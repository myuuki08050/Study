
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
import helper._

Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*11.100*/("""">
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
            <a>ようこそ """),_display_(/*29.22*/user_id),format.raw/*29.29*/(""" """),format.raw/*29.30*/("""さん。あなたは """),_display_(/*29.39*/logintime),format.raw/*29.48*/(""" """),format.raw/*29.49*/("""回目のログインです。
            ゆっくりしていってね！</a>
            
            """),_display_(/*32.14*/if(isAdmin == "false")/*32.36*/{_display_(Seq[Any](format.raw/*32.37*/("""
        
            """),format.raw/*34.13*/("""<h1>試問回答画面へ</h1>
            <form action="/shimon" method="POST" >
                <input type="submit" value="試問回答" class="subform"/>
            </form>
            
            <h1>ドリル回答画面へ</h1>
            <form action="/doril" method="POST">
                <input type="submit" value="ドリル回答" class="subform"/>
            </form>
            
            <h1>モデル確認画面へ</h1>
            <form action="/user_model" method="POST">
                <input type="submit" value="モデル確認" class="subform"/>
            </form>
            
            """)))}/*49.15*/else/*49.20*/{_display_(Seq[Any](format.raw/*49.21*/("""
            
            """),format.raw/*51.13*/("""<h1>試問登録画面へ</h1>
            <form action="/shimon_fregi" method="POST">
                <input type="submit" value="試問登録" class="subform"/>
            </form>
            
            <h1>ドリル登録画面へ</h1>
            <form action="/doril_fregi" method="POST">
                <input type="submit" value="ドリル登録" class="subform"/>
            </form>
            
            <h1>ユーザデータベース表示</h1>
            <form action="/userdb_show" method="POST">
                <input type="submit" value="表示" class="subform"/>
            </form>
            
            <h1>ID：nのユーザデータ削除</h1>
            """),_display_(/*67.14*/form(action = routes.Application.deleteUserbyID)/*67.62*/ {_display_(Seq[Any](format.raw/*67.64*/("""
                """),format.raw/*68.17*/("""<input type="number" name="del" class="subform"/><br>
                <input type="submit" value="DELETE" class="subform">
            """)))}),format.raw/*70.14*/("""
            
            """)))}),format.raw/*72.14*/("""
            
        """),format.raw/*74.9*/("""</div>
        </div>
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
                  DATE: Wed Feb 03 01:31:41 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/home.scala.html
                  HASH: 2aa529fb00c458abb500f057528ad5888927272f
                  MATRIX: 757->1|945->54|973->99|1000->100|1386->459|1401->465|1463->505|2033->1048|2061->1055|2090->1056|2126->1065|2156->1074|2185->1075|2277->1140|2308->1162|2347->1163|2397->1185|2965->1735|2978->1740|3017->1741|3071->1767|3694->2363|3751->2411|3791->2413|3836->2430|4003->2566|4061->2593|4110->2615
                  LINES: 27->1|33->1|35->5|36->6|41->11|41->11|41->11|59->29|59->29|59->29|59->29|59->29|59->29|62->32|62->32|62->32|64->34|79->49|79->49|79->49|81->51|97->67|97->67|97->67|98->68|100->70|102->72|104->74
                  -- GENERATED --
              */
          