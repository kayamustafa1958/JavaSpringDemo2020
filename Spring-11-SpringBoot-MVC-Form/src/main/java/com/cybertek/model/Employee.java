package com.cybertek.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String birthday;
    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;





}
