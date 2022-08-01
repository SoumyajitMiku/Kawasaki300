package com.StringPractice;

public class ReverseStringWithoutLength {
public static void main(String[] args) {
		
		String s ="TestYantra";
		char [] ch = s.toCharArray();
		String rev = "";
		int count =0;
		for(char ch1:ch)
		{
			
			count++;
			
		}
		
		for (int i = count-1; i >=0; i--) {
			
			rev =rev + ch[i];
			
		}
		System.out.print(rev);
	}


}
