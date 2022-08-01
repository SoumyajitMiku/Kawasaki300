package com.ArrayPractice;

import java.util.Iterator;

public class AscendingOrder {
	public static void main(String[] args) {
		
		int a[] = {5,2,6,1,9};
		
		for (int j = 0;  j< a.length; j++) {
			
			for (int j2 = j+1; j2 < a.length; j2++) {
				
				if(a[j]>a[j2])
				{
				int temp = a[j];
				a[j] = a[j2];
				a[j2] = temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("min no " + a[0]);
		System.out.println("max no " + a[a.length-1]);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
			
		}
		System.out.println(sum);
		
		sum=0;
		for (int i = a.length-1; i >= 2; i--) {
			
			sum = sum + a[i];
			
		}
		System.out.println(sum);
	}

}
