package MyPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CommonCharInStringArray {
	
	public static void main(String[] args) {
		
		String s[]= {"apple","application","appu","heidapap"};
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i = 0; i < s.length; i++) {
			int count=1;
			int count2=0;
			for (int j = 0; j < s[0].length(); j++) {
				for (int k = 0; k <s[count].length(); k++) {
					
					if (s[0].charAt(j)==s[count].charAt(k)) {
						count2++;
						
						
						
					}
					if (count2==s.length-1) {
						
						hs.add(s[0].charAt(j));
						
					}
					
				}
				
				
			}
			count++;
		}
		
		System.out.println(hs);
		
		
	}
	
}
