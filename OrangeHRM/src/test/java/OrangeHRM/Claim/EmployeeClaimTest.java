package OrangeHRM.Claim;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ClaimPage;
import utility.JavaFileUtility;

public class EmployeeClaimTest extends DemoBase{
	@Test
	public void toSeeEmployeeClaims() {
		JavaFileUtility jutil = new JavaFileUtility();
		int ran=jutil.toGetRandomNumber();
		ClaimPage cp=new ClaimPage(driver);
		cp.getClaimSectionLink().click();
		cp.getEmployeeClaimSectionLink().click();
		cp.getReferenceIdTextBoxLink().sendKeys("manoj"+ran);
		cp.getEventNameDropDownLink().click();
		cp.getAccommodationEventNameLink().click();
		cp.getStatusDropDownLink().click();
		cp.getInitiatedStatusLink().click();
		cp.getFromDateDropDownLink().sendKeys("2024-10-12");
		cp.getToDateDropDownLink().sendKeys("2024-12-12");
		cp.getIncludeDropDownLink().click();
		cp.getCurrentAndPastEmployeeLink().click();
		cp.getSearchButtonLink().click();
	}

}
