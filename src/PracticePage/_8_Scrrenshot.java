package PracticePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class _8_Scrrenshot {
	public static void main(String[] args) throws IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(opt);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String random= RandomString.make(1);
	    File dest = new File("D:\\@ashwini\\Testing\\Screenshot\\ashwini"+random+".png");
	    FileHandler.copy(source, dest);
		
	}

}
