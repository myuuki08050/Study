
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object doril_fregister_Scope0 {
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

     object doril_fregister_Scope1 {
import helper._

class doril_fregister extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.100*/("""">
        <title>Doril Register</title>
    </head>    
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>Doril Register</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">LOGIN</a></li>
    		<li id="menu02"><a href="/home">HOME</a></li>
    		<li id="menu03"><a href="xxx.html">PROBREM</a></li>
    		<li id="menu04"><a href="xxx.html">SOLVE</a></li>
    		<li id="menu05"><a href="/logout">LOGOUT</a></li>
    	</ul>
    
        <div id="content">
        <h1>試問登録</h1>
        ファイルをアップロードできます。
            """),_display_(/*29.14*/form(action = routes.DorilManage.MakeDoril, 'enctype -> "multipart/form-data")/*29.92*/ {_display_(Seq[Any](format.raw/*29.94*/("""
                """),format.raw/*30.17*/("""問題ファイル:
                <input type="file" name="doril_file">
                <br>
                正答ファイル:
                <input type="file" name="s_doril_file">
                <br>
                <input type="submit" value="UPLOAD">
            """)))}),format.raw/*37.14*/("""
            
            """),format.raw/*39.13*/("""<h1><a href="/home">ホームにもどる</a></h1>
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
}

/**/
object doril_fregister extends doril_fregister_Scope0.doril_fregister_Scope1.doril_fregister
              /*
                  -- GENERATED --
                  DATE: Sat Jan 30 20:27:56 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril_fregister.scala.html
                  HASH: ffe8b7eb2b7e34a5a45f7b731c91de3416206010
                  MATRIX: 901->20|1291->384|1305->390|1366->430|2009->1046|2096->1124|2136->1126|2182->1144|2470->1401|2526->1429
                  LINES: 35->3|40->8|40->8|40->8|61->29|61->29|61->29|62->30|69->37|71->39
                  -- GENERATED --
              */
          