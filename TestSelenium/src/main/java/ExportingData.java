import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


// this is the Exporting class
public class ExportingData {
	//Initializing the _textDriver
	WebDriver _textDriver;
	
	//using constructor 
	public ExportingData(String  texdrive) {
		
	}
	
	
	// method for Exporting data into Excel
	public void WritingDataIntoExcel() throws FileNotFoundException{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdat\\myfile.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet mysheet = workbook.createSheet();
		
		mysheet.createRow(0).createCell(1).setCellValue("welcom");
		mysheet.createRow(0).createCell(2).setCellValue("3163");
		mysheet.createRow(0).createCell(3).setCellValue("wef");
		mysheet.createRow(1).createCell(1).setCellValue("zxcdv");
		mysheet.createRow(1).createCell(2).setCellValue("6546");
		mysheet.createRow(1).createCell(3).setCellValue("efegfefefe");
		
//		XSSFCell cell = mysheet.createRow(0).createCell(1);
//		cell.setCellValue("Welcom");
		
		
			
		
		
		 
		 
		
		
	}
	
	// method for Exporting data into notepad 
	public String ExportToNotePad() {
		try { PrintStream productlist = new PrintStream(new File("C:\\Users\\EX perimental 1\\eclipse-workspace\\ProjectDataExtracted\\productFile.txt" )); 
		  System.setOut(productlist); 
		  productlist.print(productlist);
		  
		  } 
		  catch(FileNotFoundException ft){
			  System.out.println(ft);
			  }
		return null;
		
		
	}

}
