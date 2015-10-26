
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/login.css")),format.raw/*6.102*/("""">
        <title>User Login</title>
    <body>
     <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1>User Login</h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="/login">Login</a></li>
    		<li id="menu02"><a href="xxx.html">Overview</a></li>
    		<li id="menu03"><a href="xxx.html">Property</a></li>
    		<li id="menu04"><a href="xxx.html">Tips</a></li>
    		<li id="menu05"><a href="xxx.html">Contact</a></li>
    	</ul>
    
    	<!-- サブメニュー -->
    	<div id="submenu">
    		<div id="submenu_header">目的で探す</div>
    		<ul id="submenu_body">
    			<li><a href="xxx.html">CSSの適用</a></li>
    			<li><a href="xxx.html">セレクタ</a></li>
    			<li><a href="xxx.html">フォント</a></li>
    			<li><a href="xxx.html">テキスト</a></li>
    			<li><a href="xxx.html">文字色・背景</a></li>
    			<li><a href="xxx.html">幅・高さ・余白</a></li>
    			<li><a href="xxx.html">ボーダー</a></li>
    			<li><a href="xxx.html">表示・配置</a></li>
    			<li><a href="xxx.html">リスト</a></li>
    			<li><a href="xxx.html">テーブル</a></li>
    			<li><a href="xxx.html">生成内容の挿入</a></li>
    			<li><a href="xxx.html">インターフェース</a></li>
    			<li><a href="xxx.html">フィルタ・ズーム</a></li>
    			<li><a href="xxx.html">テキスト（IE独自）</a></li>
    			<li><a href="xxx.html">印刷</a></li>
    			<li><a href="xxx.html">音声</a></li>
    		</ul>
    	</div>
        <div id="content">
        <h1>ログイン</h1>
            <form action="/home" method="POST">
            ユーザID
            <input type="text" name="user_id"/>
            パスワード
            <input type="password" name="password"/>
            <input type="submit" value="LOGIN"/>
            </form>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Oct 27 00:33:09 JST 2015
                  SOURCE: C:/git local/activator-1.3.6-minimal/SolveSystem2/app/views/login.scala.html
                  HASH: b6668bda9413fdbf7c00b11cb6d316b36ef44c38
                  MATRIX: 827->0|1217->364|1231->370|1294->412
                  LINES: 32->1|37->6|37->6|37->6
                  -- GENERATED --
              */
          