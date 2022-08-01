package com.interviewQuestions;

public class ZopSmartInterviewQuestion {
	
	
	public static void main(String[] args) {
		
		
		String s ="gayatri$$$@--automation";
		
		String alpha = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
			   
				alpha = alpha+s.charAt(i);
				
				
			}
		
		}
		System.out.println(alpha);
		
		int count = 1;
		for (int i = 0; i <alpha.length()-1; i++) {
			
			
			System.out.println(alpha.substring(i,i+count));
			
			count++;
			
			if (count==4) {
				
				count=1;
				
			}
				
		}
		
		
	}

}
