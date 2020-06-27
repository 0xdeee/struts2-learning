import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	
	@Override
	public String execute()
	{
		System.out.println("execute() method called");
		return "success";
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

	//Comment this method if validation is done using xml file
//	@Override
//	public void validate()
//	{
//		if (firstName.equals("")) {
//	        addFieldError("firstName", getText("error.firstName.required"));
//	    }
//		
//		if (lastName.equals("")) {
//	        addFieldError("lastName", getText("error.lastName.required"));
//	    }
//		
//		if (gender == null) {
//	        addFieldError("gender", getText("error.gender.required"));
//	    }
//		
//		if (age == null) {
//	        addFieldError("age", getText("error.age.required"));
//	    }
//		else if(age <= 18)
//		{
//			addFieldError("age", getText("error.age.range"));
//		}
//		
//		if (email.equals("")) {
//	        addFieldError("email", getText("error.email.required"));
//	    }
//	}
}
