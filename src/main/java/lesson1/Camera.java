package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("camera")
@Scope("prototype")
public class Camera implements CameraImpl {
    int result;
    Random random = new Random();
    private CameraRollImpl cameraRoll;

    Camera() {
        result = random.nextInt();
    }

    @Autowired()
    @Qualifier("cameraRollBlackAndWhite")
    public void setCameraRoll(CameraRollImpl cameraRoll) {
        this.cameraRoll = cameraRoll;

    }

    @Override
    public void doPhotographColor() {
        System.out.println("Camera result " + result);
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
