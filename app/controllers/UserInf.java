package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import java.util.List;
import java.util.Date;
 
import models.User;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.io.*;
import java.net.*;

public class UserInf extends Controller {
    
    public Result ShowLogin() {
        return ok(login.render());
    }
    
     public Result ShowRegister() {
        return ok(register.render());
    }
    
    public Result LoginJudge(){
        String[] params = { "user_id" , "password" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        String user_id = input.data().get("user_id");
        String password = input.data().get("password");
        
        //form入力データの判定
        if ((user_id == null || user_id.trim().equals("")) && (password == null || password.trim().equals(""))) {
            return badRequest("ID・PASSを入力してください。");
        }
        else if(user_id == null || user_id.trim().equals("")){
            return badRequest("IDを入力してください。");
        }
        else if(password == null || password.trim().equals("")){
            return badRequest("PASSを入力してください。");
        }
        else {
            List<User> users = User.finder.all();
            StringBuilder msg = new StringBuilder();
            for (User user : users) {
                if(user.user_id.equals(user_id) && user.password.equals(password)){
                    user.logindate = new Date();
                    user.logintimes++;
                    return ok(home.render(user.user_id,user.password,String.valueOf(user.logintimes)));
                }
            }
        }
        
        /* return badRequest("そのIDは登録されていないか、パスワードが違います。"); */
        
        List<User> users = User.finder.all();
        StringBuilder msg = new StringBuilder();
        for (User user : users) {
            msg.append(user.toString()).append("\n");
        }
        return badRequest("user_id " + user_id + ",password  " + password + "\n" + msg.toString());
    }
    
    public Result NewRegister(){
        String[] params = { "user_id" , "password" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        String user_id = input.data().get("user_id");
        String password = input.data().get("password");
        
        // 入力チェック
        if ((user_id == null || user_id.trim().equals("")) && (password == null || password.trim().equals(""))) {
            return badRequest("ID・PASSを入力してください。");
        }
        else if(user_id == null || user_id.trim().equals("")){
            return badRequest("IDを入力してください。");
        }
        else if(password == null || password.trim().equals("")){
            return badRequest("PASSを入力してください。");
        }
        else {
            // 文字列全長チェック
            if(user_id.length() > 20){
                return badRequest("IDは数字アルファベット20文字以内で入力してください");
            }
            else if(password.length() < 8 || password.length() >20){
                return badRequest("PASSは数字アルファベット8文字以上20文字以内で入力してください");
            }
            else{
                //ID重複チェック
                List<User> users = User.finder.all();
                for (User user : users) {
                    if(user.user_id.equals(user_id)){
                        return badRequest("そのIDは既に登録済みです。");
                    }
                }
                        
                //データベースに登録
                User newuser = new User();
                newuser.user_id = user_id;
                newuser.password = password;
                newuser.logintimes = 0;
                newuser.save();
                        
                //データベースの内容表示
                StringBuilder msg = new StringBuilder();
                for (User user : users) {
                    msg.append(user.toString()).append("\n");
                }
                return ok(regicomplete.render(""/*msg.toString()*/,"",""));
            }
        }
        //return ok(regicomplete.render(user_id,password,String.valueOf(0)));
    }        
}
