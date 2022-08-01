package com.interviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		
		LinkedList<String> ls = new LinkedList<String>();
		
		for (WebElement wb : urls) {
			
			if(wb.getAttribute("href")!=null)
			{
				//System.out.println(wb.getAttribute("href"));
				ls.add(wb.getAttribute("href"));
			}
			
		}
		
	Iterator itr=ls.iterator();
		
		while(itr.hasNext())
		{
			try
			{
			URL url = new URL(itr.next().toString());
			
			HttpURLConnection httpconnect = (HttpURLConnection)url.openConnection();
			
			httpconnect.connect();
			if (httpconnect.getResponseCode()>=200 && httpconnect.getResponseCode()<=300) {
				
				System.out.println(itr.next() + " -----> "+"Link is okk");
				
			} 
			}
			catch(Exception e)
			{
				System.out.println(itr.next() + " -----> "+"Link is broken");
			}
			
			
		}
		
		
	}

}
