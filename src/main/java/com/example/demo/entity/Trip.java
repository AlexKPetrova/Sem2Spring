package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne()
    private Human human;

    @OneToOne
    private Country country;

    @OneToOne
    private Hotel hotel;
    
}
