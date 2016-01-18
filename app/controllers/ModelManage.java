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
        return ok(usermodel.render());
    }
    
  
}
    
