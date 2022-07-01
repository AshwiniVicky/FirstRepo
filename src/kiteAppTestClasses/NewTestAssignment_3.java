package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KiteAppPOM.NewHomeAssignment_3;
import KiteAppPOM.NewKiteAssignment_3;
import KiteAppPOM.NewPinAssignment__3;
import kiteAppBaseClass.NewBaseAssignment_3;
import kiteAppUtility.NewUtilityAssignment_3;

public class NewTestAssignment_3 extends NewBaseAssignment_3{
	
	NewKiteAssignment_3 obj;
	NewPinAssignment__3 abc;
	NewHomeAssignment_3 bcd;
	
	@BeforeClass
	public void launchingbrowser() throws IOException
	{
		launchbrowser();
		obj = new NewKiteAssignment_3(driver);
		abc = new NewPinAssignment__3(driver);
		bcd = new NewHomeAssignment_3(driver);
	}
	
	//valid username and password
	
  @Test
  public void Test1() throws IOException, InterruptedException 
  {
		NewUtilityAssignment_3.implicitwait(driver, 1000);
		obj.sendusername(NewUtilityAssignment_3.readdatafromproperty("UN"));
		obj.sendpassword(NewUtilityAssignment_3.readdatafromproperty("PWD"));
		obj.clickloginbutton();	
		abc.sendpin(NewUtilityAssignment_3.readdatafromproperty("PIN"));
		abc.clickcontinuebutton();
		bcd.clicklogoutbutton();
		abc.changetoUser();
  }
  
  // valid username empty password check error msg
  
  @Test
  public void Test2() throws IOException
  {
	  SoftAssert sa = new SoftAssert();
	  NewUtilityAssignment_3.implicitwait(driver, 1000);
	  obj.sendusername(NewUtilityAssignment_3.readdatafromproperty("UN"));
	  obj.clickloginbutton();	
//	  sa.assertEquals(obj.checkPWDMSG(), NewUtilityAssignment_3.readdatafromproperty("UNerrorMsg"), "Actual and expected error msg not matching,TC is failed"); // expected msg put wrong
//	  sa.assertAll();
	  Assert.assertEquals(obj.checkPWDMSG(), NewUtilityAssignment_3.readdatafromproperty("PWDerrorMsg"), "Actual and expected error msg not matching,TC is failed");
	  Reporter.log("Actual and expected error msg are matching,TC is passed", true);	
	  abc.clickkitelogo();
  }

 //invalid username and password
  
  @Test
  public void Test3() throws IOException
  {
	    NewUtilityAssignment_3.implicitwait(driver, 1000);
		obj.sendusername(NewUtilityAssignment_3.readdatafromproperty("UN1"));
		obj.sendpassword(NewUtilityAssignment_3.readdatafromproperty("PWD1"));
		obj.clickloginbutton();	
		 abc.clickkitelogo();
  }
  
  // valid username and incorrect password
  
  @Test
  public void Test4() throws IOException
  {
	    NewUtilityAssignment_3.implicitwait(driver, 1000);
		obj.sendusername(NewUtilityAssignment_3.readdatafromproperty("UN"));
		obj.sendpassword(NewUtilityAssignment_3.readdatafromproperty("PWD1"));
		obj.clickloginbutton();	
		 abc.clickkitelogo();
  }
  
}
