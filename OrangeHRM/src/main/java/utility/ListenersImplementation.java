package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.print("test started.." + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.print("test success.." + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.print("test failed.." + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.print("test skipped.." + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.print("testcase started..");
		System.out.println("..suite execution started..");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.print("test finished..");
	}

}
