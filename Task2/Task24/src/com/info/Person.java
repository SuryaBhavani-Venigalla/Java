package com.info;

public class Person {
	String name;
	int age;
    Person(String name, int age){
    	this.name=name;
    	this.age=age;
    	System.out.println("Person class constructor is intialised using super keyword");
    }
	
	public static void main(String args[]) {
		Employee emp=new Employee("Surya",23,1234,200000);
		
		
	}
	
	
}
class Employee extends Person{
	int empId;
	double sal;
	Employee(String name,int age,int empId, double sal) {
		super(name,age);
		this.empId=empId;
		this.sal=sal;
		
		
	}
	
}

