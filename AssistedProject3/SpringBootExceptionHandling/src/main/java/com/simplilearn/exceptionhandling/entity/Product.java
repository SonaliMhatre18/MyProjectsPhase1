package com.simplilearn.exceptionhandling.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Table")
public class Product {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String name;
	private BigDecimal price;
	private Date dateAdded;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long id, String name, BigDecimal price, Date dateAdded) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

}
