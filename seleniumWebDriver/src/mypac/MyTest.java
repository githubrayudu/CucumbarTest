package mypac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver.exe");
			
			WebDriver chrome = new ChromeDriver();
			
			chrome.get("https://www.cricbuzz.com/");
	}

}
