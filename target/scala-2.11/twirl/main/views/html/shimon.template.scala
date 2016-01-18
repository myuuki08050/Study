
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object shimon_Scope0 {
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

class shimon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,List[String],List[String],List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(problem_state: String)(programs: List[String])(tags: List[String])(smallproblems: List[String])(subprograms: List[String])(solves: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.147*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>Shimon Solve</title>
    </head>
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>Shimon Solve</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="xxx.html">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
    	</ul>
    	
    	<script type="text/javascript">
            function ChangeTab(tabname) """),format.raw/*27.41*/("""{"""),format.raw/*27.42*/("""
            """),format.raw/*28.13*/("""// タブメニュー実装
            document.getElementById('tab1').style.display = 'none';
            document.getElementById('tab2').style.display = 'none';
            document.getElementById('tab3').style.display = 'none';
            // タブメニュー実装
            document.getElementById(tabname).style.display = 'block';
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</script>
        
        <div id="content">
    	
    	<div class="tabbox">
        
        <p class="tabs">
            <a href="#tab1" class="tab1" onclick="ChangeTab('tab1'); return false;">大問</a>
            <a href="#tab2" class="tab2" onclick="ChangeTab('tab2'); return false;">タグ</a>
            <a href="#tab3" class="tab3" onclick="ChangeTab('tab3'); return false;">回答</a>
        </p>
        
        <div id="tab1" class="tab">
            """),_display_(/*48.14*/problem_state),format.raw/*48.27*/("""
            
            """),_display_(/*50.14*/for(program <- programs) yield /*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
                """),format.raw/*51.17*/("""<div>"""),_display_(/*51.23*/program),format.raw/*51.30*/("""</div>
            """)))}),format.raw/*52.14*/("""
            
        """),format.raw/*54.9*/("""</div>

        <div id="tab2" class="tab">
        
            """),_display_(/*58.14*/for(tag <- tags) yield /*58.30*/ {_display_(Seq[Any](format.raw/*58.32*/("""
                """),format.raw/*59.17*/("""<div>"""),_display_(/*59.23*/tag),format.raw/*59.26*/("""</div>
            """)))}),format.raw/*60.14*/("""
            
"""),format.raw/*62.1*/("""　      </div>

        <div id="tab3" class="tab">
        
            """),_display_(/*66.14*/for(smallproblem <- smallproblems) yield /*66.48*/ {_display_(Seq[Any](format.raw/*66.50*/("""
                """),format.raw/*67.17*/("""<div>"""),_display_(/*67.23*/smallproblem),format.raw/*67.35*/("""</div>
                """),_display_(/*68.18*/for(subprogram <- subprograms) yield /*68.48*/ {_display_(Seq[Any](format.raw/*68.50*/("""
                    """),format.raw/*69.21*/("""<div>"""),_display_(/*69.27*/subprogram),format.raw/*69.37*/("""</div>
                """)))}),format.raw/*70.18*/("""
                """),_display_(/*71.18*/for(solve <- solves) yield /*71.38*/ {_display_(Seq[Any](format.raw/*71.40*/("""
                    """),format.raw/*72.21*/("""<div>"""),_display_(/*72.27*/solve),format.raw/*72.32*/("""</div>
                """)))}),format.raw/*73.18*/("""
                
            """)))}),format.raw/*75.14*/("""
            
        """),format.raw/*77.9*/("""</div>
   
        </div>
        </div>
        
        <script type="text/javascript">
            ChangeTab('tab1');
        </script>
        
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(problem_state:String,programs:List[String],tags:List[String],smallproblems:List[String],subprograms:List[String],solves:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(problem_state)(programs)(tags)(smallproblems)(subprograms)(solves)

  def f:((String) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => play.twirl.api.HtmlFormat.Appendable) = (problem_state) => (programs) => (tags) => (smallproblems) => (subprograms) => (solves) => apply(problem_state)(programs)(tags)(smallproblems)(subprograms)(solves)

  def ref: this.type = this

}


}

/**/
object shimon extends shimon_Scope0.shimon
              /*
                  -- GENERATED --
                  DATE: Mon Jan 18 19:36:41 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: ec241abf58ef679149f0cbf4610caab62f3c2131
                  MATRIX: 812->1|1053->146|1083->150|1473->514|1487->520|1548->560|2181->1165|2210->1166|2252->1180|2603->1504|2632->1505|2669->1515|3165->1984|3199->1997|3255->2026|3295->2050|3335->2052|3381->2070|3414->2076|3442->2083|3494->2104|3545->2128|3642->2198|3674->2214|3714->2216|3760->2234|3793->2240|3817->2243|3869->2264|3912->2280|4016->2357|4066->2391|4106->2393|4152->2411|4185->2417|4218->2429|4270->2454|4316->2484|4356->2486|4406->2508|4439->2514|4470->2524|4526->2549|4572->2568|4608->2588|4648->2590|4698->2612|4731->2618|4757->2623|4813->2648|4877->2681|4928->2705
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|65->34|65->34|66->35|79->48|79->48|81->50|81->50|81->50|82->51|82->51|82->51|83->52|85->54|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|106->75|108->77
                  -- GENERATED --
              */
          