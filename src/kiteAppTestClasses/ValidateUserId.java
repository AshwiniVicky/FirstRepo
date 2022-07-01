package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteWithExcel.KiteHomePage;
import KiteWithExcel.KiteLoginPage;
import KiteWithExcel.KitePinPage;
import kiteAppBaseClass.BaseClass;
import kiteAppUtility.Utility;

public class ValidateUserId extends BaseClass{
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	
	
	@BeforeClass
	public void launchbrowser()
	{
		openbrowser();
		login = new KiteLoginPage(driver);
	    pin = new KitePinPage(driver);
	    home = new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void logintokite() throws EncryptedDocumentException, IOException
	{
		login.sendusername(Utility.readDataFromExcel(0, 0));
		login.sendpassword(Utility.readDataFromExcel(0, 1));
		login.clickloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.readDataFromExcel(0, 2));	
		pin.clickcontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
	}
	
  @Test
  public void validateusername() throws EncryptedDocumentException, IOException
  {
	  String expectedid = Utility.readDataFromExcel(0, 0);
	  String actualid = home.getActualUserId();
	  
	  Assert.assertEquals(actualid, expectedid,"Userid are not matching TC is failed");
	  Reporter.log("Userid are matching TC is passed", true);
	  Utility.takescreenshot(driver);
  }
  
  @AfterMethod
  public void logoutfromkite() throws InterruptedException
  {
	  home.clicklogoutbutton();
	  Reporter.log("Clicking on logout button", true);
  }
  
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("Closing browser", true);
	  driver.close();
}
}
