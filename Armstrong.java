package com.rays.basic;

public class Armstrong {

	public static void main(String[] args) {
		
		int number = 153;
		int c= 0;
		int r = 0;
		int s = 0;
		
		c = number;
		while(c!= 0) {
			r = c % 10;
			s = s + (r*r*r);
			c = c/10;
		}
		if (s == number) {
			System.out.println("Given number is Armstsrong");
		}
		else
			System.out.println("Given number is Not an Armstsrong");
		
	}
}
