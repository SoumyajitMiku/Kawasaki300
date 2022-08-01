package MyPractice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class Question {
	
	@Test
	
	public void duplicateNumbers()
	{
		
		int x[] = {2,10,10,100,2,10,11,2,11,2};
		
		HashMap<Integer,Integer>hs = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < x.length; i++) {
			hs.put(i, x[i]);	
		}
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		
		for(Map.Entry col:hs.entrySet())
		{
			
			lhs.add(col.getValue());
			
		}
		
		for (Object object : lhs) {
			int count=0;
			
			for (int i = 0; i < x.length; i++) {
				
				if(object.equals(x[i]))
				{
					count++;
				}
				
			}
			
			System.out.println(object + " repeated " + count + " times");
			
		}
		
	}
	
	

}
