
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yuki/eclipse_play/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Wed Oct 28 11:55:51 JST 2015


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
