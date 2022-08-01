package MyPractice;

import java.util.HashSet;

public class CommonCharinStringTest {
	
	public static void main(String[] args) {
		
		String s[] = {"application","apple","apahdpa","apedihea"};
		
		//HashSet hs = new HashSet();
		
		String s1="";
		
		for (int i = 0; i < s[0].length(); i++) {
			int count=0;
			for (int j = 1; j < s.length; j++) {
				int count2=0;
				
				for (int j2 = 0; j2 < s[j].length(); j2++) {
					
					if (s[0].charAt(i)==s[j].charAt(j2)) {
						count++;
						if (count==s.length) {
							count2++;
							s1=s1+s[0].charAt(i);
						}
						if(count2==1)
						{
							break;
						}
					
					}
						
				}	
			}	
			}
		System.out.println(s1);
			
		
		
		
	}

}
