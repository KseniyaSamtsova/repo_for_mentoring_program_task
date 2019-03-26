import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    protected final Logger logger = LogManager.getRootLogger();

    int a = 5;
    int b = 5;

    @Test(groups = { "group2" })
    void firstTest() {
        Assert.assertEquals(a, b);
    }
}
