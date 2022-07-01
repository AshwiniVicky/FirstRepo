package PracticePage;


import javax.swing.text.DefaultEditorKit.PasteAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _6_KeyboardAction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement text = driver.findElement(By.name("enter-name"));
		WebElement text1 = driver.findElement(By.name("show-hide"));
		Actions act = new Actions(driver);
		
		 act.keyDown(text, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("shwini").keyDown(text, Keys.CONTROL).sendKeys("c").build().perform();
		
		
		act.moveToElement(text1).keyDown(text1, Keys.CONTROL ).sendKeys("v").build().perform();
	}

}
