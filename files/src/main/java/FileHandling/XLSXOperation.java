package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXOperation {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// CreateRow
		// Add Cell 
	 // Set Cell data
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Qapitol QA\\eclipse-workspace\\files\\src\\test\\resources\\Repositories\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
//		XSSFSheet sheet = 	workbook.getSheet("Demo");
		XSSFSheet  sheet  = workbook.createSheet("Demo2");
		XSSFRow row = sheet.createRow(1);
		row.createCell(1).setCellValue("Added1");
		
		
		System.out.println("WorkBook Created Successfully");
//		int num = sheet.getLastRowNum();
//		for(int i =0; i<sheet.getLastRowNum();i++) {
//			XSSFRow row = sheet.getRow(i);
//			for(int j=0; j<row.getLastCellNum();j++ ) {
//				System.out.println(row.getCell(j));
//			}
//		}
		
		workbook.close();
		
	}
}
