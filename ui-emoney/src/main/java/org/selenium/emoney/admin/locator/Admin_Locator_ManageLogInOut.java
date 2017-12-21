package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_ManageLogInOut extends UnitBase{

	//Form login
	public final By ADMIN_LOGIN_USERNAME=By.xpath(".//*[@id='id_username']");
	
	public final By ADMIN_LOGIN_PASSWORD=By.xpath(".//*[@id='id_password']");
	
	public final By ADMIN_LOGIN_DANGNHAP_BTN=By.xpath(".//*[@id='login-in-form']//*[@type='submit']");
	
	public final By ADMIN_LOGIN_QUENMATKHAU=By.xpath("//*[@href='/reset_password/']");
	
	// form forgot password
	public final By ADMIN_FORGOT_EMAIL=By.xpath("");
	
	public final By ADMIN_FORGOT_SEND_BTN=By.xpath("");
	
	//Logout
	public final By ADMIN_LOGOUT_DANGXUAT_BTN=By.xpath("//*[@href='/logout/']");
	
	//Message
	public final String ADMIN_MESSAGE_DISPLAY=".//*[contains(text(),'$mesg')]";
}
