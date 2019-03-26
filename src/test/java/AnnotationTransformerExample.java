import org.testng.annotations.Test;

public class AnnotationTransformerExample {

    @Test
    public void t1() {
        String param = "2";
        System.out.println("Method is t1 " + param);
    }

    @Test
    public void t2() {
        System.out.println("Method is t2");
    }
}
