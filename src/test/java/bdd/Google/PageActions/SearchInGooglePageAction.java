package bdd.Google.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.Google.PageElements.SearchInGoogleLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;
public class SearchInGooglePageAction {


SearchInGoogleLocators saerchInGoogleLocatorsobj = new SearchInGoogleLocators();

SearchInGoogleLocators SearchInGoogleLocatorsobj;

	public SearchInGooglePageAction() {
	SearchInGoogleLocatorsobj = new SearchInGoogleLocators();
	PageFactory.initElements(SetupDrivers.driver, SearchInGoogleLocatorsobj);
	
	}
	
	public void browseHomepage() throws Exception{
	SetupDrivers.driver.get("https://www.google.com/");
	SetupDrivers.driver.manage().window().maximize();
	SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
public void Searchbykeyword(String keyword) throws Exception{ 
	Thread.sleep(2000);
	SearchInGoogleLocatorsobj.txtkeyword.sendKeys(keyword);
	SearchInGoogleLocatorsobj.buttonsearch.click();

}
}
