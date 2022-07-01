package kiteAppBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.NewUtilityAssignment_3;
import kiteAppUtility.UtilityAssignmnt_2;

public class NewBaseAssignment_3 {
	
	public WebDriver driver;
	
	public void launchbrowser() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(NewUtilityAssignment_3.readdatafromproperty("URL"));
		driver.manage().window().maximize();
		UtilityAssignmnt_2.implicitwait(driver, 1000);
	}

}
