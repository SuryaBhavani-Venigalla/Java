package com.info;

import java.util.Scanner;

public class NumPosOrNeg {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num=scn.nextInt();
		if(num>0) {
			System.out.println("Number is Possive");
		}
		else {
			System.out.println("Number is Negative");
		}
	
}
}
