package com.ArrayPractice;

import org.checkerframework.checker.units.qual.s;

public class SortingOneZero {
	
	public static void main(String[] args) {
		
		int[] x = {1,0,1,0,1,0,1};
		int [] y = new int[x.length];
		int sCount = 0;
		int lCount = x.length-1;
		
		for (int i = 0; i < y.length; i++) {
			
			if(x[i] == 0)
			{
				y[sCount] = x[i];
				sCount++;
			}
			else
			{
				y[lCount]  = x[i];
				lCount--;
			}
		}
			
			for (int j = 0; j < y.length; j++) {
				
				System.out.print(y[j] + " ");
				
			}
	
		}	
	}


