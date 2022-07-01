package Serial_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass3 {
  @Test
  public void Method3() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.facebook.com/");
       Reporter.log("Method3 is running", true);
}
}
