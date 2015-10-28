package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

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
        
        //IDリストURLの取得
        
        URL url = Play.application().classloader().getResource("ID_list.txt");
        String temp = url.toString();
        String idlist_url[] = temp.split("/",2); //「file:」の部分を取り除く 
        
        try{
            File file = new File(idlist_url[1]);
            FileReader filereader = new FileReader(file);
            
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
                BufferedReader br = new BufferedReader(filereader);
                while((temp = br.readLine()) != null){
                    if(temp.equals(user_id + "," + password)){
                        filereader.close();
                        return ok(home.render(user_id,password));
                    }
                }
            }
            filereader.close();
            return badRequest(user_id + "は未登録のユーザーです。またはパスワードが正しくありません。" );
        }catch(FileNotFoundException e){
            return badRequest("IDリストが見つかりません");
        }catch(IOException e){
            return badRequest("IDリストが開けません");
        }
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
        
        try{
            File file = new File(idlist_url[1]);
            FileReader filereader = new FileReader(file);
            
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
                
                BufferedReader br = new BufferedReader(filereader);
                while((temp = br.readLine()) != null){
                    String regiinf[] = temp.split(",",2);
                    if(regiinf[0].equals(user_id)){
                        filereader.close();
                        return badRequest("そのIDは既に登録済みです。");
                    }
                }
            }
            filereader.close();
            
            //チェックオーケーだったら新しく追加する。
            
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write("\n" + user_id + "," + password);
            filewriter.close();
            
            return ok(regicomplete.render(user_id,password));
    
        }catch(FileNotFoundException e){
            return badRequest("IDリストが見つかりません");
        }catch(IOException e){
            return badRequest("IDリストが開けません");
        }
    }
}
