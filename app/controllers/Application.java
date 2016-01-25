package controllers;

import java.util.*;
import java.lang.*;

import play.mvc.*;
import play.mvc.Security.Authenticated;
import play.data.Form;
import static play.data.Form.form;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import views.html.*;
import models.*;

public class Application extends Controller {
    
    public Result showTop(){
        return ok(top.render());
    }

	public Result showLogin() {
		return ok(login.render("ログイン", form(User.class)));
	}
	
	@Authenticated(MySecured.class)
	public Result showHome() {
	    if(session("user_id") == null || session("logintimes") == null){
	        return redirect(routes.Application.showLogin());
	    }
		return ok(home.render(session("user_id"), session("logintimes")));
	}
	

	public Result auth() {
	    
	   Form<User> inputForm = form(User.class).bindFromRequest();
	   
	   if (inputForm.hasErrors()) {
            return redirect(routes.Application.showLogin());
        }
        else {
            List<User> users = User.finder.all();
            for (User user : users) {
                if(user.user_id.equals(inputForm.get().user_id) && user.password.equals(inputForm.get().password)){
                    //ユーザ情報更新
                    user.logintimes++;
                    user.save();
                    //セッション管理
                    session().clear();
			        session("user_id", inputForm.get().user_id);
			        session("logintimes", String.valueOf(inputForm.get().logintimes));
                    return redirect(routes.Application.showHome());
                }
            }
        }
		
		return redirect(routes.Application.showLogin());
	}
	
	public Result showNewRegister() {
		return ok(register.render("新規登録", form(User.class)));
	}
	
	public Result NewRegister(){
        Form<User> inputForm = form(User.class).bindFromRequest();
        
        if (inputForm.hasErrors()) {
            return redirect(routes.Application.showNewRegister());
        }
        else{
            //ID重複チェック
            List<User> users = User.finder.all();
            for (User user : users) {
                if(user.user_id.equals(inputForm.get().user_id)){
                    return redirect(routes.Application.showNewRegister());
                }
            }
                        
            //データベースに登録
            User newuser = new User();
            newuser.id = users.size() + 1;
            newuser.user_id = inputForm.get().user_id;
            newuser.password = inputForm.get().password;
            newuser.logintimes = 0;
            newuser.isAdmin = true;
            newuser.save();
                        
            //データベースの内容表示
            StringBuilder msg = new StringBuilder();
            for (User user : users) {
                msg.append(user.toString()).append("\n");
            }
            //return ok(regicomplete.render(""/*msg.toString()*/,"",""));
        }
        return ok(regicomplete.render());
    }        
	
	public Result logout() {
		session().clear();
		return redirect(routes.Application.showTop());
	}
	
	@Authenticated(MySecured.class)
	public Result secret() {
		return ok("認証できています。");
	}
}