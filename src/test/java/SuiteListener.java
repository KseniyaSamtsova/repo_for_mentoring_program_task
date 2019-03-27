import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import java.util.List;

public class SuiteListener implements ISuiteListener {

    protected final Logger logger = LogManager.getRootLogger();

    @Override
    public void onStart(ISuite iSuite) {
        logger.info("Suite is started " + iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
        logger.info("Suite is finished " + iSuite.getName() + "spending time: ");

        List<IInvokedMethod> methods = iSuite.getAllInvokedMethods();
        for (IInvokedMethod method : methods) {
            String name = method.getTestMethod().getMethodName();
            Long time = method.getTestResult().getEndMillis() - method.getTestResult().getStartMillis();

            logger.info(name, time);
        }
    }
}
