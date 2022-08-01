package com.StringPractice;

import java.util.LinkedHashSet;

public class OccuranceOfDuplicateWords {
	public static void main(String[] args) {
		String s = "khatam ta ta bye bye";
			
			LinkedHashSet<String> hs=new LinkedHashSet<String>();
			
			String[] wrd = s.split(" ");
			for (int i = 0; i <wrd.length; i++) {
				
				hs.add(wrd[i]);
				
			}
			
			for (String ch : hs) {
				int count = 0;
				for (int i = 0; i <wrd.length; i++) {
					
					if(ch.equals(wrd[i]))
					{
						count++;
					}
				}
				
				if(count>1)
				{
				System.out.println(ch + " present " + count + " times");
				}
				
			}
		}


}
