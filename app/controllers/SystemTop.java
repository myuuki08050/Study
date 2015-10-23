package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class SystemTop extends Controller {

    public Result index() {
        return ok(top.render());
    }

}
