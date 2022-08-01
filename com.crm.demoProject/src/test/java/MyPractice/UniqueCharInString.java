package MyPractice;

public class UniqueCharInString {
	public static void main(String[] args) {
		String s1 = "anggel";
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.indexOf(s1.charAt(i))==s1.lastIndexOf(s1.charAt(i)))
			{
				System.out.println(s1.charAt(i) + " is unique");
				
			}
			
			else
			{
				
				System.out.println(s1.charAt(i) + " is repeated");
			}
			
		}
		
	
		
		
		
	}

}
