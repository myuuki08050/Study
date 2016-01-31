
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

class doril_anschk extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(judge: String)(commentary: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>"""),_display_(/*9.17*/judge),format.raw/*9.22*/("""</title>
    </head>
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>"""),_display_(/*15.28*/judge),format.raw/*15.33*/("""</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>
    
        <div id="content">
            """),_display_(/*27.14*/if(judge == "true")/*27.33*/{_display_(Seq[Any](format.raw/*27.34*/("""
                """),format.raw/*28.17*/("""<h1>Correct Answer</h1>
            """)))}/*29.15*/else/*29.20*/{_display_(Seq[Any](format.raw/*29.21*/("""
                """),format.raw/*30.17*/("""<h1>Wrong Answer</h1>
            """)))}),format.raw/*31.14*/("""
            
            """),format.raw/*33.13*/("""<div>[解説]</div>
            
            """),_display_(/*35.14*/for((obj,i) <- commentary.zipWithIndex) yield /*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
                """),format.raw/*36.17*/("""<div>"""),_display_(/*36.23*/{obj}),format.raw/*36.28*/("""</div>
            """)))}),format.raw/*37.14*/("""
            
            """),_display_(/*39.14*/helper/*39.20*/.form(action = routes.DorilManage.ShowDoril)/*39.64*/ {_display_(Seq[Any](format.raw/*39.66*/("""
                """),format.raw/*40.17*/("""<input type="submit" value="次へ"/>
            """)))}),format.raw/*41.14*/("""
        """),format.raw/*42.9*/("""</div>
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(judge:String,commentary:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(judge)(commentary)

  def f:((String) => (List[String]) => play.twirl.api.HtmlFormat.Appendable) = (judge) => (commentary) => apply(judge)(commentary)

  def ref: this.type = this

}


}

/**/
object doril_anschk extends doril_anschk_Scope0.doril_anschk
              /*
                  -- GENERATED --
                  DATE: Mon Feb 01 04:42:12 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril_anschk.scala.html
                  HASH: 9fb22306ff5dd22b94c5c5bd9b98661104b133d2
                  MATRIX: 772->1|908->42|938->46|1328->410|1342->416|1403->456|1449->476|1474->481|1614->594|1640->599|2071->1003|2099->1022|2138->1023|2184->1041|2241->1080|2254->1085|2293->1086|2339->1104|2406->1140|2462->1168|2533->1212|2588->1251|2628->1253|2674->1271|2707->1277|2733->1282|2785->1303|2841->1332|2856->1338|2909->1382|2949->1384|2995->1402|3074->1450|3111->1460
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|46->15|46->15|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|70->39|70->39|70->39|70->39|71->40|72->41|73->42
                  -- GENERATED --
              */
          