package com.StringPractice;

public class Assigmnment6 {
	
	public static void main(String[] args) {
		
		int n = 56818;
		int rem=0;
		int sum = 0;
		
		while(n!=0)
		{
			rem = n%10;
			sum = sum + rem;
			n=n/10;
	
		}
		int rem1 = 0;
		int sum1 = 0;
		int rem2=0;
		for(;;)
		{
			rem1 = sum%10;
			sum1 = sum1 + rem;
			sum1 = sum1/10;
			if( sum1>9 && sum<99)
			{
				 rem2=sum1/10;
				 break;
			}
			
		}
		System.out.println(rem2);
		
		
		
			
		
	}

}
