package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutSelectTag {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		int width = 850;
		int hight= 400;
	    Dimension dimention = new Dimension(width, hight);
		
		driver.manage().window().setSize(dimention);
				driver.manage().window().setPosition(new  Point(1,1));
		

		// clicking on the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//li"));

		// find total number of options
		System.out.println("Total number of options:" + options.size());
		// print all the options from dropdown
		// using normal for loop
//	for(int i=0;i<options.size();i++)
//	{
//			System.out.println(options.get(i).getText());
//	}

		// select options from dropdown
		
//		  for(int i=0;i<options.size();i++) { 
//			
//			  
//			 String option=   options.get(i).getText();
//			  if (option.equals("Java")||option.equals("Python")&&option.equals("MySQL")) {
//				  options.get(i).click();
//				  
//			  }
		
//		 }
		
		  for (WebElement option:options) {
			  String text = option.getText();
			  if (text.equals("Java")||text.equals("MySQL"));
			   
			  
			  option.click();
			  
			  boolean  isselet= option.isEnabled();
			 System.out.println(isselet);
			  
//				for(WebElement option:options)
//				{
//					String text=option.getText();
//					if(text.equals("Java") || text.equals("Python"))
//					{
//						option.click();
//					}
//				}
		  }


//		driver.quit();

	}

}
