package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eproduct")
public class EProduct {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private double price;

	public EProduct() {

	}

	public EProduct(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "EProduct [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
