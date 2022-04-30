package com.ecommerce.spring_jdbc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	private long ID;
	private String name;
	private BigDecimal price;
	private Date dateAdded;

	public EProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(long iD, String name, BigDecimal price, Date dateAdded) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
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
