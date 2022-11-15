package com.example.labs;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String lastname;
	private int id;
	private String name;
	private double salary;
	
	
	
	public Employee() {
		
		id=1;
		name="Guest from usa";
		salary=3999;
		
	}



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



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
