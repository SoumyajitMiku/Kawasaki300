package MyPractice;

public class FindingOccuranceOfWordInString {
	
	public static void main(String[] args) {
		
		String s = "javaseleniumjava";
		
		String s1="java";
		int count=0;
		
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)=='j' && s.substring(i, i+s1.length()).equals(s1))
			{
			   	count++;
			}
			
		}
		
		System.out.println(count);
		
		
	}

}
