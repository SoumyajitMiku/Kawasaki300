package com.StringPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ReversingChractersOfWordsInSentence {
	
	public static void main(String[] args) {
		

	String s = "khatham ta ta bye bye";
	
	String str[] = s.split(" ");
	
	for (int i = 0; i < str.length; i++) {
		
		
		for (int j = str[i].length()-1; j >=0 ; j--) {
			
			System.out.print(str[i].charAt(j));
			
		}
		System.out.print(" ");
		
	}
	
	
	}

}
