
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object shimon_fregister_Scope0 {
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

     object shimon_fregister_Scope1 {
import helper._

class shimon_fregister extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>Shimon Register</title>
    </head>    
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>Shimon Register</h1></div>
    	
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
        <a>ファイルをアップロードできます。</a>
            """),_display_(/*29.14*/form(action = routes.ShimonManage.MakeShimon, 'enctype -> "multipart/form-data", 'class -> "subform")/*29.115*/ {_display_(Seq[Any](format.raw/*29.117*/("""
                """),format.raw/*30.17*/("""問題ファイル:
                <input type="file" name="shimon_file">
                正答ファイル:
                <input type="file" name="s_shimon_file">
                <input type="submit" value="UPLOAD">
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""<h1>試問データベース表示</h1>
            <form action="/shimondb_show" method="POST" >
                <input type="submit" value="試問回答" class="subform"/>
            </form>
            <h1>ID：nの試問データ削除</h1>
            """),_display_(/*41.14*/form(action = routes.ShimonManage.deleteShimonbyID, 'class -> "subform")/*41.86*/ {_display_(Seq[Any](format.raw/*41.88*/("""
                """),format.raw/*42.17*/("""<input type="number" name="del"/>
                <input type="submit" value="DELETE">
            """)))}),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""<h1><a href="/home">ホームにもどる</a></h1>
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
object shimon_fregister extends shimon_fregister_Scope0.shimon_fregister_Scope1.shimon_fregister
              /*
                  -- GENERATED --
                  DATE: Wed Feb 03 03:32:57 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/shimon_fregister.scala.html
                  HASH: 62adbc1452022fc8631a031a7ca3fcec55fbad4a
                  MATRIX: 904->20|1294->384|1308->390|1369->430|2021->1055|2132->1156|2173->1158|2219->1176|2465->1391|2507->1405|2752->1623|2833->1695|2873->1697|2919->1715|3052->1817|3094->1831
                  LINES: 35->3|40->8|40->8|40->8|61->29|61->29|61->29|62->30|67->35|68->36|73->41|73->41|73->41|74->42|76->44|77->45
                  -- GENERATED --
              */
          