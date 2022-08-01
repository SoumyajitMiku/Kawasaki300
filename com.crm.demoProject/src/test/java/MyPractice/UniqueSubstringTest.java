package MyPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class UniqueSubstringTest {
	
	public static void main(String[] args) {
		
		String s = "abaaba";
		
		//TreeSet<String> ts = new TreeSet<String>();
		HashMap<String, Integer> hmap= new HashMap<String, Integer>();
		
		for (int i = 2; i < s.length(); i++) {
			for (int j = 0; j <s.length()-i; j++) {
				
				//System.out.print(s.substring(j, j+i) + " ");
                String sub=s.substring(j,j+i);

				 if(hmap.containsKey(sub)){
	                    hmap.put(sub,hmap.get(sub)+1);
	                }else{
	                    hmap.put(sub,1);
	                }
				
			}
			//System.out.println();
			
		}
		 for(Entry<String, Integer> e: hmap.entrySet()){
             if(e.getValue()==1){
                 System.out.print(e.getKey()+" "+ e.getKey().length());
                 //return e.getKey();
             }
		
		//System.out.println(ts);
	}

	}}
