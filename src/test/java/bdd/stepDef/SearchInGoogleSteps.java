package bdd.stepDef;

import bdd.Google.PageActions.SearchInGooglePageAction;
import bdd.Google.PageElements.SearchInGoogleLocators;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchInGoogleSteps {
	
	//SearchInGoogleLocators saerchInGoogleLocators = new SearchInGoogleLocators();
	//SearchInGoogleLocators SearchInGoogleLocatorsobj = new SearchInGoogleLocators();
	
	SearchInGooglePageAction SearchInGooglePageActionobj = new SearchInGooglePageAction();
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		SearchInGooglePageActionobj.browseHomepage();
	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String keyword) throws Throwable {
		SearchInGooglePageActionobj.Searchbykeyword(keyword);
	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		System.out.println("Test Complete");
	}


}
