package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	// Data members/variable
	
	@FindBy(id="userid") private WebElement  UN;
	@FindBy(id="password")  private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	
	// Constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Method
	
	public void SendUserName()
	{
		UN.sendKeys("ELR321");
	}
	
	public void SendPassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	
	public void ClickLoginButton()
	{
		login.click();
	}
}
