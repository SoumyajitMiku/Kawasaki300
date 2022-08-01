package MyPractice;

public class ThreeMinInArray {
	
	public static void main(String[] args) {
		
		
		
		int x[] = {4,6,27,94,-8,10,99,98};
		
		int fmin=x[0];
		int smin=x[0];
		int tmin=x[0];
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i]<fmin)
			{
				tmin=smin;
				smin=fmin;
				fmin=x[i];
			}
			else if(x[i]<smin)
			{
				smin=x[i];
			}
			else if(x[i]<tmin)
			{
				tmin=x[i];
			}
			
			
		}
		
		System.out.println(fmin+ " " + smin+" "+ tmin);
		
	}
	}


