package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class MasterNonEmpPage extends Base{
	
	@FindBy(xpath = "//a[normalize-space()=\"Masters\"]")
	WebElement master;
	
	@FindBy(xpath = "//a[normalize-space()=\"Deductee (Employee)\"]")
	WebElement employe;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtEmployeeName\"]")
	WebElement name1;
	
	@FindBy(xpath = "//select[@id=\"ctl00_contentPlaceHolderBody_ddlState\"]")
	WebElement state2;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_dateFromDate\"]")
	WebElement fromdate3;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_dateToDate\"]")
	WebElement todate4;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_txtPanReference\"]")
	WebElement pan5;
	
	@FindBy(xpath = "//input[@id=\"ctl00_contentPlaceHolderBody_btnSave\"]")
	WebElement save;
	
	public MasterNonEmpPage( ) {
		PageFactory.initElements(driver, this);
	}
	
	public DeductionPage maaaaaa(String name,String state,String fdate,String tdate,String pan) throws Exception {
		Actions action=new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(2000);
		action.moveToElement(employe).build().perform();
		Thread.sleep(2000);
		employe.click();
		Thread.sleep(2000);
		name1.sendKeys("name");
		Thread.sleep(2000);
		state2.sendKeys("state");
		Thread.sleep(2000);
		fromdate3.sendKeys(fdate);
		Thread.sleep(2000);
		todate4.sendKeys(tdate);
		Thread.sleep(2000);
		pan5.sendKeys("pan");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		return new DeductionPage();
		
	}

}
