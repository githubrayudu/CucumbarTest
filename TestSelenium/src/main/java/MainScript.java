import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EmptyFileException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScript {

	public static WebDriver _driver;

	public static void main(String[] arg) throws IOException {

		// <<<<<<--creating an object so that we can accesss all
		// the methods from the base class----->>>>>>
		base _base = new base(_driver);
		_driver = _base.intializeDriver();

		_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// <<<<<<--creating an object so that we can accesss all
		// the methods from the amazonPage class----->>>>>>
		amazonPage _amz = new amazonPage(_driver);
		// Find mobiles under 10000
		List<WebElement> mobiles = _amz.searchItems("Mobiles under 10000");
		String data = _amz.getTheText(mobiles);
		// Find fridges under 20000
		List<WebElement> fridges = _amz.searchItems("Fridges under 20000");
		String data1 = _amz.getTheText(fridges);

		String path = ".\\testdata\\file2.xlsx";
		XLUtility xlutil = new XLUtility(path);
		// write headers in excel sheet

		FileOutputStream fileout = new FileOutputStream(path);
		
		

		//<<<<<--------------------------------------------------------------------------------------------------------------------------->>>>>//
		
		/*WebElement table = _driver.findElement(By.xpath("(//tbody)[1]"));

		int rows = table.findElements(By.xpath("//tr")).size();
			System.out.println(rows);
		
		
		
		
		
		for (int i = 1; i < rows; i++) 
		{
			String country = table.findElement(By.xpath("//tr[" + i + "]//td[1]")).getText();
			String population = table.findElement(By.xpath("//tr[" + i + "]//td[2]")).getText();
			String perOf_world = table.findElement(By.xpath("//tr[" + i + "]//td[3]")).getText();
			String date = table.findElement(By.xpath("//tr[" + i + "]//td[4]")).getText();
			String source = table.findElement(By.xpath("//tr[" + i + "]//td[5]")).getText();
			
			System.out.println(country + population + perOf_world + date + source);
			
			// writing data into the excel
			
			xlutil.setCellData("sheet1", i, 0, country);
			xlutil.setCellData("sheet1", i, 1, population);
			xlutil.setCellData("sheet1", i, 2, perOf_world);
			xlutil.setCellData("sheet1", i, 3, date);
			xlutil.setCellData("sheet1", i, 4, source);
			
		}
		
		System.out.println("file is sucessfuly created ");
		_driver.quit();
*/
	}
}
