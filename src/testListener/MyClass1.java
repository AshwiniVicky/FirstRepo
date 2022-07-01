

//Implementing listener at XML level 

package testListener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testListener.Listener.class)

public class MyClass1 {
 
	@Test
  public void method1() 
	{
		Reporter.log("Hii", true);
  }
	
	@Test
	  public void method2() 
		{
			Reporter.log("Namaste", true);
	  }
}
