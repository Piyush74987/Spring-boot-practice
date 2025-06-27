package com.mydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mydata.respository.*;
import java.util.Scanner;
import com.mydata.model.*;
import java.util.List;

@RestController
@RequestMapping(path="/")
public class ProductResController {
	
	@Autowired
	ProductRespository pr;
	public void setPr(ProductRespository pr) {
		this.pr = pr;
	}
	
	Scanner sc =new Scanner (System.in);
	@RequestMapping(path="/create")
	public String CreateProduct() {
		System.out.println("Enter id , Name, Float , Qty");
		int x =pr.saveProduct(new Product(sc.nextInt(),sc.next(),sc.nextFloat(),sc.nextInt()));
		if(x>0) {
			return "Product Saved";
		}
		else {
			return "Product not Saved";
		}
	}
	@RequestMapping(path="/update")
	public String UpdateProduct() {
		System.out.println("Enter the id and cost and Qty");
		int x=pr.updateProduct(sc.nextInt(), sc.nextFloat(), sc.nextInt());
		if(x>0) {
			return "Product updated";
		}
		else {
			return "Product not updated";
		}
	}
	@RequestMapping(path="/delete")
	public String DeleteProduct() {
		System.out.println("Enter the id u want to delete");
		int x=pr.deleteProduct(sc.nextInt());
		if(x>0) {
			return "Product deleted";
		}
		else {
			return "Product not deleted";
	}
		
	}
	@RequestMapping(path="/view")
	public List<Product> ViewAllProduct(){
		return pr.listAllProduct();
	}

}
