import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import keyengine.Keyword;
import util.ExcelUtil;

public class FacebookTest {
	@Test
	public void toTestFacebook() throws IOException {
      //  WebDriver driver=new ChromeDriver();
		String filePath = "C:\\Users\\Qapitol QA\\eclipse-workspace\\KDD\\src\\test\\resources\\TestData\\Book1.xlsx";
		String sheetName = "Sheet1";

		Object[][] testData = ExcelUtil.getTestData(filePath, sheetName);

		WebDriver driver=new ChromeDriver();

		for (int i = 1; i < testData.length; i++) {
			String keyword = (String) testData[i][0];
			String locator = (String) testData[i][1];
			String testDataValue = (String) testData[i][2];

			Keyword keywordObject = new Keyword(keyword, locator, testDataValue);
			keywordObject.execute(driver);
		}

		driver.quit();
	}

}
