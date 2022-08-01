package com.ArrayPractice;

import java.util.Iterator;

public class RightTriangle {
	
	public static void main(String[] args) {
		
		int rowCount = 5;
		
		
		for (int i = 0; i <rowCount ; i++) {
			
			for (int j = rowCount; j >i ; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
