package com.StringPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PositionOfChar {
	
	public static void main(String[] args) {
		String s = "aplep";
			
			LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
			
			for (int i = 0; i <s.length(); i++) {
				
				 hs.add(s.charAt(i));
				
			}
			
			for (Character ch : hs) {
				
				for (int i = 0; i <s.length(); i++) {
					
					if(ch==(s.charAt(i)))
					{
						System.out.println(ch + " present at " + i+ " place");
						
					}
				}
				
			}
			
//			Object[] obj = hs.toArray();
//			for (int i = 0; i < obj.length; i++) {
//				
//				System.out.println(obj[i] + " at " + i + "th place");
//				
//			}
		
		}

}
