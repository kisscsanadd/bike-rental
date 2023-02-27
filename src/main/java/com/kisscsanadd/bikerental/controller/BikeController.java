package com.kisscsanadd.bikerental.controller;

import com.kisscsanadd.bikerental.model.Bike;
import com.kisscsanadd.bikerental.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping("/bikes")
    public List<Bike> getBikes() {
        return (List<Bike>) bikeRepository.findAll();
    }

    @PostMapping("/bikes")
    void addBike(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @DeleteMapping("/bikes")
    void deleteBike(@RequestBody long id) {
        bikeRepository.deleteById(id);
    }
}