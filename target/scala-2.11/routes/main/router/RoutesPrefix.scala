
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Sat Oct 24 00:32:57 JST 2015


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
