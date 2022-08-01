package MyPractice;

public class ThreeMaxNumberInArray {
	
	public static void main(String[] args) {
		
		int x[] = {4,6,27,94,-8,10,99,98,166};
		
		int fmax=x[0];
		int smax=x[0];
		int tmax=x[0];
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=x[i];
			}
			else if(x[i]>smax)
			{
				smax=x[i];
			}
			else if(x[i]>tmax)
			{
				tmax=x[i];
			}
			
			
		}
		
		System.out.println(fmax+ " " + smax+" "+ tmax);
		
	}

}
