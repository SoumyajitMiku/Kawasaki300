package MyPractice;

import java.util.HashMap;

public class ConsecutiveCharInStringCount {
	
	
	String s ="aaabbcdeaafe";
	HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
	
	for(int i=0;i<s.length();i++)
	{
		hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
	}

}
