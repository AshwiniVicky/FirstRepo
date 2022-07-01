package testListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener

{
	
	//ontestPass
	//ontestFailure
	//ontestSkip
	//ontestSuccess
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Tc is failed,screenshot taken", true);
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Tc is passed", true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Tc is skipped", true);
		ITestListener.super.onTestSkipped(result);
	}

}
