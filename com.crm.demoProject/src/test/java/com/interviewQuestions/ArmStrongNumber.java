package com.interviewQuestions;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=s.nextInt();
		int count=0;
		int temp=num;
		int temp2=num;
		
		while(temp>0)
		{
			
			temp=temp/10;
			count++;
			
		}
		
		System.out.println("No of digits " + count);
		
		int sum=0;
		
		while(num>0)
		{
			int r=num%10;
			
			sum = sum + (int) Math.pow(r,count);
			
			num=num/10;
			
			
		}
		
		
		if (sum==temp2) {
			
			System.out.println("is a armstring number");
			
		} else {
			
			System.out.println("not a armstrong number");

		}
				
				
				
		
		
		
		
		
		
		
	}

}
