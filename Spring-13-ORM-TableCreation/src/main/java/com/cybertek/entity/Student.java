package com.cybertek.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="studenFirstName")
    private String firstName;
    private String lastName;
    private String email;

}
