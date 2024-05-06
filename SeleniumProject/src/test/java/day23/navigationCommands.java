package day23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class navigationCommands {

	public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.navigate().to("https://www.amazon.in/");
				System.out.println(driver.getCurrentUrl());
				
				driver.navigate().to("https://www.flipkart.com/");
				System.out.println(driver.getCurrentUrl());
				
				
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().forward();
			
				driver.get("https://www.toysrus.com/");
				driver.getTitle();
			System.out.println(driver.getTitle());
			driver.notifyAll();
			driver.navigate().wait(2200, 5);
				
			/*
				driver.navigate().back();
				System.out.println(driver.getCurrentUrl()); // amzon
				
				driver.navigate().forward();
				System.out.println(driver.getCurrentUrl()); // flipkart
				
				driver.navigate().refresh();  // refresh the page
				*/
				

			}


	

}
