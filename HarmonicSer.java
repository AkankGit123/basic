package com.rays.basic;

public class HarmonicSer {
	public static void main(String[] args) {
	
	int number = 5;
	double result = 0.0;
	while(number > 0) {
		result = result + (double) 1 / number;
		number --;
		System.out.println( result);
			
	}
	System.out.println("Sum of Harmonic Serise is" + result);
	

}
}	
