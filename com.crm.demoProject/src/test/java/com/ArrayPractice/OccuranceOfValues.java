package com.ArrayPractice;

public class OccuranceOfValues {
	
	public static void main(String[] args) {
		
		int a[] = {2,5,8,9,2,5,6,8,1};
		
		for (int i = 0; i < a.length; i++) {
			
			int count = 1;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			
			System.out.println(a[i] + "=" + count);
			
			
		}
	}

}
