package com.StringPractice;

import java.util.LinkedHashSet;

public class Assigment3 {
	
	public static void main(String[] args) {
		
		String s = "aabbcaea";//aabbbccdaaae
		//int count1=0;
		
		for (int i = 0; i < s.length();i++ ) {
			int count=1;
			
			for (int j = i+1; j < s.length(); j++) {
		
				if(s.charAt(i)==s.charAt(j))
				{
					//count1++;
					count++;
					i++;
				}
				else
				{
					//i=j-1;
					break;
				}
			}
			
			System.out.print(s.charAt(i)+""+count);
			//i=count1;
//			if (s.length()-count==i) {
//				break;
				
			}
			
		}
	
	}