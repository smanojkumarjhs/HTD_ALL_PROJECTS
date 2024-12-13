package OrangeHRM.Claim;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ClaimPage;

public class SubmitClaimTest extends DemoBase {
	@Test
	public void toSubmitClaim() {
		
		ClaimPage cp=new ClaimPage(driver);
		cp.getClaimSectionLink().click();
		cp.getSubmitSectionLink().click();
		cp.getEventDropdownLink().click();
		cp.getAccommodationEventNameLink().click();
		cp.getCurrencyDopDownLink().click();
		cp.getIndianRupeeLink().click();
		cp.getRemarkTextBoxLink().sendKeys("ascasca");
		cp.getCreateButtonLink().click();
		
	}

}
