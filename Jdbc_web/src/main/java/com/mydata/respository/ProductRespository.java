package com.mydata.respository;

import java.util.List;
import com.mydata.model.Product;
public interface ProductRespository {
	
	public int saveProduct(Product p);
	public int deleteProduct(int id);
	public int updateProduct(int id , float cost,int qty);
	public List<Product> listAllProduct();

}
