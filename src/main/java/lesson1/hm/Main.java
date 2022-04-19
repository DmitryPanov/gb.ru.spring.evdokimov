package lesson1.hm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Human.class);
        Registry registry = context.getBean("registry", Registry.class);
        Registry registry1 = context.getBean("registry", Registry.class);
        Registry registry2 = context.getBean("registry", Registry.class);
        Registry registry3 = context.getBean("registry", Registry.class);
        registry.info();
        registry1.info();
        registry2.info();
        registry3.info();
    }
}
