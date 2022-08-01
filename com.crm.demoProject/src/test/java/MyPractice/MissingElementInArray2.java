package MyPractice;

import java.util.ArrayList;

public class MissingElementInArray2 {
	
	public static void main(String[] args) {
		
		int x[]= {2,6,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 1; i <=10; i++) {
			al.add(i);
			
		}
		
		//ArrayList<Integer> al2 = new ArrayList<Integer>();
		int j=0;
		for (int i = 0; i < x.length; i++) {
			
			while(al.contains(x[i]))
			{
				if(al.get(j)!=x[i]) {
				System.out.println(al.get(j));
				j++;
				}
				
			}
			if(j==al.size())
			{
				break;
			}
		}
		
		
	}

}
