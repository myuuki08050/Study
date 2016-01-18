
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Tue Jan 19 05:35:02 JST 2016

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
  Application_5: controllers.Application,
  // @LINE:9
  SystemTop_1: controllers.SystemTop,
  // @LINE:10
  UserInf_6: controllers.UserInf,
  // @LINE:15
  ShimonManage_3: controllers.ShimonManage,
  // @LINE:19
  DorilManage_2: controllers.DorilManage,
  // @LINE:23
  ModelManage_0: controllers.ModelManage,
  // @LINE:26
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:9
    SystemTop_1: controllers.SystemTop,
    // @LINE:10
    UserInf_6: controllers.UserInf,
    // @LINE:15
    ShimonManage_3: controllers.ShimonManage,
    // @LINE:19
    DorilManage_2: controllers.DorilManage,
    // @LINE:23
    ModelManage_0: controllers.ModelManage,
    // @LINE:26
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_5, SystemTop_1, UserInf_6, ShimonManage_3, DorilManage_2, ModelManage_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, SystemTop_1, UserInf_6, ShimonManage_3, DorilManage_2, ModelManage_0, Assets_4, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user_model""", """controllers.ModelManage.ShowUserModel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
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
    Application_5.index(),
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
    SystemTop_1.index(),
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
    UserInf_6.ShowLogin(),
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
    UserInf_6.LoginJudge(),
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
    UserInf_6.LoginJudge(),
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
    UserInf_6.ShowRegister(),
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
    UserInf_6.NewRegister(),
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
    ShimonManage_3.ShowShimon(),
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
    ShimonManage_3.ShowFShimonregi(),
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
    ShimonManage_3.ShowFShimonregi(),
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
    ShimonManage_3.MakeShimon(),
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
    DorilManage_2.ShowDoril(),
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
    DorilManage_2.ShowFDorilregi(),
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
    DorilManage_2.ShowFDorilregi(),
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
    DorilManage_2.MakeDoril(),
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

  // @LINE:23
  private[this] lazy val controllers_ModelManage_ShowUserModel15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user_model")))
  )
  private[this] lazy val controllers_ModelManage_ShowUserModel15_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:27
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
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
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.index())
      }
  
    // @LINE:9
    case controllers_SystemTop_index1_route(params) =>
      call { 
        controllers_SystemTop_index1_invoker.call(SystemTop_1.index())
      }
  
    // @LINE:10
    case controllers_UserInf_ShowLogin2_route(params) =>
      call { 
        controllers_UserInf_ShowLogin2_invoker.call(UserInf_6.ShowLogin())
      }
  
    // @LINE:11
    case controllers_UserInf_LoginJudge3_route(params) =>
      call { 
        controllers_UserInf_LoginJudge3_invoker.call(UserInf_6.LoginJudge())
      }
  
    // @LINE:12
    case controllers_UserInf_LoginJudge4_route(params) =>
      call { 
        controllers_UserInf_LoginJudge4_invoker.call(UserInf_6.LoginJudge())
      }
  
    // @LINE:13
    case controllers_UserInf_ShowRegister5_route(params) =>
      call { 
        controllers_UserInf_ShowRegister5_invoker.call(UserInf_6.ShowRegister())
      }
  
    // @LINE:14
    case controllers_UserInf_NewRegister6_route(params) =>
      call { 
        controllers_UserInf_NewRegister6_invoker.call(UserInf_6.NewRegister())
      }
  
    // @LINE:15
    case controllers_ShimonManage_ShowShimon7_route(params) =>
      call { 
        controllers_ShimonManage_ShowShimon7_invoker.call(ShimonManage_3.ShowShimon())
      }
  
    // @LINE:16
    case controllers_ShimonManage_ShowFShimonregi8_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi8_invoker.call(ShimonManage_3.ShowFShimonregi())
      }
  
    // @LINE:17
    case controllers_ShimonManage_ShowFShimonregi9_route(params) =>
      call { 
        controllers_ShimonManage_ShowFShimonregi9_invoker.call(ShimonManage_3.ShowFShimonregi())
      }
  
    // @LINE:18
    case controllers_ShimonManage_MakeShimon10_route(params) =>
      call { 
        controllers_ShimonManage_MakeShimon10_invoker.call(ShimonManage_3.MakeShimon())
      }
  
    // @LINE:19
    case controllers_DorilManage_ShowDoril11_route(params) =>
      call { 
        controllers_DorilManage_ShowDoril11_invoker.call(DorilManage_2.ShowDoril())
      }
  
    // @LINE:20
    case controllers_DorilManage_ShowFDorilregi12_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi12_invoker.call(DorilManage_2.ShowFDorilregi())
      }
  
    // @LINE:21
    case controllers_DorilManage_ShowFDorilregi13_route(params) =>
      call { 
        controllers_DorilManage_ShowFDorilregi13_invoker.call(DorilManage_2.ShowFDorilregi())
      }
  
    // @LINE:22
    case controllers_DorilManage_MakeDoril14_route(params) =>
      call { 
        controllers_DorilManage_MakeDoril14_invoker.call(DorilManage_2.MakeDoril())
      }
  
    // @LINE:23
    case controllers_ModelManage_ShowUserModel15_route(params) =>
      call { 
        controllers_ModelManage_ShowUserModel15_invoker.call(ModelManage_0.ShowUserModel())
      }
  
    // @LINE:26
    case controllers_Assets_versioned16_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:27
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_4.at(path, file))
      }
  }
}