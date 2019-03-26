import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    protected final Logger logger = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info(iTestResult.getTestClass().toString() + iTestResult.getMethod() + " sterted");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        logger.info(iTestResult.getTestClass().toString() + iTestResult.getMethod() + " finished");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.info(iTestResult.getTestClass().toString() + iTestResult.getMethod() + " finished");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        logger.info(iTestResult.getTestClass().toString() + iTestResult.getMethod() + " finished");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        logger.info(iTestResult.getTestClass().toString() + iTestResult.getMethod() + " finished");
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}
