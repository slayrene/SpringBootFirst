package com.pup.taguig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
		System.out.println("Hello World");
		
		Alien alien = context.getBean(Alien.class);
		alien.code();
		
	}

}
