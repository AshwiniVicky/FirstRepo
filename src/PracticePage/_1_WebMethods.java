package PracticePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_WebMethods {
	
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");
	//	opt.addArguments("--ignito");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
//		w.until(ExpectedConditions.visibilityOf(null));
		
		
		 WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(option1.isSelected());
		

		 WebElement button = driver.findElement(By.name("show-hide"));
		System.out.println(button.isDisplayed());
		
		
		
		
		
		//driver.close;
		//driver.quit
		
		
	}

}
