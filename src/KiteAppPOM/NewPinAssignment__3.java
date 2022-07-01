package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPinAssignment__3 {
	
	//data variable
	
		@FindBy(id="pin") private WebElement PIN;
		@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;
		@FindBy(xpath = "//a[text()='Change user']") private WebElement changeUser;
		@FindBy(xpath = "//img[@alt='Kite']") private WebElement kitelogo;

		//constructor
		
		public NewPinAssignment__3(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//methods
		
		public void sendpin(String PINNUM)
		{
			PIN.sendKeys(PINNUM);
		}
		
		public void clickcontinuebutton()
		{
			continuebutton.click();
		}
		
		public void changetoUser()
		{
			changeUser.click();
		}
	
		public void clickkitelogo()
		{
			kitelogo.click();
		}
}

