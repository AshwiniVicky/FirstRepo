package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void TC() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://vctcpune.com/selenium/practice.html");
       
      WebElement option1 = driver.findElement(By.xpath("//input[@value='option1']"));
      option1.click();
      
//      if(option1.isSelected())
//      {
//    	  Reporter.log("option 1 is selected");
//      }
//      
//      else
//      {
//    	  Reporter.log("option 1 is not selected");
//    	  
//      }
      Thread.sleep(100);
      Assert.assertTrue(option1.isSelected(), "option 1 is not selected TC is failed");
      Reporter.log("option 1 is selected TC is passed",true);
  }
}
