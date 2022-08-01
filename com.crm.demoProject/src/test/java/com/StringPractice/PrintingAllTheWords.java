package com.StringPractice;

import java.util.LinkedHashSet;

public class PrintingAllTheWords {
	public static void main(String[] args) {
	
			String s = "khatam ta ta bye bye";
				
				LinkedHashSet<String> hs=new LinkedHashSet<String>();
				
				String[] wrd = s.split(" ");
				for (int i = 0; i <wrd.length; i++) {
					
					hs.add(wrd[i]);
					
				}
				
				for (String ch : hs) {
				
					for (int i = 0; i <wrd.length; i++) {
						

						
					}
					
					
					System.out.println(ch + " present");
					
				}
			}

	}


