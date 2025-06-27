package com.mydata.respository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mydata.model.Product;

@Repository
public class ProductRespositoryImpl implements ProductRespository{
	
	Scanner sc =new Scanner(System.in);
	@Autowired
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	

	@Override
	public int saveProduct(Product p) {
		return jt.update("insert into product value (?,?,?,?)",p.getId(),p.getName(),p.getCost(),p.getQty());
	}

	@Override
	public int deleteProduct(int id) {
		return jt.update("delete from product where id=?",id);
	}

	@Override
	public int updateProduct(int id, float cost, int qty) {
		return jt.update("update product set cost=?,qty=? where id=?",cost,qty,id);
	}

	@Override
	public List<Product> listAllProduct() {
		
		return jt.query("Select * from product", new RowMapper<Product>(){
			
			@Override
			public Product mapRow(ResultSet rs, int rowNum)throws SQLException {
				Product p= new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setCost(rs.getFloat(3));
				p.setQty(rs.getInt(4));
				return p;
			}
		});
	}

}
