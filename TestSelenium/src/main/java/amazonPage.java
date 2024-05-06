import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonPage {

	WebDriver _driver;
	String data;

	
	
	
	// this is the constructor which is calling
	public amazonPage(WebDriver drv) {
		this._driver = drv;
	}
	// <<<<<<<<<<<<-------THIS METHOD IS FOR ENTERING DATA INTO THE SEARCH AND CLICK
	// ON SEARCH-------->>>>>
	public List<WebElement> searchItems(String text) {
		// search mobile under 10000 in amazon
		_driver.findElement(By.id("twotabsearchtextbox")).clear();
		_driver.findElement(By.id("twotabsearchtextbox")).sendKeys(text);

		// Click on search button
		_driver.findElement(By.id("nav-search-submit-button")).click();

		// collect all the items from search results
		List<WebElement> mobileNames = _driver.findElements(By.xpath("//div[@data-cy='title-recipe']//h2"));

		return mobileNames;
	}
	
	// <<<<-------------this method is for printing the text ---------->>>>>>>>

	public void printAllItems(List<WebElement> items) {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getText() + "----->" + items.get(i).getText());
		}
	}
	public String getTheText(List<WebElement> items) {
		
		
		for (int i = 0; i < items.size(); i++) {
			String data = (items.get(i).getText() + "----->" + items.get(i).getText());
		System.out.println(data);
		}
		return data;
	}

	}
	

