package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({ @Result(name = "SUCCESS", location = "/success.jsp"), @Result(name = "ERROR", location = "/error.jsp") })
@Action("/testAction")
public class TestAction {

	public String execute() {
		System.out.println("Execute method called");
		return "SUCCESS";
	}
}
