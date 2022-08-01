package MyPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Substring {
	
	
	public static void main(String[] args) {
		
		String s = "aabaca";
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		for (int i = 2; i < s.length()-1; i++) {
			
			for (int j = 0; j <s.length()-1; j++) {
				
				if((j+i)<(s.length()+1))
				{
				
				hs.add(s.substring(j, j+i));
				}
				
				
			}
			
		}
		
		System.out.println(hs);
		
		
	}

}
