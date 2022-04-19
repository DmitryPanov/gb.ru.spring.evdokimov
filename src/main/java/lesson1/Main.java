package lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        CameraImpl camera = context.getBean("camera",CameraImpl.class);
        CameraImpl camera1 = context.getBean("camera",CameraImpl.class);

        camera.doPhotographColor();
        camera1.doPhotographColor();
    }
}
