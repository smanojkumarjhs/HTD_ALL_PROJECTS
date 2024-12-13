//package OrangeHRM.leave;
//
//import org.testng.annotations.Test;
//
//import Base.DemoBase;
//import objectrepo.ApplyLeavePage;
//import utility.JavaFileUtility;
//
//public class AddEntitlementTest extends DemoBase {
//	@Test
//	public void toAddEntitlements() {
//		ApplyLeavePage alp = new ApplyLeavePage(driver);
//		JavaFileUtility jutil = new JavaFileUtility();
//		int ran = jutil.toGetRandomNumber();
//		alp.getLeaveLink().click();
//		alp.getEntitlementsLink().click();
//		alp.getAddEntitlementsLink().click();
//		alp.getEmployeeNameTextBoxLink().sendKeys("asasds" + ran);
//		alp.getLeaveTypeLink().click();
//		alp.getCANFMLAlink().click();
//		alp.getPeriodLink().click();
//		alp.getLeavePeriodLink().click();
//		alp.getEntitlementTextBoxLink().sendKeys("" + ran + "");
//		alp.getSubmitButtonLink().click();
//
//	}
//
//}
package OrangeHRM.leave;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ApplyLeavePage;
import utility.JavaFileUtility;

public class AddEntitlementTest extends DemoBase {

    @Test
    public void toAddEntitlements() {
        ApplyLeavePage alp = new ApplyLeavePage(driver);
        JavaFileUtility jutil = new JavaFileUtility();
        int ran = jutil.toGetRandomNumber(); // Ensure this method returns an integer value.

        // Use explicit waits to make sure the elements are loaded before interacting with them.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for Leave link and click on it
        WebElement leaveLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getLeaveLink()));
        leaveLink.click();

        // Wait for Entitlements link and click on it
        WebElement entitlementsLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getEntitlementsLink()));
        entitlementsLink.click();

        // Wait for Add Entitlements link and click on it
        WebElement addEntitlementsLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getAddEntitlementsLink()));
        addEntitlementsLink.click();

        // Fill out the form
        WebElement employeeNameTextBox = wait.until(ExpectedConditions.visibilityOf(alp.getEmployeeNameTextBoxLink()));
        employeeNameTextBox.sendKeys("asasds" + ran); // Ensure this field accepts the input correctly

        // Select Leave Type
        WebElement leaveTypeLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getLeaveTypeLink()));
        leaveTypeLink.click();

        WebElement CANFMLALink = wait.until(ExpectedConditions.elementToBeClickable(alp.getCANFMLAlink()));
        CANFMLALink.click();

        // Select Leave Period
        WebElement periodLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getPeriodLink()));
        periodLink.click();

        WebElement leavePeriodLink = wait.until(ExpectedConditions.elementToBeClickable(alp.getLeavePeriodLink()));
        leavePeriodLink.click();

        // Enter Entitlement
        WebElement entitlementTextBox = wait.until(ExpectedConditions.visibilityOf(alp.getEntitlementTextBoxLink()));
        entitlementTextBox.sendKeys("" + ran + "");

        // Submit the form
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(alp.getSubmitButtonLink()));
        submitButton.click();
    }
}

