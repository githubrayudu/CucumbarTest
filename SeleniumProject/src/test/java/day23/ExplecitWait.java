package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplecitWait {

	public static void main(String[] args) {
	
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));

	
	WebElement user= myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	user.sendKeys("Admin");
	
	
	
	}

}
