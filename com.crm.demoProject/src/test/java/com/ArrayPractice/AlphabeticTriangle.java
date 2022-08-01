package com.ArrayPractice;

public class AlphabeticTriangle {
	
	public static void main(String[] args) {
		
		int row = 5;
		char ch =  'A';
		
		for (int i = 1; i <=row; i++) {
			for (int j = i; j <=row; j++) {
				System.out.print("  ");
			}
			
			for (int k = 0; k <i ; k++) {
					
					System.out.print((char)('A'+k) + " ");	
			}
			
			for (int l = 1; l <i; l++) {
				System.out.print((char)(ch-l) + " ");
				
			}
			ch++;
			
			System.out.println();
			
		}
	}

}
