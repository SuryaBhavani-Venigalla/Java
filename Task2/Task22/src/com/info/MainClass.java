package com.info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	
	int total=0;
	public int totalAmount(Product[] prods) {
		for(int i=0;i<5;i++) {
			total=total+(prods[i].getQuantity()*prods[i].getPrice());
				
		}
		return total;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
	Product[] products=new Product[5];
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<5;i++) {
	      products[i]=new Product(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
		
	}
	for(int i=0;i<5;i++) {
		System.out.println(products[i]);
	}
	
	int highprice=0;
	int prodId=0;
	for(Product prod:products) {
		if(prod.getPrice()>highprice) {
			prodId=prod.getpId();
		}
	
	}
	System.out.println(prodId);
	
	
	
		
	
	MainClass main=new MainClass();
	System.out.println(main.totalAmount(products));
}
}