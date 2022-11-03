import java.lang.annotation.Annotation;

public class Demo2 {
    public static void main(String[] args) {
        Demo d=new Demo();
        Class c=d.getClass();
        System.out.println();
        Anno a=(Anno) c.getAnnotation(Anno.class);
        System.out.println(a.city());
    }
}
