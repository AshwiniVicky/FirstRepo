package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertnull {
  @Test
  public void method()
  {
	  String m = null;
	  String n = "Hiii";
	  
	  Assert.assertNull(m, "String is not null TC is failed");
	  Reporter.log("String is null TC is passed", true);
	  
	  Assert.fail();
	  Assert.assertNotNull(n, "String is null TC is failed");
	  Reporter.log("String is not null TC is true", true);
  }
}
