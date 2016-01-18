
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

class usermodel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*6.100*/("""">
        <script type="text/javascript" src=""""),_display_(/*7.46*/routes/*7.52*/.Assets.at("javascripts/flotr2.min.js")),format.raw/*7.91*/("""" ></script>
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
    	
    	(function basic_radar(container) """),format.raw/*31.39*/("""{"""),format.raw/*31.40*/("""
            """),format.raw/*32.13*/("""var s1 = """),format.raw/*32.22*/("""{"""),format.raw/*32.23*/("""
            """),format.raw/*33.13*/("""label: 'データ名1',
            data: [[0, 3],[1, 8],[2, 5],[3, 5],[4, 3],[5, 9]]"""),format.raw/*34.62*/("""}"""),format.raw/*34.63*/(""",
            graph, ticks;
            ticks = [
            [0, "項目1"],
            [1, "項目2"],
            [2, "項目3"],
            [3, "項目4"],
            [4, "項目5"],
            [5, "項目6"]];
     
            graph = Flotr.draw(container, [s1], """),format.raw/*44.49*/("""{"""),format.raw/*44.50*/(""" """),format.raw/*44.51*/("""//canvasへの描画。変数を配列で指定して
                radar: """),format.raw/*45.24*/("""{"""),format.raw/*45.25*/("""show: true"""),format.raw/*45.35*/("""}"""),format.raw/*45.36*/(""",  //radar特有のオプション。デフォがfalseなのでtrueにして
                grid: """),format.raw/*46.23*/("""{"""),format.raw/*46.24*/("""
                    """),format.raw/*47.21*/("""circular: true,   //罫線を多角形に。必須。
                    minorHorizontalLines: true"""),format.raw/*48.47*/("""}"""),format.raw/*48.48*/(""",  //細かい（マイナーな）水平の罫線を表示する
                yaxis: """),format.raw/*49.24*/("""{"""),format.raw/*49.25*/("""    """),format.raw/*49.29*/("""//yaxisはy軸。この場合は中心から各頂点への軸
                    min: 0,
                    max: 10,
                    minorTickFreq: 2"""),format.raw/*52.37*/("""}"""),format.raw/*52.38*/(""",  //小目盛りのテキストを表示する頻度
                xaxis: """),format.raw/*53.24*/("""{"""),format.raw/*53.25*/("""ticks: ticks"""),format.raw/*53.37*/("""}"""),format.raw/*53.38*/(""",  //xaxisはx軸。変数ticksを各頂点に表示
                legend: """),format.raw/*54.25*/("""{"""),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""position: 'se',
                    backgroundColor: '#ffc'  //円グラフと同じように位置と背景色を変更
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/("""
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/(""");
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""")(document.getElementById("graph"));
        
        </script>
    </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object usermodel extends usermodel_Scope0.usermodel
              /*
                  -- GENERATED --
                  DATE: Tue Jan 19 05:38:27 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/usermodel.scala.html
                  HASH: 06e04b73ddfec7d6df93101d32ea0d578eec70bc
                  MATRIX: 835->0|1220->359|1234->365|1295->405|1369->453|1383->459|1442->498|2192->1220|2221->1221|2262->1234|2299->1243|2328->1244|2369->1257|2474->1334|2503->1335|2780->1584|2809->1585|2838->1586|2913->1633|2942->1634|2980->1644|3009->1645|3098->1706|3127->1707|3176->1728|3282->1806|3311->1807|3388->1856|3417->1857|3449->1861|3597->1981|3626->1982|3699->2027|3728->2028|3768->2040|3797->2041|3878->2094|3907->2095|3956->2116|4083->2215|4112->2216|4153->2229|4182->2230|4220->2241|4249->2242
                  LINES: 32->1|37->6|37->6|37->6|38->7|38->7|38->7|62->31|62->31|63->32|63->32|63->32|64->33|65->34|65->34|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|83->52|83->52|84->53|84->53|84->53|84->53|85->54|85->54|86->55|88->57|88->57|89->58|89->58|90->59|90->59
                  -- GENERATED --
              */
          