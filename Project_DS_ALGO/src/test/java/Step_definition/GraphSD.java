package Step_definition;

import Page_Factory.Graph;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class GraphSD {
	
	Graph GP = new Graph();
	
	@Given("user is on Home Page after Tree")
	public void user_is_on_home_page_after_tree() {
		Loggerload.info("User is on Home page");
	   //System.out.println("User is on Home page");
	}

	@When("user click on get started button of Graph")
	public void user_click_on_get_started_button_of_graph() {
	    GP.getstartedgraph();
	}

	@Then("user directed to Graph page")
	public void user_directed_to_graph_page() {
		Loggerload.info("User is on Graph Page");
	    //System.out.println("User is on Graph Page");
	}

	@Given("user is on Graph page")
	public void user_is_on_graph_page() {
		Loggerload.info("User checking Graph operation");
	   //System.out.println("User checking Graph operation");
	}

	@When("user clicks on Graph button")
	public void user_clicks_on_graph_button() {
	    GP.Graphbtn();
	}

	@And("user clicks tryhere button of Graph")
	public void user_clicks_tryhere_button_of_graph() {
	    GP.tryhere();
	}

	@Then("user is on tryeditor and run button Graph page")
	public void user_is_on_tryeditor_and_run_button_graph_page() {
		Loggerload.info("User checking Text area");
	    //System.out.println("User checking Text area");
	}

	@Given("user is sending python code in Tryeditor")
	public void user_is_sending_python_code_in_tryeditor() {
	   GP.print();
	}

	@When("user clicks on run button of Graph")
	public void user_clicks_on_run_button_of_graph() throws Exception {
	   GP.run();
	}

	@Then("user get output of Graph")
	public void user_get_output_of_graph() {
		Loggerload.info("User get Output");
		//System.out.println("User get Output");
	   	}

	@And("user redirected to back after Graph")
	public void user_redirected_to_back_after_graph() {
	    GP.back();
	}

	@Given("user is on Graph page again")
	public void user_is_on_graph_page_again() {
		Loggerload.info("User is on Graph");
		//System.out.println("User is on Graph");
	   	}

	@When("user clicks on Graph representation button")
	public void user_clicks_on_graph_representation_button() {
		GP.Gpresentation();
	}

	@And("user clicks tryhere button of Graph representation")
	public void user_clicks_tryhere_button_of_graph_representation() {
	    GP.tryGpresentation();
	}

	@Then("user is on tryeditor and run button Graph representation page")
	public void user_is_on_tryeditor_and_run_button_graph_representation_page() {
		Loggerload.info("User checking try Editor");
	   //System.out.println("User checking try Editor");
	}

	@Given("user is sending python code in Tryeditor of Graph representation")
	public void user_is_sending_python_code_in_tryeditor_of_graph_representation() {
	    GP.printcode();
	}

	@When("user clicks on run button of Graph representation")
	public void user_clicks_on_run_button_of_graph_representation() throws Exception {
	   GP.runbtn();
	}

	@Then("user get output of Graph representation")
	public void user_get_output_of_graph_representation() {
		Loggerload.info("User get Output");
	  // System.out.println("User get Output");
	}
	

	@And("user redirected to Home page after Graph")
	public void user_redirected_to_home_page_after_graph() {
	  GP.homepage();
	}
	
	@Given ("User is on Home page")
	public void User_is_on_Home_page() {
		Loggerload.info("User is on Home page");
		//System.out.println("User is on Home page");
	}
	
    @When("user clicks Sign out")
    public void user_clicks_Sign_out() {
    	GP.signout();
    }
    @Then("user successfully Sign Out from DS algo")
    public void user_successfully_Sign_Out_from_DS_algo() {
    	Loggerload.info("User successfully Sign Out from DS algo");
    	//System.out.println("User successfully Sign Out from DS algo");
    }


}
