package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import java.io.*;
import java.net.*;



public class Login extends Controller {

    public Result index() {
        return ok(login.render());
    }
    
    public Result LoginJudge(){
        String[] params = { "user_id" , "password" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        String user_id = input.data().get("user_id");
        String password = input.data().get("password");
        
        //IDリストURLの取得
        
        URL url = Play.application().classloader().getResource("ID_list.txt");
        String temp = url.toString();
        String idlist_url[] = temp.split("/",2);
        
        try{
            File file = new File(idlist_url[1]);
            FileReader filereader = new FileReader(file);
            filereader.close();
        }catch(FileNotFoundException e){
            return ok(home.render("URL",idlist_url[1]));
        }catch(IOException e){
            return badRequest("IDリストが開けません");
        }
            
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
        
        //テキストファイルに保存
    
        return ok(home.render(user_id,password));
    }
}
