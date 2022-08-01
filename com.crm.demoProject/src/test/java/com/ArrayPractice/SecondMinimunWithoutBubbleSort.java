package com.ArrayPractice;

import java.util.Iterator;

public class SecondMinimunWithoutBubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {6,4,45,3};
		
		int fMin = a[0];
		int sMin = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<fMin)
			{
				sMin=fMin;
				fMin=a[i];
			}
			else if(a[i]<sMin)
			{
			sMin=a[i];	
			}
		}
		
		System.out.println(fMin + " " + sMin);
		
		
	}

}
