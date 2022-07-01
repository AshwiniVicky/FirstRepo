package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestclassTestNGcrossbrowser {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	static WebDriver driver;
	Sheet mysheet;
	
	
//Parameter name and value name as should be written same in xml file as written in test class
	
	@Parameters("browser")               //annotation for crossbrowser
	@BeforeClass
	public void launchbrowser(String browser) throws EncryptedDocumentException, IOException
	{
	
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Ashwini\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Ash\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}

	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
	    Reporter.log("Launching URL", true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    login = new KiteLoginPage(driver);
	    pin = new KitePinPage(driver);
	    home = new KiteHomePage(driver);
	    
	    File myfile= new File("D:\\@ashwini\\ExcelReading\\Excelfetchsel.xlsx");
	    mysheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
	}
	
	@BeforeMethod
	public void logintokite()
	{
		login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username", true);
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Password", true);
		login.clickloginbutton();
		Reporter.log("Clicking on login button", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending pin", true);
		pin.clickcontinuebutton();
		Reporter.log("Clicking continue button", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
  @Test
  public void verifykiteusername()
  {
	  String expectedid = mysheet.getRow(0).getCell(0).getStringCellValue();
	  String actualid = home.getActualUserId();
	  
	  Assert.assertEquals(actualid, expectedid,"Userid are not matching TC is failed");
		Reporter.log("Userid are matching TC is passed", true);
  }
  
  @AfterMethod
  public void logoutfromkite() throws InterruptedException
  {
	  home.clicklogoutbutton();
	  Reporter.log("Clicking on logout button", true);
  }
  
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("Closing browser", true);
	  driver.close();
	  
  }
  
}
