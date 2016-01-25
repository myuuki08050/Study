package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import play.data.DynamicForm;
import play.data.Form;

import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;

import java.util.*;
 
import models.User;
import models.UserModel;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

import java.io.*;
import java.net.*;

public class ModelManage extends Controller {
    
    public Result ShowUserModel(){
        List<User> nowuser = User.finder.where().gt("isLogin", true).findList();
        List<UserModel> usrmodels = UserModel.finder.where().gt("user_id", nowuser.get(1).user_id).findList();
        
        UserModel usrmodel = usrmodels.get(1);
        
        return ok(usermodel.render(usrmodel.user.user_id,usrmodel.param1,usrmodel.param2,usrmodel.param3,usrmodel.param4,usrmodel.param5,usrmodel.param6));
    
    }
}
    
