package com.ArrayPractice;

import java.util.Iterator;

public class NumericPattern6 {
	
	public static void main(String[] args) {
		
		int n =5;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print((i%2) + " ");
				
			}
			System.out.println();
			
		}
	}

}
