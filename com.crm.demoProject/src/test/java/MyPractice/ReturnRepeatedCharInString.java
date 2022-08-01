package MyPractice;

import java.util.HashMap;
import java.util.Map;

public class ReturnRepeatedCharInString {

	public static void main(String[] args) {
		
		
		String s = "abcaegdd";
		
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
			
		}
		
		for(Map.Entry<Character,Integer> e : hs.entrySet())
		{
			
			if (e.getValue()>1) {
				
				System.out.println(e.getKey());
				
			}
			
			
		}
		
		
		
				
		
		
		
		
		
	}
	
	
	
}
