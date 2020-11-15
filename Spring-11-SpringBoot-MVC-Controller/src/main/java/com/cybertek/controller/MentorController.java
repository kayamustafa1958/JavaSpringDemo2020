package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MentorController {

    @GetMapping("/mentor/show")
    public String show() {

        return "home";
    }

}
