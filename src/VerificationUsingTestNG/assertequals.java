package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertequals {
  @Test
  public void method() {
	  String m ="Velocity";
	  String n ="Velocity";
	  String o ="pune";
	  
	  Assert.assertEquals(m, n,"String are not matching TC is failed");
	  Reporter.log("String is matcing TC is passed ", true);
	  
	  Assert.assertNotEquals(n, o,"String is matcing TC is passed");
	  Reporter.log("String is not matcing TC is passed ", true);
	  
  }
  
}
