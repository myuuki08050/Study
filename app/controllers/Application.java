package controllers;

import java.util.*;
import java.lang.*;
import play.mvc.*;
import play.mvc.Security.Authenticated;
import play.data.Form;
import play.data.DynamicForm;
import static play.data.Form.form;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import views.html.*;
import models.*;
import play.cache.Cache;

public class Application extends Controller {
    
    public Result showTop(){
        return ok(top.render());
    }

	public Result showLogin() {
	    if(session("user_id") == null){
		    return ok(login.render("ログイン", form(User.class)));
	    }
	    else{
	        return ok(error.render("既にログインしています。"));
	    }
	}
	
	@Authenticated(MySecured.class)
	public Result showHome() {
	    if(session("user_id") == null || session("logintimes") == null || session("isAdmin") == null){
	        return redirect(routes.Application.showLogin());
	    }
	    Cache.set("shimon_size", 0);
	    Cache.set("doril_size", 0);
		return ok(home.render(session("user_id"), session("logintimes"),session("isAdmin")));
	}
	

	public Result auth() {
	    String[] params = { "use_kind" };
	    Form<User> inputForm = form(User.class).bindFromRequest();
	   
	    if (inputForm.hasErrors()) {
            return redirect(routes.Application.showLogin());
        }
        else {
            List<User> users = User.finder.all();
            for (User user : users) {
                if(user.user_id.equals(inputForm.get().user_id) && user.password.equals(inputForm.get().password)){
                    session().clear();
                    
                    if(user.isAdmin){
                        session("isAdmin", "true");
                    }
                    else{
                        session("isAdmin", "false");
                    }
                    
                    //ユーザ情報更新
                    user.logintimes = user.logintimes + 1;
                    user.update();
                    flash();
                    
			        session("user_id", inputForm.get().user_id);
			        session("logintimes", String.valueOf(user.logintimes));
			        
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
	    String[] params = { "use_kind" };
        Form<User> inputForm = form(User.class).bindFromRequest();
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        
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
            newuser.user_id = inputForm.get().user_id;
            newuser.password = inputForm.get().password;
            newuser.logintimes = 0;
            
            if(input.data().get("use_kind").equals("nonadmin")){
                newuser.isAdmin = false;
            }
            else{
                newuser.isAdmin = true;
            }
            
            //ユーザーモデルの初期化
            UserModel newusrmodel = new UserModel();
            newusrmodel.param1 = 0;
            newusrmodel.param2 = 0;
            newusrmodel.param3 = 0;
            newusrmodel.param4 = 0;
            newusrmodel.param5 = 0;
            newusrmodel.param6 = 0;
            
            newuser.children.add(newusrmodel);
            
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
	
	public Result showError(String errorstring){
	     return ok(error.render(errorstring));
	}
	
}