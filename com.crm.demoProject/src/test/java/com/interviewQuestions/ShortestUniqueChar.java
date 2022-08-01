package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class ShortestUniqueChar {
	public static void main(String[] args) {
		
		//String s = "abaaba";
		 String s = "zyzyzyz"; // yzyzy

		ArrayList<String> alist = new ArrayList<String>();
		ArrayList<Integer> alen = new ArrayList<Integer>();
		for (int i = 2; i < s.length(); i++) {
			String sub = "";
			for (int j = 0; j <= s.length() - i; j++) {
				sub = s.substring(j, j + i);
				alist.add(sub);
				alen.add(sub.length());
			}
		}
		System.out.println("all possible substrings are: " + alist);

		int l = alen.get(0);

		LinkedHashSet<String> hset = new LinkedHashSet<String>(alist);
		LinkedHashMap<String, Integer> lMap = new LinkedHashMap<String, Integer>();

		System.out.println("unique substrings are " + hset);
		for (String e : alist) {
			if (lMap.containsKey(e)) {
				lMap.put(e, lMap.get(e) + 1);
			} else {
				lMap.put(e, 1);
			}
		}
		System.out.println("substrings with occurances " + lMap);
		
		ArrayList<Integer> al= new ArrayList<Integer>();

		for (Entry<String, Integer> e : lMap.entrySet()) {

			if (e.getValue() == 1) {

				al.add(e.getKey().length());
			}

		}
		Collections.sort(al);
		
		for (Entry<String, Integer> e : lMap.entrySet()) {
			
			if (e.getValue() == 1 && e.getKey().length()==al.get(0)) {
				
				System.out.println(e.getKey());
				System.out.println(e.getKey().length());
				
				
			}
		
		}
		}
	}


