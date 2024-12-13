package OrangeHRM.leave;

import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ApplyLeavePage;

public class SearchForLeaveTest extends DemoBase {
	@Test
	public void toSearchForLeave() {
	ApplyLeavePage alp = new ApplyLeavePage(driver);
	alp.getLeaveLink().click();
	alp.getMyleaveLink().click();
	alp.getFromDateDropDownLink().sendKeys("2024-10-12");
	alp.getToDateDropDownLink().sendKeys("2024-14-12");
	alp.getSubmitButtonLink().click();
	

}
}
