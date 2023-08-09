package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath = "//select[@id=\"ddlFinYear\"]")
	WebElement finacialyear;
	
	@FindBy(xpath = "//input[@id=\"txtUsername\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@id=\"txtPassword\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@id=\"btnLogin\"]")
	WebElement lgn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public SearchPage logeeeee(String fn,String un,String pwd) throws Exception {
		finacialyear.sendKeys("fn");
		Thread.sleep(2000);
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		lgn.click();
		Thread.sleep(4000);
		return new SearchPage();
		
	}

}
