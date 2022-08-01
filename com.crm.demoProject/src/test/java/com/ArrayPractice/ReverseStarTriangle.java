package com.ArrayPractice;

public class ReverseStarTriangle {
	
	public static void main(String[] args) {
		
		int rowCount= 5;
		
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 1 ; j < i ; j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=rowCount;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		
			
		}
	}

}
