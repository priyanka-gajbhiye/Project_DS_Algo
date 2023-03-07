package Step_definition;

import Page_Factory.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class RegisterSD {
	
	Register RG = new Register();
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		
	    RG.url();
	    RG.getstarted();
	    RG.register();
	    Loggerload.info("User opened DS Algo URL and is trying to Registrer");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_Register_button_with_all_fields_empty() throws Exception {
		RG.emptyfeilds();
		RG.takescreenshot("Emptyfields.png");
	   	}

	@Then("It should display an error")
	public void it_should_display_an_error() {
		Loggerload.info("Please fill out this field");
	    //System.out.println("Please fill out this field");
	}
	
	@Given("The user opens Register Page for Invalid username")
	public void the_user_opens_register_page_for_Invalid_username() {
	   Loggerload.info("User is trying with Invalid username");
		// System.out.println("User is trying with Invalid username");
	}

	@When("The user enters invalid username")
	public void the_user_enters_invalid_username() throws Exception {
	    RG.invalidusernameonly();
	    RG.registerclick();
	    Thread.sleep(1000);
	    RG.takescreenshot("InvalidUsername.png");
	}

	@Then("It should display an error message Invalid username")
	public void it_should_display_an_error_message_Invalid_username() {
		Loggerload.info("Please enter a valid username");
		//System.out.println( "Please enter a valid username");
		RG.register();
	   	}
	
	@Given("The user opens Register Page for Invalid password")
	public void the_user_opens_register_page_for_Invalid_password() {
		Loggerload.info("User is trying with Invalid password only");
	    //System.out.println("User is trying with Invalid password only");
	}

	@When("The user enters valid username and invalid password")
	public void the_user_enters_valid_username_and_invalid_password() throws Exception {
	    RG.invalidpassword();
	    RG.registerclick();
	    RG.takescreenshot("Invalidpassword.png");
	}
	
	@Then("It should display an error message Invalid password")
	public void it_should_display_an_error_message_Invalid_password() {
		Loggerload.info("Password is too short");
		//System.out.println( "Password is too short");
		RG.register();
	   	}
	
	@Given("The user opens Register Page for mismatch data")
	public void the_user_opens_register_page_for_mismatch_data() {
		Loggerload.info("User is trying with misatch data");
	    //System.out.println("User is trying with misatch data");
	}


	@When("The user enters a valid username and password but different password_confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_but_different_password_confirmation_and_the_user_clicks_Register_button() throws Exception {
	   RG.mismatchdata();
	   RG.registerclick();
	   RG.takescreenshot("Mismatchpassword.png");
	}

	@Then("It should display an error mismatch password")
	public void it_should_display_an_error_mismatch_password() {
		Loggerload.info("The two password fields didn’t match.");
	  // System.out.println("The two password fields didn’t match.");
	   RG.register();
	}
	
	@Given("The user opens Register Page for valid username and password")
	public void the_user_opens_register_page_for_valid_username_and_password() {
	    Loggerload.info("User is trying with Valid username and password");
		//System.out.println("User is trying with Valid username and password");
	}

	@When("The user enters a valid username and password and password confirmation and the user clicks Register button")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation_and_the_user_clicks_Register_button() throws Exception {
	   RG.validdata();
	   RG.registerclick();
	   RG.takescreenshot("Validusernaepassword.png");
	}

	@Then("The user should be redirected to Homepage with New Account Created")
	public void the_user_should_be_redirected_to_homepage_with_New_Account_Created() {
		Loggerload.info("User successfully created New Account");
	    //System.out.println("User successfully created New Account");
	}
	
	@And ("User signs out from the account")
	public void user_signs_out_from_the_account(){
		RG.signout();
	}
	


}
