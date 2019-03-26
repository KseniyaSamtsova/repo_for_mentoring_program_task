import org.testng.annotations.Test;

public class TestNGFactoryExample {

    int s = 5;

    public TestNGFactoryExample(int s) {
        this.s = s;
    }

    @Test
    public void testNGFactoryExample() {
        System.out.println(s);
    }
}
