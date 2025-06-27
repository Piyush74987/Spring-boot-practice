package com.mydata.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydata.model.Simple;

@Repository
public class DaoImpl implements Dao {
	
	@Autowired
	Simple s;
	public void setS(Simple s) {
		this.s = s;
	}

	@Override
	public void show() {
		System.out.println("Hello world");
		
	}

	@Override
	public String getData() {
		return s.getdata();
	}
}
