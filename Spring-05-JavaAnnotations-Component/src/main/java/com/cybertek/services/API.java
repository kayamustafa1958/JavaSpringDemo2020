package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("wekkely teaching hours : 7");
    }
}
