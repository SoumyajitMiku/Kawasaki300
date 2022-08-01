import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

public class GenericTest {
	    public static void main(String args[]) {
	      String s="abaaba"; //smallest unique substring and length is aa 2
	      unique(s);
	     String s1="abacdef";// first duplicate letter and print as a  string
	     duplicate(s1);
	     String s2 = "aaBatzcDbACd";// D highest letter in the string in uppercase
	     highest(s2);
	    }
	    public static String unique(String s)
	    {
	        HashMap<String, Integer> hmap= new HashMap<String, Integer>();
	        for(int i=2;i<s.length();i++)
	        {
	            for(int j=0;j<=s.length()-i;j++)
	            {
	                String sub=s.substring(j,j+i);
	                if(hmap.containsKey(sub)){
	                    hmap.put(sub,hmap.get(sub)+1);
	                }else{
	                    hmap.put(sub,1);
	                }
	            }
	            for(Entry<String, Integer> e: hmap.entrySet()){
	                if(e.getValue()==1){
	                    System.out.print(e.getKey()+" "+ e.getKey().length());
	                    return e.getKey();
	                }
	            }
	        }
	        return s;
	    }
	     public static String duplicate(String s)
	    {
	        HashSet<Character> hset= new HashSet<Character>();
	        for(char c:s.toCharArray()){
	            if(hset.contains(c)){
	                System.out.println(c+"");
	            }else{
	                hset.add(c);
	            }
	        }
			return s;
	    }
	    public static String highest(String s){
	        HashSet<Character> hset= new HashSet<Character>();
	        for(char c: s.toCharArray())
	        {
	            hset.add(c);
	        }
	        TreeSet<Character> tset= new TreeSet<Character>();
	        for(char c: hset){
	            if(Character.isLowerCase(c) && hset.contains(Character.toUpperCase(c))){
	                tset.add(Character.toUpperCase(c));
	            }
	        }
	        System.out.println(tset.last());
	        return s;
	    }
	
}
