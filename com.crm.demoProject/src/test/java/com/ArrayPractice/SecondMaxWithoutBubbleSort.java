package com.ArrayPractice;

public class SecondMaxWithoutBubbleSort {
	public static void main(String[] args) {
		
		int x[] = {6,2,10,9,7,1,10};
		
		int fMax = x[0];
		int sMax = x[0];
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]>fMax)
			{
				sMax = fMax;
				fMax = x[i];
			}
			else if(x[i]>sMax)
			{
				sMax = x[i];
			}
			
		}
		System.out.println(fMax + " " + sMax);
		
	}

}
