package com.ArrayPractice;

public class MaxNoWithoutBubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {6,53,2,6,46,82,4};
		
		int maxNo=a[0];
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>maxNo)
			{
				maxNo= a[i];
			}
			
		}
		System.out.println(maxNo);
		
	}

}
