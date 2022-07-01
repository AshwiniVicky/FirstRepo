
//listener at class level


package testListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testListener.Listener.class)

public class MyClass {
 
	@Test
  public void method1() 
	{
		Assert.fail();
		Reporter.log("Hii", true);
  }
	
	@Test(dependsOnMethods = {"method1"})
	  public void method2() 
		{
		
			Reporter.log("Namaste", true);
	  }
}
