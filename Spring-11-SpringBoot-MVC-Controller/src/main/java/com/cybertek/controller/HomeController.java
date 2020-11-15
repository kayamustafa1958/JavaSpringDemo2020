package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String getRequestMapping() {
        return "home";
        // pointing localhost:8080/
    }

    @RequestMapping(method = RequestMethod.GET, value="/mkaya")
    public String getRequestMapping2() {
        return "home";
        // pointing localhost:8080/mkaya
    }
    @RequestMapping("/gizo")
    public String getRequestMapping3() {
        return "home";
        //pointing localhost:8080/gizo
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }


    @PostMapping("/spring")
    public String postMappingEx(){
        return "home";
    }

}
