package lesson1.hm;

import org.springframework.stereotype.Component;

@Component("ArchiveGetCard")
public class Archive {
    @Override
    public String toString() {
        return "Вот ваша карточка ";
    }
}
