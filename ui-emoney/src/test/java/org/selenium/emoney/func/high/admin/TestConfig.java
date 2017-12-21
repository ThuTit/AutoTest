package org.selenium.emoney.func.high.admin;

import org.selenium.common.UnitBase;
import org.selenium.emoney.admin.common.Admin_HomePage;
import org.selenium.emoney.admin.common.Admin_QuanLyNhomQuyen;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.readData.PermissionDatabase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.*;

public class TestConfig extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	
	PermissionDatabase PerListData;
	Admin_HomePage magPerHomePage;
	Admin_QuanLyNhomQuyen mangPermission;
	Emoney_Configuration config;
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest("Chrome");
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		config = new Emoney_Configuration();
		config.getSystemProperty();
		
		//Quản lý nhóm quyền
		mangPermission= new Admin_QuanLyNhomQuyen(driver);
		magPerHomePage = new Admin_HomePage(driver);
		PerListData = new PermissionDatabase();
		PerListData.setData(config.permissionListFilePath,defaultSheet,isUseFile);
		
		info("End setUpBeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		info("Start afterMethod");
		driver.manage().deleteAllCookies();
		driver.quit();
		info("End setUpBeforeClass");
	}

}
