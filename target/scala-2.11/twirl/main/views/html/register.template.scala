
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



"""),format.raw/*5.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*10.100*/("""">
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
        <h1>"""),_display_(/*28.14*/title),format.raw/*28.19*/("""</h1>
    
        """),_display_(/*30.10*/helper/*30.16*/.form(action = routes.Application.NewRegister)/*30.62*/ {_display_(Seq[Any](format.raw/*30.64*/("""
        	"""),_display_(/*31.11*/helper/*31.17*/.inputText(form("user_id"))),format.raw/*31.44*/("""
        	"""),_display_(/*32.11*/helper/*32.17*/.inputPassword(form("password"))),format.raw/*32.49*/("""
             """),format.raw/*33.14*/("""<input type="radio" id="a" name="use_kind" value="nonadmin"  >
                <label for="a">通常利用者として登録</label>
                <input type="radio" id="b" name="use_kind" value="admin"  >
                <label for="gender_female">管理者として登録</label>
        	<input type="submit" value="登録"/>
        """)))}),format.raw/*38.10*/("""
        
        """),format.raw/*40.9*/("""</div>
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
                  DATE: Tue Jan 26 05:10:29 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/register.scala.html
                  HASH: dac7a4102ae8a4e602415f7c85c08be80c1916c6
                  MATRIX: 762->1|890->34|920->38|1306->397|1321->403|1383->443|1940->973|1966->978|2013->998|2028->1004|2083->1050|2123->1052|2161->1063|2176->1069|2224->1096|2262->1107|2277->1113|2330->1145|2372->1159|2704->1460|2749->1478
                  LINES: 27->1|32->1|36->5|41->10|41->10|41->10|59->28|59->28|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|69->38|71->40
                  -- GENERATED --
              */
          