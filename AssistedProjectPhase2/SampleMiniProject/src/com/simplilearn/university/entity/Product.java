package com.simplilearn.university.entity;


public class Product {
	private int studentID;
	private String deparment;
	private String firstName;
	private String lastName;
	private int passoutYear;
	private int universityRank;
	
	public Product() {
		
	}
	public Product(int studentID, String deparment, String firstName, String lastName, int passoutYear,
			int universityRank) {
		super();
		this.studentID = studentID;
		this.deparment = deparment;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passoutYear = passoutYear;
		this.universityRank = universityRank;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
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
	public int getPassoutYear() {
		return passoutYear;
	}
	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}
	public int getUniversityRank() {
		return universityRank;
	}
	public void setUniversityRank(int universityRank) {
		this.universityRank = universityRank;
	}
	@Override
	public String toString() {
		return "Product [studentID=" + studentID + ", deparment=" + deparment + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", passoutYear=" + passoutYear + ", universityRank=" + universityRank
				+ "]";
	}
	
	

}
