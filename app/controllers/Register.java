package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Register extends Controller {

    public Result index() {
        return ok(register.render());
    }

}
