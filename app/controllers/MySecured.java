package controllers;

import play.mvc.Result;
import play.mvc.Http.Context;
import play.mvc.Security.Authenticator;

public class MySecured extends Authenticator{

	@Override
	public String getUsername(Context ctx) {
		/* nullを返すと認証していないものとみなす。
		 * 今回は単純にセッション中にIDがあれば認証されているものとみなすが、
		 * 本来ならば、認証後にトークンを発行してここでトークンチェックを行うべき。 */
		return ctx.session().get("user_id");
	}
	
	@Override
	public Result onUnauthorized(Context ctx) {
		return redirect(routes.Application.showTop());
	}
	
}