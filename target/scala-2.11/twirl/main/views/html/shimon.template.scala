
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

class shimon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,List[String],List[String],String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(problem_state: String)(programs: List[String])(tags: List[String])(smallproblems: String)(subprograms: List[String])(solves: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.141*/("""

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
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
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
            <a href="#tab1" class="tab1" onclick="ChangeTab('tab1'); return false;">問題</a>
            <a href="#tab2" class="tab2" onclick="ChangeTab('tab2'); return false;">設問</a>
            <a href="#tab3" class="tab3" onclick="ChangeTab('tab3'); return false;">回答</a>
            
        </p>
        
        <div id="tab1" class="tab">
            <div>"""),_display_(/*49.19*/problem_state),format.raw/*49.32*/("""</div>
 
            
            """),_display_(/*52.14*/for((obj,i) <- programs.zipWithIndex) yield /*52.51*/ {_display_(Seq[Any](format.raw/*52.53*/("""
                """),format.raw/*53.17*/("""<div>"""),_display_(/*53.23*/{obj}),format.raw/*53.28*/("""</div>
            """)))}),format.raw/*54.14*/("""
            
            """),format.raw/*56.13*/("""<br>
            
            """),_display_(/*58.14*/for((obj,i) <- tags.zipWithIndex) yield /*58.47*/ {_display_(Seq[Any](format.raw/*58.49*/("""
                """),format.raw/*59.17*/("""<div> 付加タグ"""),_display_(/*59.28*/{i+1}),format.raw/*59.33*/(""" """),format.raw/*59.34*/(""": """),_display_(/*59.37*/{obj}),format.raw/*59.42*/("""</div>
            """)))}),format.raw/*60.14*/("""
            
            
        """),format.raw/*63.9*/("""</div>

        <div id="tab2" class="tab">
        
            """),_display_(/*67.14*/smallproblems),format.raw/*67.27*/("""
            """),_display_(/*68.14*/for(subprogram <- subprograms) yield /*68.44*/ {_display_(Seq[Any](format.raw/*68.46*/("""
                """),format.raw/*69.17*/("""<div>"""),_display_(/*69.23*/subprogram),format.raw/*69.33*/("""</div>
            """)))}),format.raw/*70.14*/("""
            
"""),format.raw/*72.1*/("""　      </div>

        <div id="tab3" class="tab">
            
        """),_display_(/*76.10*/if(solves.size() == 0)/*76.32*/{_display_(Seq[Any](format.raw/*76.33*/("""
            """),format.raw/*77.13*/("""<form action="/shimon_solve" method="POST">
            <input type="text" name="solve"/>
            <br>
            <input type="submit" value="SOLVE"/>
            </form>
        """)))}/*82.11*/else/*82.16*/{_display_(Seq[Any](format.raw/*82.17*/("""
            """),format.raw/*83.13*/("""<form action="/shimon_solve" method="POST">
            """),_display_(/*84.14*/for(solve <- solves) yield /*84.34*/ {_display_(Seq[Any](format.raw/*84.36*/(""" 
                """),format.raw/*85.17*/("""<div>
                """),_display_(/*86.18*/solve),format.raw/*86.23*/("""
                """),format.raw/*87.17*/("""<input type="radio" name=solve value="""),_display_(/*87.55*/solve),format.raw/*87.60*/(""" """),format.raw/*87.61*/("""/>
                </div>
            
            """)))}),format.raw/*90.14*/("""
            """),format.raw/*91.13*/("""<br>
            <input type="submit" value="SOLVE"/>
            </form>
        """)))}),format.raw/*94.10*/("""  
            
        """),format.raw/*96.9*/("""</div>
   
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

  def render(problem_state:String,programs:List[String],tags:List[String],smallproblems:String,subprograms:List[String],solves:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(problem_state)(programs)(tags)(smallproblems)(subprograms)(solves)

  def f:((String) => (List[String]) => (List[String]) => (String) => (List[String]) => (List[String]) => play.twirl.api.HtmlFormat.Appendable) = (problem_state) => (programs) => (tags) => (smallproblems) => (subprograms) => (solves) => apply(problem_state)(programs)(tags)(smallproblems)(subprograms)(solves)

  def ref: this.type = this

}


}

/**/
object shimon extends shimon_Scope0.shimon
              /*
                  -- GENERATED --
                  DATE: Sat Jan 30 20:31:12 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: 7371ef332656b21d9f0ba6d8b89e92cbf686ba5e
                  MATRIX: 806->1|1041->140|1069->142|1454->501|1468->507|1529->547|2135->1125|2164->1126|2205->1139|2550->1457|2579->1458|2615->1467|3116->1941|3150->1954|3212->1989|3265->2026|3305->2028|3350->2045|3383->2051|3409->2056|3460->2076|3514->2102|3572->2133|3621->2166|3661->2168|3706->2185|3744->2196|3770->2201|3799->2202|3829->2205|3855->2210|3906->2230|3968->2265|4061->2331|4095->2344|4136->2358|4182->2388|4222->2390|4267->2407|4300->2413|4331->2423|4382->2443|4423->2457|4523->2530|4554->2552|4593->2553|4634->2566|4838->2752|4851->2757|4890->2758|4931->2771|5015->2828|5051->2848|5091->2850|5137->2868|5187->2891|5213->2896|5258->2913|5323->2951|5349->2956|5378->2957|5461->3009|5502->3022|5616->3105|5667->3129
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|65->34|65->34|66->35|80->49|80->49|83->52|83->52|83->52|84->53|84->53|84->53|85->54|87->56|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|91->60|94->63|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|103->72|107->76|107->76|107->76|108->77|113->82|113->82|113->82|114->83|115->84|115->84|115->84|116->85|117->86|117->86|118->87|118->87|118->87|118->87|121->90|122->91|125->94|127->96
                  -- GENERATED --
              */
          