
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Wed Oct 28 19:18:45 JST 2015

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
  Application_1: controllers.Application,
  // @LINE:9
  SystemTop_2: controllers.SystemTop,
  // @LINE:10
  UserInf_3: controllers.UserInf,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    SystemTop_2: controllers.SystemTop,
    // @LINE:10
    UserInf_3: controllers.UserInf,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, SystemTop_2, UserInf_3, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, SystemTop_2, UserInf_3, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """top""", """controllers.SystemTop.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserInf.ShowLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.UserInf.LoginJudge()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserInf.ShowRegister()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regicomplete""", """controllers.UserInf.NewRegister()"""),
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
    Application_1.index(),
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
    SystemTop_2.index(),
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
    UserInf_3.ShowLogin(),
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
  private[this] lazy val controllers_UserInf_LoginJudge3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_UserInf_LoginJudge3_invoker = createInvoker(
    UserInf_3.LoginJudge(),
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

  // @LINE:12
  private[this] lazy val controllers_UserInf_ShowRegister4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserInf_ShowRegister4_invoker = createInvoker(
    UserInf_3.ShowRegister(),
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

  // @LINE:13
  private[this] lazy val controllers_UserInf_NewRegister5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regicomplete")))
  )
  private[this] lazy val controllers_UserInf_NewRegister5_invoker = createInvoker(
    UserInf_3.NewRegister(),
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

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_SystemTop_index1_route(params) =>
      call { 
        controllers_SystemTop_index1_invoker.call(SystemTop_2.index())
      }
  
    // @LINE:10
    case controllers_UserInf_ShowLogin2_route(params) =>
      call { 
        controllers_UserInf_ShowLogin2_invoker.call(UserInf_3.ShowLogin())
      }
  
    // @LINE:11
    case controllers_UserInf_LoginJudge3_route(params) =>
      call { 
        controllers_UserInf_LoginJudge3_invoker.call(UserInf_3.LoginJudge())
      }
  
    // @LINE:12
    case controllers_UserInf_ShowRegister4_route(params) =>
      call { 
        controllers_UserInf_ShowRegister4_invoker.call(UserInf_3.ShowRegister())
      }
  
    // @LINE:13
    case controllers_UserInf_NewRegister5_route(params) =>
      call { 
        controllers_UserInf_NewRegister5_invoker.call(UserInf_3.NewRegister())
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}