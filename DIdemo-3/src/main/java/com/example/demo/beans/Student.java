package com.example.demo.beans;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements Serializable {
	
	@Value("${Student.roll}")
	private int roll;
	@Value("${Student.name}")
	private String name;
	@Value("${Student.percentage}")
	private float percentage;
	@Autowired
	private Address address;

	public Student(){}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int roll, String name, float percentage, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", percentage=" + percentage + ", address=" + address + "]";
	};
	
	
	
	
	
	
	
	

}
