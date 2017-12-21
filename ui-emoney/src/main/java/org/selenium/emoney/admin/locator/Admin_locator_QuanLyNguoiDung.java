package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_locator_QuanLyNguoiDung extends UnitBase{
	
	//**********************************************SQL QUERY****************************************************\\
	
	
	//**********************************************LOCATOR****************************************************\\
	//Home page
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_USERNAME=By.xpath(".//*[@id='id_username']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_EMAIL=By.xpath(".//*[@id='id_email']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL2=By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL3=By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL4=By.xpath(".//*[@id='id_member_store_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_SEARCH_BTN=By.xpath(".//*[@id='main']//button[@type='submit']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_XEM_BTN=".//*[text()='$username']/..//*[@href]";
	
	public final By ADMIN_QUANLYNGUOIDUNG_TAONGUOIDUNG_BTN=By.xpath("//*[@href='/staff/create/']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_USERINFO="//*[text()='username']/..//*[text()='$name']/..//*[text()='$email']";
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER = By.xpath(".//button[@data-target='#createByFile']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CREATE_BTN = By.xpath(".//*[@id='mws-validate']//button[@type='submit']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CANCEL_BTN = By.xpath(".//*[@id='mws-validate']//a[contains(@class,'btn-close')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_USERNAME = By.xpath(".//*[@id='id_username']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_FIRSTNAME = By.xpath(".//*[@id='id_first_name']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_LASTNAME = By.xpath(".//*[@id='id_last_name']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_BIRTHDAY = By.xpath(".//*[@id='id_birthday']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CMND = By.xpath(".//*[@id='id_identification']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTCODE = By.xpath(".//*[@id='id_post_code']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_CHECKED = By.xpath(".//*[@id='id_status'][@checked='checked']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_UNCHECKED = By.xpath(".//*[@id='id_status' and not (@checked='checked')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_EMAIL = By.xpath(".//*[@id='id_email']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_PHONE = By.xpath(".//*[@id='id_phone_number']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_PROVINCE = By.xpath(".//*[@id='id_province']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_DISTRICT = By.xpath(".//*[@id='id_district']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL2 = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL3 = By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL4 = By.xpath(".//*[@id='id_member_store_id']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_ROLE = By.xpath(".//*[@id='selected_role_input-tokenfield']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_CREATEUSER_ROLE_LIST=".//*[contains(@id,'ui-id')][contains(text(),'$info')]";
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_UPLOAD_BTN = By.xpath(".//*[@id='create_by_file_submit']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_DONG_BTN = By.xpath(".//*[@id='file_create_staff_form']//button[contains(@class,'btn-close')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_CLOSE_BTN = By.xpath(".//*[@id='file_create_staff_form']//button[@class='close']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_UPDATE_BTN = By.xpath(".//*[@id='mws-validate']//button[@type='submit']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_DONG_BTN = By.xpath(".//*[@id='mws-validate']//a[contains(@class,'btn-close')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_RESETPASSWORD_BTN = By.xpath(".//*[@id='main']//button[@data-target='#changePassModal']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_USERNAME_VALUE = ".//*[@id='id_username'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_FIRSTNAME_VALUE = ".//*[@id='id_first_name'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_LASTNAME_VALUE = ".//*[@id='id_last_name'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_BIRTHDAY_VALUE = ".//*[@id='id_birthday'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_CMND_VALUE = ".//*[@id='id_identification'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_MABUUCUC_VALUE = ".//*[@id='id_post_code'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PINCODE_VALUE = ".//*[@id='id_pincode'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_EMAIL_VALUE = ".//*[@id='id_email'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PHONE_VALUE = ".//*[@id='id_phone_number'][@value='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PROVINCE_VALUE = ".//*[@id='id_province']//*[@selected='selected'][text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_DISTRICT_VALUE = ".//*[@id='id_district']//*[@selected='selected'][text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL1_VALUE = ".//*[@id='id_member_store_3g_id']//*[@selected='selected'][text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL2_VALUE = ".//*[@id='id_member_store_2g_id']//*[@selected='selected'][text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL3_VALUE = ".//*[@id='id_member_store_g_id']//*[@selected='selected'][text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL4_VALUE = ".//*[@id='id_member_store_id']//*[@selected='selected'][text()='$value']";
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_USERNAME_DISABLED = By.xpath(".//*[@id='id_username'][@readonly='true']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL1_DISABLED = By.xpath(".//*[@id='id_member_store_3g_id'][@disabled='disabled']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_ROLE_VALUE = ".//*[@id='mws-validate']//span[text()='$value']";
	
	public final String ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_ERROR_MESSAGE = ".//*[@class='errorlist']//*[text()='$value']";
	
	public final By ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_SUCCESS_MESSAGE = By.xpath(".//*[@id='main']//*[contains(@class,'alert-success')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_PASSWORD = By.xpath(".//*[@id='password']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_CONFIRMPASSWORD = By.xpath(".//*[@id='confirm_password']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_UPDATE_BTN = By.xpath(".//*[@id='set_pwd_submit']");
	
	public final By ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_DONG_BTN = By.xpath(".//*[@id='set_pass_form']//button[contains(@class,'btn-close')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_CLOSE_BTN = By.xpath(".//*[@id='set_pass_form']//button[@class='close']");
	
	public final String ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_MESSAGE = ".//*[@id='success-alert'][contains(.,'$mesg')]";

}
