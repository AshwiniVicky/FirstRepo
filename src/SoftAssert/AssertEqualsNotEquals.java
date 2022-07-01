package SoftAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsNotEquals {
	
	SoftAssert soft = new SoftAssert();
	
  @Test
  public void method()
  {
	  String m ="Velocity";
	  String n ="Velocity";
	  String o ="pune";
	  
	  soft.assertEquals(m, o,"String are not matching TC is failed");
	  
	  soft.assertNotEquals(n, o,"Strings are not matcing TC is failed");
	  soft.assertAll();  
  }
  @Test
  public void method1()
  {
	  boolean a = true;
	  
	  soft.assertTrue(a, "A is not true TC is failed");
	  soft.assertAll();
  }
}
