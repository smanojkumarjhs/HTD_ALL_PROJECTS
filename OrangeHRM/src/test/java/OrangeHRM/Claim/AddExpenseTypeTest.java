package OrangeHRM.Claim;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ClaimPage;

public class AddExpenseTypeTest extends DemoBase {
	@Test
	public void toAddExpenseType() {
		ClaimPage cp=new ClaimPage(driver);
		cp.getClaimSectionLink().click();
		cp.getConfigurationSectionLink().click();
		cp.getExpenseTypeSectionLink().click();
		cp.getEventNameTextBoxLink().sendKeys("accomodation");
		cp.getStatusDropDownLink().click();
		cp.getActiveStatusLink().click();
		cp.getSearchButtonLink().click();
	}

}
