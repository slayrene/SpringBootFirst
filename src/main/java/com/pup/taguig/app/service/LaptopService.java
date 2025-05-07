package com.pup.taguig.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pup.taguig.app.model.Laptop;
import com.pup.taguig.app.repository.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;
	
	public void addLaptop(Laptop laptop) {
		System.out.println("Method called");
		laptopRepository.save(laptop);
	}
	
	public boolean isGoodForProg(Laptop laptop) {
		
		return false;
	}
}
