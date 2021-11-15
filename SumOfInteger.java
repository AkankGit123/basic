package com.rays.basic;

public class SumOfInteger {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int total = 0;
		
		for(int i =101; i<200; i++) {
			if(i % 7 == 0) {
				sum = sum+i;
				total++;
				
				
			}
			
		}
		System.out.println("Sum of all int value less than 200 and greater than 200 is  :" +sum);
		System.out.println("total number of interger divisible by 7 is  :" +total);
		
	}

}
