package Serial_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 {
  @Test
  public void Method2() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://paytm.com/");
       Reporter.log("Method2 is running", true);
}
}
