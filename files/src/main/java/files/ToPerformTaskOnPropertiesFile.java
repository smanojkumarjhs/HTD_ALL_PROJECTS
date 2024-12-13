package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ToPerformTaskOnPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Qapitol QA\\eclipse-workspace\\files\\src\\test\\resources\\config.properties");
		Properties property = new Properties();

		property.load(new FileInputStream(
				"C:\\Users\\Qapitol QA\\eclipse-workspace\\files\\src\\test\\resources\\config.properties"));

		String data = property.getProperty("company");
		System.out.println(data);

		property.setProperty("username", "mk");
		property.setProperty("pass", "pass");
		property.store(fos, null);
		property.clear();
		property.setProperty("data", "temp");
		property.store(
				new FileOutputStream(
						"C:\\Users\\Qapitol QA\\eclipse-workspace\\files\\src\\test\\resources\\config.properties"),
				null);

	}

}
