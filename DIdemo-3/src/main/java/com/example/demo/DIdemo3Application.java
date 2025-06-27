package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Student;

@SpringBootApplication
public class DIdemo3Application {

	public static void main(String[] args) {
		try{
			ConfigurableApplicationContext ac=SpringApplication.run(DIdemo3Application.class, args);
			Student s=ac.getBean(Student.class);
			System.out.println(s.toString());
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

}
