
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
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>
    
        <div id="content">
            <div id="graph"></div>
            <h1><a href="/home">ホームにもどる</a></h1>
    	</div>
    	
    	<script type="text/javascript">
    	
    	(function basic_radar(container) """),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""
            """),format.raw/*35.13*/("""var s1 = """),format.raw/*35.22*/("""{"""),format.raw/*35.23*/("""
            """),format.raw/*36.13*/("""label: "Aさん",
            data: [[0, 100],[1, 100],[2, 100],[3, 100],[4, 100],[5, 100]]"""),format.raw/*37.74*/("""}"""),format.raw/*37.75*/(""",
            graph, ticks;
            ticks = [
            [0, "項目1"],
            [1, "項目2"],
            [2, "項目3"],
            [3, "項目4"],
            [4, "項目5"],
            [5, "項目6"]];
     
            graph = Flotr.draw(container, [s1], """),format.raw/*47.49*/("""{"""),format.raw/*47.50*/(""" """),format.raw/*47.51*/("""//canvasへの描画。変数を配列で指定して
                radar: """),format.raw/*48.24*/("""{"""),format.raw/*48.25*/("""show: true"""),format.raw/*48.35*/("""}"""),format.raw/*48.36*/(""",  //radar特有のオプション。デフォがfalseなのでtrueにして
                grid: """),format.raw/*49.23*/("""{"""),format.raw/*49.24*/("""
                    """),format.raw/*50.21*/("""circular: true,   //罫線を多角形に。必須。
                    minorHorizontalLines: true"""),format.raw/*51.47*/("""}"""),format.raw/*51.48*/(""",  //細かい（マイナーな）水平の罫線を表示する
                yaxis: """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""    """),format.raw/*52.29*/("""//yaxisはy軸。この場合は中心から各頂点への軸
                    min: 0,
                    max: 100,
                    minorTickFreq: 10"""),format.raw/*55.38*/("""}"""),format.raw/*55.39*/(""",  //小目盛りのテキストを表示する頻度
                xaxis: """),format.raw/*56.24*/("""{"""),format.raw/*56.25*/("""ticks: ticks"""),format.raw/*56.37*/("""}"""),format.raw/*56.38*/(""",  //xaxisはx軸。変数ticksを各頂点に表示
                legend: """),format.raw/*57.25*/("""{"""),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/("""position: 'se',
                    backgroundColor: '#ffc'  //円グラフと同じように位置と背景色を変更
                """),format.raw/*60.17*/("""}"""),format.raw/*60.18*/("""
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/(""");
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""")(document.getElementById("graph"));
        
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
                  DATE: Sun Jan 31 00:31:49 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/usermodel.scala.html
                  HASH: 92003ca17af6fd2d42816e3985a507a7f600c0bc
                  MATRIX: 777->1|967->96|995->98|1380->457|1394->463|1455->503|1529->551|1543->557|1602->596|2350->1316|2379->1317|2420->1330|2457->1339|2486->1340|2527->1353|2642->1440|2671->1441|2948->1690|2977->1691|3006->1692|3081->1739|3110->1740|3148->1750|3177->1751|3266->1812|3295->1813|3344->1834|3450->1912|3479->1913|3556->1962|3585->1963|3617->1967|3767->2089|3796->2090|3869->2135|3898->2136|3938->2148|3967->2149|4048->2202|4077->2203|4126->2224|4253->2323|4282->2324|4323->2337|4352->2338|4390->2349|4419->2350
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|65->34|65->34|66->35|66->35|66->35|67->36|68->37|68->37|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|89->58|91->60|91->60|92->61|92->61|93->62|93->62
                  -- GENERATED --
              */
          