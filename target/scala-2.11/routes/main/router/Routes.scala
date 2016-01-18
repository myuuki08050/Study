
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Mon Jan 18 23:58:21 JST 2016

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
  // @LINE:9
  SystemTop_0: controllers.SystemTop,
  // @LINE:10
  UserInf_5: controllers.UserInf,
  // @LINE:15
  ShimonManage_2: controllers.ShimonManage,
  // @LINE:19
  DorilManage_1: controllers.DorilManage,
  // @LINE:25
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:9
    SystemTop_0: controllers.SystemTop,
    // @LINE:10
    UserInf_5: controllers.UserInf,
    // @LINE:15
    ShimonManage_2: controllers.ShimonManage,
    // @LINE:19
    DorilManage_1: controllers.DorilManage,
    // @LINE:25
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_4, SystemTop_0, UserInf_5, ShimonManage_2, DorilManage_1, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, SystemTop_0, UserInf_5, ShimonManage_2, DorilManage_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """top""", """controllers.SystemTop.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserInf.ShowLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.UserInf.LoginJudge()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.UserInf.LoginJudge()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserInf.ShowRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regicomplete""", """controllers.UserInf.NewRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon""", """controllers.ShimonManage.ShowShimon()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_fregi""", """controllers.ShimonManage.ShowFShimonregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shimon_regicomp""", """controllers.ShimonManage.MakeShimon()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril""", """controllers.DorilManage.ShowDoril()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_fregi""", """controllers.DorilManage.ShowFDorilregi()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doril_regicomp""", """controllers.DorilManage.MakeDoril()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_SystemTop_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("top")))
  )
  private[this] lazy val controllers_SystemTop_index1_invoker = createInvoker(
    SystemTop_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SystemTop",
      "index",
      Nil,
      "GET",
      """ add page""",
      this.prefix + """top"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserInf_ShowLogin2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserInf_ShowLogin2_invoker = createInvoker(
    UserInf_5.ShowLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserInf",
      "ShowLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserInf_LoginJudge3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_UserInf_LoginJudge3_invoker = createInvoker(
    UserInf_5.LoginJudge(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserInf",
      "LoginJudge",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserInf_LoginJudge4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_UserInf_LoginJudge4_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_UserInf_ShowRegister5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserInf_ShowRegister5_invoker = createInvoker(
    UserInf_5.ShowRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserInf",
      "ShowRegister",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserInf_NewRegister6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regicomplete")))
  )
  private[this] lazy val controllers_UserInf_NewRegister6_invoker = createInvoker(
    UserInf_5.NewRegister(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserInf",
      "NewRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """regicomplete"""
    )
  )

  // @LINE:15
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

  // @LINE:16
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi8_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_fregi")))
  )
  private[this] lazy val controllers_ShimonManage_ShowFShimonregi9_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_ShimonManage_MakeShimon10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shimon_regicomp")))
  )
  private[this] lazy val controllers_ShimonManage_MakeShimon10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_DorilManage_ShowDoril11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril")))
  )
  private[this] lazy val controllers_DorilManage_ShowDoril11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_DorilManage_ShowFDorilregi12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi12_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_DorilManage_ShowFDorilregi13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_fregi")))
  )
  private[this] lazy val controllers_DorilManage_ShowFDorilregi13_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_DorilManage_MakeDoril14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doril_regicomp")))
  )
  private[this] lazy val controllers_DorilManage_MakeDoril14_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index())
      }
  
    // @LINE:9
    case controllers_SystemTop_index1_route(params) =>
      call { 
        controllers_SystemTop_index1_invoker.call(SystemTop_0.index())
      }
  
    // @LINE:10
    case controllers_UserInf_ShowLogin2_route(params) =>
      call { 
        controllers_UserInf_ShowLogin2_invoker.call(UserInf_5.ShowLogin())
      }
  
    // @LINE:11
    case controllers_UserInf_LoginJudge3_route(params) =>
      call { 
        controllers_UserInf_LoginJudge3_invoker.call(UserInf_5.LoginJudge())
      }
  
    // @LINE:12
    case controllers_UserInf_LoginJudge4_route(params) =>
      call { 
        controllers_UserInf_LoginJudge4_invoker.call(UserInf_5.LoginJudge())
      }
  
    // @LINE:13
    case controllers_UserInf_ShowRegister5_route(params) =>
      call { 
        controllers_UserInf_ShowRegister5_invoker.call(UserInf_5.ShowRegister())
      }
  
    // @LINE:14
    case controllers_UserInf_NewRegister6_route(params) =>
      call { 
        controllers_UserInf_NewRegister6_invoker.call(UserInf_5.NewRegister())
      }
  
    // @LINE:15
    case controllers_ShimonManage_ShowShimon7_route(params) =>
      call { 
        controllers_ShimonManage_ShowShimon7_invoker.call(ShimonManage_2.ShowShimon())
      }
  
    // @LINE:16
    case controllers_ShimonManage_ShowFShimonregi8_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi8_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:17
    case controllers_ShimonManage_ShowFShimonregi9_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi9_invoker.call(ShimonManage_2.ShowFShimonregi())
      }
  
    // @LINE:18
    case controllers_ShimonManage_MakeShimon10_route(params) =>
      call { 
        controllers_ShimonManage_MakeShimon10_invoker.call(ShimonManage_2.MakeShimon())
      }
  
    // @LINE:19
    case controllers_DorilManage_ShowDoril11_route(params) =>
      call { 
        controllers_DorilManage_ShowDoril11_invoker.call(DorilManage_1.ShowDoril())
      }
  
    // @LINE:20
    case controllers_DorilManage_ShowFDorilregi12_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi12_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:21
    case controllers_DorilManage_ShowFDorilregi13_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi13_invoker.call(DorilManage_1.ShowFDorilregi())
      }
  
    // @LINE:22
    case controllers_DorilManage_MakeDoril14_route(params) =>
      call { 
        controllers_DorilManage_MakeDoril14_invoker.call(DorilManage_1.MakeDoril())
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_3.versioned(path, file))
      }
  }
}