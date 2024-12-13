package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyLeavePage {
	public ApplyLeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leaveLink;
	@FindBy(linkText = "Apply")
	private WebElement applyLink;
	@FindBy(xpath = "//div[@class='oxd-select-text--after']")
	private WebElement leaveTypeLink;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	// (//input[@class='oxd-input oxd-input--active'])[2]
	private WebElement fromDateDropDownLink;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement toDateDropDownLink;
	@FindBy(xpath = "//button[text()=' Apply ']")
	private WebElement applyButtonLink;
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	private WebElement commentsBoxLink;

	
	
	@FindBy(linkText = "My Leave")
	private WebElement MyleaveLink;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButtonLink;

	
	
	@FindBy(xpath = "//span[text()='Entitlements ']")
	private WebElement EntitlementsLink;
	@FindBy(linkText = "Add Entitlements")
	private WebElement addEntitlementsLink;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeNameTextBoxLink;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	private WebElement LeaveTypedropDownLink;
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement PeriodLink;
	
	
   @FindBy(linkText = "Employee Entitlements")
   private WebElement employeeEntitlementsLink;
   
   
   @FindBy(linkText = "My Entitlements")
   private WebElement myEntitlementsLink;
   
	
	
	public WebElement getMyEntitlementsLink() {
	return myEntitlementsLink;
}

	public WebElement getEmployeeEntitlementsLink() {
	return employeeEntitlementsLink;
}

	public WebElement getPeriodLink() {
		return PeriodLink;
	}

	@FindBy(xpath = "//span[text()='CAN - FMLA']")
	private WebElement CANFMLAlink;
	@FindBy(xpath = "//span[text()='2022-01-01 - 2022-31-12']")
	private WebElement LeavePeriodLink;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement EntitlementTextBoxLink;
	
	
	
	
	
	
	public WebElement getEntitlementsLink() {
		return EntitlementsLink;
	}

	public WebElement getAddEntitlementsLink() {
		return addEntitlementsLink;
	}

	public WebElement getEmployeeNameTextBoxLink() {
		return employeeNameTextBoxLink;
	}

	public WebElement getLeaveTypedropDownLink() {
		return LeaveTypedropDownLink;
	}

	public WebElement getCANFMLAlink() {
		return CANFMLAlink;
	}

	public WebElement getLeavePeriodLink() {
		return LeavePeriodLink;
	}

	public WebElement getEntitlementTextBoxLink() {
		return EntitlementTextBoxLink;
	}

	public WebElement getMyleaveLink() {
		return MyleaveLink;
	}

	public WebElement getSubmitButtonLink() {
		return submitButtonLink;
	}

	public WebElement getLeaveLink() {
		return leaveLink;
	}

	public WebElement getApplyLink() {
		return applyLink;
	}

	public WebElement getLeaveTypeLink() {
		return leaveTypeLink;
	}

	public WebElement getFromDateDropDownLink() {
		return fromDateDropDownLink;
	}

	public WebElement getToDateDropDownLink() {
		return toDateDropDownLink;
	}

	public WebElement getApplyButtonLink() {
		return applyButtonLink;
	}

	public WebElement getCommentsBoxLink() {
		return commentsBoxLink;
	}

}
