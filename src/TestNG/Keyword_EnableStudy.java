package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_EnableStudy {
	 @Test(enabled = false)
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
	  
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is running", true);
	  }
	  
	  @Test
	  public void E() 
	  {
		  Reporter.log("E is running", true);
	  }
}
