
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

class regicomplete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>REGISTER COMPLETE</title>
    <body>
        <div id="pagebody">
        
        	<!-- ヘッダ -->
        	<div id="header"><h1>User Login</h1></div>
        	
        	<!-- メインメニュー -->
        	<ul id="menu">
        		<li id="menu01"><a href="/login">LOGIN</a></li>
        		<li id="menu02"><a href="/home">HOME</a></li>
        		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
        		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
        		<li id="menu05"><a href="xxx.html">INFOMATION</a></li>
        	</ul>
        	
        	<div id="content">
            <h1>COMPLETE REGISTER!</h1>
                登録が完了しました。
        
            <h1><a href="/login">ログイン画面にもどる</a></h1>
            
            </div>
            
            
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
object regicomplete extends regicomplete_Scope0.regicomplete
              /*
                  -- GENERATED --
                  DATE: Sat Jan 30 20:31:12 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/regicomplete.scala.html
                  HASH: 2243ccd328b0220c54489d3fd485e995fbcf2dc1
                  MATRIX: 841->0|1226->359|1240->365|1301->405
                  LINES: 32->1|37->6|37->6|37->6
                  -- GENERATED --
              */
          