package OrangeHRM.Claim;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ClaimPage;
import utility.*;

public class AssignClaimTest extends DemoBase{
	@Test
	public void toAssignClaim() {
		
	JavaFileUtility jutil = new JavaFileUtility();
	int ran=jutil.toGetRandomNumber();
	ClaimPage cp=new ClaimPage(driver);
	cp.getClaimSectionLink().click();
	cp.getAssignClaimSectionLink().click();
	cp.getEmployeeNameTextBoxLink().sendKeys("manoj"+ran);
	cp.getEventDropdownLink().click();
	cp.getAccommodationEventNameLink().click();
	cp.getCurrencyDopDownLink().click();
	cp.getIndianRupeeLink().click();
	cp.getRemarkTextBoxLink().sendKeys("ssahghasjs");
	cp.getCreateButtonLink().click();
	
	
	
	}
}
