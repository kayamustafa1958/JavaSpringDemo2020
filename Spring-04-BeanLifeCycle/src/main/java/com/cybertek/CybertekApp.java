package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("java", Course.class);

        course1.getTeachingHours();  // will give also init method

        ((ClassPathXmlApplicationContext)container).close();  // we casted because (Close method belongs ClassPathxml)
    }

}

