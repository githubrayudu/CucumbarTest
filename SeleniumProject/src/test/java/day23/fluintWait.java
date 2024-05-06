package day23;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
 

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluintWait {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Fluent wait declaration
				
		 FluentWait<WebDriver> mywait= new FluentWait<WebDriver> (driver)
								.withTimeout(Duration.ofSeconds(30L))
								.pollingEvery(Duration.ofSeconds(5L))
								.ignoring(NoSuchElementException.class);
		
		
			
		//usage
	    WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
	

	}

}
