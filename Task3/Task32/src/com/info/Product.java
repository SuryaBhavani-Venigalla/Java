package com.info;

public class Product implements Taxable{
      private int pId;
      private int price;
      private int quantity;
      
      
	public Product(int pId, int price, int quantity) {
		super();
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public double calcTax() {
		double slsTax=price*Taxable.salesTax;
		return slsTax;
	}
      
}
