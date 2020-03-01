package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterConfrPageLocators {
	//verify Thank You for registering
		@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
		public WebElement TxtThankYou;
}
