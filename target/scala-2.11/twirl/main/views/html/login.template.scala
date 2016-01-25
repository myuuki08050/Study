
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(form: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>User Login</title>
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>User Login</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="xxx.html">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
    	</ul>
    	
    	<div id="content">
        <h1>"""),_display_(/*26.14*/title),format.raw/*26.19*/("""</h1>
    
        """),_display_(/*28.10*/helper/*28.16*/.form(action = routes.Application.auth)/*28.55*/ {_display_(Seq[Any](format.raw/*28.57*/("""
        	"""),_display_(/*29.11*/helper/*29.17*/.inputText(form("user_id"))),format.raw/*29.44*/("""
        	"""),_display_(/*30.11*/helper/*30.17*/.inputPassword(form("password"))),format.raw/*30.49*/("""
        	"""),format.raw/*31.10*/("""<input type="submit" value="LOGIN"/>
        """)))}),format.raw/*32.10*/("""
        
        """),format.raw/*34.9*/("""<h1><a href="/register">新規登録</a></h1>
        
        </div>
        </div>
        
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,form:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(title)(form)

  def f:((String) => (Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (form) => apply(title)(form)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Jan 26 04:34:41 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/login.scala.html
                  HASH: 343679bbef8084c54fb488925890f8f7feb6ea92
                  MATRIX: 756->1|884->34|912->36|1297->395|1311->401|1372->441|1929->971|1955->976|2002->996|2017->1002|2065->1041|2105->1043|2143->1054|2158->1060|2206->1087|2244->1098|2259->1104|2312->1136|2350->1146|2427->1192|2472->1210
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|57->26|57->26|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|65->34
                  -- GENERATED --
              */
          