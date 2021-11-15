package com.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class AgeFromDOB {
    	public static void main(String[] args) {
    		LocalDate today = LocalDate.now();
    		LocalDate birthDate = LocalDate.of(1994, 01, 21);
    		int years = Period.between(birthDate, today).getYears();
    		
    		System.out.println("today's Date is : " + today);
    		System.out.println("Person's Birthdate is : " + birthDate);
    		System.out.println("Age of PErson is : " + years);
    	}


}
