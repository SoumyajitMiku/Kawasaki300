package com.StringPractice;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ReverseWordWithCollection {
	
	public static void main(String[] args) {
		
		
		String s = "khatham ta ta bye bye";
		
		String str[] = s.split(" ");
		
		LinkedList<String> ls = new LinkedList<String>();
		
		for (int i = str.length-1; i >=0; i--) {
			
			ls.add(str[i]);
			
		}
		System.out.println(ls);
		
//		for (String st : ls) {
//			for (int i = str.length-1; i >=0; i--) {
//				
//				if (st.equals(str[i])) {
//					
//					System.out.println(str[i]);
//					
//				}
//				else
//				{
//					break;
//				}
//				
//			}
//			
//		}
	}

}
