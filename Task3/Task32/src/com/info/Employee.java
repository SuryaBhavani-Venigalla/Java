package com.info;

public class Employee implements Taxable{
	
	private int empId;
	private String name;
	private double salary;
	public Employee(int id, String name,int sal ) {
		this.empId=id;
		this.name=name;
		this.salary=sal;
	}
	
	@Override
	public double calcTax() {
		double tax=(this.salary*Taxable.incomeTax)/100;
		return tax;
	}
	
   


	

	

}
