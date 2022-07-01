package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_InvocationCountStudy {
 
  
  @Test(timeOut = 1000)
  public void A() throws InterruptedException 
  {
	  Thread.sleep(1200);
	  Reporter.log("A is running", true);
  }
  
  @Test
  public void D() 
  {
	  Reporter.log("D is running", true);
  }
}
