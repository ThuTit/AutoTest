package com.selenium.emoney.func.high.frontend;

import org.selenium.common.UnitBase;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.info;

public class TestConfig extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	Emoney_Configuration config;
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		//init driver, common configuration of all projects
		initSeleniumTest();
		
		//call configuration of Emoney project
		config = new Emoney_Configuration();
		config.getSystemProperty();
		
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
		
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
