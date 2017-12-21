package org.selenium.emoney.func.high.admin;
import org.selenium.common.UnitBase;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.common.Admin_HomePage;
import org.selenium.emoney.admin.common.Admin_ManageLogInOut;
import org.selenium.emoney.admin.common.Admin_QuanLyNguoiDung;
import org.selenium.emoney.common.Emoney_Configuration;
import org.selenium.emoney.frontEnd.common.FrontEnd_ManageLogInOut;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class Func_High_Admin_CreateTestUsers extends UnitBase{

	Admin_ManageLogInOut mgLogInOut;
	FrontEnd_ManageLogInOut mgFELoginOut;
	Admin_HomePage maghp;
	Admin_QuanLyNguoiDung magQLND;
	Emoney_Configuration config;
	
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception{
		info("Start setUpBeforeMethod");
		initSeleniumTest();
		//login
		mgLogInOut = new Admin_ManageLogInOut(driver);
		mgFELoginOut = new FrontEnd_ManageLogInOut(driver);
		
		config = new Emoney_Configuration();
		config.getSystemProperty();
		
		//Quản lý người dùng
		magQLND = new Admin_QuanLyNguoiDung(driver);
		maghp = new Admin_HomePage(driver);
		
		info("End setUpBeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		info("Start afterMethod");
		driver.manage().deleteAllCookies();
		driver.quit();
		info("End setUpBeforeClass");
	}
	/**
	 * Tạo user cấp tổng
	 * @throws TestLinkAPIException
	 */
	@Test
	public void TC01_createTestUsersLevel1() throws TestLinkAPIException{
		info("Create user cấp tổng");
		testCaseID="EM-333";
		String userName="staff03";
		String firstName="tester";
		String lastName="qc 03";
		String birthday="10/10/1975";
		String cmnd=getRandomNumber()+getRandomNumber();
		String postCode=getRandomNumber();
		String email=userName+"@gmail.com";
		String phone=getRandomNumber()+getRandomNumber();
		String role="Admin";
		
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		maghp.goToQuanLyNguoiDung();
		magQLND.goToCreateNewUser();
		magQLND.inputUserName(userName);
		magQLND.inputFirstName(firstName);
		magQLND.inputLastName(lastName);
		magQLND.inputBirthday(birthday);
		magQLND.inputCMND(cmnd);
		magQLND.inputPostCode(postCode);
		magQLND.inputEmail(email);
		magQLND.inputPhone(phone);
		magQLND.inputRole(role);
		magQLND.create_btn();
		
		info("Change password");
		info("Vào quản lý người dùng");
		maghp.goToQuanLyNguoiDung();
		info("Search thông tin người dùng");
		magQLND.inputSearchUserName(config.USER_STAFF_03);
		magQLND.search_btn();
		info("Xem thông tin người dùng");
		magQLND.goToUserDetail(config.USER_STAFF_03);
		info("Đặt lại mật khẩu");
		magQLND.goToResetPassword();
		magQLND.inputNewPassword(config.USER_PASS);
		magQLND.inputConfirmPassword(config.USER_PASS);
		magQLND.updatePassword_btn();
		
		mgLogInOut.logout();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Utils.pause(1000);
		info("Login voi a normal user");
		mgFELoginOut.login(config.USER_STAFF_03, config.USER_PASS,true);
	}
	
	/**
	 * Tạo user cấp tỉnh
	 * @throws TestLinkAPIException
	 */
	@Test
	public void TC02_createTestUsersLevel2() throws TestLinkAPIException{
		info("Create user cấp tổng");
		testCaseID="EM-335";
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		maghp.goToQuanLyNguoiDung();
		magQLND.goToCreateNewUser();
	}
	
	/**
	 * Tạo user cấp huyện
	 * @throws TestLinkAPIException
	 */
	@Test
	public void TC03_createTestUsersLevel3() throws TestLinkAPIException{
		info("Create user cấp tổng");
		testCaseID="EM-336";
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		maghp.goToQuanLyNguoiDung();
		magQLND.goToCreateNewUser();
	}
	
	/**
	 * Tạo user cấp tổng
	 * @throws TestLinkAPIException
	 */
	@Test
	public void TC04_createTestUsersLevel4() throws TestLinkAPIException{
		info("Create user cấp tổng");
		testCaseID="EM-337";
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		maghp.goToQuanLyNguoiDung();
		magQLND.goToCreateNewUser();
	}
}
