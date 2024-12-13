package OrangeHRM.leave;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ApplyLeavePage;
import utility.JavaFileUtility;

public class SearchEmployeeEntitlementsTest extends DemoBase {
	@Test
	public void toSearchEmployeeEntitlements() {

		ApplyLeavePage alp = new ApplyLeavePage(driver);
		JavaFileUtility jutil = new JavaFileUtility();
		int ran = jutil.toGetRandomNumber();
		alp.getLeaveLink().click();
		alp.getEntitlementsLink().click();
		alp.getEmployeeEntitlementsLink().click();
		alp.getEmployeeNameTextBoxLink().sendKeys("maon"+ran);
		alp.getLeaveTypedropDownLink().click();
		alp.getCANFMLAlink().click();
		alp.getPeriodLink().click();
		alp.getLeavePeriodLink().click();
		alp.getSubmitButtonLink().click();
		
		
	}

}
