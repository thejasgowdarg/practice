package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SearchPage extends Base{
	
	@FindBy(xpath = "//input[@id=\"txtSearch\"]")
	WebElement search;
	
	@FindBy(xpath = "//input[@id=\"imgSearch\"]")
    WebElement searchicon;
	
	@FindBy(xpath = "//option[@value=\"1678\"]")
	WebElement branch;
	
	@FindBy(xpath = "//input[@id=\"btnSelect\"]")
	WebElement select;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	public MasterNonEmpPage seeeeeeee(String bcode) throws Exception {
		search.sendKeys(bcode);
		Thread.sleep(2000);
		searchicon.click();
		Thread.sleep(2000);
		branch.click();
		Thread.sleep(2000);
		select.click();
		Thread.sleep(4000);
		return new MasterNonEmpPage();
		
	}

}
