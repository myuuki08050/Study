
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Mon Feb 01 03:57:30 JST 2016

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
  // @LINE:13
  ShimonManage_2: controllers.ShimonManage,
  // @LINE:17
  ModelManage_0: controllers.ModelManage,
  // @LINE:22
  DorilManage_1: controllers.DorilManage,
  // @LINE:37
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:13
    ShimonManage_2: controllers.ShimonManage,
    // @LINE:17
    ModelManage_0: controllers.ModelManage,
    // @LINE:22
    DorilManage_1: controllers.DorilManage,
    // @LINE:37
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_4, ShimonManage_2, ModelManage_0, DorilManage_1, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, ShimonManage_2, ModelManage_0, DorilManage_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.showTop()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.showLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.showHome()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.showHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.showNewRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regicomplete""", """controllers.Application.NewRegister()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon""", """controllers.ShimonManage.ShowShimon()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon""", """controllers.ShimonManage.ShowShimon()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_solve""", """controllers.ShimonManage.CheckAnserShimon()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_solve""", """controllers.ShimonManage.CheckAnserShimon()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_change""", """controllers.ModelManage.s_changeUserModel(param1_chng:Int, param2_chng:Int, param3_chng:Int, param4_chng:Int, param5_chng:Int, param6_chng:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_change""", """controllers.ModelManage.s_changeUserModel(param1_chng:Int, param2_chng:Int, param3_chng:Int, param4_chng:Int, param5_chng:Int, param6_chng:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_regicomp""", """controllers.ShimonManage.MakeShimon()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril""", """controllers.DorilManage.ShowDoril()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_solve""", """controllers.DorilManage.CheckAnserDoril()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_solve""", """controllers.DorilManage.CheckAnserDoril()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_change""", """controllers.ModelManage.d_changeUserModel(param:String, chng_param:Int, judge:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_change""", """controllers.ModelManage.d_changeUserModel(param:String, chng_param:Int, judge:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_regicomp""", """controllers.DorilManage.MakeDoril()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user_model""", """controllers.ModelManage.ShowUserModel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.auth()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newregi""", """controllers.Application.NewRegister()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error""", """controllers.Application.showError(errorstring:String)"""),
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
  private[this] lazy val controllers_Application_showHome3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Application_showHome3_invoker = createInvoker(
    Application_4.showHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showHome",
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
  private[this] lazy val controllers_ShimonManage_ShowShimon6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon")))
  )
  private[this] lazy val controllers_ShimonManage_ShowShimon6_invoker = createInvoker(
    ShimonManage_2.ShowShimon(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "ShowShimon",
      Nil,
      "GET",
      """""",
      this.prefix + """shimon"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShimonManage_ShowShimon7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon")))
  )
  private[this] lazy val controllers_ShimonManage_ShowShimon7_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_ShimonManage_CheckAnserShimon8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_solve")))
  )
  private[this] lazy val controllers_ShimonManage_CheckAnserShimon8_invoker = createInvoker(
    ShimonManage_2.CheckAnserShimon(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "CheckAnserShimon",
      Nil,
      "GET",
      """""",
      this.prefix + """shimon_solve"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShimonManage_CheckAnserShimon9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_solve")))
  )
  private[this] lazy val controllers_ShimonManage_CheckAnserShimon9_invoker = createInvoker(
    ShimonManage_2.CheckAnserShimon(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShimonManage",
      "CheckAnserShimon",
      Nil,
      "POST",
      """""",
      this.prefix + """shimon_solve"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ModelManage_s_changeUserModel10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_change")))
  )
  private[this] lazy val controllers_ModelManage_s_changeUserModel10_invoker = createInvoker(
    ModelManage_0.s_changeUserModel(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ModelManage",
      "s_changeUserModel",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """shimon_change"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ModelManage_s_changeUserModel11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_change")))
  )
  private[this] lazy val controllers_ModelManage_s_changeUserModel11_invoker = createInvoker(
    ModelManage_0.s_changeUserModel(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ModelManage",
      "s_changeUserModel",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "POST",
      """""",
      this.prefix + """shimon_change"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi12_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi13_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_ShimonManage_MakeShimon14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_regicomp")))
  )
  private[this] lazy val controllers_ShimonManage_MakeShimon14_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_DorilManage_ShowDoril15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril")))
  )
  private[this] lazy val controllers_DorilManage_ShowDoril15_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_DorilManage_ShowFDorilregi16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi16_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_DorilManage_ShowFDorilregi17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi17_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_DorilManage_CheckAnserDoril18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_solve")))
  )
  private[this] lazy val controllers_DorilManage_CheckAnserDoril18_invoker = createInvoker(
    DorilManage_1.CheckAnserDoril(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "CheckAnserDoril",
      Nil,
      "GET",
      """""",
      this.prefix + """doril_solve"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_DorilManage_CheckAnserDoril19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_solve")))
  )
  private[this] lazy val controllers_DorilManage_CheckAnserDoril19_invoker = createInvoker(
    DorilManage_1.CheckAnserDoril(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DorilManage",
      "CheckAnserDoril",
      Nil,
      "POST",
      """""",
      this.prefix + """doril_solve"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ModelManage_d_changeUserModel20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_change")))
  )
  private[this] lazy val controllers_ModelManage_d_changeUserModel20_invoker = createInvoker(
    ModelManage_0.d_changeUserModel(fakeValue[String], fakeValue[Int], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ModelManage",
      "d_changeUserModel",
      Seq(classOf[String], classOf[Int], classOf[String]),
      "GET",
      """""",
      this.prefix + """doril_change"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ModelManage_d_changeUserModel21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_change")))
  )
  private[this] lazy val controllers_ModelManage_d_changeUserModel21_invoker = createInvoker(
    ModelManage_0.d_changeUserModel(fakeValue[String], fakeValue[Int], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ModelManage",
      "d_changeUserModel",
      Seq(classOf[String], classOf[Int], classOf[String]),
      "POST",
      """""",
      this.prefix + """doril_change"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_DorilManage_MakeDoril22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_regicomp")))
  )
  private[this] lazy val controllers_DorilManage_MakeDoril22_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_ModelManage_ShowUserModel23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user_model")))
  )
  private[this] lazy val controllers_ModelManage_ShowUserModel23_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Application_logout24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout24_invoker = createInvoker(
    Application_4.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_auth25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_auth25_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_NewRegister26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newregi")))
  )
  private[this] lazy val controllers_Application_NewRegister26_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_showError27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error")))
  )
  private[this] lazy val controllers_Application_showError27_invoker = createInvoker(
    Application_4.showError(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showError",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """error"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned28_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_Assets_at29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at29_invoker = createInvoker(
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
    case controllers_Application_showHome3_route(params) =>
      call { 
        controllers_Application_showHome3_invoker.call(Application_4.showHome())
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
    case controllers_ShimonManage_ShowShimon7_route(params) =>
      call { 
        controllers_ShimonManage_ShowShimon7_invoker.call(ShimonManage_2.ShowShimon())
      }
  
    // @LINE:15
    case controllers_ShimonManage_CheckAnserShimon8_route(params) =>
      call { 
        controllers_ShimonManage_CheckAnserShimon8_invoker.call(ShimonManage_2.CheckAnserShimon())
      }
  
    // @LINE:16
    case controllers_ShimonManage_CheckAnserShimon9_route(params) =>
      call { 
        controllers_ShimonManage_CheckAnserShimon9_invoker.call(ShimonManage_2.CheckAnserShimon())
      }
  
    // @LINE:17
    case controllers_ModelManage_s_changeUserModel10_route(params) =>
      call(params.fromQuery[Int]("param1_chng", None), params.fromQuery[Int]("param2_chng", None), params.fromQuery[Int]("param3_chng", None), params.fromQuery[Int]("param4_chng", None), params.fromQuery[Int]("param5_chng", None), params.fromQuery[Int]("param6_chng", None)) { (param1_chng, param2_chng, param3_chng, param4_chng, param5_chng, param6_chng) =>
        controllers_ModelManage_s_changeUserModel10_invoker.call(ModelManage_0.s_changeUserModel(param1_chng, param2_chng, param3_chng, param4_chng, param5_chng, param6_chng))
      }
  
    // @LINE:18
    case controllers_ModelManage_s_changeUserModel11_route(params) =>
      call(params.fromQuery[Int]("param1_chng", None), params.fromQuery[Int]("param2_chng", None), params.fromQuery[Int]("param3_chng", None), params.fromQuery[Int]("param4_chng", None), params.fromQuery[Int]("param5_chng", None), params.fromQuery[Int]("param6_chng", None)) { (param1_chng, param2_chng, param3_chng, param4_chng, param5_chng, param6_chng) =>
        controllers_ModelManage_s_changeUserModel11_invoker.call(ModelManage_0.s_changeUserModel(param1_chng, param2_chng, param3_chng, param4_chng, param5_chng, param6_chng))
      }
  
    // @LINE:19
    case controllers_ShimonManage_ShowFShimonregi12_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi12_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:20
    case controllers_ShimonManage_ShowFShimonregi13_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi13_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:21
    case controllers_ShimonManage_MakeShimon14_route(params) =>
      call { 
        controllers_ShimonManage_MakeShimon14_invoker.call(ShimonManage_2.MakeShimon())
      }
  
    // @LINE:22
    case controllers_DorilManage_ShowDoril15_route(params) =>
      call { 
        controllers_DorilManage_ShowDoril15_invoker.call(DorilManage_1.ShowDoril())
      }
  
    // @LINE:23
    case controllers_DorilManage_ShowFDorilregi16_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi16_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:24
    case controllers_DorilManage_ShowFDorilregi17_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi17_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:25
    case controllers_DorilManage_CheckAnserDoril18_route(params) =>
      call { 
        controllers_DorilManage_CheckAnserDoril18_invoker.call(DorilManage_1.CheckAnserDoril())
      }
  
    // @LINE:26
    case controllers_DorilManage_CheckAnserDoril19_route(params) =>
      call { 
        controllers_DorilManage_CheckAnserDoril19_invoker.call(DorilManage_1.CheckAnserDoril())
      }
  
    // @LINE:27
    case controllers_ModelManage_d_changeUserModel20_route(params) =>
      call(params.fromQuery[String]("param", None), params.fromQuery[Int]("chng_param", None), params.fromQuery[String]("judge", None)) { (param, chng_param, judge) =>
        controllers_ModelManage_d_changeUserModel20_invoker.call(ModelManage_0.d_changeUserModel(param, chng_param, judge))
      }
  
    // @LINE:28
    case controllers_ModelManage_d_changeUserModel21_route(params) =>
      call(params.fromQuery[String]("param", None), params.fromQuery[Int]("chng_param", None), params.fromQuery[String]("judge", None)) { (param, chng_param, judge) =>
        controllers_ModelManage_d_changeUserModel21_invoker.call(ModelManage_0.d_changeUserModel(param, chng_param, judge))
      }
  
    // @LINE:29
    case controllers_DorilManage_MakeDoril22_route(params) =>
      call { 
        controllers_DorilManage_MakeDoril22_invoker.call(DorilManage_1.MakeDoril())
      }
  
    // @LINE:30
    case controllers_ModelManage_ShowUserModel23_route(params) =>
      call { 
        controllers_ModelManage_ShowUserModel23_invoker.call(ModelManage_0.ShowUserModel())
      }
  
    // @LINE:31
    case controllers_Application_logout24_route(params) =>
      call { 
        controllers_Application_logout24_invoker.call(Application_4.logout())
      }
  
    // @LINE:32
    case controllers_Application_auth25_route(params) =>
      call { 
        controllers_Application_auth25_invoker.call(Application_4.auth())
      }
  
    // @LINE:33
    case controllers_Application_NewRegister26_route(params) =>
      call { 
        controllers_Application_NewRegister26_invoker.call(Application_4.NewRegister())
      }
  
    // @LINE:34
    case controllers_Application_showError27_route(params) =>
      call(params.fromQuery[String]("errorstring", None)) { (errorstring) =>
        controllers_Application_showError27_invoker.call(Application_4.showError(errorstring))
      }
  
    // @LINE:37
    case controllers_Assets_versioned28_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned28_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:38
    case controllers_Assets_at29_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at29_invoker.call(Assets_3.at(path, file))
      }
  }
}