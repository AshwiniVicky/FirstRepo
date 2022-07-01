package testListener;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClass_4;

public class Listener_4 implements ITestListener
{

	BaseClass_4 ba = new BaseClass_4(); // object creation of base class
	
	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is failed", true);
		String TCname = result.getName();
		try {
			ba.takescreenshot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is passed", true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC name is "+result.getName(), true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is skipped ", true);
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Skipped TC name is "+result.getName(), true);
	}
	
}
