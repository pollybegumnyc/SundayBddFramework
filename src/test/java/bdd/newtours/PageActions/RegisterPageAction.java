package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterPageAction {
	
	RegisterPageLocators newtoursRegisterPageLocators = new RegisterPageLocators();
	//ReadExcelSheetData Exceldata = new ReadExcelSheetData();
	
	public void fillUpContactInfo() throws Exception{
		
		
		newtoursRegisterPageLocators.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		newtoursRegisterPageLocators.LastName.sendKeys("Begum");
		newtoursRegisterPageLocators.PhoneNumber.sendKeys("9176187832");
		newtoursRegisterPageLocators.EmailAddress.sendKeys("pollybegum8@gmail.com");
	}

	public void fillUpMailingInfo(){
		
		newtoursRegisterPageLocators.AddressLine1.sendKeys("32-53 77th street ");
		newtoursRegisterPageLocators.AddressLine2.sendKeys("Apt 1st");
		newtoursRegisterPageLocators.City.sendKeys("East Elmhurst");
		newtoursRegisterPageLocators.State.sendKeys("NY");
		newtoursRegisterPageLocators.PostalCode.sendKeys("11370");
		
		Select mydrpdwn = new Select(newtoursRegisterPageLocators.Country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
		
	}
	
	public void fillUpUserInfo(String UserName){
		
		newtoursRegisterPageLocators.UserName.sendKeys(UserName);
		newtoursRegisterPageLocators.Password.sendKeys("home");
		newtoursRegisterPageLocators.ConfirmPassword.sendKeys("home");
		
	}
	
	public void submitForm(){
		
		newtoursRegisterPageLocators.SubmitButton.click();
 		

}
}