package org.selenium.emoney.admin.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_Locator_ManageLogInOut;
import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.*;

public class Admin_ManageLogInOut extends Admin_Locator_ManageLogInOut {

	public Admin_ManageLogInOut(WebDriver dr) {
		driver = dr;
	}

	/**
	 * Nhập username
	 * 
	 * @param username
	 * @throws TestLinkAPIException
	 */
	public void inputUser(String username) throws TestLinkAPIException {
		if (waitForAndGetElement(ADMIN_LOGIN_USERNAME, 2000, 0) != null) {
			info("Nhập username");
			type(ADMIN_LOGIN_USERNAME, username, true);
		}
	}

	/**
	 * Nhập Password
	 * 
	 * @param pass
	 * @throws TestLinkAPIException
	 */
	public void inputPass(String pass) throws TestLinkAPIException {
		if (waitForAndGetElement(ADMIN_LOGIN_USERNAME, 2000, 0) != null) {
			info("Nhập password");
			type(ADMIN_LOGIN_PASSWORD, pass, true);
		}
	}

	/**
	 * Click vào nút Đăng nhập
	 * 
	 * @throws TestLinkAPIException
	 */
	public void login_btn() throws TestLinkAPIException {
		info("Click vào nút Login");
		click(ADMIN_LOGIN_DANGNHAP_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Log out
	 * 
	 * @throws TestLinkAPIException
	 */
	public void logout_btn() throws TestLinkAPIException {
		info("Click vào nút Logout");
		click(ADMIN_LOGOUT_DANGXUAT_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào link quên mật khẩu
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToForgotPassword() throws TestLinkAPIException {
		info("Click vào link Quên Mật Khẩu");
		click(ADMIN_LOGIN_QUENMATKHAU);
		Utils.pause(100);
	}

	/**
	 * Nhập email
	 * 
	 * @param email
	 * @throws TestLinkAPIException
	 */
	public void inputEmail(String email) throws TestLinkAPIException {
		if (waitForAndGetElement(ADMIN_FORGOT_EMAIL, 2000, 0) != null) {
			info("Nhập email");
			type(ADMIN_FORGOT_EMAIL, email, true);
		}
	}

	/**
	 * Click vào nút Gửi
	 * 
	 * @throws TestLinkAPIException
	 */
	public void forgot_btn() throws TestLinkAPIException {
		info("Click vào nút Gửi");
		click(ADMIN_FORGOT_SEND_BTN);
		Utils.pause(2000);
	}

	/**
	 * Kiểm tra message được hiển thị
	 * 
	 * @param mesg
	 * @throws TestLinkAPIException
	 */
	public void verifyMessage(String mesg) throws TestLinkAPIException {
		info("Kiểm tra hiển thị message:" + mesg);
		waitForAndGetElement(ADMIN_MESSAGE_DISPLAY.replace("$mesg", mesg),
				3000, 1);
	}

	/**
	 * Login the system
	 * 
	 * @param email
	 * @param password
	 * @param opParams
	 * @throws TestLinkAPIException
	 */
	public void login(String username, String password, Boolean... opParams)
			throws TestLinkAPIException {
		info("Starting sign in the system");
		Boolean verify = (Boolean) (opParams.length > 0 ? opParams[0] : false);
		info("Open Login form");
		waitForAndGetElement(ADMIN_LOGIN_USERNAME, 3000, 1);
		info("login form is shown");
		info("login normally with email/HPID " + username + " and pass "
				+ password);
		inputUser(username);
		inputPass(password);
		login_btn();
		if (verify)
			waitForElementNotPresent(ADMIN_LOGIN_USERNAME);

		info("Eding sign in the system");
	}

	/**
	 * Logout the system
	 * 
	 * @param opParams
	 * @throws TestLinkAPIException
	 */
	public void logout(Boolean... opParams) throws TestLinkAPIException {
		info("Starting sign out the system");
		Boolean verify = (Boolean) (opParams.length > 0 ? opParams[0] : false);
		logout_btn();
		if (verify)
			waitForAndGetElement(ADMIN_LOGIN_USERNAME);
		info("Eding sign out the system");
	}

	/**
	 * forgot password
	 * 
	 * @param email
	 * @param opParams
	 * @throws TestLinkAPIException
	 */
	public void forgot(String email, Boolean... opParams)
			throws TestLinkAPIException {
		info("Starting forgot pasword in the system");
		Boolean verify = (Boolean) (opParams.length > 0 ? opParams[0] : false);

		info("Open forgot password form");
		goToForgotPassword();
		info("forgot password form is shown");
		inputEmail(email);
		forgot_btn();
		if (verify)
			waitForAndGetElement(ADMIN_LOGIN_USERNAME);
		info("Eding forgot password the system");
	}
}
