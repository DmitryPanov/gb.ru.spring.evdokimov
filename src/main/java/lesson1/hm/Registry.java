package lesson1.hm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("registry")
@Scope("prototype")
public class Registry implements InfoImpl {
    private Archive archive;
    private Schedule schedule;
    private BuildingPlan buildingPlan;
    private static int human = 1;


    @Autowired
    public void setArchive(Archive archive) {
        this.archive = archive;
    }
    @Autowired
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Autowired
    public void setBuildingPlan(BuildingPlan buildingPlan) {
        this.buildingPlan = buildingPlan;
    }


    @Override
    public void info() {
        System.out.println("Подошел " + human + " человек." );
        System.out.print("Врач находится ");
        buildingPlan.info();
        schedule.info();
        System.out.println(archive);
        human++;
    }
}
