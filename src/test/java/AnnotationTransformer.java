import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        Annotation[] annotations = method.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }

        if (method.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation ann = method.getAnnotation(CustomAnnotation.class);
            if ("ann".equalsIgnoreCase(ann.customAnnotation())) {
                iTestAnnotation.setEnabled(false);
            }
        }
    }
}