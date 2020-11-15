package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){

        System.out.println("name is: "+name);
        return "home";
    }
    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name,@PathVariable("email") String email) {

        System.out.println("name is: " + name+" and email is "+email);
        return "home";
    }

    @GetMapping("/home/course")
    public String queryParam(@RequestParam("course") String course) {

        System.out.println("name is: " + course);
        return "home";
    }

}
