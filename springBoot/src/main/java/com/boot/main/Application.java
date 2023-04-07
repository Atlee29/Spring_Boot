package com.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hello spring!!Error nahi aane ko maangta");
		SpringApplication.run(Application.class, args);
	}

}
