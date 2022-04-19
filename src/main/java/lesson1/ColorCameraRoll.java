package lesson1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component ("ColorCameraRoll")
//@Scope ("prototype")
public class ColorCameraRoll implements CameraRollImpl {
    int result;

    Random random = new Random();

    public ColorCameraRoll() {
        this.result = random.nextInt();
    }

    @Override
    public void processing() {
        System.out.println("Цветное фото " + result);
    }
}
