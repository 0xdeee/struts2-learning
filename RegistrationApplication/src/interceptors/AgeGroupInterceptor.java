package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("AgeGroupInterceptor destroy() called");
	}

	@Override
	public void init() {
		System.out.println("AgeGroupIntercetor init() called");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("AgeGroupInterceptor Pre-processing");
		// we can get the action object from value stack using ActionInvocation object
		ValueStack valueStack = invocation.getStack();
		// there are two ways to access values of specfic member variables in object,
		// using findValue() & findString()
		Integer age = (Integer) valueStack.findValue("age");
//		String age = valueStack.findString("age");
		String ageGroup = "";
		if (age <= 18) {
			ageGroup = "Children";
		} else if (age > 18 && age < 50) {
			ageGroup = "Adult";
		} else {
			ageGroup = "Senior";
		}
		// setting new value for age after some processing is done
		valueStack.set("age", age + " (" + ageGroup + ")");
		// this inturn call calls the ActionInvocation's invoke() this will call the
		// intercept() of next Interceptor or call the action
		String result = invocation.invoke();
		System.out.println("AgeGroupInterceptor Post-processing");
		return result;
	}

}
