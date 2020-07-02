package interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.products.action.LoginAction;

/**
 * @author dstar - This interceptor will be used while user login & on all
 *         action calls to check if the logged in user is making that request or
 *         else.
 * 
 *         this will be called in all user requests, to check if the session
 *         attribute has been set, if not it will redirect the user to login
 *         page
 *
 */
public class LoginInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("LoginInterceptor destroy() called");
	}

	@Override
	public void init() {
		System.out.println("LoginInterceptor init() called");

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// getting the session attribute from request
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedInUser");
		// checking if the session attribute "loggedInUser" is null
		if (user == null) {
			// if null we are checking if this request is from LoginAction because inside
			// the LoginAction only are setting the session Attribute, login is the setter
			// action for loggedInUser Session Attribute, so we need to allow this operation
			if (invocation.getAction().getClass().equals(LoginAction.class)) {
				// if the req with null attribute is a LoginAction request then we are calling
				// the invoke() of ActionInvocation so that the this will pass & the next
				// intrceptor in the stack will be executed
				return invocation.invoke();
			}
			// if the request with null attribute is not a LoginAction req then we are
			// returning INPUT so that i will be redirected to login page
			System.out.println("An non logged in user is trying to access the webpages");
			return "input";
		}
		// if the req attribute is not null then we are allowing the operation.
		return invocation.invoke();
	}
	/**
	 * @author dstar -
	 * 
	 *         Scenario 1: if a user tries enters valid user name & password this
	 *         interceptor will be called & it will allow the action because its
	 *         login action
	 * 
	 *         Scenatio 2: if the session attribute we fetched using
	 *         ServletActionContext is not null then a successfully logged in user
	 *         is performing this request so we validate it
	 * 
	 *         Scenario 3: if a non logged-in user tried to access the welcome.jsp
	 *         page direcly then his session attr will be null and this action will
	 *         also wont be for LoginActon.class thus we return INPUT to take him
	 *         back to login page
	 *
	 */

}
