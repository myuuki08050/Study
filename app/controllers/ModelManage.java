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
            usrmodel = usrmodels.get(0);
        }
        catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter( stringWriter );
            e.printStackTrace( printWriter );
            return badRequest(stringWriter.toString());
        }
        
        return ok(usermodel.render(usrmodel.user.user_id,usrmodel.param1,usrmodel.param2,usrmodel.param3,usrmodel.param4,usrmodel.param5,usrmodel.param6));
    }
    
    public Result changeUserModel(){
        return ok(error.render("仮"));
    }
}
    
