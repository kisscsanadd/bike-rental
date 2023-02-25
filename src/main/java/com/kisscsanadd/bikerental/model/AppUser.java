package com.kisscsanadd.bikerental.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;
    private String email;

    private boolean enabled;

    @Column(columnDefinition = "boolean default false")
    private boolean deleted;

    public AppUser(String name, String email){
        this.name = name;
        this.email = email;
    }

}