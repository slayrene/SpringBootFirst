package com.pup.taguig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pup.taguig.app.model.Device;

@Component
public class Alien {
	
	@Value("25")
	private int age;
	
	@Autowired
	private Device device;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Device getDevice() {
		return device;
	}

	@Autowired
	@Qualifier("laptop")
	public void setDevice(Device device) {
		this.device = device;
	}
	
	public void code() {
		System.out.println("Coding");
		device.compile();
	}
	
}
