
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Tue Feb 02 15:05:57 JST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:45
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:45
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseModelManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def ShowUserModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ModelManage.ShowUserModel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user_model"})
        }
      """
    )
  
    // @LINE:27
    def d_changeUserModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ModelManage.d_changeUserModel",
      """
        function(param,chng_param,judge) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_change" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("param", param), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("chng_param", chng_param), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("judge", judge)])})
          }
        
        }
      """
    )
  
    // @LINE:17
    def s_changeUserModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ModelManage.s_changeUserModel",
      """
        function(param1_chng,param2_chng,param3_chng,param4_chng,param5_chng,param6_chng) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_change" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param1_chng", param1_chng), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param2_chng", param2_chng), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param3_chng", param3_chng), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param4_chng", param4_chng), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param5_chng", param5_chng), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("param6_chng", param6_chng)])})
          }
        
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseDorilManage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def ShowDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.ShowDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril"})
        }
      """
    )
  
    // @LINE:23
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
  
    // @LINE:29
    def MakeDoril: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.MakeDoril",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_regicomp"})
        }
      """
    )
  
    // @LINE:25
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
  
    // @LINE:37
    def showDorilDB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.showDorilDB",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dorildb_show"})
          }
        
        }
      """
    )
  
    // @LINE:39
    def deleteDorilbyID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DorilManage.deleteDorilbyID",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "doril_delete"})
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

  
    // @LINE:34
    def showError: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showError",
      """
        function(errorstring) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("errorstring", errorstring)])})
        }
      """
    )
  
    // @LINE:32
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
  
    // @LINE:31
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

  
    // @LINE:21
    def MakeShimon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.MakeShimon",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_regicomp"})
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
  
    // @LINE:41
    def deleteShimonbyID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.deleteShimonbyID",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimon_delete"})
          }
        
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
  
    // @LINE:35
    def showShimonDB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShimonManage.showShimonDB",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shimondb_show"})
          }
        
        }
      """
    )
  
    // @LINE:19
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


}