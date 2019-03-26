import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "datapr")
    public Object[][] createData1() {
        return new Object[][] { { "Kseniya", 2 }, { "Alina", new Integer(8) }, };
    }

    @Test(dataProvider = "datapr")
    void verifyData1(String n1, int n2) {
        System.out.println(n1 + "  " + n2);
    }

    @Test(dependsOnMethods = "verifyData1")
    void dependTest() {
        System.out.println("test2");
    }
}
