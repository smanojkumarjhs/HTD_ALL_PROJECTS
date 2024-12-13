package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DemoBase;

public class DemoHomePage{
	public DemoHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	private WebElement userNameLink;

	@FindBy(name = "password")
	private WebElement passwordLink;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButtonLink;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement LogoutdropDownMenuLink;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logouLink;

	public WebElement getLogouLink() {
		return logouLink;
	}


	public WebElement getLogoutdropDownMenuLink() {
		return LogoutdropDownMenuLink;
	}
	

	public WebElement getUserNameLink() {
		return userNameLink;
	}

	public WebElement getPasswordLink() {
		return passwordLink;
	}

	public WebElement getSubmitButtonLink() {
		return submitButtonLink;
	}

}
