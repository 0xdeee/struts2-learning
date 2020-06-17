package com.struts2.basics;

public class TestAction {

	private String message;
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		System.out.println("Execute method called");
		message = "SUCCESS message from variable";
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		return "SUCCESS";
	}
}
