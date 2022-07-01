package PracticePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _7_MouseAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		
	     WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement text1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act = new Actions(driver);
	
		
	//	act.dragAndDrop(source, text1).perform();
		act.clickAndHold(source).release(text1).build().perform();
		
		
	}

}
