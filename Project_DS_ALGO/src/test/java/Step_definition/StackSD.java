package Step_definition;

import Page_Factory.Stack;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class StackSD {
	Stack ST = new Stack();
	@Given("user is on Home Page")
	public void user_is_on_Home_page() {
		Loggerload.info("user is on Home Page after Linked List");
	   //System.out.println("user is on Home Page after Linked List");
	}

	@When("user click on get started button of stack")
	public void user_click_on_get_started_button_of_stack() {
	    ST.getstartedstack();
	}

	@Then("user directed to Stack page")
	public void user_directed_to_stack_page() {
		Loggerload.info("User os on Stack Page");
	   //System.out.println("User os on Stack Page");
	}

	@Given("user is on operation in Stack page")
	public void user_is_on_operation_in_Stack_page() {
		Loggerload.info("user checking functionality");
	    //System.out.println("user checking functionality");
	}

	@When("useer clicks on operation in stacks button")
	public void useer_clicks_on_operation_in_stacks_button() {
	    ST.operationstack();
	}

	@And("user clicks tryhere button")
	public void user_clicks_tryhere_button() {
	    ST.tryhere();
	}

	@Then("user is on tryeditor and run button page")
	public void user_is_on_tryeditor_and_run_button_page() {
		Loggerload.info("User is on tryeditor page");
	   //System.out.println("User is on tryeditor page");
	}

	@Given("user is sending python code")
	public void user_is_sending_python_code() {
	   ST.stackprint();
	}

	@When("user clicks on run button")
	public void user_clicks_on_run_button() throws Exception {
		ST.run();
	   	}

	@Then("user get output")
	public void user_get_output() {
		Loggerload.info("User get Output");
	  //System.out.println("User get Output");
	}

	@And("user redirected to home page after Stack")
	public void user_redirected_to_home_page_after_stack() {
	   ST.stackhomeurl();
	}



}
