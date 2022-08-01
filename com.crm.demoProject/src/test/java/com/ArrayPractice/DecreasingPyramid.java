package com.ArrayPractice;

import org.apache.poi.util.SystemOutLogger;

public class DecreasingPyramid {
	
	public static void main(String[] args) {
		
		int rowCount = 5;
	
		
			
			for (int i = rowCount; i >=0; i--) {
				
				for (int j = 0; j<=i; j++) {
					
					System.out.print("* ");
					
				}
				System.out.println();

			}
		
	}

}
