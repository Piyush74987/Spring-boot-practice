package com.example.demo.beans;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Address implements Serializable {
	
	@Value("${Address.City}")
	private String City;
	@Value("${Address.State}")
	private String State;
	@Value("${Address.Country}")
	private String country;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String city, String state, String country) {
		super();
		City = city;
		State = state;
		this.country = country;
	}
	public Address(){};
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", country=" + country + "]";
	}
	

}
