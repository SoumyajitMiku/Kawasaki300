package com.ArrayPractice;

public class NumericPattern5 {
	
	public static void main(String[] args) {
		
		int n =5;
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print((i+1)%2 + " ");
			}
			System.out.println();
			
		}
	}

}
