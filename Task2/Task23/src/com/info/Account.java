package com.info;

public class Account {
    double balance;
    Account(double balance){
    	this.balance=balance;
    }
   void displayBal() {
	   System.out.println("account balance: "+balance);
   }
   void deposit(double amount) {
	   balance=balance+amount;
	   System.out.println("deposit successful");
   }
   void withdraw(double money) {
	   balance=balance-money;
	   System.out.println("withdraw successful");
	   
   }
	public static void main(String[] args) {
		Account acc=new Account(1000000);
		
		acc.deposit(10000);
		acc.withdraw(200000);
		acc.displayBal();
	}

}
