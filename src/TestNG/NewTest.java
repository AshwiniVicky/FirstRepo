package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  //System.out.println("Successful");
	  Reporter.log("Hello World", true);
  }
}





















