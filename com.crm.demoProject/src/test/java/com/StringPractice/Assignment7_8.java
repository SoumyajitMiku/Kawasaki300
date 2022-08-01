package com.StringPractice;

public class Assignment7_8 {
	
	public static void main(String[] args) {
		
		
	   String s = "abc";
		//int count = s.length();
		
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j <s.length() ; j++) {
				for (int j2 = 0; j2 <i; j2++) {
					System.out.print(s.charAt(j));
					
				}
				System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
		
	}
	
}
