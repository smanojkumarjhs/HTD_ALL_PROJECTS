package keyengine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
    private String keyword;
    private String locatorType;
    private String testData;
 
    public Keyword(String keyword, String locatorType, String testData) {
        this.keyword = keyword;
        this.locatorType = locatorType;
        this.testData = testData;
    }
 
    public void execute(WebDriver driver) {
        switch (keyword) {
            case "openBrowser":
               // driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "navigateTo":
                driver.get(testData);
                break;
            case "enteremail":
                driver.findElement(By.xpath(locatorType)).click();
                break;
            case "enterpass":
                driver.findElement(By.xpath(locatorType)).sendKeys(testData);
            case "click":
            	driver.findElement(By.xpath(locatorType)).sendKeys(testData);
                break;
          
        }
    }
}