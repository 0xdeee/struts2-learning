package com.struts2.registration;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private String selectedColor;
	private boolean subscription;
	private String hobby;
	private List<Products> products;

	private List<String> colors;
	private List<String> hobbies;

	// while starting the appln we need this colors list to be initialized so we are
	// using this method to invoke a methd that initalizes colour list and this
	// method will return "input". we need to create a suitable action for this...
	// refer formLoadAction in struts.xml we use it to call this
	// initalizeFromField() method and the call thr registration action call so that
	// when it gets to registration the colors field will be populated
	public String intializeFormFields() {
		initializeColor();
		initializeHobbies();
		initializeProducts();
		return INPUT;
	}

	public void initializeColor() {
		colors = new ArrayList<String>();
		colors.add("blue");
		colors.add("black");
		colors.add("grey");
		colors.add("red");
	}

	public void initializeHobbies() {
		hobbies = new ArrayList<String>();
		hobbies.add("Coding");
		hobbies.add("Music");
		hobbies.add("Series");
		hobbies.add("Reading");
	}

	public void initializeProducts() {
		products = new ArrayList<Products>();
		products.add(new Products(11, "Mobile Phone", 100000));
		products.add(new Products(12, "Camera", 30000));
		products.add(new Products(145, "Time Machine", 10000000));
		products.add(new Products(21, "Omnitrix", 1000));
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	// execute is the method that will be execited in default in a Action class
	// like main in normal class
	@Override
	public String execute() {
		System.out.println("execute() in RegistrationAction Class");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(email);
		System.out.println(address);
		System.out.println(selectedColor);
		System.out.println(subscription ? "You are a Subscriber" : "You are not a Subscriber");
		System.out.println(hobby);
		return SUCCESS;
	}

	// this is a method in ActionSupport class we can specify all our validations
	// here
	// if we throw any error in this method it will automatically return a String
	// called "input"
	// we should have a <result name="input" > inside the approproate action to
	// display this error in same page
//	@Override
//	public void validate() {
//		// firstname == null is not working eventhough its a string
//		// for some reason string from textarea in jsp are not getting compared to null
//		if (firstName.length() == 0) {
//			// one of the method available in ActionSupport class
//			// that can be used to throw a validation error
//			addFieldError("firstName", "*First Name is required");
//		}
//		if (lastName.length() == 0) {
//			addFieldError("lastName", "*Last Name is required");
//		}
//		if (gender == null) {
//			addFieldError("gender", "*Gender is required");
//		}
//		if (age == null) {
//			addFieldError("age", "*Age is required");
//		}
//		// why the **** was this else if very important ??
//		// i missed it and put just if and the appln threw nullpointerException
//		// took a good hour to find that i missed this else if
//		// annoyed
//		else if (age <= 18) {
//			addFieldError("age", "*Age must be greater than 18");
//		}
//		if (email.length() == 0) {
//			addFieldError("email", "*E-mail address is required");
//		}
//	}


	// even though validate method does its job of validating very well it can be
	// only used if when there are very
	// small levels of validations to be done
	// for more complex ones use validation xml. this is for seperation of concern
	// our validation logic will be away from Action class imple & valdation xml
	// also provides some options to do validations easily.

}
