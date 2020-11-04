package com.cybertek.services;

import com.cybertek.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class officeHours implements ExtraSession {

    @Override
    public int getHours() {
        return 100;
    }
}
