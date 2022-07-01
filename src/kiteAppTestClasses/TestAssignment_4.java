package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomePage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import kiteAppBaseClass.BaseClass_4;
import kiteAppUtility.UtilityAssignment_4;


@Listeners(testListener.Listener_4.class)

public class TestAssignment_4 extends BaseClass_4{
	
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchingbrowser() throws IOException
	{
		launchbrowser();
		login = new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home = new KiteHomePage(driver);	
	}
	
	@BeforeMethod
	public void kitelogin() throws IOException
	{
		login.sendusername(UtilityAssignment_4.readdatafromproperty("UN"));
		login.sendpassword(UtilityAssignment_4.readdatafromproperty("PWD"));
		login.clickloginbutton();
		
		UtilityAssignment_4.implicitwait(driver, 1000);
		
		pin.sendpin(UtilityAssignment_4.readdatafromproperty("PIN"));
		pin.clickcontinuebutton();
		UtilityAssignment_4.implicitwait(driver, 1000);
	}
	
  @Test
  public void validateUN() throws IOException
  {
	  String actualid = home.getActualUserId();
	  String expectedid = UtilityAssignment_4.readdatafromproperty("UN1");
	  
	  Assert.assertEquals(actualid, expectedid,"Userid are not matching TC is failed");
	  Reporter.log("Userid are matching TC is passed", true);
	 
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
