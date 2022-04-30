package com.ecommerce;

import java.util.Date;

public class EProduct {
    private long ID;
    private String name;
    private int price;
    private Date date_added;
    
    public EProduct() {
            
    }
    public EProduct(long id, String name, int price, Date date_added) {
            this.ID = id;
            this.name = name;
            this.price = price;
            this.date_added = date_added;
    }
    
    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public int getPrice() { return this.price;}
    public Date getDateAdded() { return this.date_added;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(int price) { this.price = price;}
    public void setDateAdded(Date date_added) { this.date_added = date_added;}
    
    
}