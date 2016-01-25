
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
            <a href="#tab3" class="tab3" onclick="ChangeTab('tab3'); return false;">小問</a>
        </p>
        
        <div id="tab1" class="tab">
            """),_display_(/*50.14*/problem_state),format.raw/*50.27*/("""
            
            """),_display_(/*52.14*/for(program <- programs) yield /*52.38*/ {_display_(Seq[Any](format.raw/*52.40*/("""
                """),format.raw/*53.17*/("""<div>"""),_display_(/*53.23*/program),format.raw/*53.30*/("""</div>
            """)))}),format.raw/*54.14*/("""
            
        """),format.raw/*56.9*/("""</div>

        <div id="tab2" class="tab">
            """),_display_(/*59.14*/for(tag <- tags) yield /*59.30*/ {_display_(Seq[Any](format.raw/*59.32*/("""
                """),format.raw/*60.17*/("""<div>"""),_display_(/*60.23*/tag),format.raw/*60.26*/("""</div>
            """)))}),format.raw/*61.14*/("""
            
"""),format.raw/*63.1*/("""　      </div>

        <div id="tab3" class="tab">
        
            """),_display_(/*67.14*/for(smallproblem <- smallproblems) yield /*67.48*/ {_display_(Seq[Any](format.raw/*67.50*/("""
                """),format.raw/*68.17*/("""<div>"""),_display_(/*68.23*/smallproblem),format.raw/*68.35*/("""</div>
            """)))}),format.raw/*69.14*/("""
            """),_display_(/*70.14*/for(subprogram <- subprograms) yield /*70.44*/ {_display_(Seq[Any](format.raw/*70.46*/("""
                """),format.raw/*71.17*/("""<div>"""),_display_(/*71.23*/subprogram),format.raw/*71.33*/("""</div>
            """)))}),format.raw/*72.14*/("""
            
            """),_display_(/*74.14*/if(solves.size() == 0)/*74.36*/{_display_(Seq[Any](format.raw/*74.37*/("""
                """),format.raw/*75.17*/("""<form action="/solve_check" method="POST">
                    <input type="text" name="tx_solve"/>
                    <br>
                    <input type="submit" value="SOLVE"/>
                </form>
            """)))}/*80.15*/else/*80.20*/{_display_(Seq[Any](format.raw/*80.21*/("""
                """),format.raw/*81.17*/("""<form action="/solve_check" method="POST">
                """),_display_(/*82.18*/for(solve <- solves) yield /*82.38*/ {_display_(Seq[Any](format.raw/*82.40*/(""" 
                    """),format.raw/*83.21*/("""<div>"""),_display_(/*83.27*/solve),format.raw/*83.32*/("""</div>
                    <input type="radio" name="tx_solve"/>
                """)))}),format.raw/*85.18*/("""
                """),format.raw/*86.17*/("""<br>
                <input type="submit" value="SOLVE"/>
                </form>
            """)))}),format.raw/*89.14*/("""
        """),format.raw/*90.9*/("""</div>
            
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
                  DATE: Mon Jan 25 19:21:01 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: 8a1ab0d917499acaeb5059b24e8842b1ff8e4bb6
                  MATRIX: 812->1|1053->146|1083->150|1473->514|1487->520|1548->560|2181->1165|2210->1166|2252->1180|2603->1504|2632->1505|2669->1515|3185->2004|3219->2017|3275->2046|3315->2070|3355->2072|3401->2090|3434->2096|3462->2103|3514->2124|3565->2148|3652->2208|3684->2224|3724->2226|3770->2244|3803->2250|3827->2253|3879->2274|3922->2290|4026->2367|4076->2401|4116->2403|4162->2421|4195->2427|4228->2439|4280->2460|4322->2475|4368->2505|4408->2507|4454->2525|4487->2531|4518->2541|4570->2562|4626->2591|4657->2613|4696->2614|4742->2632|4985->2857|4998->2862|5037->2863|5083->2881|5171->2942|5207->2962|5247->2964|5298->2987|5331->2993|5357->2998|5472->3082|5518->3100|5647->3198|5684->3208
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|65->34|65->34|66->35|81->50|81->50|83->52|83->52|83->52|84->53|84->53|84->53|85->54|87->56|90->59|90->59|90->59|91->60|91->60|91->60|92->61|94->63|98->67|98->67|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|105->74|105->74|105->74|106->75|111->80|111->80|111->80|112->81|113->82|113->82|113->82|114->83|114->83|114->83|116->85|117->86|120->89|121->90
                  -- GENERATED --
              */
          