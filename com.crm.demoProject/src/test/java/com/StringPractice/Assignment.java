package com.StringPractice;

public class Assignment {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = {9,9,9};
		
		int quo =0;
		int rem = 0;
		int sum = 0;
		
		for (int i = 0; i < b.length; i++) {
			
			
			sum = (a[i] + b[i]);
			if(sum>9)
			{
			rem =sum%10;
			quo = sum/10;
			
			System.out.print(quo + " " + rem);
			System.out.print(" ");
			}
		}
		
	}

}
