package MyPractice;

import java.util.HashSet;

public class CommonCharinStringTest2 {
	
	public static void main(String[] args) {
		
		String s[] = {"application","applei","apahdpai","apediheap","appui"};
		int ln=s.length;
		
		try {
			for (int i = 0; i < s[0].length(); i++) {
				int count=0;
				char ch=s[0].charAt(i);
				for (int j = 0; j < s.length; j++) {
					if(ch==s[j].charAt(i)) {
						count++;
					}
				}
				if(count==ln) {
						System.out.print(ch);
				}		
				}
			}
		catch(Exception e) {
			
		}
		
	}
	
}
