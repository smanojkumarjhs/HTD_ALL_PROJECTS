package OrangeHRM.leave;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ApplyLeavePage;

public class MyEntitlementsTest extends DemoBase{
	@Test
	public void toSeeMyEntitlements() {
		ApplyLeavePage alp = new ApplyLeavePage(driver);
		alp.getLeaveLink().click();
		alp.getEntitlementsLink().click();
		alp.getMyEntitlementsLink().click();
		alp.getLeaveTypeLink().click();
		alp.getCANFMLAlink().click();
		alp.getPeriodLink().click();
		alp.getLeavePeriodLink().click();
		alp.getSubmitButtonLink().click();
		
	}
	

}
