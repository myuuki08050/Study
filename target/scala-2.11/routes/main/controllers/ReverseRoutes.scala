
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Tue Feb 02 22:58:48 JST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:49
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:49
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:17
  class ReverseModelManage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def ShowUserModel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user_model")
    }
  
    // @LINE:27
    def d_changeUserModel(param:String, chng_param:Int, judge:String): Call = {
    
      (param: @unchecked, chng_param: @unchecked, judge: @unchecked) match {
      
        // @LINE:27
        case (param, chng_param, judge)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "doril_change" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("param", param)), Some(implicitly[QueryStringBindable[Int]].unbind("chng_param", chng_param)), Some(implicitly[QueryStringBindable[String]].unbind("judge", judge)))))
      
      }
    
    }
  
    // @LINE:17
    def s_changeUserModel(param1_chng:Int, param2_chng:Int, param3_chng:Int, param4_chng:Int, param5_chng:Int, param6_chng:Int): Call = {
    
      (param1_chng: @unchecked, param2_chng: @unchecked, param3_chng: @unchecked, param4_chng: @unchecked, param5_chng: @unchecked, param6_chng: @unchecked) match {
      
        // @LINE:17
        case (param1_chng, param2_chng, param3_chng, param4_chng, param5_chng, param6_chng)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimon_change" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("param1_chng", param1_chng)), Some(implicitly[QueryStringBindable[Int]].unbind("param2_chng", param2_chng)), Some(implicitly[QueryStringBindable[Int]].unbind("param3_chng", param3_chng)), Some(implicitly[QueryStringBindable[Int]].unbind("param4_chng", param4_chng)), Some(implicitly[QueryStringBindable[Int]].unbind("param5_chng", param5_chng)), Some(implicitly[QueryStringBindable[Int]].unbind("param6_chng", param6_chng)))))
      
      }
    
    }
  
  }

  // @LINE:22
  class ReverseDorilManage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def ShowDoril(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "doril")
    }
  
    // @LINE:23
    def ShowFDorilregi(): Call = {
    
      () match {
      
        // @LINE:23
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "doril_fregi")
      
      }
    
    }
  
    // @LINE:29
    def MakeDoril(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "doril_regicomp")
    }
  
    // @LINE:25
    def CheckAnserDoril(): Call = {
    
      () match {
      
        // @LINE:25
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "doril_solve")
      
      }
    
    }
  
    // @LINE:37
    def showDorilDB(): Call = {
    
      () match {
      
        // @LINE:37
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "dorildb_show")
      
      }
    
    }
  
    // @LINE:41
    def deleteDorilbyID(): Call = {
    
      () match {
      
        // @LINE:41
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "doril_delete")
      
      }
    
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def showError(errorstring:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "error" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("errorstring", errorstring)))))
    }
  
    // @LINE:32
    def auth(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:6
    def showTop(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def showNewRegister(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:39
    def showUserDB(): Call = {
    
      () match {
      
        // @LINE:39
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "userdb_show")
      
      }
    
    }
  
    // @LINE:12
    def NewRegister(): Call = {
    
      () match {
      
        // @LINE:12
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "regicomplete")
      
      }
    
    }
  
    // @LINE:31
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:45
    def deleteUserbyID(): Call = {
    
      () match {
      
        // @LINE:45
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "user_delete")
      
      }
    
    }
  
    // @LINE:9
    def showHome(): Call = {
    
      () match {
      
        // @LINE:9
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "home")
      
      }
    
    }
  
    // @LINE:8
    def showLogin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:13
  class ReverseShimonManage(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def MakeShimon(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "shimon_regicomp")
    }
  
    // @LINE:15
    def CheckAnserShimon(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimon_solve")
      
      }
    
    }
  
    // @LINE:43
    def deleteShimonbyID(): Call = {
    
      () match {
      
        // @LINE:43
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimon_delete")
      
      }
    
    }
  
    // @LINE:13
    def ShowShimon(): Call = {
    
      () match {
      
        // @LINE:13
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimon")
      
      }
    
    }
  
    // @LINE:35
    def showShimonDB(): Call = {
    
      () match {
      
        // @LINE:35
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimondb_show")
      
      }
    
    }
  
    // @LINE:19
    def ShowFShimonregi(): Call = {
    
      () match {
      
        // @LINE:19
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "shimon_fregi")
      
      }
    
    }
  
  }


}