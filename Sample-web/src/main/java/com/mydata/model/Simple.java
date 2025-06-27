package com.mydata.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Simple implements Serializable {
	
	public String getdata() {
		return "FC Barcalona";
	}

}
