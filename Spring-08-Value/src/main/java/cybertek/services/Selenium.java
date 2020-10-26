package cybertek.services;



import cybertek.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("weekly teaching hours: 23");
    }
}
