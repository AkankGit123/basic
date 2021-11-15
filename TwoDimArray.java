package com.rays.basic;

public class TwoDimArray {
	
	public static void main(String[] args) {
	
	
	
	int [][] table = {
			{2,4,6,8,10,12,14,16,18,20},
			{3,6,9,12,15,18,21,24,27,30},
			{4,8,12,16,20,24,28,32,36,40},
			{5,10,15,20,25,30,35,40,45,50},
			{6,12,18,24,30,36,42,48,54,60},
			{7,14,21,28,35,42,49,56,63,70},
			{8,16,24,32,40,48,56,64,72,80},
			{9,18,27,36,45,54,63,72,81,90},
			{10,20,30,40,50,60,70,80,90,100}
	
	};
		/*
		 * //collom1 table [0][0] = 2; table [1][0] = 4; table [2][0] = 6; table [3][0]
		 * = 8; table [4][0] = 10; table [5][0] = 12; table [6][0] = 14; table [7][0] =
		 * 16; table [8][0] = 18; table [9][0] = 20; //collom 2
		 * 
		 * table [0][1] = 3; table [1][1] = 6; table [2][1] = 9; table [3][1] = 12;
		 * table [4][1] = 15; table [5][1] = 18; table [6][1] = 21; table [7][1] = 24;
		 * table [8][1] = 27; table [9][1] = 30;
		 * 
		 * //collom 3
		 * 
		 * table [0][2] = 4; table [1][2] = 8; table [2][2] = 12; table [3][2] = 16;
		 * table [4][2] = 20; table [5][2] = 24; table [6][2] = 28; table [7][2] = 32;
		 * table [8][2] = 36; table [9][2] = 40;
		 * 
		 * //collom 3
		 * 
		 * table [0][3] = 4; table [1][3] = 8; table [2][3] = 12; table [3][3] = 16;
		 * table [4][3] = 20; table [5][3] = 24; table [6][3] = 28; table [7][3] = 32;
		 * table [8][3] = 36; table [9][3] = 40;
		 * 
		 * //collom 4
		 * 
		 * table [0][4] = 5; table [1][4] = 10; table [2][4] = 15; table [3][4] = 20;
		 * table [4][4] = 25; table [5][4] = 30; table [6][4] = 35; table [7][4] = 40;
		 * table [8][4] = 45; table [9][4] = 50;
		 * 
		 * 
		 * 
		 * 
		 * //collom 5
		 * 
		 * table [0][5] = 6; table [1][5] = 12; table [2][5] = 18; table [3][5] = 24;
		 * table [4][5] = 30; table [5][5] = 36; table [6][5] = 42; table [7][5] = 48;
		 * table [8][5] = 54; table [9][5] = 60;
		 * 
		 * //collom 6
		 * 
		 * table [0][6] = 7; table [1][6] = 14; table [2][6] = 21; table [3][6] = 28;
		 * table [4][6] = 35; table [5][6] = 42; table [6][6] = 49; table [7][6] = 56;
		 * table [8][6] = 63; table [9][6] = 70;
		 * 
		 * //collom 7
		 * 
		 * table [0][7] = 8; table [1][7] = 16; table [2][7] = 24; table [3][7] = 32;
		 * table [4][7] = 40; table [5][7] = 48; table [6][7] = 56; table [7][7] = 64;
		 * table [8][7] = 72; table [9][7] = 80;
		 * 
		 * 
		 * //collom 8
		 * 
		 * table [0][8] = 9; table [1][8] = 18; table [2][8] = 27; table [3][8] = 36;
		 * table [4][8] = 45; table [5][8] = 54; table [6][8] = 63; table [7][8] = 72;
		 * table [8][8] = 81; table [9][8] = 90;
		 * 
		 * //collom 9
		 * 
		 * table [0][9] = 10; table [1][9] = 20; table [2][9] = 30; table [3][9] = 40;
		 * table [4][9] = 50; table [5][9] = 60; table [6][9] = 70; table [7][9] = 80;
		 * table [8][9] = 90; table [9][9] = 100;
		 * 
		 */
						
			
			for(int row = 0; row<=table.length; row++) {
				for (int col = 0; col<=table.length; col++) {
					
					System.out.println(table[row][col] + " ");
					
				}

				System.out.println();
			}
			
			
			
			
			
	}
				
			
			
			
			
	
	
	

}
