/**
 * 
 */
package com.products.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author dstar
 *
 */
public class LogoutAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		// once the logout button was clicked we are using ServletActionContext to
		// invalidate the session
		// this is also used to check if any non-logged in user is trying to access the
		// webpages by checking if the session is invalid.
		ServletActionContext.getRequest().getSession().invalidate();
		return INPUT;
	}
}
