import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        if (method.getName().equals("t2")) {
            System.out.println("Disable " + method.getName());
            iTestAnnotation.setEnabled(false);
        }
    }
}