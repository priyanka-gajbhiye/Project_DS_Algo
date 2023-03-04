package Step_definition;

import Page_Factory.Tree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class TreeSD {
	
	Tree TE = new Tree();
	
	@Given("The user is on home page after 	Queue")
	public void the_user_is_on_home_page_after_Queue() {
		Loggerload.info("User is on home page after Queue operation");
	    //System.out.println("User is on home page");
	}

	
	@When("The user clicks on Get Started button of Tree")
	public void the_user_clicks_on_get_started_button_of_tree() {
	   TE.getstartedtree();
	}

	@Then("The user should be redirected to Tree page")
	public void the_user_should_be_redirected_to_tree_page() {
		Loggerload.info("User is on Tree Page");
	    //System.out.println("User is on Tree Page");
	}

	@Given("The user is on Tree page")
	public void the_user_is_on_tree_page() {
		Loggerload.info("User is on Tree page");
	 //System.out.println("User has Tree options");
	}

	@When("The user clicks on Overvies of Trees")
	public void the_user_clicks_on_overvies_of_trees() {
	    TE.overviewtree();
	}
	
	@And("user clicks on try here page Tree")
	public void user_clicks_on_try_here_page_Tree() {
		TE.tryhere();
	}

	@Then("The user redirected to a Tree page having an tryEditor with a Run button")
	public void the_user_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button() {
		Loggerload.info("User can enter code");
	    //System.out.println("User can enter code");
	}

	@Given("The user sending code")
	public void the_user_sending_code() {
	    TE.printoverview();
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws Exception {
	    TE.run();
	}

	@Then("The user should get Output")
	public void the_user_should_get_output() {
		Loggerload.info("User get Output");
	    //System.out.println("User get Output");
	}

	@And("user navigate to back")
	public void user_navigate_to_back() {
	    TE.previouspage();
	}

	@Given("The user is on Tree page again")
	public void the_user_is_on_tree_page_again() {
	  System.out.println("User is on Tree Page");
	}

	@When("The user clicks on Terminologies")
	public void the_user_clicks_on_terminologies() {
	   TE.terminologies();
	}

	@And("user clicks to try here page Terminologies")
	public void user_clicks_to_try_here_page_Terminologies() {
	  TE.trybutton();
	}

	@Then("The user redirected to a Tree page having an tryEditor")
	public void the_user_redirected_to_a_tree_page_having_an_try_editor() {
		Loggerload.info("User Redirected to Try Editor");
	   //System.out.println("User Redirected to Try Editor");
	}

	@Given("The user sending code in textarea")
	public void the_user_sending_code_in_textarea() {
	    TE.printterminologies();
	}

	@When("The user clicks on run button after code")
	public void the_user_clicks_on_run_button_after_code() throws Exception {
	  TE.runbutton();
	}

	@Then("The user get Output for Terminologies")
	public void the_user_get_output_for_Terminologies() {
		Loggerload.info("User get Output for Terminologies");
	  // System.out.println("User get Output for Terminologies");
	}

	@And("user navigate back page")
	public void user_navigate_back_page_() {
	   TE.previouspagetree();
	}
	@Given("The user is Tree page one more time")
	public void the_user_is_tree_page_one_more_time() {
	    Loggerload.info("User is on Tree Page");
		//System.out.println("User is on Tree Page");
	}

	@When("The user clicks on Types of Tree")
	public void the_user_clicks_on_types_of_tree() {
	   TE.typesoftree();
	}

	@And("user clicks to try button")
	public void user_clicks_to_try_button() {
	    TE.tryb();
	}

	@Then("The user redirected to a Types of Tree page having an tryEditor")
	public void the_user_redirected_to_a_types_of_tree_page_having_an_try_editor() {
		Loggerload.info("User is on Try Editor Page");
	    //System.out.println("User is on Try Editor Page");
	}

	@Given("The user sending python code")
	public void the_user_sending_python_code() {
	  TE.printtypestree();
	}

	@When("The user clicks on run after code")
	public void the_user_clicks_on_run_after_code() throws Exception {
	    TE.runb();
	}

	@Then("The user get Output for Typer of Trees")
	public void the_user_get_output_for_typer_of_trees() {
		Loggerload.info("User get Output");
	   //System.out.println("User get Output");
	}

	@Then("user navigate home page after Tree")
	public void user_navigate_home_page_after_Tree() {
	    TE.homepage();
	}


}
