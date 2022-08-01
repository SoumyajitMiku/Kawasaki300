package com.interviewQuestions;




	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class MakeMyTripTest {

		@Test

		public void makemytripscript() throws Throwable {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();

			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

			driver.findElement(By.xpath("//span[text()='From']")).click();
			driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();

			driver.findElement(By.xpath("//span[text()='To']")).click();
			driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();

			driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();

			driver.findElement(
					By.xpath("//div[text()='July']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='9']"))
					.click();
			driver.findElement(By.xpath("//span[text()='RETURN']")).click();

			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			WebElement ele=driver.findElement(
					By.xpath("//div[text()='August']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='28']"));
				ele.click();
				//ele.click();
			//Thread.sleep(2000);

			driver.findElement(By.xpath("//a[text()='Search']")).click();

//			if (driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).isDisplayed()) {
//				driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
//			}

			//Thread.sleep(6000);
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='listingCard ']"));
			WebElement element = list.get(list.size() - 2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			for (int i = 0; i < 10; i++) {
			js.executeScript("arguments[0].scrollIntoView();", element);
			

			

			list.get(list.size() - 2).click();
			System.out.println((list.get(list.size() - 2)).getText());
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Book Now']")).click();

			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			// driver.close();

		}

}


