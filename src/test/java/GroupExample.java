import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = "groupExample")
    void test1() {
        System.out.println("first test method");
    }

    @Test(groups = "groupExample")
    void test2() {
        System.out.println("second test method");
    }

    @Test(groups = "groupExample1")
    void test3() {
        System.out.println("third test method");
    }
}
