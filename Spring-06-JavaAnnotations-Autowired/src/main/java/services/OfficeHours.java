package services;

import Interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {


    @Override
    public int getHours() {
        return 5;
    }

}
