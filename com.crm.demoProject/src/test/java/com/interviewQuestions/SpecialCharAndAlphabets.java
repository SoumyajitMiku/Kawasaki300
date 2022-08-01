package com.interviewQuestions;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class SpecialCharAndAlphabets {
	
	public static void main(String[] args) {
		
		String s = "AUw@#er&uI!";
		char ch[]=new char[s.length()];
		//o.p--Iur@#ew&UA!
		String result="";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' &&s.charAt(i)<='z' || s.charAt(i)>='A' &&s.charAt(i)<='Z')
			{
			
			}
			
			else
			{
				ch[i]=s.charAt(i);
				
			}
			
			
		}
		
		System.out.println(String.valueOf(ch));
		int j=s.length()-1;
		
		for (int i = 0; i <=s.length()-1; i++) {
			
			if(s.charAt(i)>='a' &&s.charAt(i)<='z' || s.charAt(i)>='A' &&s.charAt(i)<='Z')
			{
				ch[j]=s.charAt(i);
				j--;
				
			}
			else
			{
				j--;
			}

		}
		
		System.out.println(String.valueOf(ch));
		
		
			

		}
           
	}


