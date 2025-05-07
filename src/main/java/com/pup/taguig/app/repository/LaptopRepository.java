package com.pup.taguig.app.repository;

import org.springframework.stereotype.Repository;

import com.pup.taguig.app.model.Laptop;

@Repository
public class LaptopRepository {
	
	public void save(Laptop laptop) {
		System.out.println("Save in database");
	}
	
}
