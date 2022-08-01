package com.StringPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SortingOfAlphabets {
	public static void main(String[] args) {
		
		String s = "abcdeabcdeabcdeabcde";
		
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
			
		}
		
		for (Character ch : hs) {
		
			for (int i = 0; i <s.length(); i++) {
				
				if(ch.equals(s.charAt(i)))
				{
					System.out.print(ch);
				}
			
			
		}
			System.out.println();
		
	}}}


