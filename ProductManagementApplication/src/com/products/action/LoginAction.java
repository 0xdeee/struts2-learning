/**
 * 
 */
package com.products.action;

import com.opensymphony.xwork2.ActionSupport;
import com.products.DAO.LoginDAO;
import com.products.model.LoginInfo;

/**
 * @author dstar - LoginAction is a action class that gets invoked when the user
 *         hits login in the view
 *
 */
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7835389340040093112L;

	private String userName;
	private String password;

	// these getter() and setter() are for storing values from view to class and
	// fetching values from class to view
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// In execute() we get the result of authentication from LoginDAO by sending the
	// values for userName & password we got from view as a LoginInfo object
	// Returns SUCCESS if user authentication is successful
	// Returns INPUT if authentication failed
	@Override
	public String execute() {
		String statusCode = "";

		boolean isValidUser = LoginDAO.isValidUser(new LoginInfo(userName, password));
		if (isValidUser) {
			statusCode = SUCCESS;
		} else {
			// Returning INPUT because we have to revert back to same login page and show
			// username or password invalid error
			statusCode = INPUT;
		}

		return statusCode;
	}

}
