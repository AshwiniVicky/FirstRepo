package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {


		@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
		@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;

		

		
		public KiteHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		public void ValidateUerID()
		{
			String actualUId = UserId.getText();
			String ExpectedUId = "ELR328";
			
			if(actualUId.equals(ExpectedUId))
			{
				System.out.println("USERID IS MATCHING");
			}
			else
			{
				System.out.println("USERID IS MATCHING");
			}
			
			UserId.click();				
		}
		
		public void ClickLogoutButton() throws InterruptedException
		{
			Thread.sleep(200);
			LogoutButton.click();
		}

}
