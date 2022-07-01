package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityAssignmnt_2 {
	
	
	//fetch data from property file
	
	public static String readdatafromproperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myprop = new FileInputStream("E:\\Mona Workspace\\SeleniumProject\\Myproperty.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;
	}
	
	// Implicit wait
	
	public static void implicitwait(WebDriver driver, int timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	}
	
	//Screenshot method
	
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(5);
		File desc = new File("D:\\@ashwini\\Testing\\Screenshot\\assign"+random+".png");
		FileHandler.copy(src, desc);
	}
	
	// Scrolling method
	
	public static void scrollview(WebDriver driver, WebElement Ref)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].scrollIntoView(true);", Ref);
	
	}
	
	public static void scrollBysize(WebDriver driver, int x, int y)
	{
		Dimension d= new Dimension(x, y);
		driver.manage().window().setSize(d);	
	}
	
	
	

}
