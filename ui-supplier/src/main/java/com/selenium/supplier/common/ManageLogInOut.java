package com.selenium.supplier.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.common.UnitBase;
import org.selenium.common.Utils;
import static org.selenium.common.TestLogger.*;

public class ManageLogInOut extends UnitBase {

	//Form login
	public final By ELEMENT_GMAIL_USERNAME = By.xpath("//*[@type='email']");
	public final By ELEMENT_GMAIL_NEXT_BTN=By.xpath(".//*[contains(@id,'Next')]");
	public final By ELEMENT_GMAIL_PASS = By.xpath("//*[@type='password']");
	public final By ELEMENT_GMAIL_SIGN_IN = By.id("signIn");
	
		
	public ManageLogInOut(WebDriver dr) {
		driver = dr;
	}

	/**
	 * Nhập username
	 * 
	 * @param username
	 */
	public void inputUser(String username)  {
		if (waitForAndGetElement(ELEMENT_GMAIL_USERNAME, 2000, 0) != null) {
			info("Nhập username");
			type(ELEMENT_GMAIL_USERNAME, username, true);
		}
	}

	/**
	 * Nhập Password
	 * 
	 * @param pass
	 */
	public void inputPass(String pass)  {
		if (waitForAndGetElement(ELEMENT_GMAIL_PASS, 2000, 0) != null) {
			info("Nhập password");
			type(ELEMENT_GMAIL_PASS, pass, true);
		}
	}

	/**
	 * Click vào nút next button
	 */
	public void next_btn()  {
		info("Click vào nút next");
		click(ELEMENT_GMAIL_NEXT_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Sign in
	 */
	public void signin_btn()  {
		info("Click vào nút next");
		click(ELEMENT_GMAIL_SIGN_IN);
		Utils.pause(100);
	}


	/**
	 * Login the system
	 * 
	 * @param email
	 * @param password
	 * @param opParams
	 */
	public void login(String username, String password, Boolean... opParams){
		info("Starting sign in the system");
		Boolean verify = (Boolean) (opParams.length > 0 ? opParams[0] : false);
		info("Open Login form");
		info("login form is shown");
		info("login normally with email/HPID " + username + " and pass "
				+ password);
		inputUser(username);
		next_btn();
		inputPass(password);
		next_btn();
		if (verify)
			waitForElementNotPresent(ELEMENT_GMAIL_SIGN_IN);

		info("Eding sign in the system");
	}

}
