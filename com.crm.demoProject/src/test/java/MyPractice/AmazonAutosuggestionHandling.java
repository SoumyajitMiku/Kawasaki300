package MyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutosuggestionHandling {
	
	@Test
	public void amazonAutosuggestion() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://amazon.in");
		////div[@class='nav-issFlyout nav-flyout']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']
		
		Actions act = new Actions(driver);
		//act.moveByOffset(0, 0).perform();
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='nav-issFlyout nav-flyout']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		//Thread.sleep(3000);
		for (WebElement web : suggestions) {
			System.out.println(web.getText());
			
		}
		
		driver.quit();
		
	}
	

}
