package com.cybertek;

import com.cybertek.Interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("API", Course.class);
        course.getTeachingHours();

    }


}
