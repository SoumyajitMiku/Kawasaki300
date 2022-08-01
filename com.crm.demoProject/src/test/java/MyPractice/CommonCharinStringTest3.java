package MyPractice;

import java.util.HashSet;

public class CommonCharinStringTest3 {
	
	public static void main(String[] args) {
		
		String s[] = {"application","applei","apahdpai","apediheap","appui"};
		
		for (int i = 0; i < s[0].length(); i++) {
			int count =0;
			
			for (int j = i+1; j <s.length; j++) {
				for (int j2 = 0; j2 < s[j].length(); j2++) {
					
					if(s[0].charAt(i)==s[j].charAt(j2) && i==j2)
					{
						
						System.out.println(s[0].charAt(i));
						
					}
					
					
					
				}
				
			}
			
		 
			
		}
		
	
	}
	
}
