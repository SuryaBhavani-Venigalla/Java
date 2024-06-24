package com.info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		Employee emp=new Employee(Integer.parseInt(reader.readLine()),reader.readLine(),Integer.parseInt(reader.readLine()));
		Product prod=new Product(Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
       System.out.println("Income Tax on yearly salary:"+emp.calcTax());
       System.out.println("Sales Tax on unit price of Product:"+prod.calcTax());
	}

}
