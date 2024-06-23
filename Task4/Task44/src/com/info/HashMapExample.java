package com.info;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	HashMap<String,Integer> students=new HashMap<>();
	
	public void addStudent(String name,int grade) {
		students.put(name, grade);
	}
	
	public void removeStudent(String name) {
		students.remove(name);
	}
	
	public void displayStudents() {
		for(Map.Entry<String, Integer> entry:students.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

	public static void main(String[] args) {
		HashMapExample obj=new HashMapExample();
		obj.addStudent("Surya", 1);
		obj.addStudent("Siri", 3);
		obj.addStudent("Suresh", 5);
		obj.addStudent("Hassi", 3);
		obj.addStudent("Nikhil", 4);
		
		obj.removeStudent("Nikhil");
        obj.displayStudents();
	}

}
