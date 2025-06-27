package com.mydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.dao.DaoImpl;

@RestController
@RequestMapping(path="/")
public class SimpleController {
	
	@Autowired
	DaoImpl di;

	public void setDi(DaoImpl di) {
		this.di = di;
	}
	@RequestMapping(path="/chk")
	public String connection() {
		return "connectd";
	}
	@RequestMapping(path="/show")
	public String show() {
		di.show();
		return "show on console";
		
	}
	@RequestMapping(path="/get")
	public String getdata() {
		return di.getData();	
		}
	

}
