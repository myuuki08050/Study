
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/git_local/activator-1.3.6-minimal/SolveSystem2/conf/routes
// @DATE:Tue Feb 02 15:05:57 JST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseModelManage ModelManage = new controllers.ReverseModelManage(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDorilManage DorilManage = new controllers.ReverseDorilManage(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseShimonManage ShimonManage = new controllers.ReverseShimonManage(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseModelManage ModelManage = new controllers.javascript.ReverseModelManage(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDorilManage DorilManage = new controllers.javascript.ReverseDorilManage(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseShimonManage ShimonManage = new controllers.javascript.ReverseShimonManage(RoutesPrefix.byNamePrefix());
  }

}
