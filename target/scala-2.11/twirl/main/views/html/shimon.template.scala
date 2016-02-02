
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

class shimon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[List[String],List[String],List[String],List[String],List[String],List[String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(problem_state: List[String])(problem_condition: List[String])(programs: List[String])(tags: List[String])(smallproblemstate: List[String])(smallproblemcondition: List[String])(subprograms: List[String])(solves: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.227*/("""

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
            function ChangeTab1(tabname) """),format.raw/*27.42*/("""{"""),format.raw/*27.43*/("""
            """),format.raw/*28.13*/("""// タブメニュー実装
            document.getElementById('tab1').style.display = 'none';
            document.getElementById('tab2').style.display = 'none';
            // タブメニュー実装
            document.getElementById(tabname).style.display = 'block';
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            
            """),format.raw/*35.13*/("""function ChangeTab2(tabname) """),format.raw/*35.42*/("""{"""),format.raw/*35.43*/("""
            """),format.raw/*36.13*/("""// タブメニュー実装
            document.getElementById('tab3').style.display = 'none';
            document.getElementById('tab4').style.display = 'none';
            // タブメニュー実装
            document.getElementById(tabname).style.display = 'block';
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/("""
        """),format.raw/*42.9*/("""</script>
        
        <div id="content">
    	
    	<div class="tabbox1">
        
        <p class="tabs">
            <a href="#tab1" class="tab1" onclick="ChangeTab1('tab1'); return false;">問題・条件</a>
            <a href="#tab2" class="tab2" onclick="ChangeTab1('tab2'); return false;">プログラム</a>
        </p>
        
        <div id="tab1" class="tab">
            """),_display_(/*54.14*/for((obj,i) <- problem_state.zipWithIndex) yield /*54.56*/ {_display_(Seq[Any](format.raw/*54.58*/("""
                """),format.raw/*55.17*/("""<a>"""),_display_(/*55.21*/{obj}),format.raw/*55.26*/("""</a><br>
            """)))}),format.raw/*56.14*/("""
            """),format.raw/*57.13*/("""<br>
            """),_display_(/*58.14*/for((obj,i) <- problem_condition.zipWithIndex) yield /*58.60*/ {_display_(Seq[Any](format.raw/*58.62*/("""
                """),format.raw/*59.17*/("""<li>"""),_display_(/*59.22*/{obj}),format.raw/*59.27*/("""</li>
            """)))}),format.raw/*60.14*/("""
            """),format.raw/*61.13*/("""<br>
            """),_display_(/*62.14*/for((obj,i) <- tags.zipWithIndex) yield /*62.47*/ {_display_(Seq[Any](format.raw/*62.49*/("""
                """),format.raw/*63.17*/("""<a>付加タグ"""),_display_(/*63.25*/{i+1}),format.raw/*63.30*/(""" """),format.raw/*63.31*/(""": """),_display_(/*63.34*/{obj}),format.raw/*63.39*/("""</a>
            """)))}),format.raw/*64.14*/("""
            
         """),format.raw/*66.10*/("""</div>
 
        <div id="tab2" class="tab">
        
            """),_display_(/*70.14*/for((obj,i) <- programs.zipWithIndex) yield /*70.51*/ {_display_(Seq[Any](format.raw/*70.53*/("""
                """),format.raw/*71.17*/("""<p class="program">"""),_display_(/*71.37*/{obj}),format.raw/*71.42*/("""</p>
            """)))}),format.raw/*72.14*/("""
        
        """),format.raw/*74.9*/("""</div>
        </div>
        
        <br>
        
        <dic class="tabbox2">
        
        <p class="tabs2">
            <a href="#tab3" class="tab3" onclick="ChangeTab2('tab3'); return false;">設問・条件</a>
            <a href="#tab4" class="tab4" onclick="ChangeTab2('tab4'); return false;">回答</a>
        </p>
        
       
        <div id="tab3" class="ttab">
    
            """),_display_(/*89.14*/for(state <- smallproblemstate) yield /*89.45*/ {_display_(Seq[Any](format.raw/*89.47*/("""
                """),format.raw/*90.17*/("""<a>"""),_display_(/*90.21*/state),format.raw/*90.26*/("""</a><br>
            """)))}),format.raw/*91.14*/("""
            
            """),_display_(/*93.14*/for(condition <- smallproblemcondition) yield /*93.53*/ {_display_(Seq[Any](format.raw/*93.55*/("""
                """),format.raw/*94.17*/("""<a><li>"""),_display_(/*94.25*/condition),format.raw/*94.34*/("""</li></a>
            """)))}),format.raw/*95.14*/("""
            
            """),_display_(/*97.14*/for(subprogram <- subprograms) yield /*97.44*/ {_display_(Seq[Any](format.raw/*97.46*/("""
                """),format.raw/*98.17*/("""<p class="program">"""),_display_(/*98.37*/subprogram),format.raw/*98.47*/("""</p>
            """)))}),format.raw/*99.14*/("""
            
"""),format.raw/*101.1*/("""　      </div>

        <div id="tab4" class="ttab">
            
        """),_display_(/*105.10*/if(solves.size() == 0)/*105.32*/{_display_(Seq[Any](format.raw/*105.33*/("""
            """),format.raw/*106.13*/("""<form action="/shimon_solve" method="POST">
                <input type="text" name="solve" class="subform"/>
                <input type="submit" value="SOLVE" class="subform"/>
            </form>
        """)))}/*110.11*/else/*110.16*/{_display_(Seq[Any](format.raw/*110.17*/("""
            """),format.raw/*111.13*/("""<form action="/shimon_solve" method="POST">
            """),_display_(/*112.14*/for(solve <- solves) yield /*112.34*/ {_display_(Seq[Any](format.raw/*112.36*/(""" 
                """),format.raw/*113.17*/("""<input type="radio" name=solve value="""),_display_(/*113.55*/solve),format.raw/*113.60*/(""" """),format.raw/*113.61*/("""class="subform"/>
                """),_display_(/*114.18*/solve),format.raw/*114.23*/("""<br>
            """)))}),format.raw/*115.14*/("""
            """),format.raw/*116.13*/("""<input type="submit" value="SOLVE" class="subform"/>
            </form>
        """)))}),format.raw/*118.10*/("""  
            
        """),format.raw/*120.9*/("""</div>
        </div>
        </div>
        
        <script type="text/javascript">
            ChangeTab1('tab1');
            ChangeTab2('tab3');
        </script>
        
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(problem_state:List[String],problem_condition:List[String],programs:List[String],tags:List[String],smallproblemstate:List[String],smallproblemcondition:List[String],subprograms:List[String],solves:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(problem_state)(problem_condition)(programs)(tags)(smallproblemstate)(smallproblemcondition)(subprograms)(solves)

  def f:((List[String]) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => (List[String]) => play.twirl.api.HtmlFormat.Appendable) = (problem_state) => (problem_condition) => (programs) => (tags) => (smallproblemstate) => (smallproblemcondition) => (subprograms) => (solves) => apply(problem_state)(problem_condition)(programs)(tags)(smallproblemstate)(smallproblemcondition)(subprograms)(solves)

  def ref: this.type = this

}


}

/**/
object shimon extends shimon_Scope0.shimon
              /*
                  -- GENERATED --
                  DATE: Wed Feb 03 04:12:47 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: 0fdab111d3f7396ceb0ba5d1b63b26c501a67795
                  MATRIX: 844->1|1165->226|1193->228|1578->587|1592->593|1653->633|2259->1211|2288->1212|2329->1225|2611->1479|2640->1480|2694->1506|2751->1535|2780->1536|2821->1549|3103->1803|3132->1804|3168->1813|3569->2187|3627->2229|3667->2231|3712->2248|3743->2252|3769->2257|3822->2279|3863->2292|3908->2310|3970->2356|4010->2358|4055->2375|4087->2380|4113->2385|4163->2404|4204->2417|4249->2435|4298->2468|4338->2470|4383->2487|4418->2495|4444->2500|4473->2501|4503->2504|4529->2509|4578->2527|4629->2550|4723->2617|4776->2654|4816->2656|4861->2673|4908->2693|4934->2698|4983->2716|5028->2734|5445->3124|5492->3155|5532->3157|5577->3174|5608->3178|5634->3183|5687->3205|5741->3232|5796->3271|5836->3273|5881->3290|5916->3298|5946->3307|6000->3330|6054->3357|6100->3387|6140->3389|6185->3406|6232->3426|6263->3436|6312->3454|6354->3468|6456->3542|6488->3564|6528->3565|6570->3578|6798->3787|6812->3792|6852->3793|6894->3806|6979->3863|7016->3883|7057->3885|7104->3903|7170->3941|7197->3946|7227->3947|7290->3982|7317->3987|7367->4005|7409->4018|7523->4100|7575->4124
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|64->33|64->33|66->35|66->35|66->35|67->36|72->41|72->41|73->42|85->54|85->54|85->54|86->55|86->55|86->55|87->56|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|92->61|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|95->64|97->66|101->70|101->70|101->70|102->71|102->71|102->71|103->72|105->74|120->89|120->89|120->89|121->90|121->90|121->90|122->91|124->93|124->93|124->93|125->94|125->94|125->94|126->95|128->97|128->97|128->97|129->98|129->98|129->98|130->99|132->101|136->105|136->105|136->105|137->106|141->110|141->110|141->110|142->111|143->112|143->112|143->112|144->113|144->113|144->113|144->113|145->114|145->114|146->115|147->116|149->118|151->120
                  -- GENERATED --
              */
          