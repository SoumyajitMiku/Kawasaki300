package com.ArrayPractice;

public class SwappingWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		 
	    a = a + b;
		System.out.println("b " +"=" + (b = a-b));
		System.out.println("a " +"=" + (a = a-b));
				
	}

}
