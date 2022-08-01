package MyPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceUsingHashMapTest {
	
	public static void main(String[] args) {
		
		String s ="Soumyajit Mandal";
		
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		
		for (int i = 0; i <s.length(); i++) {
			
		hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(hs);
		
//		for (Entry<Character,Integer> e:hs.entrySet()) {
//			
//			System.out.println(e.getKey()+ " " + e.getValue());
//			
//		}
		
	}
	
	
	

}
