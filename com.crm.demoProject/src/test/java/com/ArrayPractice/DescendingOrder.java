package com.ArrayPractice;

public class DescendingOrder {
public static void main(String[] args) {
		
		int a[] = {5,2,6,1,9};
		
		for (int j = 0;  j< a.length; j++) {
			
			for (int j2 = j+1; j2 < a.length; j2++) {
				
				if(a[j]<a[j2])
				{
				int temp = a[j];
				a[j] = a[j2];
				a[j2] = temp;
				}
				
			}
			System.out.println(a[j]);
		}
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//			
//		}
	}

}
