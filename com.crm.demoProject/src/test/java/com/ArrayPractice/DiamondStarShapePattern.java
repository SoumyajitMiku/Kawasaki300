package com.ArrayPractice;

import java.util.Iterator;

public class DiamondStarShapePattern {
	
	public static void main(String[] args) {
		
		int n =5;
		
		for (int i = 1; i <=n; i++) {
			for(int j =i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				
				System.out.print("* ");
				
			}
			for (int l = 1; l <i; l++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		
			
		}
		
		for (int m = 1; m <=n ; m++) {
			
			for (int p = 1; p<=m; p++) {
				System.out.print("  ");
				
			}
			
			for (int q =m ; q <n; q++) {
				
				System.out.print("* ");
				
			}
			
			for (int r = m; r <=n ; r++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
	}}
	


