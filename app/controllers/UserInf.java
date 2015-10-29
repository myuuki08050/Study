package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import java.util.List;
 
import models.Parent;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.io.*;
import java.net.*;

public class UserInf extends Controller {
    
    private static final int TEXT_MODE = 1;
    private static final int DATABASE_MODE = 2;

    private static final int mode = DATABASE_MODE ; /*　読み出し・書き込みにTEXTを使うかDATABASEを使うか。*/

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
        
        //IDリストURLの取得
        
        URL url = Play.application().classloader().getResource("ID_list.txt");
        String temp = url.toString();
        String idlist_url[] = temp.split("/",2); //「file:」の部分を取り除く 
        
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
            if(mode == TEXT_MODE){
                try{
                    File file = new File(idlist_url[1]);
                    FileReader filereader = new FileReader(file);
                    BufferedReader br = new BufferedReader(filereader);
                    while((temp = br.readLine()) != null){
                        if(temp.equals(user_id + "," + password)){
                            filereader.close();
                            return ok(home.render(user_id,password));
                        }
                    }
                filereader.close();
                }catch(FileNotFoundException e){
                    return badRequest("IDリストが見つかりません");
                }catch(IOException e){
                    return badRequest("IDリストが開けません");
                }
            }
            else if(mode == DATABASE_MODE){
                List<Parent> parents = Parent.finder.all();
                StringBuilder msg = new StringBuilder();
                for (Parent parent : parents) {
                    if(parent.user_id.equals(user_id) && parent.password.equals(password)){
                        return ok(home.render(user_id,password));
                    }
                }
            }
        }
        
        return badRequest("そのIDは登録されていないか、パスワードが違います。");
        
        /*
        List<Parent> parents = Parent.finder.all();
        StringBuilder msg = new StringBuilder();
        for (Parent parent : parents) {
            msg.append(parent.toString()).append("\n");
        }
        return badRequest("user_id = " + user_id + ",password  " + password + "\n" + msg.toString());
        */
    }
    
    public Result NewRegister(){
        String[] params = { "user_id" , "password" };
        DynamicForm input = Form.form();
        input = input.bindFromRequest(params);
        String user_id = input.data().get("user_id");
        String password = input.data().get("password");
        
        //IDリストURLの取得
        
        URL url = Play.application().classloader().getResource("ID_list.txt");
        String temp = url.toString();
        String idlist_url[] = temp.split("/",2); //「file:」の部分を取り除く 
            
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
                    if(mode == TEXT_MODE){
                        try{
                            File file = new File(idlist_url[1]);
                            FileReader filereader = new FileReader(file);
                            BufferedReader br = new BufferedReader(filereader);
                            
                            //ID重複チェック
                            while((temp = br.readLine()) != null){
                                String regiinf[] = temp.split(",",2);
                                if(regiinf[0].equals(user_id)){
                                    filereader.close();
                                    return badRequest("そのIDは既に登録済みです。");
                                }
                            }
                            filereader.close();
    
                            //チェックオーケーだったらtextに新しく追加する。
                            FileWriter filewriter = new FileWriter(file, true);
                            filewriter.write("\n" + user_id + "," + password);
                            filewriter.close();
                            
                        }catch(FileNotFoundException e){
                            return badRequest("IDリストが見つかりません");
                        }catch(IOException e){
                            return badRequest("IDリストが開けません");
                        }
                    }
                    else if(mode == DATABASE_MODE){
                        
                        //ID重複チェック
                        List<Parent> parents = Parent.finder.all();
                        for (Parent parent : parents) {
                            if(parent.user_id.equals(user_id)){
                                return badRequest("そのIDは既に登録済みです。");
                            }
                        }
                        
                        //データベースに登録
                        Parent newparent = new Parent();
                        newparent.user_id = user_id;
                        newparent.password = password;
                        newparent.save();
                        
                        //データベースの内容表示
                        StringBuilder msg = new StringBuilder();
                        for (Parent parent : parents) {
                            msg.append(parent.toString()).append("\n");
                        }
                        
                        return ok(msg.toString());
                    }
                }
            }
        
        return ok(user_id,password);
    }        
}
