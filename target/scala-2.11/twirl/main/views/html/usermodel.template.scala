
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usermodel_Scope0 {
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

class usermodel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,Int,Int,Int,Int,Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_id: String)(param1: Int)(param2: Int)(param3: Int)(param4: Int)(param5: Int)(param6: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <script type="text/javascript" src=""""),_display_(/*9.46*/routes/*9.52*/.Assets.at("javascripts/flotr2.min.js")),format.raw/*9.91*/("""" ></script>
        <title>User Model</title>
    </head>    
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>User Model</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="xxx.html">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
    	</ul>
    
        <div id="content">
            <div id="graph"></div>
            <h1><a href="/home">ホームにもどる</a></h1>
    	</div>
    	<script type="text/javascript">
    	
    	(function basic_radar(container) """),format.raw/*33.39*/("""{"""),format.raw/*33.40*/("""
            """),format.raw/*34.13*/("""var s1 = """),format.raw/*34.22*/("""{"""),format.raw/*34.23*/("""
            """),format.raw/*35.13*/("""label: """),_display_(/*35.21*/user_id),format.raw/*35.28*/(""",
            data: [[0, """),_display_(/*36.25*/param1),format.raw/*36.31*/("""],[1, """),_display_(/*36.38*/param2),format.raw/*36.44*/("""],[2, """),_display_(/*36.51*/param3),format.raw/*36.57*/("""],[3, """),_display_(/*36.64*/param4),format.raw/*36.70*/("""],[4, """),_display_(/*36.77*/param5),format.raw/*36.83*/("""],[5, """),_display_(/*36.90*/param6),format.raw/*36.96*/("""]]"""),format.raw/*36.98*/("""}"""),format.raw/*36.99*/(""",
            graph, ticks;
            ticks = [
            [0, "項目1"],
            [1, "項目2"],
            [2, "項目3"],
            [3, "項目4"],
            [4, "項目5"],
            [5, "項目6"]];
     
            graph = Flotr.draw(container, [s1], """),format.raw/*46.49*/("""{"""),format.raw/*46.50*/(""" """),format.raw/*46.51*/("""//canvasへの描画。変数を配列で指定して
                radar: """),format.raw/*47.24*/("""{"""),format.raw/*47.25*/("""show: true"""),format.raw/*47.35*/("""}"""),format.raw/*47.36*/(""",  //radar特有のオプション。デフォがfalseなのでtrueにして
                grid: """),format.raw/*48.23*/("""{"""),format.raw/*48.24*/("""
                    """),format.raw/*49.21*/("""circular: true,   //罫線を多角形に。必須。
                    minorHorizontalLines: true"""),format.raw/*50.47*/("""}"""),format.raw/*50.48*/(""",  //細かい（マイナーな）水平の罫線を表示する
                yaxis: """),format.raw/*51.24*/("""{"""),format.raw/*51.25*/("""    """),format.raw/*51.29*/("""//yaxisはy軸。この場合は中心から各頂点への軸
                    min: 0,
                    max: 10,
                    minorTickFreq: 2"""),format.raw/*54.37*/("""}"""),format.raw/*54.38*/(""",  //小目盛りのテキストを表示する頻度
                xaxis: """),format.raw/*55.24*/("""{"""),format.raw/*55.25*/("""ticks: ticks"""),format.raw/*55.37*/("""}"""),format.raw/*55.38*/(""",  //xaxisはx軸。変数ticksを各頂点に表示
                legend: """),format.raw/*56.25*/("""{"""),format.raw/*56.26*/("""
                    """),format.raw/*57.21*/("""position: 'se',
                    backgroundColor: '#ffc'  //円グラフと同じように位置と背景色を変更
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/(""");
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""")(document.getElementById("graph"));
        
        </script>
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(user_id:String,param1:Int,param2:Int,param3:Int,param4:Int,param5:Int,param6:Int): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(param1)(param2)(param3)(param4)(param5)(param6)

  def f:((String) => (Int) => (Int) => (Int) => (Int) => (Int) => (Int) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (param1) => (param2) => (param3) => (param4) => (param5) => (param6) => apply(user_id)(param1)(param2)(param3)(param4)(param5)(param6)

  def ref: this.type = this

}


}

/**/
object usermodel extends usermodel_Scope0.usermodel
              /*
                  -- GENERATED --
                  DATE: Tue Jan 19 06:58:01 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/usermodel.scala.html
                  HASH: 6b8276403edec20a6ff70ec253ad8ccba5a33946
                  MATRIX: 777->1|967->96|995->98|1380->457|1394->463|1455->503|1529->551|1543->557|1602->596|2352->1318|2381->1319|2422->1332|2459->1341|2488->1342|2529->1355|2564->1363|2592->1370|2645->1396|2672->1402|2706->1409|2733->1415|2767->1422|2794->1428|2828->1435|2855->1441|2889->1448|2916->1454|2950->1461|2977->1467|3007->1469|3036->1470|3313->1719|3342->1720|3371->1721|3446->1768|3475->1769|3513->1779|3542->1780|3631->1841|3660->1842|3709->1863|3815->1941|3844->1942|3921->1991|3950->1992|3982->1996|4130->2116|4159->2117|4232->2162|4261->2163|4301->2175|4330->2176|4411->2229|4440->2230|4489->2251|4616->2350|4645->2351|4686->2364|4715->2365|4753->2376|4782->2377
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|79->48|80->49|81->50|81->50|82->51|82->51|82->51|85->54|85->54|86->55|86->55|86->55|86->55|87->56|87->56|88->57|90->59|90->59|91->60|91->60|92->61|92->61
                  -- GENERATED --
              */
          