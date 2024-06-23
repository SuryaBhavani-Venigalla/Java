package com.info;

public class AgeNotValidExceptionExample {
    int voterId;
    String name;
    int age;
    
	public AgeNotValidExceptionExample(int id,String name,int age) {
		this.voterId=id;
		this.name=name;
		this.age=age;
	}
	public void validateAge() throws AgeNotValidException {
		if(age<18) {
			throw new AgeNotValidException("invalid age for voter");
		}
		else {
			System.out.println("valid age for voter");
		}
	}
	public static void main(String[] args) {
		AgeNotValidExceptionExample obj=new AgeNotValidExceptionExample(1234,"Surya",45);
		try {
			obj.validateAge();
		}
		catch (AgeNotValidException e){
			System.out.println(e.getMessage());
		}
	}

}
