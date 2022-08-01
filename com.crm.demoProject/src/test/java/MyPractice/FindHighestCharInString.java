package MyPractice;

import java.util.HashSet;
import java.util.TreeSet;

public class FindHighestCharInString {
	
	public static void main(String[] args) {
		
		String s="aaBatwzcDbACdW";
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		TreeSet<Character> ts = new TreeSet<Character>();
		
		for (Character ch : hs) {
			
			if(Character.isLowerCase(ch) && hs.contains(Character.toUpperCase(ch)))
			{
				ts.add(Character.toUpperCase(ch));
				
			}
				
		}
		System.out.println(ts);
		System.out.println(ts.last());
		
		
		
	}

}
