package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	
	//data variable
	
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;

	//constructor
	
	public KitePinPage(WebDriver driver)
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
}
