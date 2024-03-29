package com.sanayard.guava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GuavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuavaApplication.class, args);
	}

}
