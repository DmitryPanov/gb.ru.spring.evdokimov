package lesson1.hm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("sheduleDoctor")
@Scope("prototype")
public class Schedule implements InfoImpl {

    Random random = new Random();
    private int timeStart = 8;
    private int timeEnd = 18;
    private int start;
    private int cab;

    Schedule() {
        start = (int) (Math.random() * (timeEnd - timeStart)) + timeStart;
        cab = random.nextInt(50);
    }

    @Override
    public void info() {
        System.out.print(" в кабинет " + cab + " c " + start + " до " + timeEnd + ".");
    }
}
