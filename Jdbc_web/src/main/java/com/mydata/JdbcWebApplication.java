package com.mydata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcWebApplication {

	public static void main(String[] args) {
		try {
		SpringApplication.run(JdbcWebApplication.class, args);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
