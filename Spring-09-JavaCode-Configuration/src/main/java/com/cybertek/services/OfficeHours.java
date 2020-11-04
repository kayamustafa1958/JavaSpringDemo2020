package com.cybertek.services;

import com.cybertek.Interfaces.ExtraSessions;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 10;
    }
}
