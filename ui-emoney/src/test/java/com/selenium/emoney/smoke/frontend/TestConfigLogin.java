package com.selenium.emoney.smoke.frontend;

import java.io.IOException;

import org.selenium.common.UnitBase;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.readData.MessageDatabase;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.*;

public class TestConfigLogin extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	MessageDatabase mesg;
	Emoney_Configuration config;
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest("Chrome");
		
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
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
