package bdd.stepDef;

import bdd.newtours.PageActions.NewToursHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//we run the feature fill Newtour using cucumber which will generate the steps which we can code 
public class NewtoursRegisterSteps {
	
	NewToursHomePageAction homePageAction = new NewToursHomePageAction();
	NewToursHomePageAction newtoursRegisterPageActions = new NewToursHomePageAction();
	RegisterConfrPageAction registerConfrPageActionobj = new RegisterConfrPageAction();
	
	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		homePageAction.launchNewtoursHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		homePageAction.NavigatetoRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtoursRegisterPageActions.fillUpContactInfo();
		newtoursRegisterPageActions.fillUpMailingInfo();
		
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName) throws Throwable {
		newtoursRegisterPageActions.fillUpUserInfo(UserName);
		newtoursRegisterPageActions.submitForm();

	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	      registerConfrPageActionobj.verifyThankyouRegister();
	}


}

