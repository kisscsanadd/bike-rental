package com.kisscsanadd.bikerental.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Rent extends AuditableEntity<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser user;

    @ManyToOne
    @JoinColumn(name="bike_id")
    private Bike bike;

}