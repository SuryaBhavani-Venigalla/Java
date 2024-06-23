package com.info;

import java.util.Scanner;

public class ArrayIndexoutofBoundExceptionExample {
	String[] week={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public void weekName(int index) throws ArrayIndexOutOfBoundsException{
		if(index>6) {
			throw new ArrayIndexOutOfBoundsException("index is out of week array range");
		}
		else {
			System.out.println(week[index]);
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		ArrayIndexoutofBoundExceptionExample obj=new ArrayIndexoutofBoundExceptionExample();
		try {
		obj.weekName(scn.nextInt());
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}

}
