package com.StringPractice;

public class ReverseStringWithoutLengthAndThirdVariable {
	
public static void main(String[] args) {
		
		String s ="TestYantra";
		char [] ch = s.toCharArray();
		int count =0;
		for(char ch1:ch)
		{
			
			count++;
			
		}
		
		for (int i = count-1; i >=0; i--) {
			
			System.out.print(ch[i]);;
			
		}
		
	}


}
