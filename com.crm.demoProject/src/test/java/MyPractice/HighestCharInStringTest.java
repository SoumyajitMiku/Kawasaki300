package MyPractice;

public class HighestCharInStringTest {
	
	public static void main(String[] args) {
		
		String s = "india";
		
		for (int i = 0; i <s.length()-1; i++) {
			
			for (int j = i+1; j < s.length()+1; j++) {
				
				System.out.print(s.substring(i, j)+" ");
				
			}
		}
		
		System.out.print("------");
//		
//for (int i = s.length()-1; i >=0; i--) {
//			
//			for (int j = i; j < s.length()+1; j++) {
//				
//				System.out.print(s.substring(i, j)+" ");
//				
//			}
//		}
		
		
		
		
	}

}
