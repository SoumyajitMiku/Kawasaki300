import java.util.LinkedHashSet;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintDuplicateWords {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
			
			String sentence = s.nextLine();
		
			
		
		
		
		//String s = "khtam ta ta bye bye";
		
		String str[] = sentence.split(" ");
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		for (String s1 : str) {
			
			ls.add(s1);
			
		}
		
		for (String word : ls) {
			int count = 0;
			
			for (int i = 0; i < str.length; i++) {
				
				if(word.equals(str[i]))
				{
					count++;
				}
				
			}
			
			if(count>1)
			{
				System.out.println(word + " repeated " + count + " times");
			}
			
		}
		
	}
	
	
	
	
	
	

}
