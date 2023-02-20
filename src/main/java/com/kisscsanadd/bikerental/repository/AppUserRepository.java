package com.kisscsanadd.bikerental.repository;

import com.kisscsanadd.bikerental.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {}
