package validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport {

	private String domainName;

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Override // this object is the current object of action invocation
	public void validate(Object object) throws ValidationException {
		System.out.println("domain name validator called");
		String validDomain = domainName;
		// String
		// FieldValidatorSupport.getFieldName() - returns the field name
		// this method gets the field name for which the current validator class is
		// running
		// we are running this validator from RegisterAction-validator.xml from email
		// field so it will return the string "email"
		String fieldName = getFieldName();
		// Object
		// ValidatorSupport.getFieldValue(String name, Object object)
		// this method takes in field name and current action invocation object as
		// paramters and return a object containing the value of the given field for the
		// current action invocation object from ValueStack
		String email = (String) getFieldValue(fieldName, object);
		if (!email.endsWith(validDomain)) {
			addFieldError(fieldName, object);
		}
	}

}
