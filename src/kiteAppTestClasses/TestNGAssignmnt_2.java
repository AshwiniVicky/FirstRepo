package kiteAppTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppPOM.POMAssignmnt_2;
import kiteAppBaseClass.BaseClassAssignmnt_2;
import kiteAppUtility.UtilityAssignmnt_2;

public class TestNGAssignmnt_2 extends BaseClassAssignmnt_2{
	
	POMAssignmnt_2 pom;

	
	@BeforeClass
	public void launchingbrowser() throws IOException
	{
		launchbrowser();
		pom = new POMAssignmnt_2(driver);
		UtilityAssignmnt_2.implicitwait(driver, 1000);
	}
	
	
  @Test
  public void screenshotAndScroll() throws IOException 
  {
	  pom.clickcheckbox();
	  
	  UtilityAssignmnt_2.scrollBysize(driver, 2000, 1000);
	  
	  UtilityAssignmnt_2.scrollview(driver, pom.checkbox());
      UtilityAssignmnt_2.takescreenshot(driver);
      UtilityAssignmnt_2.implicitwait(driver, 1000);
      
      UtilityAssignmnt_2.scrollview(driver, pom.hiddenbutton());
      UtilityAssignmnt_2.takescreenshot(driver);
      UtilityAssignmnt_2.implicitwait(driver, 1000);
      
  }
    

  
 
}
