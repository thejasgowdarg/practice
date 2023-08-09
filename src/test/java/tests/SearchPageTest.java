package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import pages.SearchPage;
import util.utilities;


public class SearchPageTest extends Base{
	
	public LoginPage lgn;
	public utilities util;
	public SearchPage srch;
	public String sheetname="Sheet2";
	
	SearchPageTest(){
		super();
	}
	@BeforeMethod
	public void setup() throws Exception {
		launchBrowser();
		lgn=new LoginPage();
		util=new utilities();
		srch=new SearchPage();
		lgn.logeeeee(prop.getProperty("financialyear"), prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@DataProvider(name ="data")
	public Object[][] getdata(){
		Object data[][]=util.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "data")
	public void seareee(String bcode) throws Exception {
		srch.seeeeeeee(bcode);
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

}
