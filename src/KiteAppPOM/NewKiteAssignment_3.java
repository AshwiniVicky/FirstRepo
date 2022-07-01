package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewKiteAssignment_3 {

	//data variable
	
	@FindBy(id="userid") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']") private WebElement PWDerrormsg;
	@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']") private WebElement UNerrormsg;

	//constructor
	
		public NewKiteAssignment_3(WebDriver driver)
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
		
		public WebElement UNMSG()
		{
			WebElement errormsgUN = UNerrormsg;
			return errormsgUN;
		}
		
		public WebElement PWDMSG()
		{
			WebElement errormsgpwd = PWDerrormsg;
			return errormsgpwd;
		}
		
		public String checkPWDMSG()
		{
			String actualpwdMsg = PWDerrormsg.getText();
			return actualpwdMsg;
		
		}
		
		public void checkUNMSG()
		{
			String actualunMsg = UNerrormsg.getText();
		
		}
}

