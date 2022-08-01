package com.StringPractice;

public class Assignment4 {
	
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6};
		int y[] = new int[x.length];
		int key =2;
		int index= x.length-key;
		int count =0;
		
		
		for (int i = 0; i < y.length; i++) {
			
			if(i>=key)
			{
				y[count]=x[i];
				count++;
			}
			else
			{
				y[index] = x[i];
				index++;
			}
			
		}
		
	
		
		for (int j = 0; j < y.length; j++) {
			
			System.out.print(y[j] + " ");
			
		}
	}

}
