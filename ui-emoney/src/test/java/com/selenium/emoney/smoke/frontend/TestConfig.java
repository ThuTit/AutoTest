package com.selenium.emoney.smoke.frontend;

import org.selenium.common.UnitBase;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.selenium.emoney.readData.AccountDetailDatabase;
import org.selenium.emoney.readData.AccountDetailNoCardDatabase;
import org.selenium.emoney.readData.AccountWidthdrawDetailDatabase;
import org.selenium.emoney.readData.AuthorizedPersonDatabase;
import org.selenium.emoney.readData.CardNotLinkDatabase;
import org.selenium.emoney.readData.LoaiGiaoDichDatabase;
import org.selenium.emoney.readData.MessageDatabase;
import org.selenium.emoney.readData.ProvinceDatabase;
import org.selenium.emoney.readData.StaffInfoDatabase;
import org.selenium.emoney.readData.TrangThaiGiaoDichDatabase;
import org.selenium.emoney.readData.TransactionInfoDatabase;
import org.selenium.emoney.frontEnd.common.FrontEnd_HomePage;
import org.selenium.emoney.frontEnd.common.FrontEnd_QuanLyGiaoDich;
import org.selenium.emoney.frontEnd.common.FrontEnd_QuanLyUyQuyen;
import org.selenium.emoney.frontEnd.common.FrontEnd_RutTien;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import static org.selenium.common.TestLogger.*;

public class TestConfig extends UnitBase{
	
	FrontEnd_ManageLogInOut mgLogInOut;
	
	FrontEnd_HomePage hp;
	//FrontEnd_ThongTinTaiKhoan thongtin;
	FrontEnd_QuanLyGiaoDich qlgiaodich;
	//DienSuVuFrontEnd qldiensuvu;
	FrontEnd_QuanLyUyQuyen qlUyQuyen;
	FrontEnd_RutTien rutTien;
	
	MessageDatabase mesg;
	AccountDetailDatabase accDetail;
	ProvinceDatabase provinceList;
	AuthorizedPersonDatabase authoList;
	AccountDetailNoCardDatabase accDetailNoCard;
	CardNotLinkDatabase cardNotLink;
	StaffInfoDatabase staffInfo;
	AccountWidthdrawDetailDatabase accWidthdraw;
	TransactionInfoDatabase transactionList;
	
	LoaiGiaoDichDatabase typeGD;
	TrangThaiGiaoDichDatabase statusGD;
	Emoney_Configuration config;
	//ThongTinTaiKhoan tttk;
	
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest("Chrome");
		
		//login
		mgLogInOut = new FrontEnd_ManageLogInOut(driver);
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		
		hp = new FrontEnd_HomePage(driver);
		//thongtin = new FrontEnd_ThongTinTaiKhoan(driver);
		qlgiaodich = new FrontEnd_QuanLyGiaoDich(driver);
		qlUyQuyen = new FrontEnd_QuanLyUyQuyen(driver);
		//qldiensuvu = new DienSuVuFrontEnd(driver);
		rutTien = new FrontEnd_RutTien(driver);
		config = new Emoney_Configuration();
		config.getSystemProperty();
		//tttk = new ThongTinTaiKhoan(driver);
		mesg = new MessageDatabase();
		mesg.setData(config.messageListFilePath,defaultSheet,isUseFile);
		
		/*accDetail = new AccountDetailDatabase();
		accDetail.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,config.sqlQuery);
		
		provinceList= new ProvinceDatabase();
		provinceList.setData("","",false,config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryProvince);
		
		authoList= new AuthorizedPersonDatabase();
		authoList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryAuthorizedPerson);
		
		accDetailNoCard = new AccountDetailNoCardDatabase();
		accDetailNoCard.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryAccountNoCard);
		
		cardNotLink = new CardNotLinkDatabase();
		cardNotLink.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryCardNotLink);
		
		staffInfo = new StaffInfoDatabase();
		
		accWidthdraw = new AccountWidthdrawDetailDatabase();
		accWidthdraw.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryAccWidthdraw);
		
		typeGD = new LoaiGiaoDichDatabase();
		typeGD.setData(config.typeGDListFilePath,defaultSheet,isUseFile);
		
		statusGD = new TrangThaiGiaoDichDatabase();
        statusGD.setData(config.statusGDListFilePath,defaultSheet,isUseFile);*/
		
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
