
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object doril_Scope0 {
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

class doril extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(doril_state: List[String])(doril_tag: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>Doril Solve</title>
    </head>
    <body>
        <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>Doril Solve</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>
    
        <div id="content">
            """),_display_(/*27.14*/for((obj,i) <- doril_state.zipWithIndex) yield /*27.54*/ {_display_(Seq[Any](format.raw/*27.56*/("""
                """),format.raw/*28.17*/("""<a>"""),_display_(/*28.21*/{obj}),format.raw/*28.26*/("""</a><br>
            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""<a>(タグ："""),_display_(/*30.21*/doril_tag),format.raw/*30.30*/(""")</a>
            
            <form action="/doril_solve" method="POST">
                <input type="submit" id="image-btn1" name="d_solve" value="maru" />
                <input type="submit" id="image-btn2" name="d_solve" value="batu" />
            </form>
            
        </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(doril_state:List[String],doril_tag:String): play.twirl.api.HtmlFormat.Appendable = apply(doril_state)(doril_tag)

  def f:((List[String]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (doril_state) => (doril_tag) => apply(doril_state)(doril_tag)

  def ref: this.type = this

}


}

/**/
object doril extends doril_Scope0.doril
              /*
                  -- GENERATED --
                  DATE: Wed Feb 03 01:27:29 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril.scala.html
                  HASH: eeca909204aaf29f6cc0514fb318a673c753be4b
                  MATRIX: 758->1|899->47|929->51|1319->415|1333->421|1394->461|1981->1021|2037->1061|2077->1063|2123->1081|2154->1085|2180->1090|2234->1113|2276->1127|2311->1135|2341->1144
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30
                  -- GENERATED --
              */
          