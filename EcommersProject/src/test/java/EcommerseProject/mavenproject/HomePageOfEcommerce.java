package EcommerseProject.mavenproject;

import static org.mockito.ArgumentMatchers.anyList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageOfEcommerce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> listOfLinks=  driver.findElements(By.tagName("a"));
		System.out.println("Total no of links in the home Page:"+listOfLinks.size());
		System.out.println(listOfLinks);
		
		driver.quit();
		
		
		

	}

}
