package kiteAppUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class NewUtilityAssignment_3 {

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
		
	
}
