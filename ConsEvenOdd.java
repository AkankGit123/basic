package com.rays.basic;

public class ConsEvenOdd {
	
	public static void main (String args[]){
		int i = 1, oddSum=0,evenSum=0,oddCount=0,evenCount=0, num = 10; 

		while(i<=num){   

		    if(i % 2==0){    

		        evenSum=evenSum+i;
		        evenCount++;
		    }
		    else{      

		        oddSum=oddSum+i;
		        oddCount++;
		    }
		     i++;
		}
		double evenAvg=evenSum/evenCount;   

		double oddAvg=oddSum/oddCount;
		
		System.out.println("Average of odd numbers are: "+oddAvg);   //7
		System.out.print("Average of even numbers are: "+evenAvg);
		    
		}
		}

