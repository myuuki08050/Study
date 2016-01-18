
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
  def apply/*1.2*/(user_id: String)(password: String)(logintime: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>Login Successful</title>
    <body>
        <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>PROGRAM learning</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="xxx.html">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
    	</ul>

        <div id="content">
            <h1>試問回答画面へ</h1>
            <form action="/shimon" method="POST">
                <input type="submit" value="試問回答"/>
            </form>
            
            <h1>試問登録画面へ</h1>
            <form action="/shimon_fregi" method="POST">
                <input type="submit" value="試問登録"/>
            </form>
            
            <h1>ドリル回答画面へ</h1>
            <form action="/doril" method="POST">
                <input type="submit" value="ドリル回答"/>
            </form>
            
            <h1>ドリル登録画面へ</h1>
            <form action="/doril_fregi" method="POST">
                <input type="submit" value="ドリル登録"/>
            </form>
            
            <h1>モデル確認画面へ</h1>
            <form action="/model" method="POST">
                <input type="submit" value="モデル確認"/>
            </form>
            
            
            
        </div>
        

    </body>
</html>"""))
      }
    }
  }

  def render(user_id:String,password:String,logintime:String): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(password)(logintime)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (password) => (logintime) => apply(user_id)(password)(logintime)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Jan 19 00:07:15 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/home.scala.html
                  HASH: 88b720dd398becdcff0211cce1b735dc6822286c
                  MATRIX: 757->1|906->55|934->57|1319->416|1333->422|1394->462
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8
                  -- GENERATED --
              */
          