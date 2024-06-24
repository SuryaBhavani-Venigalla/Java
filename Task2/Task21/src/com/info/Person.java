package com.info;

public class Person {
	private String name;
	private int age;
	public Person(String name) {
		this.name=name;
		this.age=18;
	}
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
		
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Person person1=new Person("Surya");
		Person person2=new Person("Bhavani",23);
		person1.display();
		person2.display();
		
	}

}
