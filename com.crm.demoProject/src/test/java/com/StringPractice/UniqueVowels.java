package com.StringPractice;

import java.util.LinkedHashSet;

public class UniqueVowels {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		
		String s ="india";
		
		for (int i = 0; i < s.length(); i++) {
			
			lh.add(s.charAt(i));
			
		}
		
		int count=0;
		for (Character ch : lh) {
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
