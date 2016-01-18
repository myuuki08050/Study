
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Mon Jan 18 23:58:21 JST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseSystemTop(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SystemTop.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "top"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseDorilManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def ShowDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.ShowDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril"})
        }
      """
    )
  
    // @LINE:22
    def MakeDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.MakeDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_regicomp"})
        }
      """
    )
  
    // @LINE:20
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

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseShimonManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def MakeShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.MakeShimon",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_regicomp"})
        }
      """
    )
  
    // @LINE:15
    def ShowShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.ShowShimon",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon"})
        }
      """
    )
  
    // @LINE:16
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
  
  }

  // @LINE:10
  class ReverseUserInf(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def ShowRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserInf.ShowRegister",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:10
    def ShowLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserInf.ShowLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:14
    def NewRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserInf.NewRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regicomplete"})
        }
      """
    )
  
    // @LINE:11
    def LoginJudge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserInf.LoginJudge",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
          }
        
        }
      """
    )
  
  }


}