package com.ArrayPractice;

public class SecondMinWithDuplicates {
	
	public static void main(String[] args) {
		
		int a[] = {4,1,6,3,7,1,3,8};
		
		int fmin=a[0];
		int smin=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin || smin==fmin)
			{
				smin=a[i];
			  	
			}
			
		}
		
		System.out.println(fmin + " " + smin);
	}

}
