package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ConditionalMethodsOrConditionalCommands {

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.instagram.com/udemy/");
				driver.get("https://twitter.com/udemy");
				driver.get("https://www.facebook.com/udemy/");
				driver.get("https://demo.nopcommerce.com/register");
				
		
				//driver.manage().window().maximize();
				
//				WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//				System.out.println(logo.isDisplayed());
				boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
							System.out.println(status);
							
				WebElement serchBar =driver.findElement(By.xpath("//input[@id='small-searchterms']"));
				System.out.println("Enable status :" +serchBar.isEnabled());
				
				
				WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male']"));
				WebElement female_rd =driver.findElement(By.xpath("//input[@id='gender-female']"));
				
				
				
				//After selection of male radio button
				System.out.println("After selection of male radiop button............");
				male_rd.click();
				
				
				
				
				System.out.println("status of the mail radio muttobn:"+male_rd.isSelected());
				System.out.println("status of the femail radio muttobn:"+female_rd.isSelected());
				
				
				driver.quit();
				
				
				
				
			}

		

}
