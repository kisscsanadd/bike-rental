package com.kisscsanadd.bikerental.controller;

import com.kisscsanadd.bikerental.model.AppUser;
import com.kisscsanadd.bikerental.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppUserController {

    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping("/users")
    public List<AppUser> getAppUsers() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    @PostMapping("/users")
    void addAppUser(@RequestBody AppUser user) {
        appUserRepository.save(user);
    }

    @DeleteMapping("/users")
    void deleteAppUser(@RequestBody long id) {
        appUserRepository.deleteById(id);
    }
}