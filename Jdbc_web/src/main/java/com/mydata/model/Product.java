package com.mydata.model;

import java.io.Serializable;

public class Product implements Serializable {
	
	private int id;
	private String name;
	private float cost;
	private int qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product(int id, String name, float cost, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.qty = qty;
	}
	public Product(){}
	
	
	
	

}
