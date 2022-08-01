package com.StringPractice;

public class MergingString {
	public static void main(String[] args) {
		
		String s ="khatham ta ta bye bye";
		
		String str[] = s.split(" ");
		
		
		for (int i = 0; i < str.length; i++) {
			
			if(i==str.length-1)
			{
				System.out.print(" ");
			}
			
				System.out.print(str[i]);
			
			
		}
		
	
	}

}
