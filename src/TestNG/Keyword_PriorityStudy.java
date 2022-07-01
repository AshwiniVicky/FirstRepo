package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_PriorityStudy {
  
	@Test(priority = -3)
	  public void D() 
	  {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test(priority = -3)
	  public void A() 
	  {
		  Reporter.log("D is running", true);
	  }
	  
	  @Test(priority = 0)
	  public void B() 
	  {
		  Reporter.log("B is running", true);
	  }
	  
	  @Test (priority = 3)
	  public void C() 
	  {
		  Reporter.log("C is running", true);
	  }
	  
	  @Test(priority = 2)
	   public void E() 
	  {
		  Reporter.log("E is running", true);
	  }
}
