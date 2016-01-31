package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;
import static play.data.Form.form;
import play.mvc.Security.Authenticated;
import play.cache.Cache;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import java.util.*;
import models.*;
import views.html.*;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import com.avaje.ebean.Model.Finder;
import com.avaje.ebean.Query;
import java.io.*;
import java.net.*;

public class ModelManage extends Controller {
    
    @Authenticated(MySecured.class)
    public Result ShowUserModel(){
        String user = session("user_id");
        List<User> usrs = new ArrayList<User>();
        User usr = new User();
        List<UserModel> usrmodels = new ArrayList<UserModel>();
        UserModel usrmodel = new UserModel();
        
        try{
            usrs = new ArrayList<User>(User.finder.where().eq("user_id", user).findList());
            usr = usrs.get(0);
            usrmodels = usr.children;
            //最新版のモデルを取得
            usrmodel = usrmodels.get(usrmodels.size()-1);
        }
        catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        return ok(usermodel_string.render(usrmodel.user.user_id,usrmodel.param1,usrmodel.param2,usrmodel.param3,usrmodel.param4,usrmodel.param5,usrmodel.param6));
    }
    
    //試問によるモデル変更
    @Authenticated(MySecured.class)
    public Result s_changeUserModel(int param1_chng,int param2_chng,int param3_chng,int param4_chng, int param5_chng, int param6_chng){
        String user = session("user_id");
        List<User> usrs = new ArrayList<User>();
        User usr = new User();
        List<UserModel> usrmodels = new ArrayList<UserModel>();
        UserModel usrmodel = new UserModel();
        int disparam1 = -1;
        int disparam2 = -1;
        int disparam3 = -1;
        int disparam4 = -1;
        int disparam5 = -1;
        int disparam6 = -1;
        
        try{
            usrs = new ArrayList<User>(User.finder.where().eq("user_id", user).findList());
            usr = usrs.get(0);
            usrmodels = usr.children;
            usrmodel = usrmodels.get(usrmodels.size()-1);
            
            UserModel newusrmodel = new UserModel();
            //標準入出力
            if(usrmodel.param1 + param1_chng > 100){
                disparam1 = 100;
                newusrmodel.param1 = disparam1;
            }
            else if(usrmodel.param1 + param1_chng < 0) {
                disparam1 = 0;
                newusrmodel.param1 = disparam1;
            }
            else{
                disparam1 = usrmodel.param1 + param1_chng;
                newusrmodel.param1 = disparam1;
            }
            //ファイル入出力
            if(usrmodel.param2 + param2_chng > 100){
                disparam2 = 100;
                newusrmodel.param2 = disparam2;
            }
            else if(usrmodel.param2 + param2_chng < 0) {
                disparam2 = 0;
                newusrmodel.param2 = disparam2;
            }
            else{
                disparam2 = usrmodel.param2 + param2_chng;
                newusrmodel.param2 = disparam2;
            }
            //自作関数
            if(usrmodel.param3 + param3_chng > 100){
                disparam3 = 100;
                newusrmodel.param3 = disparam3;
            }
            else if(usrmodel.param3 + param3_chng < 0) {
                disparam3 = 0;
                newusrmodel.param3 = disparam3;
            }
            else{
                disparam3 = usrmodel.param3 + param3_chng;
                newusrmodel.param3 = disparam3;
            }
            //ポインタ
            if(usrmodel.param4 + param4_chng > 100){
                disparam4 = 100;
                newusrmodel.param4 = disparam4;
            }
            else if(usrmodel.param4 + param4_chng < 0) {
                disparam4 = 0;
                newusrmodel.param4 = disparam4;
            }
            else{
                disparam4 = usrmodel.param4 + param4_chng;
                newusrmodel.param4 = disparam4;
            }
            //再帰
            if(usrmodel.param5 + param5_chng > 100){
                disparam5 = 100;
                newusrmodel.param5 = disparam5;
            }
            else if(usrmodel.param5 + param5_chng < 0) {
                disparam5= 0;
                newusrmodel.param5 = disparam5;
            }
            else{
                disparam5 = usrmodel.param5 + param5_chng;
                newusrmodel.param5 = disparam5;
            }
            //構造体
            if(usrmodel.param6 + param6_chng > 100){
                disparam6 = 100;
                newusrmodel.param6 = disparam6;
            }
            else if(usrmodel.param6 + param6_chng < 0) {
                disparam6 = 0;
                newusrmodel.param6 = disparam6;
            }
            else{
                disparam6 = usrmodel.param6 + param6_chng;
                newusrmodel.param6 = disparam6;
            }
            
            usr.children.add(newusrmodel);
            usr.save();
         
        }
        catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        return redirect(routes.ShimonManage.ShowShimon());
    }
    
