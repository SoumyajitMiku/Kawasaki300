package com.StringPractice;

import java.util.LinkedHashSet;

public class ExamQuestion2 {
public static void main(String[] args) {
		
		String st = "Tester";
		
		//char [] ch = s.toCharArray();
		String s = st.toLowerCase();
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			
			ls.add(s.charAt(i));
			
		}
		
		for (Character c : ls) {
			
			for (int i =0; i <s.length() ; i++) {
				
				//System.out.println(c.toString().toLowerCase());
				
				if(c==s.charAt(i))
				{
					System.out.println(c + "=" + (i+1));
					break;
				}
				
			} 
			
		}
	}


}
