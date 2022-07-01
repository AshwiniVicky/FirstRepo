package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.utility.RandomString;

public class UtilityUsingProperty_1 {
	
	public static void takescreenshot(WebDriver driver) throws IOException
	{
          File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          String random = RandomString.make(4);
          File destination = new File("D:\\@ashwini\\Testing\\Screenshot\\screening"+random+".png");
	      FileHandler.copy(src, destination);
	}
	
	
	public static String readDataFromproperty(String key) throws IOException 
	{
         Properties prop = new Properties();
         FileInputStream myprop = new FileInputStream("E:\\Mona Workspace\\SeleniumProject\\Myproperty.properties");
		 prop.load(myprop);
		 String value = prop.getProperty(key);
         return value;
	      
	}
	
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}

}
