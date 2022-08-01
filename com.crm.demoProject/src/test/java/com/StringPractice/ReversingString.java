package com.StringPractice;

public class ReversingString {
	
	public static void main(String[] args) {
		
		String s = "TestYantra";
	
		
		for (int i = s.length()-1; i >=0; i--) {
			
			System.out.println(s.charAt((s.length()-1)-i));
			
		}
	} 

}
