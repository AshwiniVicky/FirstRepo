package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Study {
  @Test
  public void mytest1() 
  {
	  Reporter.log("Test method1 is running", true);	    
  }
  
  @Test
  public void mytest2() 
  {
	  Reporter.log("Test method2 is running", true);	    
  }
  
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After method is running", true); 
  }
   
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before method is running", true); 
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Before class is running", true); 
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("After class is running", true); 
  }
  
}
