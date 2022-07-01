package PracticePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _3_childBrowser {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("--headless");
	
	System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	driver.findElement(By.name("NewWindow")).click();  //new window locate
	Thread.sleep(1000);
	
	
	 String mainid = driver.getWindowHandle();
	 System.out.println(mainid);
	 
	 
	Set<String> ids = driver.getWindowHandles();
	
//	ArrayList<String> ar = new ArrayList<String>(ids);
//	
//	for(int i=0 ; i<=ar.size()-1; i++)
//	{
//		ar.get(i);
//	}
//	
//	String idofmain = ar.get(0);
//	String idofchild = ar.get(1);
//	System.out.println(idofchild);
//	System.out.println(idofmain);
	
	
	
	
	Iterator<String> it = ids.iterator();
	String idofmain = it.next();
	System.out.println( "idofmain "+ idofmain);
	
	String idofchild = it.next();
	System.out.println( "idofchild "+ idofchild);

	
	
	
	driver.switchTo().window(idofchild);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenium");
	Thread.sleep(5000);
	driver.switchTo().window(idofmain);
	
	
	
	

}
}
