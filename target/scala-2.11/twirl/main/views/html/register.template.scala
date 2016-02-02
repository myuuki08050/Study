
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[User],play.twirl.api.HtmlFormat.Appendable] {

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
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
    	</ul>
    	
    	<div id="content">
            <h1>"""),_display_(/*26.18*/title),format.raw/*26.23*/("""</h1>
        
            """),_display_(/*28.14*/helper/*28.20*/.form(action = routes.Application.NewRegister, 'class -> "subform")/*28.87*/ {_display_(Seq[Any](format.raw/*28.89*/("""
            	"""),_display_(/*29.15*/helper/*29.21*/.inputText(form("user_id"))),format.raw/*29.48*/("""
            	"""),_display_(/*30.15*/helper/*30.21*/.inputPassword(form("password"))),format.raw/*30.53*/("""
                """),format.raw/*31.17*/("""<input type="radio" name="use_kind" value="nonadmin" checked="checked">
                <label for="a">通常利用者として登録</label>
                <input type="radio" name="use_kind" value="admin">
                <label for="b">管理者として登録</label><br>
            	<input type="submit" value="登録"/>
            """)))}),format.raw/*36.14*/("""
            
            """),format.raw/*38.13*/("""<h1><a href="/login">ログイン画面にもどる</a></h1>
        
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Wed Feb 03 01:56:10 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/register.scala.html
                  HASH: 9be4e1a976f32ac243252aa9de90009da4631087
                  MATRIX: 762->1|890->34|918->36|1303->395|1317->401|1378->441|1936->972|1962->977|2017->1005|2032->1011|2108->1078|2148->1080|2190->1095|2205->1101|2253->1128|2295->1143|2310->1149|2363->1181|2408->1198|2740->1499|2794->1525
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|57->26|57->26|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|67->36|69->38
                  -- GENERATED --
              */
          