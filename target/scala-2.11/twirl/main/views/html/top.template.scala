
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object top_Scope0 {
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

class top extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <title>PROGRAM Learning</title>
    </head>
    <body>
        <div id="pagebody">
    
    	<!-- ヘッダ -->
    	<div id="header"><h1><a href="index.html">PROGRAM learning</a></h1></div>
    	
    	<!-- メインメニュー -->
    	<ul id="menu">
    		<li id="menu01"><a href="login.scala.html">Login</a></li>
    		<li id="menu02"><a href="xxx.html">Overview</a></li>
    		<li id="menu03"><a href="xxx.html">Property</a></li>
    		<li id="menu04"><a href="xxx.html">Tips</a></li>
    		<li id="menu05"><a href="xxx.html">Contact</a></li>
    	</ul>
    
    	<!-- サブメニュー（左カラム） -->
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
    
    	<!-- コンテンツ（中央と右の2カラム） -->
    	<div id="content">
    		<!-- ニュース（中央カラム） -->
    		<div id="news">
    			<h2>ニュース</h2>
    			<h3>かえるさんのサイトがオープン！！</h3>
    			<p>
    			けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。
    			けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。
    			けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。
    			けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。
    			けろけろ、けろけろ、けろけーろ。けろけろ、けろけろ、けろけーろ。・・と、それはもう大変な喜びようだとか。
    			</p>
    			<p><img src="images/ss01.gif" alt="かえるサイトの画面" width="200" height="155" /></p>
    			<hr />
    		</div>
    		<!-- ピックアップ（右カラム） -->
    		<div id="pickup">
    			<h2>ピックアップ</h2>
    			<ul>
    				<li><a href="xxx.html">CSSのメリット</a></li>
    				<li><a href="xxx.html">Web標準とは</a></li>
    				<li><a href="xxx.html">CSSのバージョン</a></li>
    				<li><a href="xxx.html">HTML/XHTMLの基礎</a></li>
    				<li><a href="xxx.html">CSSの書き方</a></li>
    				<li><a href="xxx.html">文書に適用する</a></li>
    				<li><a href="xxx.html">代替スタイルシート</a></li>
    				<li><a href="xxx.html">メディアタイプ</a></li>
    				<li><a href="xxx.html">セレクタの種類</a></li>
    				<li><a href="xxx.html">ルール</a></li>
    				<li><a href="xxx.html">スタイルの優先順位</a></li>
    				<li><a href="xxx.html">スタイルの継承</a></li>
    				<li><a href="xxx.html">CSSでの長さの指定</a></li>
    				<li><a href="xxx.html">ボックス</a></li>
    				<li><a href="xxx.html">DOCTYPE宣言</a></li>
    			</ul>
    		</div>
    	</div>
    
    	<!-- フッタ -->
    	<div id="footer"><address>Copyright (c) HTMQ All Rights Reserved.</address></div>
    
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
object top extends top_Scope0.top
              /*
                  -- GENERATED --
                  DATE: Sun Oct 25 12:07:18 JST 2015
                  SOURCE: C:/git local/activator-1.3.6-minimal/SolveSystem2/app/views/top.scala.html
                  HASH: 342f37c1c23a5b9ebe051bebf5ca926f476b2fea
                  MATRIX: 823->0|1213->364|1227->370|1288->410
                  LINES: 32->1|37->6|37->6|37->6
                  -- GENERATED --
              */
          