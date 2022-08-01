package com.interviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortingHashmap {
	
	public static void main(String[] args) {
		
		
		String s="i am soumyajit mandal and i live in bangalore";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (map.containsKey(s.charAt(i))) {
				
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				
			} else {
				
				map.put(s.charAt(i), 1);

			}
			
		}
		
		System.out.println(map);
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(map);
		
		System.out.println(tm);
		
//		Iterator itr=tm.keySet().iterator();
//		
//		while(itr.hasNext())
//		{
//			
//			
//		}
		
		
	}

}
