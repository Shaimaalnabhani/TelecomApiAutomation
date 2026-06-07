package utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static final com.aventstack.extentreports.ExtentReports
            extent = ExtentManager.getInstance();

    private static final ThreadLocal<ExtentTest>
            test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest =
                extent.createTest(result.getMethod().getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().log(
                Status.PASS,
                "Test Passed"
        );
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().log(
                Status.FAIL,
                result.getThrowable()
        );
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}