package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

   /* @Autowired
    @Qualifier("officeHours")
    private ExtraSessions extraSessions;*/

     private ExtraSessions extraSessions;

    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 20" + " and ExtraSessions Hours: " + extraSessions.getHours() + " Total: " + (extraSessions.getHours() + 20));


    }
}