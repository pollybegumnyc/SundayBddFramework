package bdd.Google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchInGoogleLocators {


  //Txtkeyword
   @FindBy(xpath="//input[@title='Search']")
   public WebElement txtkeyword;

   @FindBy(xpath="//input[@value='Google Search']")
   public WebElement buttonsearch;
}
