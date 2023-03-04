package Step_definition;

import Page_Factory.Array;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class ArraySD {
	Array AR = new Array();
	
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
		Loggerload.info("User is on Home Page");
	   //System.out.println("User is on Home Page");
	}

	@When("The user clicks on Get Started button")
	public void the_user_clicks_on_get_started_button() {
	    AR.getstartedarray();	}

	@Then("The user should be redirected to Arrays page")
	public void the_user_should_be_redirected_to_arrays_page() {
		Loggerload.info("User is on Array Page");
	   //System.out.println("User is on Array Page");	
		}

	@Given("The user is in the Arrays in Python")
	public void the_user_is_in_the_arrays_in_python() {
		Loggerload.info("User click Array in PYTHON page");
	    //System.out.println("User click Array in PYTHON page");
	}

	@When("The user clicks on Arrays in Python page")
	public void the_user_clicks_on_arrays_in_python_page() {
	    AR.arrayPython();	}

	@And("user clicks on try here page")
	public void user_clicks_on_try_here_page() {
	   AR.tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() throws Exception {
	   AR.printcode();
	   AR.runaaray();
	}

	@Given("The user clicks on the Practice page")
	public void the_user_clicks_on_the_practice_page() {
	    AR.back();
	    AR.practisequestion();
	    }

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    AR.searcharray();
	}

	@Then("The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_an_try_editor_with_run_and_submit_buttons() {
	  //AR.cleartextarea();
	  //AR.printcode();
	  //AR.runpracticearray();
	}

	@And("user redirected to home page")
	public void user_redirected_to_home_page() {
	    AR.homepage();
	}


}
