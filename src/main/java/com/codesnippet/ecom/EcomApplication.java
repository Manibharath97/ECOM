package com.codesnippet.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.codesnippet.ecomassistant", "com.codesnippet.ecom"})
@ComponentScan(basePackages = "com.codesnippet")
public class EcomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(EcomApplication.class, args);
		System.out.println("Context created");
	}

}
