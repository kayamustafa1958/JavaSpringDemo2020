package com.cybertek.services;


import com.cybertek.Interfaces.Course;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Java implements Course {


    public void getTeachingHours() {
        System.out.println("Teaching hours 20");
    }
}
