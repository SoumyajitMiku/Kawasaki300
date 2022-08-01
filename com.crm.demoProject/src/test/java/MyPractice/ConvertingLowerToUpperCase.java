package MyPractice;

public class ConvertingLowerToUpperCase {
	
	
	public static void main(String[] args) {
		
		String s = "SoUMyajit maNDal";
		String res="";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isLowerCase(s.charAt(i)))
			{
		       res=res+ Character.toUpperCase(s.charAt(i));
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				
				res=res+ Character.toLowerCase(s.charAt(i));
			}
			
		}
		
		System.out.println(res);
		
	}

}
