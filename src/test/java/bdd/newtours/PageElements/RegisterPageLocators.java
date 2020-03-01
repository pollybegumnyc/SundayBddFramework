package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement LastName;
	
	@FindBy(xpath="//input[@name='phone']")
	public WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='userName']")
	public WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name='address1']")
	public WebElement AddressLine1;
	
	@FindBy(xpath="//input[@name='address2']")
	public WebElement AddressLine2;
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	public WebElement State;
	
	@FindBy(xpath="//input[@name='postalCode']")
	public WebElement PostalCode;
	
	@FindBy(xpath="//select[@name='country']")
	public WebElement Country;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@name='register']")
	public WebElement SubmitButton;
}
