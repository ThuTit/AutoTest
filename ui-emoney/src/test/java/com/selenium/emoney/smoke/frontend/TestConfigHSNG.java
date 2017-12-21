package com.selenium.emoney.smoke.frontend;

import org.selenium.common.UnitBase;
import org.selenium.emoney.admin.common.Admin_HomePage;
import org.selenium.emoney.admin.common.Admin_QuanLyNguoiDung;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.readData.BuuCucDatabase;
import org.selenium.emoney.readData.DistrictDatabase;
import org.selenium.emoney.readData.MessageDatabase;
import org.selenium.emoney.readData.ProvinceDatabase;
import org.selenium.emoney.readData.StaffInfoDatabase;
import org.selenium.emoney.readData.StaffRolesDatabase;
import org.selenium.emoney.frontEnd.common.FrontEnd_HoSoNguoiDung;
import org.selenium.emoney.frontEnd.common.FrontEnd_HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.selenium.common.TestLogger.*;

public class TestConfigHSNG extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	FrontEnd_HoSoNguoiDung hsnd;
	FrontEnd_HomePage hp;
	Admin_HomePage admin;
	Admin_QuanLyNguoiDung qlNgDung;
	
	MessageDatabase mesg;
	StaffInfoDatabase staffInfo;
	StaffRolesDatabase staffRoles;
	ProvinceDatabase provinceList;
	DistrictDatabase districtList;
	BuuCucDatabase buuCucList;
	Emoney_Configuration config;
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest("Chrome");
		
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
		hsnd = new FrontEnd_HoSoNguoiDung(driver);
		hp = new FrontEnd_HomePage(driver);
		admin = new Admin_HomePage(driver);
		qlNgDung = new Admin_QuanLyNguoiDung(driver);
		config = new Emoney_Configuration();
		config.getSystemProperty();
		mesg = new MessageDatabase();
		mesg.setData(config.messageListFilePath,defaultSheet,isUseFile);
		
		staffInfo = new StaffInfoDatabase();
		staffRoles = new StaffRolesDatabase();
		
	   /* provinceList = new ProvinceDatabase();
	    provinceList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hp.sqlQueryProvince);*/
	    
	    districtList = new DistrictDatabase();
	    buuCucList = new BuuCucDatabase();
	    
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
