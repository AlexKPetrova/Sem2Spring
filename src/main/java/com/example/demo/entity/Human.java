package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Human {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String dateOfBirth;

    @OneToOne
    private Country countryOfResidence;

    @OneToMany
    private List<Country> citizenship;

    @OneToMany
    private List<Trip> trips;


    private String login;
    private String password;


}

