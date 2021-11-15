package com.rays.basic;

public class Palindrom {
	public static void main(String[] args) {
		int number = 131;
		int total  = 0;
		int r = 0;
		int tVar = number;
		while(number > 0)
		{
			r = number % 10;
			total = (total * 10)+ r;
			number = number / 10;
		}
		if (tVar == total) {
			System.out.println("Given number is Palindrome Number");
			
		}
		else
		{
			System.out.println("Given number is not Palindrome Number");
			
		}
	}

}
