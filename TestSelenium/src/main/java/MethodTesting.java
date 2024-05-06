import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodTesting {

	int i = 0;

	public static void main(String[] args) throws IOException {

		/*
		 * FileOutputStream file = new FileOutputStream(
		 * "C:\\Users\\EX perimental 1\\eclipse-workspace\\ProjectDataExtracted\\testdata\\testfile.xlsx"
		 * ); XSSFWorkbook workbook = new XSSFWorkbook(); XSSFSheet mysheet =
		 * workbook.createSheet(); XSSFRow row0 = mysheet.createRow(0); XSSFRow row1 =
		 * mysheet.createRow(1);
		 * 
		 * row0.createCell(1).setCellValue("welcom");
		 * row0.createCell(2).setCellValue("3163");
		 * row0.createCell(3).setCellValue("wef");
		 * 
		 * row1.createCell(1).setCellValue("zxcdv");
		 * row1.createCell(2).setCellValue("6546");
		 * row1.createCell(3).setCellValue("efegfefefe");
		 * 
		 * workbook.write(file); workbook.close(); file.close();
		 * 
		 * System.out.println("Writing is done!!!");
		 */

// Excel file -->WorkBook--->Rows--->Cells

//extracting data from the excel workbook

		/*
		 * FileInputStream file = new FileInputStream(
		 * "C:\\Users\\EX perimental 1\\eclipse-workspace\\TestSelenium\\testdata\\testfile.xlsx"
		 * );
		 * 
		 * XSSFWorkbook workbook = new XSSFWorkbook(file);
		 * 
		 * XSSFSheet sheet = workbook.getSheet("Sheet1");
		 * 
		 * int totalrows = sheet.getLastRowNum();
		 * 
		 * int totalcells = sheet.getRow(1).getLastCellNum();
		 * 
		 * System.out.println("Number of rows :" + totalrows);
		 * System.out.println("Nubler of cells :" + totalcells);
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		
		String path = ".\\testdata\\testfile.xlsx"; 
		
		
		
		
		
	
		
	}

}
