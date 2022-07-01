package kiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityUsingProperty_1;

public class BaseClassUsingProperty_1 {

	
protected WebDriver driver;
	
	//Browser setup
	//I want separate method for browser calling
	public void openbrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(UtilityUsingProperty_1.readDataFromproperty("URL"));
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
	
}
