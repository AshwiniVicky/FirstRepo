package PracticePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _4_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'day']"));
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(dropdown));
		
//		dropdown.click();
//		Select s = new Select(dropdown);
//		
//		s.selectByIndex(1);
//		Thread.sleep(3000);
//		s.selectByValue("15");
//		Thread.sleep(3000);
//		s.selectByVisibleText("18");
		
	}

}
