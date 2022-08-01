package com.ArrayPractice;

public class MinNoWithoutBubbleSort {
	public static void main(String[] args) {
		
		int a[] = {2,4,9,16,48,5,1};
		int minno = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<minno)
			{
			minno = a[i];	
			}
			
		}
		System.out.println(minno);
		
	}
	
	
	

}
