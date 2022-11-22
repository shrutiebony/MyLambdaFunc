package com.Server.springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionApplication {
	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}
	
	@Bean
	public Function<String, String> lowerCase() {
		return value -> value.toLowerCase();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}

}
