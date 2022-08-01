package com.StringPractice;

public class ReverseWithoutLength {
	
	public static void main(String[] args) {
		
		String s ="TestYantra";
		char [] ch = s.toCharArray();
		
		int count =0;
		for(char ch1:ch)
		{
			
			count++;
			
		}
		char ch2[] = new char[count];
		for (int i = count-1; i >=0; i--) {
			
			ch2[i]= ch[i];
			System.out.print(ch2[i] + " ");
		}
		
	}

}


