package com.pup.taguig.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Device{

	@Autowired
	CPU cpu;
	
	public void compile () {
		System.out.println("Laptop Compiling");
	}
	
}
