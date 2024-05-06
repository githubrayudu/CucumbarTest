package day24;

import java.time.Duration;
import java.util.List;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;	
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.profiler.model.PositionTickInfo;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		int width = 900;
		int hight= 600;
	    Dimension dimention = new Dimension(width, hight);
		
		driver.manage().window().setSize(dimention);
				driver.manage().window().setPosition(new  Point(1,500));
		
		
		
		
		WebElement drpCountryEle =   driver.findElement(By.xpath("//select[@id='country-list']"));
//		System.out.println(drpCountryEle.getSize());
		
//			Select dropCountry = new Select(drpCountryEle);   
			Select drpCountry=new Select(drpCountryEle);
		
		//1) Selecting an option from teh dropdown
			drpCountry.selectByVisibleText("India");
			Thread.sleep(1000);
			drpCountry.selectByIndex(3);
			Thread.sleep(1000);
			drpCountry.selectByValue("4");
			

		// 2) Find total options in dropdown

			List<WebElement> opt= drpCountry.getOptions();
					System.out.println("no of options : " + opt.size());
			
		//3) print options in console window
					
					for (int i= 0;i<opt.size();i++) {
					
						System.out.println(opt.get(i).getText());
					
					
					
					}
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
					
					
					for (WebElement op:opt) {
						System.out.println(op.getText());
					}
		
		//using enhanced loop
//		for(WebElement op:options)
//		{
//			System.out.println(op.getText());
//		}
			
	}

//	private static Dimension Dimension(int i, int j) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

