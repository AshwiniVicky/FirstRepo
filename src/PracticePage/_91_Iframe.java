package PracticePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _91_Iframe {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(opt);
	    
        driver.manage().window().maximize();
	    
	    driver.get("https://demoqa.com/nestedframes");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
//	    WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
//	    w.until(ExpectedConditions.visibilityOf(null));
	    
	    WebElement frame1 = driver.findElement(By.xpath("//iframe[@src = '/sampleiframe']"));
	  //  WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	    WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	    
	  //  driver.switchTo().frame(frame1);
//	    driver.switchTo().frame(childframe);
//	    
//	    System.out.println(childframe.getText());
//	    
	    
	    
	    
	}

}
