import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Parameters({ "name", "age", "city" })
    @Test
    void test1(String name, int age, String city) {

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);
    }
}
