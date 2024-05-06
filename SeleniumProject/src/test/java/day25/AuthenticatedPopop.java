package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// https://the-internet.herokuapp.com/basic_auth
		
		
		// https://admin:admin@the-internet.herokuapp.com/basic_auth


		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		//Thread.sleep(2000);
		if (text.contains("Congratulations")) {
			System.out.println("successful login");
		} else {
			System.out.println("login failed");
		}
	}
}