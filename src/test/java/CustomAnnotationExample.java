import org.testng.annotations.Test;

public class CustomAnnotationExample {

    @CustomAnnotation(customAnnotation = "ann")
    @Test
    public void t1() {
        System.out.println("Method is t1");
    }

    @CustomAnnotation(customAnnotation = "ann")
    @Test
    public void t2() {
        System.out.println("Method is t2");
    }

    @Test
    public void t3() {
        System.out.println("Method is t2");
    }
}
