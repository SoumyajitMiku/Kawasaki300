package com.StringPractice;

public class Assignment7 {
	public static void main(String[] args) {
		
		int n =1234;
		int count = 0;
		int rem = 0;
		int n1 = n;
		
		while(n1!=0)
		{
			n1=n1/10;
			count++;
		}
		String s = String.valueOf(n);
		//System.out.println(s);
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count; j++) {
				for (int k = 0; k <i; k++) {
					System.out.print(s.charAt(j));
					
				}
				System.out.print(" ");
			}
			
			System.out.println();
		
		}	
	}

}
