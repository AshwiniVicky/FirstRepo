package PracticePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _2_AlertPopup {

	
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("ignito");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.name("confirmalertbox")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		
	}
}
