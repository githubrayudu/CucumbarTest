package day22;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*get(url)
		getTitle()
		getCurrentURL()
		getPageSource()
		getWindowHandle()
		getwindowHandles()
		*/


			
		
			
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//				driver.manage().window().maximize();
				
				System.out.println("title of the page:"+driver.getTitle());
				
				System.out.println("Current URL:"+ driver.getCurrentUrl());
						
//				System.out.println("Page source......................");
//				String ps=driver.getPageSource();
//				System.out.println(ps);
//				System.out.println(ps.contains("html"));
//				
//				//System.out.println(driver.getWindowHandle());  //CDwindow-3127F2DCB717E0F5993100E70756C523
//																//CDwindow-46E50E8AE6529C7635BCF8E9EA2FB5DE

				Thread.sleep(3000);
				driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser window
				
				Set<String>windows = driver.getWindowHandles();
				
				for(String winid:windows)
				{
					System.out.println(winid);
				}
				
	
	
			}
}
			

		

	

