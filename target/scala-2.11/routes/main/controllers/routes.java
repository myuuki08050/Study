
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yuki/eclipse_play/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Wed Oct 28 11:55:51 JST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSystemTop SystemTop = new controllers.ReverseSystemTop(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserInf UserInf = new controllers.ReverseUserInf(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSystemTop SystemTop = new controllers.javascript.ReverseSystemTop(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserInf UserInf = new controllers.javascript.ReverseUserInf(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
