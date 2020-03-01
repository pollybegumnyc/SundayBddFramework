package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import bdd.newtours.PageElements.HomePageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewToursHomePageAction {

HomePageLocators newtoursHomePageLocators = new HomePageLocators();


public void launchNewtoursHomepage() throws Exception{

	System.out.println(ReadExcelSheetData.getMapData("FirstName"));
	SetupDrivers.driver.get("http://www.newtours.demoaut.com/");
	SetupDrivers.driver.manage().window().maximize();
	SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
public void NavigatetoRegisterPage(){
	newtoursHomePageLocators.RegisterButton.click();

}
public void fillUpContactInfo() {
	// TODO Auto-generated method stub
	
}
public void fillUpMailingInfo() {
	// TODO Auto-generated method stub
	
}
public void fillUpUserInfo(String userName) {
	// TODO Auto-generated method stub
	
}
public void submitForm() {
	
}
}