    //ドリルによるモデル変更
    @Authenticated(MySecured.class)
    public Result d_changeUserModel(String param,int chng_param, String judge){
        String user = session("user_id");
        List<User> usrs = new ArrayList<User>();
        User usr = new User();
        List<UserModel> usrmodels = new ArrayList<UserModel>();
        UserModel usrmodel = new UserModel();
        int disparam1 = -1;
        int disparam2 = -1;
        int disparam3 = -1;
        int disparam4 = -1;
        int disparam5 = -1;
        int disparam6 = -1;
        
        try{
            usrs = new ArrayList<User>(User.finder.where().eq("user_id", user).findList());
            usr = usrs.get(0);
            usrmodels = usr.children;
            usrmodel = usrmodels.get(usrmodels.size()-1);
            
            UserModel newusrmodel = new UserModel();
            
            newusrmodel.param1 = usrmodel.param1;
            newusrmodel.param2 = usrmodel.param2;
            newusrmodel.param3 = usrmodel.param3;
            newusrmodel.param4 = usrmodel.param4;
            newusrmodel.param5 = usrmodel.param5;
            newusrmodel.param6 = usrmodel.param6;
            
            if(param == null){
                return ok(error.render("文字列不正"));
            }else switch(param){
                case "標準入出力":
                    if(usrmodel.param1 + chng_param > 100){
                        disparam1 = 100;
                        newusrmodel.param1 = disparam1;
                    }
                    else if(usrmodel.param1 + chng_param < 0) {
                        disparam1 = 0;
                        newusrmodel.param1 = disparam1;
                    }
                    else{
                        disparam1 = usrmodel.param1 + chng_param;
                        newusrmodel.param1 = disparam1;
                    }
                break;
                
                case "ファイル入出力":
                    if(usrmodel.param2 + chng_param > 100){
                        disparam2 = 100;
                        newusrmodel.param2 = disparam2;
                    }
                    else if(usrmodel.param2 + chng_param < 0) {
                        disparam2 = 0;
                        newusrmodel.param2 = disparam2;
                    }
                    else{
                        disparam2 = usrmodel.param2 + chng_param;
                        newusrmodel.param2 = disparam2;
                    }
                break;
                
                case "自作関数":
                    if(usrmodel.param3 + chng_param > 100){
                        disparam3 = 100;
                        newusrmodel.param3 = disparam3;
                    }
                    else if(usrmodel.param3 + chng_param < 0) {
                        disparam3 = 0;
                        newusrmodel.param3 = disparam3;
                    }
                    else{
                        disparam3 = usrmodel.param3 + chng_param;
                        newusrmodel.param3 = disparam3;
                    }
                break;
                
                case "ポインタ":
                    if(usrmodel.param4 + chng_param > 100){
                        disparam4 = 100;
                        newusrmodel.param4 = disparam4;
                    }
                    else if(usrmodel.param4 + chng_param < 0) {
                        disparam4 = 0;
                        newusrmodel.param4 = disparam4;
                    }
                    else{
                        disparam4 = usrmodel.param4 + chng_param;
                        newusrmodel.param4 = disparam4;
                    }
                break;
                
                case "再帰":
                    if(usrmodel.param5 + chng_param > 100){
                        disparam5 = 100;
                        newusrmodel.param5 = disparam5;
                    }
                    else if(usrmodel.param5 + chng_param < 0) {
                        disparam5= 0;
                        newusrmodel.param5 = disparam5;
                    }
                    else{
                        disparam5 = usrmodel.param5 + chng_param;
                        newusrmodel.param5 = disparam5;
                    }
                break;
                
                case "構造体":
                    if(usrmodel.param6 + chng_param > 100){
                        disparam6 = 100;
                        newusrmodel.param6 = disparam6;
                    }
                    else if(usrmodel.param6 + chng_param < 0) {
                        disparam6 = 0;
                        newusrmodel.param6 = disparam6;
                    }
                    else{
                        disparam6 = usrmodel.param6 + chng_param;
                        newusrmodel.param6 = disparam6;
                    }
                break;
                default:
            }
            
            usr.children.add(newusrmodel);
            usr.save();
         
        }
        catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        return ok(doril_anschk.render(judge,(ArrayList<String>)Cache.get("doril_commentary")));
        
    }
}
    
