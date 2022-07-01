package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import kiteAppBaseClass.BaseClassUsingProperty_1;
import kiteAppUtility.Utility;
import kiteAppUtility.UtilityUsingProperty_1;

public class kiteUNTestUsingProperty_1 extends BaseClassUsingProperty_1{
	
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openbrowser();
		login = new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home = new KiteHomePage(driver);	
	}
	
	@BeforeMethod
	public void kitelogin() throws IOException
	{
		login.sendusername(UtilityUsingProperty_1.readDataFromproperty("UN"));
		login.sendpassword(UtilityUsingProperty_1.readDataFromproperty("PWD"));
		login.clickloginbutton();
		
		UtilityUsingProperty_1.implicitWait(driver, 1000);
		
		pin.sendpin(UtilityUsingProperty_1.readDataFromproperty("PIN"));
		pin.clickcontinuebutton();
		UtilityUsingProperty_1.implicitWait(driver, 1000);
	}
	
  @Test
  public void validateUN() throws IOException
  {
	  String actualid = home.getActualUserId();
	  String expectedid = UtilityUsingProperty_1.readDataFromproperty("UN");
	  
	  Assert.assertEquals(actualid, expectedid,"Userid are not matching TC is failed");
	  Reporter.log("Userid are matching TC is passed", true);
	  UtilityUsingProperty_1.takescreenshot(driver);
  }
  
  @AfterMethod
  public void logoutpage() throws InterruptedException
  {
	  home.clicklogoutbutton();
  }
  
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
  }
  
}
