package com.ArrayPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.id("loginButton"));
		
		
		//driver.findElement(RelativeLocator.with(By.tagName("input")).above(login)).sendKeys("manager");
		
		//driver.findElement(RelativeLocator.with(By.tagName("a")).below(login)).click();
		
	}

}
