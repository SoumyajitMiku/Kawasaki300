package com.ArrayPractice;

import java.util.Iterator;

public class AssignmentPattern2 {
	
	public static void main(String[] args) {
		
		int row =5;
		int count=row;
	
		
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print("  ");
			}
			
			for (int k = 1; k <=count; k++) {
				System.out.print(k + " ");
				
			}
			for (int l = count-1 ; l >=1; l--) {
				System.out.print(l + " ");
				
			}
			count--;
			System.out.println();
		}
		
			
}
		}
	
