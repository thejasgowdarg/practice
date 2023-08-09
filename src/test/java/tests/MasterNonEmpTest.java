package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import pages.MasterNonEmpPage;
import pages.SearchPage;
import util.utilities;

public class MasterNonEmpTest extends Base{
	
	
	
	
	public LoginPage lgn;
	public utilities util;
	public SearchPage srch;
	public MasterNonEmpPage mrsp;
	public String sheetname="Sheet3";
	
	MasterNonEmpTest(){
		super();
		
	}
	@BeforeClass
	public void setup() throws Exception {
		launchBrowser();
		lgn=new LoginPage();
		util=new utilities();
		srch=new SearchPage();
		mrsp=new MasterNonEmpPage();
		lgn.logeeeee(prop.getProperty("financialyear"), prop.getProperty("username"), prop.getProperty("password"));
		srch.seeeeeeee(prop.getProperty("bcode"));
	}
	@DataProvider(name ="data1")
	public Object[][]getdata(){
		Object data[][]=util.excelData(sheetname);
		return data;
	}
	@Test(dataProvider = "data1")
	public void mastes(String name,String state,String referanceno,String employmentfrom,String employmentto,String pan) throws Exception {
		mrsp.maaaaaa(name, state, state, state, pan);
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
