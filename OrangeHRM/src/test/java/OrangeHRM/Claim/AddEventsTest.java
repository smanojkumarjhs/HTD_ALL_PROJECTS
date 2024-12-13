package OrangeHRM.Claim;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ClaimPage;

public class AddEventsTest extends DemoBase {
	@Test
	public void toAddEventsInConfiguration() {
		ClaimPage cp=new ClaimPage(driver);
		cp.getClaimSectionLink().click();
		cp.getConfigurationSectionLink().click();
		cp.getEventsSectionLink().click();
		cp.getEventNameTextBoxLink().sendKeys("accomodation");
		cp.getStatusDropDownLink().click();
		cp.getActiveStatusLink().click();
		cp.getSearchButtonLink().click();
	}
	

}
