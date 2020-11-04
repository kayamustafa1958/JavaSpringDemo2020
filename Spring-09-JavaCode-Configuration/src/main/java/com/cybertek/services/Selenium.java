package com.cybertek.services;


import com.cybertek.Interfaces.Course;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("weekly teaching hours: 23");
    }
}
