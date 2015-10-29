
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

class regicomplete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_id: String)(password: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

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
        	
            <h1>COMPLETE REGISTER!</h1>
            <div id="regicomp">
                登録が完了しました(ID:"""),_display_(/*27.31*/user_id),format.raw/*27.38*/(""",PASS:"""),_display_(/*27.45*/password),format.raw/*27.53*/(""")
            </div>
        
            <h1><a href="/login">ログイン画面にもどる</a></h1>
            
            
            
        </div>    
    </body>
</html>"""))
      }
    }
  }

  def render(user_id:String,password:String): play.twirl.api.HtmlFormat.Appendable = apply(user_id)(password)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (user_id) => (password) => apply(user_id)(password)

  def ref: this.type = this

}


}

/**/
object regicomplete extends regicomplete_Scope0.regicomplete
              /*
                  -- GENERATED --
                  DATE: Wed Oct 28 19:18:45 JST 2015
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/regicomplete.scala.html
                  HASH: 9a53371b811e2a4d33650b186691505bdb2a9551
                  MATRIX: 766->1|896->36|924->38|1309->397|1323->403|1384->443|2068->1100|2096->1107|2130->1114|2159->1122
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|58->27|58->27|58->27|58->27
                  -- GENERATED --
              */
          