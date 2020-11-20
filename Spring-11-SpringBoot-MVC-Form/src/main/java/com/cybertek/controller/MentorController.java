package com.cybertek.controller;

import com.cybertek.model.Mentor;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.sun.jdi.Method;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")     //it is calling get method
    public String showForm(Model model) {

        model.addAttribute("mentor", new Mentor());
        List<String> batchList= Arrays.asList("B7","B8","B9","B10","B11","E1","E2","E3","E4");
        model.addAttribute("batchList",batchList);


        return "mentor/mentor-register";


    }

@PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor){



        // model.addAttribute("mentor",new Mentor());  this mentor object is not holding previous objects values

    System.out.println(mentor.toString());
        return "mentor/mentor-confirmation";
}


}
