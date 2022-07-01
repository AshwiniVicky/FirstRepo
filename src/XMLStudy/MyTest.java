package XMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void Method1() 
  {
	Reporter.log("Mthod 1 is running", true); 
  }
  @Test
  public void Method2() 
  {
	Reporter.log("Mthod 2 is running", true);  
  }
  @Test
  public void Method3() 
  {
	Reporter.log("Mthod 3 is running", true);  
  }
  @Test
  public void Method4() 
  {
	Reporter.log("Mthod 4 is running", true); 
  }
  @Test
  public void Method5() 
  {
	Reporter.log("Mthod 5 is running", true);  
  }
}
