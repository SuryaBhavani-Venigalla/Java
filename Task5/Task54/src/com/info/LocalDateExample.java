package com.info;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateExample {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your birthdate(YYYY-MM-DD): ");
		String birthdayStr=scn.nextLine();
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate birthday=LocalDate.parse(birthdayStr,pattern);
		Period age=Period.between(birthday,LocalDate.now());
		System.out.println("Your age is:"+age.getYears()+"years ,"+age.getMonths()+"months and ,"+age.getDays()+"days old");
		
	}

}
