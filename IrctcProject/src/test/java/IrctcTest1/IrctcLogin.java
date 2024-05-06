package IrctcTest1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		/*
		1) Launch browser
		2) open url
			https://opensource-demo.orangehrmlive.com/
		3) Provide username  - Admin
		4) Provide password  - admin123
		5) Click on Login button 
		6) Verify the title of dashboard page   
			Exp title : OrangeHRM
		7) close browser
		 */
				// to disable the notification in chrome browsers

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(options);


//				System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
//				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("div[class='h_menu_drop_button hidden-xs'] i[class='fa fa-align-justify']")).click();

				
				//addin implecit wait to resolve some errors 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// Navigating to the url
				driver.get("https://www.irctc.co.in/nget/train-search");

				// finding the login element through the xpath and clicking on element
				driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
//				 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//				    wait.until(d -> revealed.isDisplayed());
				//provide user name and password 
				driver.findElement(By.cssSelector("input[placeholder='User Name']")).sendKeys("rayudu347");
				driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("roi328");
				
				//making an interruptedException for to enter the CAPTCHA  
				Thread.sleep(7000);
				
				//click on Sign in
				driver.findElement(By.cssSelector("button[style='padding: 10px 14px;']")).click();
				
				// close browser
//				driver.close();
				driver.quit();

}

}
