package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroy() is called");
	}

	@Override
	public void init() {
		System.out.println("init() is called");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("pre-processing");
		String result = invocation.invoke();
		System.out.println("post-processing");
		return result;
	}

}
