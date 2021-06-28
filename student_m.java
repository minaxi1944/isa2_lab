package testingLogin;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class student_m {
	
	private float total=0,m;
	@Given("I have student marks")
	public void i_have_student_marks() {
	    // Write code here that turns the phrase above into concrete actions
		float total=0;
		Student_info student=new Student_info();
		student.setName("Minaxi");
		
		
		course_marks obj1=new course_marks("Webtech",20,20,20,30);
	}

	@When("I compare marks")
	public void i_compare_marks() {
	    // Write code here that turns the phrase above into concrete actions
	    m=(40/100)*100;
	    total=20+20+20+30;
	    
	}

	@Then("I should be able to tell if student passed or failed")
	public void i_should_be_able_to_tell_if_student_passed_or_failed() {
	    // Write code here that turns the phrase above into concrete actions
		if(total>40) {
	    	System.out.println("Student passed  ");
	    }
	    else {
	    	System.out.println("Student has failed..");
	    }
	}


}
