
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usermodel_string_Scope0 {
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

class usermodel_string extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,Int,Int,Int,Int,Int,Int,play.twirl.api.HtmlFormat.Appendable] {

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
            <h1>"""),_display_(/*28.18*/user_id),format.raw/*28.25*/(""" """),format.raw/*28.26*/("""さんのユーザーモデル</h1>
            
            <div>標準入出力："""),_display_(/*30.25*/param1),format.raw/*30.31*/(""" """),format.raw/*30.32*/("""%</div>
            <div>ファイル入出力："""),_display_(/*31.27*/param2),format.raw/*31.33*/(""" """),format.raw/*31.34*/("""%</div>
            <div>自作関数："""),_display_(/*32.24*/param3),format.raw/*32.30*/(""" """),format.raw/*32.31*/("""%</div>
            <div>ポインタ："""),_display_(/*33.24*/param4),format.raw/*33.30*/(""" """),format.raw/*33.31*/("""%</div>
            <div>再帰："""),_display_(/*34.22*/param5),format.raw/*34.28*/(""" """),format.raw/*34.29*/("""%</div>
            <div>構造体："""),_display_(/*35.23*/param6),format.raw/*35.29*/(""" """),format.raw/*35.30*/("""%</div>
            
            
            <h1><a href="/home">ホームにもどる</a></h1>
    	</div>
    	
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
object usermodel_string extends usermodel_string_Scope0.usermodel_string
              /*
                  -- GENERATED --
                  DATE: Mon Feb 01 02:48:19 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/usermodel_string.scala.html
                  HASH: 21f70aa095218b6c5a043d4bdfb35ba5972db214
                  MATRIX: 791->1|981->96|1009->98|1394->457|1408->463|1469->503|1543->551|1557->557|1616->596|2197->1150|2225->1157|2254->1158|2334->1211|2361->1217|2390->1218|2451->1252|2478->1258|2507->1259|2565->1290|2592->1296|2621->1297|2679->1328|2706->1334|2735->1335|2791->1364|2818->1370|2847->1371|2904->1401|2931->1407|2960->1408
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35
                  -- GENERATED --
              */
          