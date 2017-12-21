package com.selenium.emoney.smoke.frontend;

import java.io.IOException;

import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class Smoke_FrontEnd_Login extends TestConfigLogin {
	/**
	 * Testcase ID: Login_001
	 * Test case: Kiểm tra login thành công
	 * Steps:
	 * 1. Mở trang
	 * 2. Input valid username and password
	 * 3. Click on Submit button
	 * Expected:
	 * Login thành công với đúng account đăng nhập
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	@Test
	public void Login_001_LoginSuccess() throws IOException, TestLinkAPIException{
		info("Kiểm tra login thành công");
		testCaseID="EM-1";
		info("Step1: Mở trang");
		info("Step2-3: Input valid username and password, click nút sumbit");
		mgLogInOut.login(config.USER_ADMIN, config.USER_PASS,true);
		info("Step4: Kiểm tra việc đăng nhập thành công ");
		waitForAndGetElement(mgLogInOut.ELEMENT_HEADERBAR_STAFF_INFO_NAME.replace("$fullName",config.USER_ADMIN_NAME),3000,1);
		waitForAndGetElement(mgLogInOut.ELEMENT_HEADERBAR_STAFF_INFO_BUUCUC.replace("$buucuc","VNPost"),3000,1);
	}
	
	/**
	 * Testcase ID: Login_002
	 * Test case: Kiểm tra login không thành thành công
	 * Steps:
	 * 1. Mở trang
	 * 2. Input invalid username and password
	 * 3. Click on Submit button
	 * Expected:
	 * Hiển thị thông báo lỗi, không thể đăng nhập thành công
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	@Test
	public void Login_002_LoginUnSuccess() throws IOException, TestLinkAPIException{
		info("Kiểm tra login không thành công");
		String message=mesg.getMessageByArrayTypeRandom(4);
		testCaseID="EM-2";
		info("Step1: Mở trang");
		info("Step2-3: Input invalid username and password, click nút sumbit");
		mgLogInOut.login("test", config.USER_PASS,false);
		info("Step4: Kiểm tra việc đăng nhập không thành công ");
		waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_MESSAGE.replace("$mess",message),3000,1);
	}
	
	/**
	 * Testcase ID: Login_003
	 * Test case: Kiểm tra forgot password không thành công
	 * Steps:
	 * 1. Mở trang
	 * 2. Click vào link Quên mật khẩu
	 * 3. Bỏ trống hoặc nhập sai format email
	 * Expected:
	 * Hiển thị thông báo lỗi
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	@Test
	public void Login_003_ForgotUnSuccess() throws IOException, TestLinkAPIException{
		info("Kiểm tra forgot password không thành công");
		String message=mesg.getMessageByArrayTypeRandom(5);
		info("Step1: Mở trang");
		info("Step2-3: Nhập sai format email và kiểm tra forgot password không thành công");
		mgLogInOut.forgot("test@gmail");
		waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_MESSAGE.replace("$mess",message),3000,1);
	}
	

}
