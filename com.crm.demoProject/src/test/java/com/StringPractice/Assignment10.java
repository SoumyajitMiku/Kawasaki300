package com.StringPractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment10 {
	
	public static void main(String[] args) {
		
		char [] ch = {'x','y','a','b','z','a'};
		
		TreeSet<Character> ts = new TreeSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			ts.add(ch[i]);
			
		}
		
		System.out.println(ts);
		
	}

}
