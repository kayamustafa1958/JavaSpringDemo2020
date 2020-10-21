package com.cybertek.services;

import com.cybertek.Interfaces.Course;


public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours :  15");
    }
}