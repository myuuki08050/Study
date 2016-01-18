
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

class doril extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,List[String],List[String],List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Doril Solve</title>
    </head>
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>Doril Solve</h1></div>
    	
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
object doril extends doril_Scope0.doril
              /*
                  -- GENERATED --
                  DATE: Mon Jan 18 23:53:26 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril.scala.html
                  HASH: 030dbfc74c748c2b305bfaf16cd3181790f7c0b9
                  MATRIX: 810->1|1051->146|1081->150|1471->514|1485->520|1546->560|2177->1163|2206->1164|2248->1178|2599->1502|2628->1503|2665->1513|3161->1982|3195->1995|3251->2024|3291->2048|3331->2050|3377->2068|3410->2074|3438->2081|3490->2102|3541->2126|3638->2196|3670->2212|3710->2214|3756->2232|3789->2238|3813->2241|3865->2262|3908->2278|4012->2355|4062->2389|4102->2391|4148->2409|4181->2415|4214->2427|4266->2452|4312->2482|4352->2484|4402->2506|4435->2512|4466->2522|4522->2547|4568->2566|4604->2586|4644->2588|4694->2610|4727->2616|4753->2621|4809->2646|4873->2679|4924->2703
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|65->34|65->34|66->35|79->48|79->48|81->50|81->50|81->50|82->51|82->51|82->51|83->52|85->54|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|106->75|108->77
                  -- GENERATED --
              */
          