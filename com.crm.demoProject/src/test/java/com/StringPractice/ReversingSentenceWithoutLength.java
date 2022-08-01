package com.StringPractice;

public class ReversingSentenceWithoutLength {
	
	public static void main(String[] args) {
		
		String s = "khatham ta ta bye bye";
		
		String str[] = s.split(" ");
		int count = 0;
		
		for (String st : str) {
			
			count++;
			
		}
		
		for (int i = count-1; i >=0; i--) {
			
			System.out.println(str[i]);
			
		}
	}

}
