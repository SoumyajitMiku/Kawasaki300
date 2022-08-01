package com.StringPractice;

import java.util.LinkedHashSet;

public class PrintAllChar {
	
	public static void main(String[] args) {
String s = "occurance";
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
			
		}
		
		for (Character ch : hs) {
		
			System.out.println(ch + " is present");
			
			
		}
	}
	}


