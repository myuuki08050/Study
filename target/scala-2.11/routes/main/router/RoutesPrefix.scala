
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Sun Oct 25 12:07:53 JST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
