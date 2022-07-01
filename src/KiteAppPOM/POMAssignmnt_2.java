package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMAssignmnt_2 {

	//data variable
	
	
		@FindBy(xpath = "//input[@id ='checkBoxOption3']") private WebElement option3;
		@FindBy(xpath = "//input[@id ='displayed-text']") private WebElement hideshow;

   // constructor
		
		public POMAssignmnt_2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
   //method
		
		public void clickcheckbox()
		{
			option3.click();
		}
		
		public  WebElement checkbox()
		{
			WebElement button = option3;
			return button;
			
		}
		
		public WebElement hiddenbutton()
		{
			WebElement field = hideshow;
			return field;
		}
		
	
}


