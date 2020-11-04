package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public int getTeachinghours() {
        System.out.println("20 hours");
        return 30;
    }
}
