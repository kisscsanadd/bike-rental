package com.kisscsanadd.bikerental.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bike extends AuditableEntity<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String type;

    private int condition;

    private int hourlyCost;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    private boolean isRented;
}