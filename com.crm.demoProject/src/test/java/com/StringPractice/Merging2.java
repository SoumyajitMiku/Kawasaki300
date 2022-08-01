package com.StringPractice;

import java.util.Iterator;

public class Merging2 {
	
	public static void main(String[] args) {
		
		String s = "khathamtatabyebye";
		
		String [] str = s.split("");
		System.out.println();
	
		
		for (int i = 0; i < str.length; i++) {
			
			
			if (i==s.indexOf('e')) {
				System.out.print(" ");
				
			}
			
			System.out.print(str[i]);
			
		}
		
		
		
	}

}
