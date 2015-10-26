
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
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*6.59*/routes/*6.65*/.Assets.versioned("stylesheets/top.css")),format.raw/*6.105*/(""""> -->
        <title>User Login</title>
    <body>
        <h1>ログイン</h1>
        <hr>
        <div align="center">
            <table border="0">
                <form action="list.html" method="get">
                    <tr>
                        <th>
                            ユーザID
                        </th>
                        <td>
                            <input type="text" name="user_id" value="" size="24">
                        </td>
                    </tr>
                    <tr>
                        <th>
                            パスワード
                        </th>
                        <td>
                            <input type="password" name="password" value="" size="24">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="ログイン">
                        </td>
                    </tr>
                </form>
            </table>
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
                  DATE: Sat Oct 24 15:32:44 JST 2015
                  SOURCE: C:/git local/activator-1.3.6-minimal/SolveSystem2/app/views/login.scala.html
                  HASH: 80155924bc3286458849d50f35bd291ffbe271e8
                  MATRIX: 827->0|1222->369|1236->375|1297->415
                  LINES: 32->1|37->6|37->6|37->6
                  -- GENERATED --
              */
          