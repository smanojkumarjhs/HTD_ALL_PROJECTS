package OrangeHRM.leave;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.DemoBase;
import objectrepo.ApplyLeavePage;

public class ApplyForLeaveTest extends DemoBase {
	@Test
	public void toApplyForLeave() {

		ApplyLeavePage alp = new ApplyLeavePage(driver);
		alp.getLeaveLink().click();
		alp.getApplyLink().click();
		alp.getLeaveTypeLink().click();
		driver.findElement(By.xpath("//div[contains(text(),'CAN - FMLA')]")).click();
		alp.getFromDateDropDownLink().sendKeys("2024-12-12");
		alp.getToDateDropDownLink().sendKeys("2024-16-12");
		alp.getCommentsBoxLink().sendKeys("dcsdfasdvasdv");
		alp.getApplyButtonLink().click();

	}

}
