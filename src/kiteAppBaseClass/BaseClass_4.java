
//How to take failed TC screenshot with TC name using listener interface

package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityAssignment_4;

public class BaseClass_4
{
	protected static WebDriver driver;
	
	
	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(UtilityAssignment_4.readdatafromproperty("URL"));
		 UtilityAssignment_4.implicitwait(driver, 1000);
	}
	
	
	
	//see changes
	//make screenshot method non-static

	public void takescreenshot(String TCName) throws IOException 
	{
     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     File dest = new File("D:\\@ashwini\\Testing\\Screenshot\\"+TCName+".png");
     FileHandler.copy(source, dest);

		
	}
	

}
