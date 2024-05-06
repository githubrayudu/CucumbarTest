package day31;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capture full page screenshot - selenium 3 & 4
		
		TakesScreenshot TSCH=(TakesScreenshot)driver;
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File myscrsht=TSCH.getScreenshotAs(OutputType.FILE);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\EX perimental 1\\Pictures\\Saved Picturesfullpage1.png");
		FileUtils.copyFile(src, trg);
		FileUtils.copyFile(trg, myscrsht)
		 ;
		
		// capture screenshot of specific area from webpage -- selenium 4+
		
		/*WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\pavan\\Aug19Batch\\seleniumproject\\screenshots\\featureproducts.png");
		FileUtils.copyFile(src, trg);
		*/
		
		// capture screenshot of specific Web element -- selenium 4+
		
			WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
			/*
			 * File src=logo.getScreenshotAs(OutputType.FILE); File trg=new
			 * File("C:\\Users\\EX perimental 1\\Pictures");
			 */FileUtils.copyFile(src, trg);
				
				
				
		
	}

}
