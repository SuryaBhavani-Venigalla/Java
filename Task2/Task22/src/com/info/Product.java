package com.info;

public class Product {
      private int pId;
      private int price;
      private int quantity;
      public Product(int id,int price,int qty) {
    	  this.pId=id;
    	  this.price=price;
    	  this.quantity=qty;
      }
      public Product() {
    	  
      }

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
