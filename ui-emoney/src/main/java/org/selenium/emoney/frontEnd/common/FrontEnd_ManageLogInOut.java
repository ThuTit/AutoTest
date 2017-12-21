package org.selenium.emoney.frontEnd.common;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.*;
import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.*;

public class FrontEnd_ManageLogInOut extends FrontEnd_Locator_ManagerLogOut{

	
	public FrontEnd_ManageLogInOut(WebDriver dr){
		driver = dr;
	}
	
	/**
	 * Input User
	 * @param username
	 * @throws TestLinkAPIException 
	 */
	public void inputUser(String username) throws TestLinkAPIException{
		info ("Nhập username");
		if ( username != "") 
			type(ELEMENT_LOGIN_USERNAME_FIELD, username, true);
		Utils.pause(100);
		
	}
	
	/**
	 * Input Pasword
	 * @param pass
	 * @throws TestLinkAPIException 
	 */
	public void inputPass(String pass) throws TestLinkAPIException{
		info ("Nhập password");
		if ( pass != "" ) 
			type(ELEMENT_LOGIN_PASSWORD_FIELD, pass, true);
		Utils.pause(100);
	}
	
	
	/**
	 * Click vào nút Đăng nhập
	 * @throws TestLinkAPIException 
	 * 
	 */
	public void login_btn() throws TestLinkAPIException{
		info ("Click vào nút login");
		click(ELEMENT_LOGIN_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút logout
	 * @throws TestLinkAPIException 
	 * 
	 */
	public void logout_btn() throws TestLinkAPIException{
		info ("User logout hệ thống");
		click(ELEMENT_LOGOUT_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào link Quên mật khẩu
	 * @throws TestLinkAPIException 
	 * 
	 */
	public void goToForgotPassword() throws TestLinkAPIException{
		info("Mở trang Quên mật khẩu");
		click(ELEMENT_FORGOTPASSWORD_LINK);
		Utils.pause(100);
	}
	
	/**
	 * Input Email 
	 * @param email
	 * @throws TestLinkAPIException 
	 */
	public void inputEmail(String email) throws TestLinkAPIException{
		info ("Nhập email ");
		if ( email != "") 
			type(ELEMENT_FORGOTPASSWORD_EMAIL_FIELD, email, true);
		Utils.pause(100);
	}
	/**
	 * Forget button
	 * @throws TestLinkAPIException 
	 */
	public void forgot_btn() throws TestLinkAPIException{
		info ("Click vào nút send");
		click(ELEMENT_FORGOTPASSWORD_SUBMIT_BTN);
	    Utils.pause(100);
		
	}
	/**
	 * Verify message
	 * @param message
	 * @throws TestLinkAPIException 
	 */
	public void verifyMessage(String message) throws TestLinkAPIException{
		info ("verify message hiển thị");
		waitForAndGetElement(ELEMENT_LOGIN_MESSAGE.replace("$mess", message), 3000, 1);
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
		waitForAndGetElement(ELEMENT_LOGIN_BTN, 3000, 1);
		info("login form is shown");
		info("login normally with email/HPID " + username + " and pass "
				+ password);
		inputUser(username);
		inputPass(password);
		login_btn();
		if (verify)
			waitForElementNotPresent(ELEMENT_LOGIN_BTN,1000,1);

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
			waitForAndGetElement(ELEMENT_LOGIN_BTN,1000,1);
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
			waitForAndGetElement(ELEMENT_LOGIN_BTN,1000,1);
		info("Eding forgot password the system");
	}
	/**
	 * Nhập password mới để change password
	 * @param newPass
	 * @param confirmPass
	 * @throws TestLinkAPIException
	 */
	public void resetPassword(String newPass,String confirmPass,String parentWindow) throws TestLinkAPIException{
		info("parentWindow:"+parentWindow);
		Set<String> handlers=driver.getWindowHandles(); 
		//Handler will have all the three window handles
		for(String windowHandle  : handlers){
		     driver.switchTo().window(windowHandle);
		     info("windowHandle"+windowHandle);
		     //If it is not the parent window it will close the child window 
		     if(!windowHandle.contains(parentWindow)){
		    	 info("title:"+driver.getTitle());
		    	 if(driver.getTitle().contains("Đặt lại mật khẩu")){
		    		driver.switchTo().window(windowHandle);
		    		info("windowHandle"+windowHandle);
		    		info("Nhập new password là:"+newPass);
	    			type(FORGOTPASSWORD_NEWPASSWORD,newPass,true);
	    			info("Nhập confirm password là:"+confirmPass);
	    			type(FORGOTPASSWORD_CONFIRMPASSWORD,confirmPass,true);
		 			forgot_btn();
		    	 }
		     }
	    }
	}
	/**
	 * Kiểm tra thông tin user trên header bar góc trên bên phải
	 * @param fullname
	 * @param buucucInfo
	 * @throws TestLinkAPIException
	 */
	public void verifyUserInfHeaderBar(String fullname,String buucucInfo) throws TestLinkAPIException{
		if(fullname!=""){
			info("Kiểm tra fullname của user");
			waitForAndGetElement(ELEMENT_HEADERBAR_STAFF_INFO_NAME.replace("$fullName",fullname),3000,1); 
		}
		if(buucucInfo!=""){
			info("Kiểm tra cấp bưu cục của user");
			waitForAndGetElement(ELEMENT_HEADERBAR_STAFF_INFO_BUUCUC.replace("$buucuc",buucucInfo),3000,1);
		}
	}
}
