package MyPractice;

public class ReverseSentenceWithResrveSpaces {
	
	public static void main(String[] args) {
		String s = "i am soumyajit";
		
		char[] ch = s.toCharArray();
		char[] finalres = new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i]==' ') {
				
				finalres[i]=ch[i];
				
			}	
		}
		int count = 0;
		
		for (int i = ch.length-1; i >=0 ; i--) {
			
			if(finalres[count]==' ')
			{
				count++;
			}
			  
			  if(ch[i]==' ')
			  {
				  i--;
			  }
			
				finalres[count]=ch[i];
				count++;
				
			
			
		}
		
		System.out.println(String.copyValueOf(finalres));
	}

}
