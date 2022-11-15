package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.labs.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Application.class, args);
		
		Employee e=(Employee) ac.getBean("employee");
		System.out.println(e.getName());
		System.out.println("welcome");
	}

}
