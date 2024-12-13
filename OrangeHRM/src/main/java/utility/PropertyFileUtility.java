package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * THIS CLASS CONSISTS OF A METHOD RELATED TO READ DATA FROM PROPERTY FILE
 * 
 * 
 */
public class PropertyFileUtility {
	/**
	 * this method is read to data from property file provided with "key"
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String toReadDataFromPropertyFile(String key) throws IOException {
		FileInputStream pfis = new FileInputStream("C:\\Users\\Qapitol QA\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		prop.load(pfis);

		String value = prop.getProperty(key);
		return value;

	}
}
