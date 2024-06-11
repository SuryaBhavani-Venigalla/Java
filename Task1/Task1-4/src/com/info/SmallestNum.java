package com.info;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scn.nextInt();
		System.out.println("Enter second number");
		int b=scn.nextInt();
		System.out.println("Enter third number");
		int c=scn.nextInt();
        if(a<=b && a<=c) {
        	System.out.println(a+" is smallest number");
        }
        else if(b<=a && b<=c) {
        	System.out.println(b+" is smallest number");
        	
        }
        else {
        	System.out.println(c+" is smallest number");
        }
	}

}
