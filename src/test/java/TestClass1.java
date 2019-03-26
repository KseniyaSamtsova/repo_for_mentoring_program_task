import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TestClass1 {

    int a = 5;
    int b = 5;

    @Test(groups = { "group1" })
    void secondTest() {
        Assert.assertEquals(a, b);
    }
}
