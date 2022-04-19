package lesson1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan
//@Configuration
public class ApplicationConfig {
//    @Scope (scopeName = "prototype")
//    @Bean (name = "cameraRoll")
//    public CameraRollImpl cameraRoll() {
//        return new ColorCameraRoll();
//    }
//
//    @Scope (scopeName = "prototype")
//    @Bean (name = "camera")
//    public CameraImpl camera(CameraRollImpl cameraRoll){
//        Camera camera = new Camera();
//        camera.setCameraRoll(cameraRoll);
//        return camera;
//    }
}
