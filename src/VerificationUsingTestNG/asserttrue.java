package VerificationUsingTestNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asserttrue {
  @Test
  public void method() {
	  boolean s = true;
	  boolean p = false;
	  
	  Assert.assertTrue(s, "value is false TC is failed");
	  Reporter.log("value is true TC is passed", true);
	  
	  Assert.assertFalse(p, "value is true TC is failed");
	  Reporter.log("value is false TC is passed", true);
	  
	  
	  
  }
}
