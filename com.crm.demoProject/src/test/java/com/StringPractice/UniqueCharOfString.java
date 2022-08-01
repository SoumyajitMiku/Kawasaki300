package com.StringPractice;

import java.util.LinkedHashSet;

public class UniqueCharOfString {
	
	public static void main(String[] args) {
		
String s = "occurance";
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
			
		}
		
		for (Character ch : hs) {
			int count = 0;
			for (int i = 0; i <s.length(); i++) {
				
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			
			if(count==1)
			{
			System.out.println(ch + " present " + count + " times");
			}
			
		}
	}
	}


