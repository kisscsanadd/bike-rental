package com.kisscsanadd.bikerental.repository;

import com.kisscsanadd.bikerental.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {}
