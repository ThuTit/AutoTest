package com.selenium.emoney.func.high.frontend;

import org.selenium.common.UnitBase;
import org.selenium.emoney.admin.common.Admin_HomePage;
import org.selenium.emoney.admin.common.Admin_QuanLyNguoiDung;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_HoSoNguoiDung;
import org.selenium.emoney.frontEnd.common.FrontEnd_HomePage;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.readData.BuuCucDatabase;
import org.selenium.emoney.readData.DistrictDatabase;
import org.selenium.emoney.readData.ProvinceDatabase;
import org.selenium.emoney.readData.StaffInfoDatabase;
import org.selenium.emoney.readData.StaffRolesDatabase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class TestConfig2 extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	Emoney_Configuration config;
	FrontEnd_HoSoNguoiDung hsnd;
	FrontEnd_HomePage hp;
	Admin_HomePage adHp;
	Admin_QuanLyNguoiDung adQLND;
	
	//Database
	StaffInfoDatabase staffInfo;
	StaffRolesDatabase staffRoles;
	ProvinceDatabase provinceList;
	DistrictDatabase districtList;
	BuuCucDatabase buuCucList;
	
	
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
		hp = new FrontEnd_HomePage(driver);
		hsnd = new FrontEnd_HoSoNguoiDung(driver);
		adHp = new Admin_HomePage(driver);
		adQLND = new Admin_QuanLyNguoiDung(driver);
		
		//Database
		staffInfo = new StaffInfoDatabase();
		staffRoles = new StaffRolesDatabase();
		provinceList = new ProvinceDatabase();
		districtList = new DistrictDatabase();
		buuCucList = new BuuCucDatabase();
		
		info("End setUpBeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() throws TestLinkAPIException{
		info("Start afterMethod");
		driver.manage().deleteAllCookies();
		driver.quit();
		info("End setUpBeforeClass");
	}

}
