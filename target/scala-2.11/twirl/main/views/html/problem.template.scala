
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object problem_Scope0 {
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

class problem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.105*/(""""> -->
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
    
    	<!-- コンテンツ -->
    	<div id="maincontent">
            ホーム画面です
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
object problem extends problem_Scope0.problem
              /*
                  -- GENERATED --
                  DATE: Mon Dec 21 01:13:11 JST 2015
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/problem.scala.html
                  HASH: 2f75cd5a4dc545b03d674a956189239b3d1e9500
                  MATRIX: 763->1|912->55|940->57|1330->421|1344->427|1405->467
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8
                  -- GENERATED --
              */
          