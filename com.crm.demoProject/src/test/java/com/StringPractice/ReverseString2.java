package com.StringPractice;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		String s= "TestYantra";
		char []ch = new char[s.length()];
		
		for (int i = s.length()-1  ; i >=0 ; i--) {
			
			ch[i] = s.charAt(i);
			
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}

class B
{
	public static void main(String[] args) {
		
		String s= "mom";
		String rev ="";
		
		for (int i = s.length()-1  ; i >=0 ; i--) {
			
			rev = rev+ s.charAt(i);
			
		}
	
		System.out.println(rev);
	}
}
