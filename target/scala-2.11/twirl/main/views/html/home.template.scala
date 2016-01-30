
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_id: String)(logintime: String)(isAdmin: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.cache.Cache;

Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*10.100*/("""">
        <title>Login Successful</title>
    <body>
        <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>PROGRAM learning</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>

        <div id="content">
            ようこそ """),_display_(/*28.19*/user_id),format.raw/*28.26*/(""" """),format.raw/*28.27*/("""さん。あなたは """),_display_(/*28.36*/logintime),format.raw/*28.45*/(""" """),format.raw/*28.46*/("""回目のログインです。
            ゆっくりしていってね！
            
            """),_display_(/*31.14*/if(isAdmin == "false")/*31.36*/{_display_(Seq[Any](format.raw/*31.37*/("""
        
            """),format.raw/*33.13*/("""<h1>試問回答画面へ</h1>
            <form action="/shimon" method="POST">
                <input type="submit" value="試問回答"/>
            </form>
            
            <h1>ドリル回答画面へ</h1>
            <form action="/doril" method="POST">
                <input type="submit" value="ドリル回答"/>
            </form>
            
            <h1>モデル確認画面へ</h1>
            <form action="/user_model" method="POST">
                <input type="submit" value="モデル確認"/>
            </form>
            
            """)))}/*48.15*/else/*48.20*/{_display_(Seq[Any](format.raw/*48.21*/("""
            
            """),format.raw/*50.13*/("""<h1>試問登録画面へ</h1>
            <form action="/shimon_fregi" method="POST">
                <input type="submit" value="試問登録"/>
            </form>
            
            <h1>ドリル登録画面へ</h1>
            <form action="/doril_fregi" method="POST">
                <input type="submit" value="ドリル登録"/>
            </form>
            
            """)))}),format.raw/*60.14*/("""
            
            
        """),format.raw/*63.9*/("""</div>
        

    </body>
</html>"""))
      }
    }
  }

  def render(user_id:String,logintime:String,isAdmin:String): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(logintime)(isAdmin)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (logintime) => (isAdmin) => apply(user_id)(logintime)(isAdmin)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Sat Jan 30 20:31:12 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/home.scala.html
                  HASH: 478aa5c6b4790c2d077af4d551cd28aef6d0ee46
                  MATRIX: 757->1|929->54|957->82|984->83|1370->442|1385->448|1447->488|2014->1028|2042->1035|2071->1036|2107->1045|2137->1054|2166->1055|2254->1116|2285->1138|2324->1139|2374->1161|2893->1662|2906->1667|2945->1668|2999->1694|3372->2036|3434->2071
                  LINES: 27->1|32->1|34->4|35->5|40->10|40->10|40->10|58->28|58->28|58->28|58->28|58->28|58->28|61->31|61->31|61->31|63->33|78->48|78->48|78->48|80->50|90->60|93->63
                  -- GENERATED --
              */
          