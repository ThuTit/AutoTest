package com.selenium.emoney.smoke.admin;

import java.io.IOException;

import org.selenium.common.UnitBase;
import org.selenium.emoney.admin.common.Admin_HomePage;
import org.selenium.emoney.admin.common.Admin_ManageLogInOut;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.readData.MessageDatabase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.*;

public class TestConfig extends UnitBase{
	
	Admin_ManageLogInOut mgLogInOut;
	MessageDatabase mesg;
	Emoney_Configuration config;
	Admin_HomePage hpAdmin;
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest();
		
		//login
		mgLogInOut = new Admin_ManageLogInOut(driver);
		mgLogInOut.login(config.USER_ADMIN,config.USER_PASS,true);
		
		hpAdmin = new Admin_HomePage(driver);
		
		config = new Emoney_Configuration();
		config.getSystemProperty();
		
		mesg = new MessageDatabase();
		mesg.setData(config.messageListFilePath,defaultSheet,isUseFile);
		
		info("End setUpBeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		info("Start afterMethod");
		driver.manage().deleteAllCookies();
		driver.quit();
		info("End setUpBeforeClass");
	}

}
