package MyPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;

public class StringAnagram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		
		

		if (s1.length() == s2.length()) {
			TreeSet ts1 = new TreeSet();
			TreeSet ts2 = new TreeSet();

			for (int i = 0; i < s1.length(); i++) {
				ts1.add(s1.charAt(i));
			}

			for (int i = 0; i < s2.length(); i++) {

				ts2.add(s2.charAt(i));

			}
			System.out.println(ts1.equals(ts2));

		} else {
			System.out.println("Two strings are not anagram as length are not equal");
		}
		
		Arrays.sort(s1.toCharArray());
		

	}
}
