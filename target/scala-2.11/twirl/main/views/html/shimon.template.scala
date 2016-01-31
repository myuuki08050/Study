
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
        <br><br>
        <dic class="tabbox2">
        
        <p class="tabs2">
            <a href="#tab3" class="tab3" onclick="ChangeTab2('tab3'); return false;">設問・条件</a>
            <a href="#tab4" class="tab4" onclick="ChangeTab2('tab4'); return false;">回答</a>
        </p>
        
       
        <div id="tab3" class="tab">
    
            """),_display_(/*87.14*/for(state <- smallproblemstate) yield /*87.45*/ {_display_(Seq[Any](format.raw/*87.47*/("""
                """),format.raw/*88.17*/("""<div>"""),_display_(/*88.23*/state),format.raw/*88.28*/("""</div>
            """)))}),format.raw/*89.14*/("""
            
            """),_display_(/*91.14*/for(condition <- smallproblemcondition) yield /*91.53*/ {_display_(Seq[Any](format.raw/*91.55*/("""
                """),format.raw/*92.17*/("""<li>"""),_display_(/*92.22*/condition),format.raw/*92.31*/("""</li>
            """)))}),format.raw/*93.14*/("""
            
            """),_display_(/*95.14*/for(subprogram <- subprograms) yield /*95.44*/ {_display_(Seq[Any](format.raw/*95.46*/("""
                """),format.raw/*96.17*/("""<div>"""),_display_(/*96.23*/subprogram),format.raw/*96.33*/("""</div>
            """)))}),format.raw/*97.14*/("""
            
"""),format.raw/*99.1*/("""　      </div>

        <div id="tab4" class="tab">
            
        """),_display_(/*103.10*/if(solves.size() == 0)/*103.32*/{_display_(Seq[Any](format.raw/*103.33*/("""
            """),format.raw/*104.13*/("""<form action="/shimon_solve" method="POST">
            <input type="text" name="solve"/>
            <br>
            <input type="submit" value="SOLVE"/>
            </form>
        """)))}/*109.11*/else/*109.16*/{_display_(Seq[Any](format.raw/*109.17*/("""
            """),format.raw/*110.13*/("""<form action="/shimon_solve" method="POST">
            """),_display_(/*111.14*/for(solve <- solves) yield /*111.34*/ {_display_(Seq[Any](format.raw/*111.36*/(""" 
                """),format.raw/*112.17*/("""<input type="radio" name=solve value="""),_display_(/*112.55*/solve),format.raw/*112.60*/(""" """),format.raw/*112.61*/("""/>
                """),_display_(/*113.18*/solve),format.raw/*113.23*/("""
                """),format.raw/*114.17*/("""<br>
            """)))}),format.raw/*115.14*/("""
            """),format.raw/*116.13*/("""<input type="submit" value="SOLVE"/>
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
                  DATE: Sun Jan 31 20:36:00 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon.scala.html
                  HASH: fba0dc7f515fdf174bfc84979bd9a221bf169e5b
                  MATRIX: 844->1|1165->226|1193->228|1578->587|1592->593|1653->633|2260->1212|2289->1213|2330->1226|2612->1480|2641->1481|2695->1507|2752->1536|2781->1537|2822->1550|3104->1804|3133->1805|3169->1814|3571->2189|3629->2231|3669->2233|3714->2250|3747->2256|3773->2261|3824->2281|3878->2308|3940->2354|3980->2356|4025->2373|4057->2378|4083->2383|4133->2402|4187->2429|4236->2462|4276->2464|4321->2481|4359->2492|4385->2497|4414->2498|4444->2501|4470->2506|4521->2526|4572->2549|4666->2616|4719->2653|4759->2655|4804->2672|4837->2678|4863->2683|4914->2703|4959->2721|5361->3096|5408->3127|5448->3129|5493->3146|5526->3152|5552->3157|5603->3177|5657->3204|5712->3243|5752->3245|5797->3262|5829->3267|5859->3276|5909->3295|5963->3322|6009->3352|6049->3354|6094->3371|6127->3377|6158->3387|6209->3407|6250->3421|6351->3494|6383->3516|6423->3517|6465->3530|6670->3716|6684->3721|6724->3722|6766->3735|6851->3792|6888->3812|6929->3814|6976->3832|7042->3870|7069->3875|7099->3876|7147->3896|7174->3901|7220->3918|7270->3936|7312->3949|7410->4015|7462->4039
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|59->28|64->33|64->33|66->35|66->35|66->35|67->36|72->41|72->41|73->42|85->54|85->54|85->54|86->55|86->55|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|95->64|97->66|101->70|101->70|101->70|102->71|102->71|102->71|103->72|105->74|118->87|118->87|118->87|119->88|119->88|119->88|120->89|122->91|122->91|122->91|123->92|123->92|123->92|124->93|126->95|126->95|126->95|127->96|127->96|127->96|128->97|130->99|134->103|134->103|134->103|135->104|140->109|140->109|140->109|141->110|142->111|142->111|142->111|143->112|143->112|143->112|143->112|144->113|144->113|145->114|146->115|147->116|149->118|151->120
                  -- GENERATED --
              */
          