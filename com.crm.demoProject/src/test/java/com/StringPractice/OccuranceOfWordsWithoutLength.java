package com.StringPractice;

import java.util.LinkedHashSet;

public class OccuranceOfWordsWithoutLength {
	
	public static void main(String[] args) {
		
	
	
	String s = "khatham ta ta bye bye";
	int count = 0;
	
	LinkedHashSet<String> ls = new LinkedHashSet<String>();
	
	String str[] = s.split(" ");
	
	for (String st : str) {
		
		count++;
		
	}

	
	for (int i = 0; i < count; i++) {
		
		ls.add(str[i]);
		
	}

	
	for (String s1 : ls) {
		int wCount = 0;
		
		for (int i = 0; i < count; i++) {
			
			if (s1.equals(str[i])) {
				
				wCount++;
			}
			
		}
		
		System.out.println(s1 + " present " + wCount + " times");
		
	}

}
}
