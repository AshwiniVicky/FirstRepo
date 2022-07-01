package kiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	
	protected WebDriver driver;
	
	//Browser setup
	//I want separate method for browser calling
	public void openbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://kite.zerodha.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
}
