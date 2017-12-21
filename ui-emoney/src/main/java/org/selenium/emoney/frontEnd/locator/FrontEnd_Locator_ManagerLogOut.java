package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_ManagerLogOut extends UnitBase{

	//Login
	public By ELEMENT_LOGIN_BTN = By.xpath(".//*[@id='login-in-form']//button[contains(@class,'signup')]");
	public By ELEMENT_LOGIN_EMAIL_FIELD = By.xpath(".//*[@id='id_username']");
	public By ELEMENT_LOGIN_PASSWORD_FIELD = By.xpath(".//*[@id='id_password']");
	public String ELEMENT_HEADERBAR_STAFF_INFO_NAME="//*[@class='info']//strong[text()='$fullName']";
	public String ELEMENT_HEADERBAR_STAFF_INFO_BUUCUC="//*[@class='info'][contains(.,'$buucuc')]";
	
	
	//Logout
	public By ELEMENT_LOGOUT_BTN=By.xpath("//a[@href='/logout/']");
	
	//Forgot password
	public By ELEMENT_FORGOTPASSWORD_LINK=By.xpath("//*[@href='/reset_password/']");
	public By ELEMENT_FORGOTPASSWORD_EMAIL_FIELD=By.xpath(".//*[@id='id_email']");
	public By ELEMENT_FORGOTPASSWORD_SUBMIT_BTN=By.xpath(".//*[@id='login-in-form']//button");
	public final By FORGOTPASSWORD_NEWPASSWORD=By.xpath(".//*[@id='id_new_password1']");
	public final By FORGOTPASSWORD_CONFIRMPASSWORD=By.xpath(".//*[@id='id_new_password2']");

    //message
	public String ELEMENT_LOGIN_MESSAGE=".//*[contains(text(),'$mess')]";
	
	//Login	
	public By ELEMENT_LOGIN_USERNAME_FIELD = By.xpath(".//*[@id='id_username']");	

}
