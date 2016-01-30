
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Sat Jan 30 20:53:02 JST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:33
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:33
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseModelManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def ShowUserModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ModelManage.ShowUserModel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user_model"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseDorilManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def CheckAnserDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.CheckAnserDoril",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_solve"})
          }
        
        }
      """
    )
  
    // @LINE:20
    def ShowDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.ShowDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril"})
        }
      """
    )
  
    // @LINE:25
    def MakeDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.MakeDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_regicomp"})
        }
      """
    )
  
    // @LINE:21
    def ShowFDorilregi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.ShowFDorilregi",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_fregi"})
          }
        
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def showError: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showError",
      """
        function(errorstring) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("errorstring", errorstring)])})
        }
      """
    )
  
    // @LINE:28
    def auth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.auth",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:6
    def showTop: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showTop",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def showNewRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showNewRegister",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:12
    def NewRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.NewRegister",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regicomplete"})
          }
        
        }
      """
    )
  
    // @LINE:27
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:9
    def showHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showHome",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
          }
        
        }
      """
    )
  
    // @LINE:8
    def showLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseShimonManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def MakeShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.MakeShimon",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_regicomp"})
        }
      """
    )
  
    // @LINE:13
    def ShowShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.ShowShimon",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon"})
          }
        
        }
      """
    )
  
    // @LINE:17
    def ShowFShimonregi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.ShowFShimonregi",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_fregi"})
          }
        
        }
      """
    )
  
    // @LINE:15
    def CheckAnserShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.CheckAnserShimon",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_solve"})
          }
        
        }
      """
    )
  
  }


}