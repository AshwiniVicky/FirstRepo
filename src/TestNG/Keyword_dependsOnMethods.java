package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Keyword_dependsOnMethods {
  @Test
  public void B() 
  {
	  Assert.fail();  
	  Reporter.log("B is running", true);
  }
  
  @Test(dependsOnMethods = {"B"})
  public void C() throws InterruptedException 
  {
	  Thread.sleep(200);
	  Reporter.log("C is running", true);
  }
  
  @Test
  public void E() 
  {
	  Reporter.log("E is running", true);
  }

}
