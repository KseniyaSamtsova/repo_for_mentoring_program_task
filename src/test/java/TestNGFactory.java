import org.testng.annotations.Factory;

public class TestNGFactory {

    @Factory
    public Object[] createInstances() {
        Object[] result = new Object[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = new TestNGFactoryExample(i);
        }
        return result;
    }
}
