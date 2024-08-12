package com.example.mock2;

import com.example.mock2.entities.Customer;
import com.example.mock2.repositories.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;

@SpringBootApplication
public class Mock2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mock2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer(null, "Jam", 15000.00, 2010, "regular"));
			customerRepository.save(new Customer(null, "Jen", 6000.00, 2012, "deluxe"));
			customerRepository.save(new Customer(null, "Jok", 7000.00, 2012, "deluxe"));
			customerRepository.save(new Customer(null, "Jos", 4000.00, 2015, "regular"));
			customerRepository.findAll().forEach(p -> {
				System.out.println(p.getName());
			});
		};
	}

}
