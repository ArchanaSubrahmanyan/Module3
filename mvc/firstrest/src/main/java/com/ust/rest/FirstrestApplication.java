package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;

@SpringBootApplication
public class FirstrestApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
	}

	
	
	
}
