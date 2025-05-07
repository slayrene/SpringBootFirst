package com.pup.taguig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pup.taguig.app.model.Laptop;
import com.pup.taguig.app.service.LaptopService;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
//		System.out.println("Hello World");	
//		Alien alien = context.getBean(Alien.class);
//		alien.code();
//		System.out.println(alien.getAge());
		
		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		
		service.addLaptop(laptop);
	}

}
