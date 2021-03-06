
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[User],play.twirl.api.HtmlFormat.Appendable] {

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
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>
    	
    	<div id="content">
        <h1>ログイン</h1>
    
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
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jan 29 21:30:34 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/main.scala.html
                  HASH: 9b4e85ea2f072dfd8878e07738cdaacbeeadbfba
                  MATRIX: 754->1|882->34|910->36|1295->395|1309->401|1370->441|1945->989|1960->995|2008->1034|2048->1036|2086->1047|2101->1053|2149->1080|2187->1091|2202->1097|2255->1129|2293->1139|2370->1185|2415->1203
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|65->34
                  -- GENERATED --
              */
          