
public class ScreeningPractice {
	
	public static void main(String[] args) {
		
		String s = "soumyajit";
		
		String[] str = s.split("");
		int count = 0;
		
		for (String string : str) {
			count++;
		}
		
		String rev="";
		
		for (int i = count-1; i >=0 ; i--) {
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}

}
