import com.opensymphony.xwork2.ActionSupport;

public class ChangeLocaleAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// this just used to trigger a url call. from register.jsp this will be called
	// with url param and based on that params value framework will determine which
	// one of the global.properties to use.
	@Override
	public String execute()
	{
		return INPUT;
	}
	
}
