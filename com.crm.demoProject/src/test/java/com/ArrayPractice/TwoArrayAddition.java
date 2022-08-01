package com.ArrayPractice;

import java.util.Iterator;

public class TwoArrayAddition {
	public static void main(String[] args) {
		int [] x = {2,4,6,8,10,12,15};
		int [] y = {1,3,5,7,11,12,15,16};
		int [] z;
		if(x.length>y.length)
		{
		 z = new int[x.length];
		}
		else
		{
			z = new int[y.length]; 
		}
		
//		System.out.println(z.length);
		
		for (int i = 0; i < z.length; i++) {
			try
			{
			z[i] = x[i] + y[i];
			}
			catch(Exception e)
			{
				if(x.length>y.length)
				{
				z[i] = x[x.length-1];
				}
				else
				{
					z[i] =y[y.length-1]; 
				}
			}
			
		}
		for (int i = 0; i < z.length; i++) {
			
			System.out.println(z[i]);
		
			
		}
	}

}
