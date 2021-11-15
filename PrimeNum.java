package com.rays.basic;

public class PrimeNum {
	public static void main(String[] args) {
		
	int number = 13;
	
	int i = 0, m = 0, flag = 0;
	
	m = number/2;

	if (number == 0 || number ==1) {
		System.out.println("Given number is not Prime Number");
	}
	else {
		for(i = 2; i<= m; i++) {
			if(number % i == 0 ) {
				System.out.println("Given number is not Prime Number");
				flag = 1;
				break;
			}
		}
	}
	if (flag== 0)
	 {
		System.out.println("Given number is a Prime Number");
	}
	}
}
