package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import util.utilities;

public class LoginPageTest extends Base{
	
	LoginPageTest(){
		super();
	}
	
	public LoginPage lgn;
	public utilities util;
	public String sheetname="Sheet1";
	
	@BeforeMethod
	public void SetUp() {
		launchBrowser();
		lgn=new LoginPage();
		util=new utilities();
		
		
	}
	@DataProvider(name ="getExcelTestData")
	public Object[][]getExcelTestData(){
		Object data[][]=util.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "getExcelTestData")
	public void logins(String financialyear,String username,String password) throws Exception {
		lgn.logeeeee(financialyear, username, password);
		
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
