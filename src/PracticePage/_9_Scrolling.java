package PracticePage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _9_Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(opt);
	    
//   driver.manage().window().maximize();
	    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    WebElement button = driver.findElement(By.name("show-hide"));
		
//	    WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
//	    w.until(ExpectedConditions.visibilityOf(""));
//	    
//	      JavascriptExecutor js = ((JavascriptExecutor)driver);
//	      js.executeScript("window.scrollBy(800,900)");
//	    
//	      Thread.sleep(2000);
//	      js.executeScript("window.scrollBy(100,1100)");
//	      
//	      JavascriptExecutor js = ((JavascriptExecutor)driver);
//	      js.executeAsyncScript("arguments[0].scrollIntoView(true);", button);
	      

//	   Dimension d = new Dimension(100, 900);
//	   System.out.println(driver.manage().window().getSize());
//	   driver.manage().window().setSize(d);
//	   System.out.println(driver.manage().window().getSize());
//	   
	    Point p = new Point(100, 200);
	    System.out.println(driver.manage().window().getPosition()); 
	    driver.manage().window().setPosition(p);
	    System.out.println(driver.manage().window().getPosition());
	   
	}

}
