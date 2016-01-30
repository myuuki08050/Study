
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object doril_anschk_Scope0 {
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

class doril_anschk extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(doril_state: String)(doril_tag: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

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
            <div>"""),_display_(/*27.19*/doril_state),format.raw/*27.30*/("""</div>
            <div>(タグ："""),_display_(/*28.23*/doril_tag),format.raw/*28.32*/(""")</div>
            <br>
            <form action="/doril_solve" method="POST">
                <input type="submit" id="image-btn1" name=d_solve value="maru" />
                <input type="submit" id="image-btn2" name=d_solve value="batu" />
            </form>
            </div>
        </div>
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(doril_state:String,doril_tag:String): play.twirl.api.HtmlFormat.Appendable = apply(doril_state)(doril_tag)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (doril_state) => (doril_tag) => apply(doril_state)(doril_tag)

  def ref: this.type = this

}


}

/**/
object doril_anschk extends doril_anschk_Scope0.doril_anschk
              /*
                  -- GENERATED --
                  DATE: Sat Jan 30 23:27:56 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril_anschk.scala.html
                  HASH: c5441377096e1a6eede33f312ebbf952db9fe563
                  MATRIX: 766->1|901->41|931->45|1321->409|1335->415|1396->455|1985->1017|2017->1028|2074->1058|2104->1067
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|59->28
                  -- GENERATED --
              */
          