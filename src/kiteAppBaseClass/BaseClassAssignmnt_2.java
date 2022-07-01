package kiteAppBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityAssignmnt_2;

public class BaseClassAssignmnt_2 {
	
	protected WebDriver driver;
	
	
	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UtilityAssignmnt_2.readdatafromproperty("URL1"));
		driver.manage().window().maximize();
		UtilityAssignmnt_2.implicitwait(driver, 1000);
	}
	
	

}
