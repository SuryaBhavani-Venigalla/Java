package com.info;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		float num=scn.nextFloat();
		float amt=0;
		float dis=0;
		if(num<500) {
			amt=num;
		}
		else if(num>=500 && num<=1000) {
			dis=(num*10)/100;
			amt=num-dis;
			
		}
		else {
			dis=(num*20)/100;
			amt=num-dis;
		}
		System.out.println("Amount to be paid: "+amt);

}
}
