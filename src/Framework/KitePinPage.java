package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

		//Data member/variable
		
	@FindBy (id = "pin") private   WebElement PIN;
	@FindBy(xpath = "//button[@type = 'submit']") private WebElement ContinueButton;
	
	
	//Constructor
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	//Method
	
	public void SendPin()
	{
		PIN.sendKeys("982278");
	}
		
	public void ClickContinuebutton()
	{
		ContinueButton.click();
	}
		

	

}
