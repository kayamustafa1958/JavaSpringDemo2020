package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import com.cybertek.Interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    //OfficeHours officeHours;
    private ExtraSessions extraSessions;


    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }


}