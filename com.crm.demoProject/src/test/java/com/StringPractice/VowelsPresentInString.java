package com.StringPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class VowelsPresentInString {
	
	public static void main(String[] args) {
		
		String s = "india";
		s = s.toLowerCase();
		
		String vowel = "aeiou";
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < vowel.length(); i++) {
			
			ls.add(vowel.charAt(i));
			
		}
	
		//int count=0;
		for (Character ch : ls) {
			int count=0;
			
			for (int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i)==ch)
				{
					
					count++;
				}
				
			}
			System.out.println(ch + " is present in " + s + " " +  count + " times");
			
			
		}
		//System.out.println("Total number of vowels are " + count);
	}

}
