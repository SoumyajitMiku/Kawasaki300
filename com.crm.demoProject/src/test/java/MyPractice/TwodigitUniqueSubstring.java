package MyPractice;

import java.util.TreeSet;

public class TwodigitUniqueSubstring {
	public static void main(String[] args) {

		String s = "xyxyxyxy";
		TreeSet<String> ts = new TreeSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length() -1; j++) {

                     //System.out.print(s.charAt(i)+ ""+s.charAt(j) + " ");
                     
                     ts.add(s.charAt(i)+""+s.charAt(j));
			}
		}
		System.out.println(ts);

	}

}
