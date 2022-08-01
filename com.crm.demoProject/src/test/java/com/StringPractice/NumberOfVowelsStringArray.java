package com.StringPractice;

public class NumberOfVowelsStringArray {
	
	public static void main(String[] args) {
		
		String s[] = {"hi","hello","india","education"};
		
		for (int i = 0; i < s.length; i++) {
			int count = 0;
			for (int j = 0; j < s[i].length(); j++) {
				
				if (s[i].charAt(j) == 'a' || s[i].charAt(j)=='e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o' || s[i].charAt(j) == 'u'    ) {
					
					count++;
					
				}
				
				
			}
			System.out.println(s[i] + " has " + count + " vowels");
			
			
		}
	}

}
