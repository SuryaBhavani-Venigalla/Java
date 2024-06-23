package com.info;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	
	int rollNo;
	String name;
	int age;
	String course;
	public Student(int no,String name,int age,String course) {
		this.rollNo=no;
		this.name=name;
		this.age=age;
		this.course=course;
	}
    public void validateAge() throws AgeNotWithinRangeException {
    	if(!(age>15 && age<21)) {
    		throw new AgeNotWithinRangeException("Age is not valid");
    	}
    	else {
    		System.out.println("Age is valid");
    	}
    }
    public void validateName() throws NameNotValidException {
    	String specialChar="[^a-zA-Z0-9]";
    	Pattern pattern=Pattern.compile(specialChar);
    	Matcher matcher=pattern.matcher(name);
    	if(matcher.find()) {
    		throw new NameNotValidException("Name is not valid");
    	}
    	else {
    		System.out.println("Name is valid");
    	}
    }
	public static void main(String[] args) {
		Student stu1=new Student(543,"Surya",25,"MPC");
		try {
			
			stu1.validateName();
		}
			catch(NameNotValidException e) {
			System.out.println(e.getMessage());
		}
		try {
			stu1.validateAge();
		}
		catch (AgeNotWithinRangeException e){
			System.out.println(e.getMessage());
		}
		
	}

}
