package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;

    // We can ignore @NoArgConstructor by putting this constructor without id
    // which is gonna be auto generated
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }




}
