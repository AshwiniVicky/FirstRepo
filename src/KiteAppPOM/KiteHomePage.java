
package KiteAppPOM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class KiteHomePage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	
	public String getActualUserId()
	{
		String actualid= userid.getText();
		return actualid;
	}
	
	public void validateuserid(String expectedusername)
	{
		String actualid= userid.getText();
		String expectedid= expectedusername;
		
		Assert.assertEquals(actualid, expectedid,"Userid is not matching TC is failed");
		Reporter.log("Userid is matching TC is passed", true);
		
	}
	
	public void clicklogoutbutton() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		logout.click();
	}

}
