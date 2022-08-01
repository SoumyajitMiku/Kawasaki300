package com.StringPractice;

import org.apache.commons.math3.analysis.function.Pow;
import org.apache.commons.math3.analysis.function.Power;

import com.graphbuilder.math.func.PowFunction;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		
		int num = 1234;
		int rem =0;
		int x = 0;
		int sum = 0;
		int count = 0;
		int y = 10;
		
		
		int num1 = num;
		while(num1!=0)
		{
			num1 = num1/10;
			count++;
		}
		
		while(num!=0)
		{
			int z =1;
			rem = num % 10;
			//System.out.println(rem);
			for (int i = 0; i < count-1; i++) {
				z = z*y;
				
			}
		
			//sum = (int) (sum + rem * (Math.pow(10,count-1)));
			sum = sum+rem* z;
			//System.out.println(sum);
			count--;
			num=num/10;
		}
		
		System.out.println(sum);
		
		if (sum==num) {
			
			System.out.println(num + " is Palindrome");
			
		}
		
	}

}
