package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testkite {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// kitelogin page
		
		KiteLoginPage login = new KiteLoginPage(driver);
		login.SendUserName();
		login.SendPassword();
		login.ClickLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//kitepinpage
		
		KitePinPage kp = new KitePinPage(driver);
		kp.SendPin();
		kp.ClickContinuebutton();
		
		//Kite Home Page
		
		KiteHomePage home = new KiteHomePage(driver);
		home.ValidateUerID();
		home.ClickLogoutButton();
		
		driver.close();
		
		
	}

}
