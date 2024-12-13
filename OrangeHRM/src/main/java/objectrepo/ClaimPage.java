package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimPage {
	public ClaimPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement ClaimSectionLink;
	@FindBy(linkText = "Assign Claim")
	private WebElement assignClaimSectionLink;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeNameTextBoxLink;
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement EventDropdownLink;
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement currencyDopDownLink;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButtonLink;
	@FindBy(xpath = "//textarea")
	private WebElement remarkTextBoxLink;

	@FindBy(linkText = "Employee Claims")
	private WebElement employeeClaimSectionLink;
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement referenceIdTextBoxLink;
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement eventNameDropDownLink;
	@FindBy(xpath = "(//span[text()='Accommodation'])[1]")
	private WebElement accommodationEventNameLink;
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement statusDropDownLink;
	@FindBy(xpath = "//span[text()='Initiated']")
	private WebElement initiatedStatusLink;
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	private WebElement FromDateDropDownLink;
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
	private WebElement toDateDropDownLink;
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
	private WebElement includeDropDownLink;
	@FindBy(xpath = "//span[text()='Current and Past Employees']")
	private WebElement currentAndPastEmployeeLink;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButtonLink;

	@FindBy(linkText = "Submit Claim")
	private WebElement SubmitSectionLink;
	@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement currencyDropDownLink;
	@FindBy(xpath = "//span[text()='Indian Rupee']")
	private WebElement indianRupeeLink;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement createButtonLink;

	@FindBy(linkText = "Events")
	private WebElement eventsSectionLink;
	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement ConfigurationSectionLink;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement EventNameTextBoxLink;
	@FindBy(xpath = "//div[text()='-- Select --']")
	private WebElement EventStatusLink;
	@FindBy(xpath = "//span[text()='Active']")
	private WebElement activeStatusLink;

	@FindBy(linkText = "Expense Types")
	private WebElement ExpenseTypeSectionLink;

	public WebElement getClaimSectionLink() {
		return ClaimSectionLink;
	}

	public WebElement getAssignClaimSectionLink() {
		return assignClaimSectionLink;
	}

	public WebElement getEmployeeNameTextBoxLink() {
		return employeeNameTextBoxLink;
	}

	public WebElement getEventDropdownLink() {
		return EventDropdownLink;
	}

	public WebElement getCurrencyDopDownLink() {
		return currencyDopDownLink;
	}

	public WebElement getSubmitButtonLink() {
		return submitButtonLink;
	}

	public WebElement getRemarkTextBoxLink() {
		return remarkTextBoxLink;
	}

	public WebElement getEmployeeClaimSectionLink() {
		return employeeClaimSectionLink;
	}

	public WebElement getReferenceIdTextBoxLink() {
		return referenceIdTextBoxLink;
	}

	public WebElement getEventNameDropDownLink() {
		return eventNameDropDownLink;
	}

	public WebElement getAccommodationEventNameLink() {
		return accommodationEventNameLink;
	}

	public WebElement getStatusDropDownLink() {
		return statusDropDownLink;
	}

	public WebElement getInitiatedStatusLink() {
		return initiatedStatusLink;
	}

	public WebElement getFromDateDropDownLink() {
		return FromDateDropDownLink;
	}

	public WebElement getToDateDropDownLink() {
		return toDateDropDownLink;
	}

	public WebElement getIncludeDropDownLink() {
		return includeDropDownLink;
	}

	public WebElement getCurrentAndPastEmployeeLink() {
		return currentAndPastEmployeeLink;
	}

	public WebElement getSearchButtonLink() {
		return searchButtonLink;
	}

	public WebElement getSubmitSectionLink() {
		return SubmitSectionLink;
	}

	public WebElement getCurrencyDropDownLink() {
		return currencyDropDownLink;
	}

	public WebElement getIndianRupeeLink() {
		return indianRupeeLink;
	}

	public WebElement getCreateButtonLink() {
		return createButtonLink;
	}

	public WebElement getEventsSectionLink() {
		return eventsSectionLink;
	}

	public WebElement getConfigurationSectionLink() {
		return ConfigurationSectionLink;
	}

	public WebElement getEventNameTextBoxLink() {
		return EventNameTextBoxLink;
	}

	public WebElement getEventStatusLink() {
		return EventStatusLink;
	}

	public WebElement getActiveStatusLink() {
		return activeStatusLink;
	}

	public WebElement getExpenseTypeSectionLink() {
		return ExpenseTypeSectionLink;
	}

}