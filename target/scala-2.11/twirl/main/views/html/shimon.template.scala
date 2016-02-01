
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
                """),format.raw/*55.17*/("""<div>"""),_display_(/*55.23*/{obj}),format.raw/*55.28*/("""</div>
            """)))}),format.raw/*56.14*/("""
            
            """),_display_(/*58.14*/for((obj,i) <- problem_condition.zipWithIndex) yield /*58.60*/ {_display_(Seq[Any](format.raw/*58.62*/("""
                """),format.raw/*59.17*/("""<li>"""),_display_(/*59.22*/{obj}),format.raw/*59.27*/("""</li>
            """)))}),format.raw/*60.14*/("""
            
            """),_display_(/*62.14*/for((obj,i) <- tags.zipWithIndex) yield /*62.47*/ {_display_(Seq[Any](format.raw/*62.49*/("""
                """),format.raw/*63.17*/("""<div> 付加タグ"""),_display_(/*63.28*/{i+1}),format.raw/*63.33*/(""" """),format.raw/*63.34*/(""": """),_display_(/*63.37*/{obj}),format.raw/*63.42*/("""</div>
            """)))}),format.raw/*64.14*/("""
            
         """),format.raw/*66.10*/("""</div>
 
        <div id="tab2" class="tab">
        
            """),_display_(/*70.14*/for((obj,i) <- programs.zipWithIndex) yield /*70.51*/ {_display_(Seq[Any](format.raw/*70.53*/("""
                """),format.raw/*71.17*/("""<div>"""),_display_(/*71.23*/{obj}),format.raw/*71.28*/("""</div>
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
                """),format.raw/*90.17*/("""<div>"""),_display_(/*90.23*/state),format.raw/*90.28*/("""</div>
            """)))}),format.raw/*91.14*/("""
            
            """),_display_(/*93.14*/for(condition <- smallproblemcondition) yield /*93.53*/ {_display_(Seq[Any](format.raw/*93.55*/("""
                """),format.raw/*94.17*/("""<li>"""),_display_(/*94.22*/condition),format.raw/*94.31*/("""</li>
            """)))}),format.raw/*95.14*/("""
            
            """),_display_(/*97.14*/for(subprogram <- subprograms) yield /*97.44*/ {_display_(Seq[Any](format.raw/*97.46*/("""
                """),format.raw/*98.17*/("""<div>"""),_display_(/*98.23*/subprogram),format.raw/*98.33*/("""</div>
            """)))}),format.raw/*99.14*/("""
            
"""),format.raw/*101.1*/("""　      </div>

        <div id="tab4" class="ttab">
            
        """),_display_(/*105.10*/if(solves.size() == 0)/*105.32*/{_display_(Seq[Any](format.raw/*105.33*/("""
            """),format.raw/*106.13*/("""<form action="/shimon_solve" method="POST">
            <input type="text" name="solve"/>
            <br>
            <input type="submit" value="SOLVE"/>
            </form>
        """)))}/*111.11*/else/*111.16*/{_display_(Seq[Any](format.raw/*111.17*/("""
            """),format.raw/*112.13*/("""<form action="/shimon_solve" method="POST">
            """),_display_(/*113.14*/for(solve <- solves) yield /*113.34*/ {_display_(Seq[Any](format.raw/*113.36*/(""" 
                """),format.raw/*114.17*/("""<input type="radio" name=solve value="""),_display_(/*114.55*/solve),format.raw/*114.60*/(""" """),format.raw/*114.61*/("""/>
                """),_display_(/*115.18*/solve),format.raw/*115.23*/("""
                """),format.raw/*116.17*/("""<br>
            """)))}),format.raw/*117.14*/("""
            """),format.raw/*118.13*/("""<input type="submit" value="SOLVE"/>
            </form>
        """)))}),format.raw/*120.10*/("""  
            
        """),format.raw/*122.9*/("""</div>
   
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
                  DATE: Tue Feb 02 07:00:55 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: f3411baed531f459a86939735d98c4860db9011a
                  MATRIX: 844->1|1165->226|1193->228|1578->587|1592->593|1653->633|2260->1212|2289->1213|2330->1226|2612->1480|2641->1481|2695->1507|2752->1536|2781->1537|2822->1550|3104->1804|3133->1805|3169->1814|3570->2188|3628->2230|3668->2232|3713->2249|3746->2255|3772->2260|3823->2280|3877->2307|3939->2353|3979->2355|4024->2372|4056->2377|4082->2382|4132->2401|4186->2428|4235->2461|4275->2463|4320->2480|4358->2491|4384->2496|4413->2497|4443->2500|4469->2505|4520->2525|4571->2548|4665->2615|4718->2652|4758->2654|4803->2671|4836->2677|4862->2682|4913->2702|4958->2720|5375->3110|5422->3141|5462->3143|5507->3160|5540->3166|5566->3171|5617->3191|5671->3218|5726->3257|5766->3259|5811->3276|5843->3281|5873->3290|5923->3309|5977->3336|6023->3366|6063->3368|6108->3385|6141->3391|6172->3401|6223->3421|6265->3435|6367->3509|6399->3531|6439->3532|6481->3545|6686->3731|6700->3736|6740->3737|6782->3750|6867->3807|6904->3827|6945->3829|6992->3847|7058->3885|7085->3890|7115->3891|7163->3911|7190->3916|7236->3933|7286->3951|7328->3964|7426->4030|7478->4054
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|64->33|64->33|66->35|66->35|66->35|67->36|72->41|72->41|73->42|85->54|85->54|85->54|86->55|86->55|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|95->64|97->66|101->70|101->70|101->70|102->71|102->71|102->71|103->72|105->74|120->89|120->89|120->89|121->90|121->90|121->90|122->91|124->93|124->93|124->93|125->94|125->94|125->94|126->95|128->97|128->97|128->97|129->98|129->98|129->98|130->99|132->101|136->105|136->105|136->105|137->106|142->111|142->111|142->111|143->112|144->113|144->113|144->113|145->114|145->114|145->114|145->114|146->115|146->115|147->116|148->117|149->118|151->120|153->122
                  -- GENERATED --
              */
          