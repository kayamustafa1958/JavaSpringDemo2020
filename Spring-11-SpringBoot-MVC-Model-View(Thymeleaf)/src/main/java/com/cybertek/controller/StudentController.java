package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name","Kaya");  // attribute name and html attribute name should match
        model.addAttribute("course","MVC");  // attribute name and html attribute name should match

        String subject="Collections";
        model.addAttribute("subject",subject);

        return "student/welcome";
    }

}
