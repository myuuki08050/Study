
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Tue Jan 26 05:52:32 JST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:10
  UserInf_5: controllers.UserInf,
  // @LINE:13
  ShimonManage_2: controllers.ShimonManage,
  // @LINE:17
  DorilManage_1: controllers.DorilManage,
  // @LINE:21
  ModelManage_0: controllers.ModelManage,
  // @LINE:29
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:10
    UserInf_5: controllers.UserInf,
    // @LINE:13
    ShimonManage_2: controllers.ShimonManage,
    // @LINE:17
    DorilManage_1: controllers.DorilManage,
    // @LINE:21
    ModelManage_0: controllers.ModelManage,
    // @LINE:29
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_4, UserInf_5, ShimonManage_2, DorilManage_1, ModelManage_0, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, UserInf_5, ShimonManage_2, DorilManage_1, ModelManage_0, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.showTop()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.showLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.showHome()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.UserInf.LoginJudge()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.showNewRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regicomplete""", """controllers.Application.NewRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon""", """controllers.ShimonManage.ShowShimon()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_regicomp""", """controllers.ShimonManage.MakeShimon()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril""", """controllers.DorilManage.ShowDoril()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_regicomp""", """controllers.DorilManage.MakeDoril()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user_model""", """controllers.ModelManage.ShowUserModel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.auth()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newregi""", """controllers.Application.NewRegister()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_showTop0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_showTop0_invoker = createInvoker(
    Application_4.showTop(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showTop",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_showLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_showLogin1_invoker = createInvoker(
    Application_4.showLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showLogin",
      Nil,
      "GET",
      """ add page""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_showHome2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Application_showHome2_invoker = createInvoker(
    Application_4.showHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showHome",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserInf_LoginJudge3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_UserInf_LoginJudge3_invoker = createInvoker(
    UserInf_5.LoginJudge(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserInf",
      "LoginJudge",
      Nil,
      "POST",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_showNewRegister4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_showNewRegister4_invoker = createInvoker(
    Application_4.showNewRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showNewRegister",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_NewRegister5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regicomplete")))
  )
  private[this] lazy val controllers_Application_NewRegister5_invoker = createInvoker(
    Application_4.NewRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "NewRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """regicomplete"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ShimonManage_ShowShimon6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon")))
  )
  private[this] lazy val controllers_ShimonManage_ShowShimon6_invoker = createInvoker(
    ShimonManage_2.ShowShimon(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "ShowShimon",
      Nil,
      "POST",
      """""",
      this.prefix + """shimon"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi7_invoker = createInvoker(
    ShimonManage_2.ShowFShimonregi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "ShowFShimonregi",
      Nil,
      "GET",
      """""",
      this.prefix + """shimon_fregi"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi8_invoker = createInvoker(
    ShimonManage_2.ShowFShimonregi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "ShowFShimonregi",
      Nil,
      "POST",
      """""",
      this.prefix + """shimon_fregi"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShimonManage_MakeShimon9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_regicomp")))
  )
  private[this] lazy val controllers_ShimonManage_MakeShimon9_invoker = createInvoker(
    ShimonManage_2.MakeShimon(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "MakeShimon",
      Nil,
      "POST",
      """""",
      this.prefix + """shimon_regicomp"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DorilManage_ShowDoril10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril")))
  )
  private[this] lazy val controllers_DorilManage_ShowDoril10_invoker = createInvoker(
    DorilManage_1.ShowDoril(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "ShowDoril",
      Nil,
      "POST",
      """""",
      this.prefix + """doril"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DorilManage_ShowFDorilregi11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi11_invoker = createInvoker(
    DorilManage_1.ShowFDorilregi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "ShowFDorilregi",
      Nil,
      "GET",
      """""",
      this.prefix + """doril_fregi"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DorilManage_ShowFDorilregi12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi12_invoker = createInvoker(
    DorilManage_1.ShowFDorilregi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "ShowFDorilregi",
      Nil,
      "POST",
      """""",
      this.prefix + """doril_fregi"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_DorilManage_MakeDoril13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_regicomp")))
  )
  private[this] lazy val controllers_DorilManage_MakeDoril13_invoker = createInvoker(
    DorilManage_1.MakeDoril(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "MakeDoril",
      Nil,
      "POST",
      """""",
      this.prefix + """doril_regicomp"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ModelManage_ShowUserModel14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user_model")))
  )
  private[this] lazy val controllers_ModelManage_ShowUserModel14_invoker = createInvoker(
    ModelManage_0.ShowUserModel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ModelManage",
      "ShowUserModel",
      Nil,
      "POST",
      """""",
      this.prefix + """user_model"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_logout15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout15_invoker = createInvoker(
    Application_4.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """ test""",
      this.prefix + """logout"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_auth16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_auth16_invoker = createInvoker(
    Application_4.auth(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "auth",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_NewRegister17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newregi")))
  )
  private[this] lazy val controllers_Application_NewRegister17_invoker = createInvoker(
    Application_4.NewRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "NewRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """newregi"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_showTop0_route(params) =>
      call { 
        controllers_Application_showTop0_invoker.call(Application_4.showTop())
      }
  
    // @LINE:8
    case controllers_Application_showLogin1_route(params) =>
      call { 
        controllers_Application_showLogin1_invoker.call(Application_4.showLogin())
      }
  
    // @LINE:9
    case controllers_Application_showHome2_route(params) =>
      call { 
        controllers_Application_showHome2_invoker.call(Application_4.showHome())
      }
  
    // @LINE:10
    case controllers_UserInf_LoginJudge3_route(params) =>
      call { 
        controllers_UserInf_LoginJudge3_invoker.call(UserInf_5.LoginJudge())
      }
  
    // @LINE:11
    case controllers_Application_showNewRegister4_route(params) =>
      call { 
        controllers_Application_showNewRegister4_invoker.call(Application_4.showNewRegister())
      }
  
    // @LINE:12
    case controllers_Application_NewRegister5_route(params) =>
      call { 
        controllers_Application_NewRegister5_invoker.call(Application_4.NewRegister())
      }
  
    // @LINE:13
    case controllers_ShimonManage_ShowShimon6_route(params) =>
      call { 
        controllers_ShimonManage_ShowShimon6_invoker.call(ShimonManage_2.ShowShimon())
      }
  
    // @LINE:14
    case controllers_ShimonManage_ShowFShimonregi7_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi7_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:15
    case controllers_ShimonManage_ShowFShimonregi8_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi8_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:16
    case controllers_ShimonManage_MakeShimon9_route(params) =>
      call { 
        controllers_ShimonManage_MakeShimon9_invoker.call(ShimonManage_2.MakeShimon())
      }
  
    // @LINE:17
    case controllers_DorilManage_ShowDoril10_route(params) =>
      call { 
        controllers_DorilManage_ShowDoril10_invoker.call(DorilManage_1.ShowDoril())
      }
  
    // @LINE:18
    case controllers_DorilManage_ShowFDorilregi11_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi11_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:19
    case controllers_DorilManage_ShowFDorilregi12_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi12_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:20
    case controllers_DorilManage_MakeDoril13_route(params) =>
      call { 
        controllers_DorilManage_MakeDoril13_invoker.call(DorilManage_1.MakeDoril())
      }
  
    // @LINE:21
    case controllers_ModelManage_ShowUserModel14_route(params) =>
      call { 
        controllers_ModelManage_ShowUserModel14_invoker.call(ModelManage_0.ShowUserModel())
      }
  
    // @LINE:24
    case controllers_Application_logout15_route(params) =>
      call { 
        controllers_Application_logout15_invoker.call(Application_4.logout())
      }
  
    // @LINE:25
    case controllers_Application_auth16_route(params) =>
      call { 
        controllers_Application_auth16_invoker.call(Application_4.auth())
      }
  
    // @LINE:26
    case controllers_Application_NewRegister17_route(params) =>
      call { 
        controllers_Application_NewRegister17_invoker.call(Application_4.NewRegister())
      }
  
    // @LINE:29
    case controllers_Assets_versioned18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_at19_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_3.at(path, file))
      }
  }
}