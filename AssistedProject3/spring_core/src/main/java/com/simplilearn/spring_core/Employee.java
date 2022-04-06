package com.simplilearn.spring_core;

public class Employee {

	private int id;
	private String ename;
	private Address address;

	
	public Employee() {
		System.out.println("Employee object is created...");
	}

	public Employee(int id, String ename,Address address) {
		super();
		System.out.println("Para constructor called....");
		this.id = id;
		this.ename = ename;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
