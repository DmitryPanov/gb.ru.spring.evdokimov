package lesson1.hm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("buildplan")
@Scope("prototype")
public class BuildingPlan implements InfoImpl {
    int floor;
    Random random = new Random();

    BuildingPlan() {
        floor = random.nextInt(5) + 1;
    }

    @Override
    public void info() {
        System.out.print("на " + floor + " этаже");
    }
}
