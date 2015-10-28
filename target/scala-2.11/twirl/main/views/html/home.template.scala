
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

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
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("stylesheets/top.css")),format.raw/*8.105*/(""""> -->
        <title>User Login</title>
    <body>
        <div id="content">
                """),_display_(/*12.18*/user_id),format.raw/*12.25*/(""" """),format.raw/*12.26*/("""さんのPASSは"""),_display_(/*12.35*/password),format.raw/*12.43*/(""" """),format.raw/*12.44*/("""です。
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Tue Oct 27 05:04:32 JST 2015
                  SOURCE: C:/git_local/activator-1.3.6-minimal/SolveSystem2/app/views/home.scala.html
                  HASH: d0b4c3e9dd654543ebc3c3a9ff6ec2b535ef85c2
                  MATRIX: 750->1|880->36|908->38|1298->402|1312->408|1373->448|1496->544|1524->551|1553->552|1589->561|1618->569|1647->570
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|43->12|43->12|43->12
                  -- GENERATED --
              */
          