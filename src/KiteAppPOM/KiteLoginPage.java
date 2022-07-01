package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//Data variable
	
	@FindBy(id="userid") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	//constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void sendusername(String USERNAME)
	{
		username.sendKeys(USERNAME);
	}
	
	public void sendpassword(String PASSWORD)
	{
		password.sendKeys(PASSWORD);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	
}

