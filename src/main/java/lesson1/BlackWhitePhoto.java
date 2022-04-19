package lesson1;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("cameraRollBlackAndWhite")
public class BlackWhitePhoto implements CameraRollImpl {
    int result = -1;
    int res1;

    Random random = new Random();

    BlackWhitePhoto() {
        res1 = random.nextInt();
    }

    @Override
    public void processing() {
        System.out.println("Black/White 1" + result + " ramdom " + res1);
    }
}
