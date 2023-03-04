package Step_definition;

import Page_Factory.Queue;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class QueueSD {
	Queue QE = new Queue();
	
	@Given("User is on Home page after Stack")
	public void user_is_on_home_page_after_stack() {
		Loggerload.info("User is on Home page after Stack");
	    //System.out.println("User is on Home page after Stack");
	}

	@When("user click on get started button of Queue")
	public void user_clicks_on_get_started_button_of_queue() throws Exception {
	   QE.getstartedqueue();
	}
	
	@Then("user directed to Queue page")
	public void user_directed_to_Queue_page() {
		Loggerload.info("User is on Queue page");
		//System.out.println("User is on Queue page");
		
	}
	
	@Given("user is on operation in Queue page")
	public void user_is_on_operation_in_queue_page() {
		Loggerload.info("user is on operation in Queue page");
		//System.out.println("user is on operation in Queue page");
		
	}

	@When("user clicks on Queue operations button")
	public void user_clicks_on_queue_operations_button() {
		QE.queueoperation();
	}

	
	@And("user clicks tryhere button of Queue")
	public void user_clicks_tryhere_button_of_queue() {
	   QE.tryhere();
	}

	@Then("user is on tryeditor and run page")
	public void user_is_on_tryeditor_and_run_page() {
		Loggerload.info("User is on tryeditor page");
	    //System.out.println("User is on tryeditor page");
	}

	@Given("user is sending python code in text area")
	public void user_is_sending_python_code_in_text_area() {
	   QE.queueprint();
	}

	@When("user clicks on run button after code")
	public void user_clicks_on_run_button_after_code() throws InterruptedException {
	   QE.run();
	}

	@Then("user get output of code")
	public void user_get_output_of_code() {
		Loggerload.info("User is got the output of the code");
		//System.out.println("User is got the output of the code");
	   
	}

	@And("user redirected to home page after Queue")
	public void user_redirected_to_home_page_after_queue() {
		 QE.queuehomeurl();
	}

}
