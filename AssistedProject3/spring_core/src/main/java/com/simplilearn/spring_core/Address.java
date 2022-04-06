package com.simplilearn.spring_core;

import java.util.List;

public class Address {
	private List<String> cities;

	public Address(List<String> cities) {
		super();
		this.cities = cities;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	

}
