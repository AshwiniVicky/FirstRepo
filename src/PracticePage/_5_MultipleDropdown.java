package PracticePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _5_MultipleDropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(dropdown);
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(dropdown));
		
		s.selectByIndex(0);
		s.selectByValue("opel");
		s.selectByVisibleText("Audi");
		
		
		int size1 = s.getOptions().size();
		System.out.println(size1);
		
		for(int i=0; i<=size1;i++)
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		
		//System.out.println(s.getFirstSelectedOption().getText());		
	}

}
