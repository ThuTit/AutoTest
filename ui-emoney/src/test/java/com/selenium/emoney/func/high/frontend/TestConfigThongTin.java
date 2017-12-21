package com.selenium.emoney.func.high.frontend;

import org.selenium.common.UnitBase;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.frontEnd.common.FrontEnd_ThongTinTaiKhoan;
import org.selenium.emoney.readData.AccountDetailDatabase;
import org.selenium.emoney.readData.AuthorizedPersonDatabase;
import org.selenium.emoney.readData.MessageDatabase;
import org.selenium.emoney.readData.ProvinceDatabase;
import org.selenium.emoney.frontEnd.common.FrontEnd_HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.info;

public class TestConfigThongTin extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	
	FrontEnd_HomePage hp;
	FrontEnd_ThongTinTaiKhoan thongtin;
	
	MessageDatabase mesg;
	AccountDetailDatabase accDetail;
	ProvinceDatabase provinceList;
	AuthorizedPersonDatabase authoList;
	Emoney_Configuration config;
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest("Chrome");
		
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
		mgLogInOut.login(config.USER_ADMIN,config.USER_PASS,true);
		
		hp = new FrontEnd_HomePage(driver);
		thongtin = new FrontEnd_ThongTinTaiKhoan(driver);
		config = new Emoney_Configuration();
		mesg = new MessageDatabase();
		mesg.setData(config.messageListFilePath,defaultSheet,isUseFile);
		
		accDetail = new AccountDetailDatabase();
		accDetail.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,config.sqlQuery);
		
		/*provinceList= new ProvinceDatabase();
		provinceList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryProvince);
		
		authoList= new AuthorizedPersonDatabase();
		authoList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryAuthorizedPerson);*/
		
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
