package MyPractice;

public class ReverseStringWithReserveSpaceOptimized {
	
	
	public static void main(String[] args) {
		
		String s = "i am soumyajit";
		char ch[]= s.toCharArray();
		
	
		int start=0; int end=s.length()-1;
		
		while(start<end)
		{
			if(!Character.isAlphabetic(ch[start]))
			{
			
				start++;
				
			}
			
			else if(!Character.isAlphabetic(ch[end]))
			{
				end--;
				
			}
			else
			{
			  char temp = ch[start];
			  ch[start] = ch[end];
			  ch[end]=temp;
			  start++;
			  end--;
				
				
				
			}
		}
		
		System.out.println(String.valueOf(ch));
		
		
	}

}
