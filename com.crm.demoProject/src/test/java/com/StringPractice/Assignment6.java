package com.StringPractice;

public class Assignment6 {
	
	public static void main(String[] args) {
		
		int x[] = {1,2,3,4,5};
		
		int key = 2;
		
		for (int i = 0; i < key; i++) {
			
			int temp=x[0];
			for (int j = 1; j < x.length; j++) {
				
				x[j-1]=x[j];
				
			}
			
			x[x.length-1] = temp;
			
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}

}
