package com.kisscsanadd.bikerental;

import com.kisscsanadd.bikerental.model.AppUser;
import com.kisscsanadd.bikerental.repository.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BikerentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikerentalApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AppUserRepository appUserRepository) {
		return args -> {
			Stream.of("Walter", "Jesse", "Jimmy", "Mike").forEach(name -> {
				AppUser user = new AppUser(name, name.toLowerCase() + "@mail.com");
				appUserRepository.save(user);
			});
			appUserRepository.findAll().forEach(System.out::println);
		};
	}
}
