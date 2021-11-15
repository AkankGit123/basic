package com.rays.basic;

public class CharOccur {
	
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chohan";
		char findChar = 'a';
		int count = 0;
		 
		for (int i = 0; i < name.length(); i++) {
		    if (name.charAt(i) == findChar) {
		        count++;
		    }
		}
		System.out.println("Count of 'a' in above string is :" +" " +count);
		
}

	
}