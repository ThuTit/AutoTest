package org.selenium.emoney.frontEnd.common;

import static org.selenium.common.TestLogger.info;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_HoSoNguoiDung;

import testlink.api.java.client.TestLinkAPIException;

public class FrontEnd_HoSoNguoiDung extends FrontEnd_Locator_HoSoNguoiDung {

	public FrontEnd_HoSoNguoiDung(WebDriver dr) {
		driver = dr;
	}
	/**
	 * Kiểm tra các trường không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledFields() throws IOException, TestLinkAPIException{
		info ("Kiểm tra các trường không thể edit");
		info("Trường Username không thể edit");
		waitForAndGetElement(ELEMENT_HSND_USERNAME_READONLY,3000, 1);
		info("Trường Bưu điện cấp 1 không thể edit");
		waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP1_READONLY,3000, 1);
		info("Trường phân quyền không thể edit");
		waitForAndGetElement(ELEMENT_HSNG_ROLE_READONLY,3000, 1);
		Utils.pause(300);
	}
	/**
	 * Kiểm tra thông tin username
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyUserNameInfo(String info) throws TestLinkAPIException{
		info ("Kiểm tra thông tin username");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_USER_NAME_VALUE.replace("$username", info), 3000, 1);
	}
	/**
	 * Kiểm tra thông tin họ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyFirstnameInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin họ");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_FIRST_NAME_VALUE.replace("$firstName", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra thông tin tên
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyLastnameInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin tên");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_LAST_NAME_VALUE.replace("$lastName", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra thông tin ngày sinh
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyBirthdayInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin ngày sinh");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_BIRTHDAY_VALUE.replace("$birthDay", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra thông tin CMND
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyCMNDInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin CMND");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_IDENTIFICATION_VALUE.replace("$identification", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra mã bưu cục
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyCodePost(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra mã bưu cục");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_POST_CODE_VALUE.replace("$postCode", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra pin code
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPinCode(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra pin code");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_PIN_CODE_VALUE.replace("$pinCode", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra thông tin email
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyEmailInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin email");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_EMAIL_VALUE.replace("$email", info), 3000, 1);
		
	}

	/**
	 * Kiểm tra thông tin điện thoại
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPhoneInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin điện thoại");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_PHONE_NUMBER_VALUE.replace("$phoneNumber", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra thông tin tỉnh thành
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyProvinceInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin tỉnh thành:"+info);
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_PROVINCE_VALUE.replace("$idProvince", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra thông tin quận huyện
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDistrictInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin quận huyện:"+info);
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_DISTRICT_VALUE.replace("$idDistrict", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra bưu cục cấp 1
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException
	 */
	public void verifyLevel1Info(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra bưu cục cấp 1");
		if (info != ""){
			waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP1_SELECTED.replace("$info", info), 3000, 1);
		}	
	}
	/**
	 * Kiểm tra bưu cục cấp 2
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyLevel2Info(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra bưu cục cấp 2");
		if (info != ""){
			waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP2_SELECTED.replace("$info", info), 3000, 1);
		}else {
			waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP2_SELECTED_EMPTY, 3000, 1);
		}
	}
	
	/**
	 * Kiểm tra bưu cục cấp 3
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyLevel3Info(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra bưu cục cấp 3");
			if (info != "") 
				waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP3_SELECTED.replace("$info", info), 3000, 1);
			else {
				waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP3_SELECTED_EMPTY, 3000, 1);
			}
	}
	
	/**
	 * Kiểm tra bưu cục cấp 4
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyLevel4Info(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra bưu cục cấp 4");
		if (info != "")
				waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP4_SELECTED.replace("$info", info), 3000, 1);
			else {
				waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP4_SELECTED_EMPTY, 3000, 1);
		}
	}
	
	/**
	 * Kiếm tra thông tin phân quyền
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyRolesInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiếm tra thông tin phân quyền");
		if (info != "") 
			waitForAndGetElement(ELEMENT_HSND_ROLE_FIELD.replace("$role", info),3000, 1);
		else{
			waitForAndGetElement(ELEMENT_HSND_ROLE_EMPTY,3000, 1);
		}
		
	}
	/**
	 * Nhập họ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputFirstname(String info) throws IOException, TestLinkAPIException{
		info ("Nhập họ");
		if (info != "") 
			type(ELEMENT_HSND_FIRST_NAME_FIELD, info, true);
		Utils.pause(1000);
	}
	/**
	 * Nhập tên
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputLastname(String info) throws IOException, TestLinkAPIException{
		info ("Nhập tên");
		if (info != "") 
			type( ELEMENT_HSND_LAST_NAME_FIELD , info, true);
		Utils.pause(1000);
	}
	/**
	 * Nhập ngày sinh
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputBirthday(String info) throws IOException, TestLinkAPIException{
		info ("Nhập ngày sinh");
		if (info != "") 
			type( ELEMENT_HSND_BIRTHDAY_FIELD, info, true);
		Utils.pause(1000);
	}
	/**
	 * Nhập CMND
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputCMND(String info) throws IOException, TestLinkAPIException{
		info ("Nhập CMND");
		if (info != "") 
			type( ELEMENT_HSND_IDENTIFICATION_NUMBER_FIELD , info, true);
		Utils.pause(1000);
	}
	/**
	 * 
	 * Nhập mã bưu cục
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputCodePost(String info) throws IOException, TestLinkAPIException{
		info ("Nhập mã bưu cục");
		if (info != "") 
			type( ELEMENT_HSND_POST_CODE_FIELD, info, true);
		Utils.pause(1000);
	}
	
	/**
	 * Nhập pincode
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputPinCode(String info) throws IOException, TestLinkAPIException{
		info ("Nhập pincode");
		if (info != "") 
			type( ELEMENT_HSND_PIN_CODE_FIELD, info, true);
		Utils.pause(1000);
	}
	
	/**
	 * Nhập Email
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputEmail(String info) throws IOException, TestLinkAPIException{
		info ("Nhập Email");
		if (info != "") 
			type( ELEMENT_HSND_EMAIL_FIELD, info, true );
		Utils.pause(1000);
	}
	/**
	 * Nhập điện thoại
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputPhone(String info) throws IOException, TestLinkAPIException{
		info ("Nhập điện thoại");
		if (info != "") 
			type( ELEMENT_HSND_PHONE_NUMBER_FIELD , info, true );
		Utils.pause(1000);
	}
	/**
	 * Chọn tỉnh thành
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputProvince(String info) throws IOException, TestLinkAPIException{
		info ("Chọn tỉnh thành");
		if (info != "") 
			select(ELEMENT_HSND_PROVINCE_FIELD, info, 2);
		Utils.pause(1000);
		
	}
	/**
	 * Chọn quận huyện
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputDistrict(String info) throws IOException, TestLinkAPIException{
		info ("Chọn quận huyện");
		if (info != "") 
			select(ELEMENT_HSND_DISTRICT_FIELD, info, 2);
		Utils.pause(1000);
	}
	/**
	 * Chọn bưu cục cấp 2
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel2(String info) throws IOException, TestLinkAPIException{
		info ("Chọn bưu cục cấp 2");
		if (info != "") 
			select(ELEMENT_HSND_BUUCUC_CAP2_FIELD , info, 2);
		Utils.pause(1000);
	}
	/**
	 * Chọn bưu cục cấp 3
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel3(String info) throws IOException, TestLinkAPIException{
		info ("Chọn bưu cục cấp 3");
		if (info != "") 
			select(ELEMENT_HSND_BUUCUC_CAP3_FIELD , info, 2);
		Utils.pause(1000);
	}
	
	/**
	 * Chọn bưu cục cấp 4
	 * @param info 
	 *             = id của bưu cục
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel4(String info) throws IOException, TestLinkAPIException{
		info ("Chọn bưu cục cấp 4");
		if (info != "") 
			selectByValue(ELEMENT_HSND_BUUCUC_CAP4_FIELD , info, 2);
		Utils.pause(1000);
	}
	
	/**
	 * Click vào nút Cập nhật
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void update_btn() throws IOException, TestLinkAPIException{
		info ("Click vào nút Cập nhật");
		click( ELEMENT_HSND_UPDATE_BTN);
		Utils.pause(1000);
	}
	

	/**
	 * Click vào nút Đóng
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void close_btn() throws IOException, TestLinkAPIException{
		info ("Click vào nút Đóng");
		click(  ELEMENT_HSND_CLOSE_BTN);
		Utils.pause(1000);
	}

	/**
	 * Lấy id của tỉnh thành
	 * @return id
	 * @throws TestLinkAPIException 
	 */
	public String getIDProvince() throws TestLinkAPIException{
		info("Lấy ID của tỉnh thành hiện tại");
		String id = waitForAndGetElement(ELEMENT_HSND_PROVINCE_SELECTED).getAttribute("value");
		return id;
	}
	
	/**
	 * Kiểm tra có thể edit phần work infor
	 * @return boolean true or false
	 * @throws TestLinkAPIException 
	 */
	public boolean isChangeWorkInfo() throws TestLinkAPIException{
		if(waitForAndGetElement(ELEMENT_HSND_BUUCUC_CAP2_DISABLED,2000,0)!=null){
			return false;
		} 
		return true;
	}

	
}