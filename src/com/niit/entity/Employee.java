package com.niit.entity;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private  double salary;
	private boolean working;
	
	
	public Employee()
	{
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public boolean isWorking() {
		return working;
	}


	public void setWorking(boolean working) {
		this.working = working;
	}


	
	
}
