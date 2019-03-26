import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    protected final Logger logger = LogManager.getRootLogger();

    @Override
    public void onStart(ISuite iSuite) {
        logger.info("suite is started ");
    }

    @Override
    public void onFinish(ISuite iSuite) {
    }
}
