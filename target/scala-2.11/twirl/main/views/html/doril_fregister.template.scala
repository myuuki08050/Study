
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
        <a>ファイルをアップロードできます。</a><br>
            """),_display_(/*29.14*/form(action = routes.DorilManage.MakeDoril, 'enctype -> "multipart/form-data", 'class -> "subform")/*29.113*/ {_display_(Seq[Any](format.raw/*29.115*/("""
                """),format.raw/*30.17*/("""問題ファイル:
                <input type="file" name="doril_file" >
                正答ファイル:
                <input type="file" name="s_doril_file">
                <input type="submit" value="UPLOAD" />
            """)))}),format.raw/*35.14*/("""
            
            """),format.raw/*37.13*/("""<h1>ドリルデータベース表示</h1>
            <form action="/dorildb_show" method="POST" >
                <input type="submit" value="試問回答" class="subform"/>
            </form>
            
            <h1>ID：nのドリルデータ削除</h1>
            """),_display_(/*43.14*/form(action = routes.DorilManage.deleteDorilbyID, 'class -> "subform")/*43.84*/ {_display_(Seq[Any](format.raw/*43.86*/("""
                """),format.raw/*44.17*/("""<input type="number" name="del" />
                <input type="submit" value="DELETE" />
            """)))}),format.raw/*46.14*/("""
            
            """),format.raw/*48.13*/("""<h1><a href="/home">ホームにもどる</a></h1>
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
                  DATE: Wed Feb 03 02:21:13 JST 2016
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/doril_fregister.scala.html
                  HASH: 29c7c31fa5e29835cfd8f4d06f18301935b66379
                  MATRIX: 901->20|1291->384|1305->390|1366->430|2020->1057|2129->1156|2170->1158|2216->1176|2463->1392|2519->1420|2779->1653|2858->1723|2898->1725|2944->1743|3080->1848|3136->1876
                  LINES: 35->3|40->8|40->8|40->8|61->29|61->29|61->29|62->30|67->35|69->37|75->43|75->43|75->43|76->44|78->46|80->48
                  -- GENERATED --
              */
          