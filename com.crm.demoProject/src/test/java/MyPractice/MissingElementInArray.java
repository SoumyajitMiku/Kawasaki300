package MyPractice;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int x[] = {2,6,9,13};
		
		for (int i = 0; i < x.length-1; i++) {
			
			while(x[i+1]-x[i]>1)
			{
				x[i]++;
				System.out.print(x[i]+" ");
				
			}
			
		}
		
		
		
	}

}
