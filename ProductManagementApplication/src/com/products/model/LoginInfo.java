package com.products.model;

/**
 * @author dstar - LoginInfo is a pojo class used to perform user
 *         authentication, the data fethed from the View & DB for user
 *         authentication will be stored here for authentication
 *
 */
public class LoginInfo {

	private String userName;
	private String password;

	public LoginInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

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

	// It is optional but its a good programming practice to have a toString() in
	// our pojo/model class
	@Override
	public String toString() {
		return "LoginInfo [userName=" + userName + ", password=" + password + "]";
	}

}
