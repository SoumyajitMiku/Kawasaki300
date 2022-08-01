package com.interviewQuestions;

import java.util.HashMap;

public class OccuranceUsingHashMap {
	
	public static void main(String[] args) {
		
		String s = "aaabbeecaadd";
		
		HashMap<Character,Integer> map = new HashMap();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			if(map.containsKey(s.charAt(i)))
			{
				
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				
			}
			else
			{
				
				map.put(s.charAt(i), 1);
			}
			
			
			
		}
		System.out.println(map);
		
		
		
		
		
		
	}

}
