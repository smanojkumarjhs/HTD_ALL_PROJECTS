package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
	public static Object[][] getTestData(String filePath, String sheetName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum() + 1;
		int columnCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][columnCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		workbook.close();
		fileInputStream.close();
		return data;
	}
}