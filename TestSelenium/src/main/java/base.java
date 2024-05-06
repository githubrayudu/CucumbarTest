import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	WebDriver _driver;

	// this is the constructor which is calling
	public base(WebDriver drv) {
		this._driver = drv;
	}
	public WebDriver intializeDriver() {
		// Initialize Chrome driver
		_driver = new ChromeDriver();
		
		
		//appliend wait conditon with imlicitywait 
		_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Launch Amazon application
		_driver.get("https://www.amazon.in/");
		
		
		//_driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		

		// maximize driver
		//_driver.manage().window().maximize();

		return _driver;
	}
}