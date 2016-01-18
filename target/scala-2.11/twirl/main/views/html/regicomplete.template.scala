
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object regicomplete_Scope0 {
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

class regicomplete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_id: String)(password: String)(logintimes: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>REGISTER COMPLETE</title>
    <body>
        <div id="pagebody">
        
        	<!-- ヘッダ -->
        	<div id="header"><h1>User Login</h1></div>
        	
        	<!-- メインメニュー -->
        	<ul id="menu">
        		<li id="menu01"><a href="/login">LOGIN</a></li>
        		<li id="menu02"><a href="xxx.html">HOME</a></li>
        		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
        		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
        		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
        	</ul>
        	
        	<div id="content">
            <h1>COMPLETE REGISTER!</h1>
                登録が完了しました(ID:"""),_display_(/*27.31*/user_id),format.raw/*27.38*/(""",PASS:"""),_display_(/*27.45*/password),format.raw/*27.53*/(""")
        
            <h1><a href="/login">ログイン画面にもどる</a></h1>
            
            </div>
            
            
        </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(user_id:String,password:String,logintimes:String): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(password)(logintimes)

  def f:((String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (password) => (logintimes) => apply(user_id)(password)(logintimes)

  def ref: this.type = this

}


}

/**/
object regicomplete extends regicomplete_Scope0.regicomplete
              /*
                  -- GENERATED --
                  DATE: Mon Jan 11 18:22:51 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/regicomplete.scala.html
                  HASH: 9ff206c9bb9fab3c2198d73faed19cc456643f09
                  MATRIX: 773->1|923->56|951->58|1336->417|1350->423|1411->463|2091->1116|2119->1123|2153->1130|2182->1138
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|58->27|58->27
                  -- GENERATED --
              */
          