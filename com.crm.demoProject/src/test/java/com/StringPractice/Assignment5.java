package com.StringPractice;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		String s = "j@a12v?a34";
		String alphabet ="";
		String num = "";
		String special = "";
		
		
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) >= 'A' && s.charAt(i)<='Z' || s.charAt(i) >= 'a' && s.charAt(i)<='z') {
				
				alphabet = alphabet + s.charAt(i);
				
			}
			
			else if (s.charAt(i)>='0'&& s.charAt(i)<='9') {
				num = num + s.charAt(i);
				
			}
			
			else
			{
				special = special + s.charAt(i);
				
			}
			
		}
		
//		System.out.println(alphabet);
//		System.out.println(num);
//		System.out.println(special);
		System.out.println(alphabet + num + special);
		
	}

}
