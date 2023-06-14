package LiveProjects.ea_coding_test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Base implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		String testName = result.getName();
//		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		String testMethodName = result.getName();
		
//		extentTest.fail(result.getThrowable());
		
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String screenshotFilePath = takeScreenshot(testMethodName, driver);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// Mandatory to push all the above onTest results into reports
		
	}
}
