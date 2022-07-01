
//Implementing listener at XML level 


package testListener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testListener.Listener.class)

public class MyClass2 {
 
	@Test
  public void method3() 
	{
		Reporter.log("Jai Maharashtra", true);
  }
	
	@Test
	  public void method4() 
		{
			Reporter.log("Jai Hind", true);
	  }
}
