package org.selenium.emoney.frontEnd.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_ThongTinTaiKhoan;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.*;

import java.io.IOException;

public class FrontEnd_ThongTinTaiKhoan extends FrontEnd_Locator_ThongTinTaiKhoan{
	
	public FrontEnd_ThongTinTaiKhoan(WebDriver dr){
		driver = dr;
	}
	/**
	 * Tại màn hình Thông tin tài khoản, chọn loại thông tin tài khoản để search
	 * @param info
	 * throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputTypeInfo(String info) throws IOException, TestLinkAPIException {
		info (" Chọn loại thông tin tài khoản");
		if (info != "") 
			select(ELEMENT_TTTK_TYPE_FIELD, info, 2);
		Utils.pause(300);
	}
	
	/**
	 * Nhập từ khóa tìm kiếm
	 * @param info
	 * throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputCode(String info) throws IOException, TestLinkAPIException {
		info ("Nhập từ khóa tìm kiếm");
		if (info != "") 
			type(ELEMENT_TTTK_SEARCH_FIELD, info, true);
		Utils.pause(300);
		
	}
	/**
	 * Click nút Tìm kiếm
	 * @param info
	 * throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void search() throws IOException, TestLinkAPIException {
		info ("Click nút tìm kiếm");
		click(ELEMENT_TTTK_SEARCH_BTN);
		Utils.pause(300);
		
	}
	
	/**
	 * Kiểm tra hiển thị đúng theo từ khóa tìm kiếm
	 * @param info
	 * throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifySearchInfo(String info) throws IOException, TestLinkAPIException {
		info("Verify hiển thị đúng theo từ khóa tìm kiếm");		
		waitForAndGetElement( ELEMENT_TTTK_MESSAGE.replace("$mess", info), 3000, 1);
	
	}
	/**
	 * Kiểm tra thông tin họa tên và mã thành viên trên header bar
	 * @param fullName
	 * @param emoneyId
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyHeaderInfo( String fullName, String emoneyId ) throws IOException, TestLinkAPIException {
		info ("Verify thông tin họ tên và mã thành viên của tài khoản trên header bar");	
		if (fullName != "")
			waitForAndGetElement(ELEMENT_TTTK_HEADER_INFO.replace("$header_info", fullName), 3000, 1);
		if (emoneyId != "") 
			waitForAndGetElement(ELEMENT_TTTK_HEADER_INFO.replace("$header_info", emoneyId), 3000, 1);
		
		
	}
	/**
	 * Mở tab Giao dịch
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void goToTransactionTab() throws IOException, TestLinkAPIException {
		info ("Mở tab Giao dịch");
		click(ELEMENT_TTTK_GIAODICH_TAB);
		Utils.pause(300);
	}
	
	
	/**
	 * Mở tab Giao dịch chờ xử lý
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void goToPendingTransactionTab() throws IOException, TestLinkAPIException {
		info("Mở tab Giao dịch chờ xử lý");
		click(ELEMENT_TTTK_GIAODICHXULY_TAB);
		Utils.pause(300);
			
	}
	//**************************************************************************
	//************* THONG TIN TAI KHOAN >> THONG TIN CHUNG ***************
	/**
	 * Kiểm tra thông tin họ tên
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyNameInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin họ tên");
		if ( info != "") 
			waitForAndGetElement(ELEMENT_TTTK_FULLNAME_VALUE.replace("$name", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_FULLNAME_EMPTY, 3000, 1);
				
	}
	/**
	 * Kiểm tra thông tin giới tính
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyGenderInfo (String info) throws IOException, TestLinkAPIException {		
		info ("Kiểm tra thông tin giới tính");
		waitForAndGetElement(ELEMENT_TTTK_GENDER_CHECKED.replace("$gender",info), 3000, 1);
	
	}
	/**
	 * Kiểm tra thông tin ngày sinh
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyBirthdayInfo (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin ngày sinh");
		if ( info != "") 
			waitForAndGetElement(ELEMENT_TTTK_BIRTHDAY_VALUE.replace("$birthday", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_BIRTHDAY_EMPTY, 3000, 1);
		
	}
	/**
	 * Kiểm tra thông tin nơi sinh
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPlaceBirthdayInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin nơi sinh");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_BIRTH_PLACE_VALUE.replace("$birth_place", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_BIRTH_PLACE_EMPTY, 3000, 1);
	}
	/**
	 * Kiểm tra thông tin số CMND
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIDCardInfo (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin số CMND");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_VALUE.replace("$identification", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_EMPTY, 3000, 1);
	}
	
	/**
	 * Kiểm tra thông tin ngày cấp
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdentificationDate(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin ngày cấp");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_DATE_VALUE.replace("$identification_date", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_DATE_EMPTY, 3000, 1);
	}

	/**
	 * Kiểm tra thông tin nơi cấp
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIssueAddress(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin nơi cấp");
		if (info != "")
			waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_ISSUE_DATE_VALUE.replace("$identification_issue_address", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_IDENTIFICATION_ISSUE_DATE_EMPTY, 3000, 1);
	}
	
	/**
	 * Kiểm tra trường họ tên không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledName() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường họ tên không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_FULLNAME_READONLY, 3000, 1);
		
	}
	/**
	 * Kiểm tra trường ngày sinh không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledBirthday() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường ngày sinh không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_BIRTHDAY_READONLY , 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường nơi sinh không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledBirthdayPlace() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường nơi sinh không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_BIRTH_PLACE_READONLY, 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường CMND không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIDCard() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường CMND không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_BIRTH_IDENTIFICATION_NUMBER_READONLY, 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường Ngày cấp không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdentificaitonDate() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường Ngày cấp không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_BIRTH_IDENTIFICATION_DATE_READONLY, 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường nơi cấp không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIssueAddress() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường nơi cấp không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_BIRTH_IDENTIFICATION_ADDRESS_READONLY, 3000, 1);
		
	}
	
	
	
	
	//******************************* EMONEY INFO SECTION : THONG TIN E-MONEY *************************************/
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra mã thành viên
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyEmoneyId (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra mã thành viên");
		if (info != "")  
			waitForAndGetElement(ELEMENT_TTTK_EMONEY_ID_VALUE.replace("$emoney_id", info ), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_EMONEY_ID_EMPTY, 3000,1);
	}
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra số dư tài khoản
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyEmoneyBalance(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số dư tài khoản");
		if (info != "")  
			waitForAndGetElement(ELEMENT_TTTK_EMONEY_BALANCE_VALUE.replace("$emoney_balance", info ), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_EMONEY_BALANCE_EMPTY, 3000,1);
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trạng thái tài khoản
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyAccountStatus(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra trạng thái tài khoản");
		waitForAndGetElement(ELEMENT_TTTK_EMONEY_ACCOUNT_STATUS_VALUE.replace("$status", info ), 3000,1);
	}
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra mã thẻ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdCard(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra mã thẻ");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_EMONEY_ID_CARD_NO_VALUE.replace("$card_no", info), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_EMONEY_ID_CARD_NO_EMPTY, 3000,1);
	}
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra ngày hết hạn thẻ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdCardExpDate(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra ngày hết hạn thẻ");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_CARD_EXP_DATE_VALUE.replace("$card_exp_date", info), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_CARD_EXP_DATE_EMPTY, 3000,1);
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra ngày phát hành thẻ
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdCardIssueDate (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra ngày phát hành thẻ");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_CARD_ISSUE_DATE_VALUE.replace("$card_issue_date", info), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_CARD_ISSUE_DATE_EMPTY, 3000,1);
	}

	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trạng thái thẻ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdCardStatus(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra trạng thái thẻ");
		if (info != "")  
			waitForAndGetElement(ELEMENT_TTTK_CARD_STATUS_VALUE.replace("$card_status", info), 3000,1);
		else waitForAndGetElement(ELEMENT_TTTK_CARD_STATUS_EMPTY, 3000,1);
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường mã thành viên không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledEmoneyId() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường mã thành viên không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_EMONEY_ID_READONLY, 3000,1);
		
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường số dư tài khoản không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledEmoneyBalance() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường số dư tài khoản không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_EMONEY_BALANCE_READONLY, 3000,1);
		
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường trạng thái tài khoản không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledAccountStatus() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường trạng thái tài khoản không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_EMONEY_ACCOUNT_STATUS_READONLY , 3000,1);
		
	}

	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường mã thẻ không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdCard() throws IOException, TestLinkAPIException {
		info (" Kiểm tra trường mã thẻ không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_EMONEY_ID_CARD_READONLY , 3000,1);
		
	}
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường ngày hết hạn thẻ không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdCardExpDate() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường ngày hết hạn thẻ không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_CARD_EXP_DATE_READONLY, 3000,1);
		
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường ngày phát hành thẻ không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdCardIssueDate() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường ngày phát hành thẻ không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_CARD_ISSUE_DATE_READONLY, 3000,1);
		
	}
	
	/**
	 * Tại Tab Thông tin EMoney: Kiểm tra trường trạng thái thẻ không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdCardStatus() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường trạng thái thẻ không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_CARD_STATUS_READONLY, 3000,1);
		
	}
	
	//**********************CONTACT INFO SECTION: THONG TIN LIEN LAC *********************
	/**
	 * Kiểm tra thông tin điện thoại cố định
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPhoneInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin điện thoại cố định");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_PHONE_NUMBER_VALUE.replace("$phone_number", info), 3000, 1);		
		
	}
	/**
	 * Kiểm tra thông tin điện thoại di động
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyCellPhoneInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin điện thoại di động");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_CELL_PHONE_NUMBER_VALUE.replace("$cell_phone_number", info), 3000, 1);		
		
	}
	/**
	 * Kiểm tra thông tin email
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyEmailInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin email");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_EMAIL_VALUE.replace("$email", info), 3000, 1);		
		
	}
	/**
	 * Nhập số điện thoại cố định
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputPhone (String info) throws IOException, TestLinkAPIException {
		info("Nhập số điện thoại cố định");
		if (info != "") 
			type(ELEMENT_TTTK_PHONE_NUMBER_FIELD, info, true);
		Utils.pause(300);
		
	}

	/**
	 * Nhập số điện thoại di động
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputCellPhone (String info) throws IOException, TestLinkAPIException {
		info ("Nhập số điện thoại di động");
		if (info != "") 
			type(ELEMENT_TTTK_CELL_PHONE_NUMBER_FIELD, info, true);
		Utils.pause(300);
	}

	/**
	 * Nhập email
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputEmail (String info) throws IOException, TestLinkAPIException {
		info ("Nhập email");
		if (info != "") 
			type(ELEMENT_TTTK_EMAIL_FIELD, info, true);
		Utils.pause(300);
	}
	
	//********************** ĐỊA CHỈ THƯỜNG TRÚ ******************
	/**
	 * Kiểm tra thông tin địa chỉ chi tiết
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDetailAddressInfo (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin địa chỉ chi tiết");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_DETAIL_ADDRESS_VALUE .replace("$detail_address", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_DETAIL_ADDRESS_EMPTY, 3000, 1);
	}

	/**
	 * Kiểm tra thông tin tỉnh thành
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyProvinceInfo (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin tỉnh thành");
		waitForAndGetElement(ELEMENT_TTTK_ADDRESS_PROVINCE_SELECTED_TEXT.replace("$value",info),3000,1);
	}
	
	/**
	 * Kiểm tra thông tin quận huyện
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDistrictInfo (String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin quận huyện");
		waitForAndGetElement( ELEMENT_TTTK_ADDRESS_DISTRICT_SELECTED_TEXT.replace("$value",info),3000,1);
		
	}
	
	/**
	 * Kiểm tra thông tin phường xã
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyCommuneInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin phường xã");
		waitForAndGetElement(ELEMENT_TTTK_ADDRESS_COMMUNE_SELECTED_TEXT.replace("$value",info),3000,1);
	}
	
	/**
	 * Kiểm tra trường địa chỉ chi tiết không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledDetailAddress() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường địa chỉ chi tiết không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_DETAIL_ADDRESS_DISABLE, 3000, 1);
		
		
	}
	/**
	 * Kiểm tra trường tình thành không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledProvince() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường tình thành không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_ADDRESS_PROVINCE_DISABLE , 3000, 1);
	}
	
	/**
	 * Kiểm tra trường quận huyện không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledDistrict() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường quận huyện không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_ADDRESS_DISTRICT_DISABLE, 3000, 1);
	}
	
	/**
	 * Kiểm tra trường phường xã không thể edit
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledCommune() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường phường xã không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_ADDRESS_COMMUNE_DISABLE, 3000, 1);
	}
	
	//****************** DIA CHI TAM TRU ***************************/
	/**
	 * Kiểm tra thông tin địa chỉ tạm trú chi tiế
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDetailTempAddressInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin địa chỉ tạm trú chi tiết");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_VALUE.replace("$detail_address_temp", info), 3000, 1);
		else waitForAndGetElement(ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_EMPTY, 3000, 1);
	}
	/**
	 * Kiểm tra thông tin tình thành tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyTempProvinceInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin tình thành tạm trú");
		if (info != ""){
			waitForAndGetElement(ELEMENT_TTTK_ADDRESS_TEMP_PROVINCE_SELECTED_TEXT.replace("$value",info),3000,1);
		}
		
	}
	/**
	 * Kiểm tra thông tin quận huyện tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyTempDistrictInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin quận huyện tạm trú");
		if (info != ""){
			waitForAndGetElement(ELEMENT_TTTK_ADDRESS_TEMP_DISTRICT_SELECTED_TEXT.replace("$value",info),3000,1);
		}
	}
	/**
	 * Kiểm tra thông tin phường xã tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyTempCommuneInfo(String info) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin phường xã tạm trú");
		if (info != "") {
			waitForAndGetElement(ELEMENT_TTTK_ADDRESS_TEMP_COMMUNE_SELECTED_TEXT.replace("$value",info),3000,1);
		}
	}
	/**
	 * Nhập địa chỉ chi tiết tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDetailTempAddress(String info) throws IOException, TestLinkAPIException {
		info("Nhập địa chỉ chi tiết tạm trú");
		if (info != "") 
			type(ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_FIELD, info, true);
		Utils.pause(300);
	}
	/**
	 * Nhập tỉnh thành tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputTempProvince(String info) throws IOException, TestLinkAPIException {
		info("Nhập tỉnh thành tạm trú");
		if (info != "") 
			select(ELEMENT_TTTK_ADDRESS_TEMP_PROVINCE_FIELD, info, 2);
		Utils.pause(300);
	}
	/**
	 * Nhập quận huyện tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputTempDistrict(String info) throws IOException, TestLinkAPIException {
		info("Nhập quận huyện tạm trú");
		if (info != "") 
			select(ELEMENT_TTTK_ADDRESS_TEMP_DISTRICT_FIELD, info, 2);
		Utils.pause(300);
	}
	
	/**
	 * Nhập phường xã tạm trú
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputTempCommune(String info) throws IOException, TestLinkAPIException {
		info("Nhập phường xã tạm trú");
		if (info != "") 
			select(ELEMENT_TTTK_ADDRESS_TEMP_COMMUNE_FIELD, info, 2);
		Utils.pause(300);
	}
	
	//*************************************************************************
	//************** AUTHO INFO SECTION: THONG TIN UY QUYEN *****************/
	
	/**
	 * Kiểm tra số CMND của người được ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyIDCardAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số CMND của người được ủy quyền");
		if ( info != "") 
			waitForAndGetElement(ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_NUMBER_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra tên của người được ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyNameAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra tên của người được ủy quyền");
		if ( info != "") 
			waitForAndGetElement(ELEMENT_TTTK_AUTHORIZED_FULLNAME_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra ngày cấp CMND của người được ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyIdentificationDateAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra ngày cấp CMND của người được ủy quyền");
		if ( info != "") 
			waitForAndGetElement(ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_DATE_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra nơi cấp CMND của người được ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyIssueAddressAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra nơi cấp CMND của người được ủy quyền");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_ADDRESS_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra số điện thoại của người được ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyPhoneAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số điện thoại của người được ủy quyền");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_PHONE_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra quan hệ với chủ tài khoản
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyRelationAuthInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra quan hệ với chủ tài khoản");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_RELATION_INFO.replace("$info", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra nơi xác nhận ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyAuthoOfficeInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra nơi xác nhận ủy quyền");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_OFFICE_INFO.replace("$info", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra thời hạn ủy quyền từ
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyAuthDateFromInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thời hạn ủy quyền từ");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_DATE_FROM_INFO.replace("$info", info), 3000, 1);
		
	}
	/**
	 * Kiểm tra thời hạn ủy quyền đến
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyAuthoDateToInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thời hạn ủy quyền đến");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_DATE_TO_INFO.replace("$info", info), 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường họ tên không thể edit
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledNameAuth() throws IOException, TestLinkAPIException {
		info ("Kiểm tra thời hạn ủy quyền đến");
		waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_FULLNAME_READONLY, 3000, 1);
		
	}
	/**
	 * Kiểm tra trường Ngày cấp không thể edit
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIdentificaitonDateAuth() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường Ngày cấp không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_DATE_READONLY, 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường Nơi cấp không thể edit
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledIssueAddressAuth() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường Nơi cấp không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_ADDRESS_READONLY, 3000, 1);
		
	}
	
	/**
	 * Kiểm tra trường Phone không thể edit
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledPhoneAuth() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường Phone không thể edit");
		waitForAndGetElement( ELEMENT_TTTK_AUTHORIZED_PHONE_READONLY, 3000, 1);
		
	}
	
	/**
	 * Click vào nút Xóa ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void clearAuthInfo() throws IOException, TestLinkAPIException {
		info ("Click vào nút Xóa ủy quyền");
		click(ELEMENT_TTTK_DELETE_AUTH_BTN);
		Utils.pause(100);
		
	}
	
	/**
	 * Nhập quan hệ với chủ tài khoản
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputRelationAuth(String info) throws IOException, TestLinkAPIException {
		info ("Nhập quan hệ với chủ tài khoản");
		if ( info != "") 
			type(ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_FIELD, info, true);
		Utils.pause(300);
		
	}
	/**
	 * Nhập nơi xác nhận ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputAuthOfffice(String info) throws IOException, TestLinkAPIException {
		info("Nhập nơi xác nhận ủy quyền");
		if ( info != "") 
			type(ELEMENT_TTTK_AUTHORIZED_OFFICE_FIELD, info, true);
		Utils.pause(300);
		
	}
	/**
	 * Nhập thời hạn ủy quyền từ
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputAuthDateFrom(String info) throws IOException, TestLinkAPIException {
		info ("Nhập thời hạn ủy quyền từ");
		if (info != "") 
			type(ELEMENT_TTTK_AUTHORIZED_DATE_FROM_FIELD, info, true);
		Utils.pause(300);
	}
	
	/**
	 * Nhập thời hạn ủy quyền đến
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputAuthDateTo(String info) throws IOException, TestLinkAPIException {
		info("Nhập thời hạn ủy quyền đến");
		if (info != "") 
			type(ELEMENT_TTTK_AUTHORIZED_DATE_TO_FIELD, info, true);
		Utils.pause(300);
		
	}
	
	/**
	 * Nhập số CMND
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputIDCardAuth(String info) throws IOException, TestLinkAPIException {
		info ("Nhập số CMND");
		if (info != "") 
			type(ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_FIELD, info, true);
		Utils.pause(300);
	}
	
	/**
	 * Click vào nút Tìm kiếm người ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void searchAuth() throws IOException, TestLinkAPIException {
		info ("Click vào nút Tìm kiếm người ủy quyền");
		click(ELEMENT_TTTK_AUTH_SEARCH_BTN);
		Utils.pause(300);
	}
	
	/**
	 * Mở trang đổi mật khẩu
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void goToChangePassword() throws IOException, TestLinkAPIException {
		info ("Mở trang đổi mật khẩu");
		click(ELEMENT_TTTK_RESET_PASSWORD_LINK);
		Utils.pause(300);
		
	}
	/**
	 * Mở trang khóa tài khoản/Thẻ
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void goToLockAccountCard() throws IOException, TestLinkAPIException {
		info ("Mở trang khóa tài khoản/Thẻ");
		click(ELEMENT_TTTK_LOCK_ACCOUNT_LINK);
		Utils.pause(300);
	}

	/**
	 * Ấn nút cập nhật
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void update() throws IOException, TestLinkAPIException {
		info ("Ấn nút cập nhật");
		click(ELEMENT_TTTK_UPDATE_LINK);
		Utils.pause(300);
	}
	
	//******************* TRANSACTION TAB: GIAO DICH *********************/
	/**
	 * Tại Tab giao dịch: Nhập Ngày từ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputTransactionDateFrom(String info) throws IOException, TestLinkAPIException {
		info("Nhập Ngày từ");
		if (info != "") 
			type(ELEMENT_TTTK_TRANSACTION_DATE_FROM_FIELD, info, true);
		Utils.pause(300);
	}
	/**
	 * Tại Tab giao dịch: Nhập ngày đến
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputTransactionDateTo (String info) throws IOException, TestLinkAPIException {
		info("Nhập ngày đến");
		if ( info != "") 
			type(ELEMENT_TTTK_TRANSACTION_DATE_TO_FIELD, info, true);
		Utils.pause(300);
	}
	/**
	 * Tại Tab giao dịch: Nhập keyword vào trường tìm kiếm
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputTransactionSearch (String info) throws IOException, TestLinkAPIException {
		info("Nhập keyword vào trường tìm kiếm");
		if ( info != "") 
			type(ELEMENT_TTTK_TRANSACTION_SEARCH_FIELD, info, true);
		Utils.pause(300);
	}
	/**
	 * Tại Tab giao dịch: Click vào nút Tìm kiếm
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void searchTransaction() throws IOException, TestLinkAPIException {
		info("Click vào nút Tìm kiếm");
		click(ELEMENT_TTTK_TRANSACTION_SEARCH_BTN);
		Utils.pause(300);
		
	}
	/**
	 * Nhập số lượng giao dịch hiển thị trên một trang
	 * String info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputTransactionList(String info) throws IOException, TestLinkAPIException {
		info("Nhập số lượng giao dịch hiển thị trên một trang");
		if (info != "") 
			select( ELEMENT_TTTK_TRANSACTION_LIST_LENGTH , info, 2);
		Utils.pause(300);
		
	}
	/**
	 * Tại Tab giao dịch:Kiểm tra thông tin của một giao dịch theo số hiệu giao dịch
	 * @param info
	 * @param transactionNumb
	 * @throws TestLinkAPIException 
	 */
	public void verifyTransactionInfo(String info, String transactionNumb) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin của một giao dịch theo số hiệu giao dịch");
		if (transactionNumb != "") {
			waitForAndGetElement(ELEMENT_TTTK_TRANSACTION_ID_INFO
					.replace("$transactionNumb", transactionNumb), 3000, 1);
			if ( info != "") 
				waitForAndGetElement( ELEMENT_TTTK_TRANSACTION_INFO 
						.replace("$transactionNumb", transactionNumb)
						.replace("$info", info), 3000, 1);
		}	
	}
	
	/**
	 * Nhẩy sang trang giao dịch tiếp theo
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void nextTransactionPage() throws IOException, TestLinkAPIException {
		info("Nhẩy sang trang giao dịch tiếp theo");
		click( ELEMENT_TTTK_NEXT_TRANSACTION_PAGE_BTN);
		Utils.pause(300);
		
	}
	

	/**
	 * Nhảy sang trang giao dịch trước đó
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void previousTransactionPage() throws IOException, TestLinkAPIException {
		info("Nhảy sang trang giao dịch trước đó");
		click( ELEMENT_TTTK_PREV_TRANSACTION_PAGE_BTN);
		Utils.pause(300);
		
	}
	
	
	
	
	
	
	//*********************** PENDING TRANSACTION TAB: GIAO DICH CHO XU LY ******************/
	/**
	 * Tại Tab Giao dịch chờ xử lý: Kiểm tra thông tin giao dịch đang chờ xử lý
	 * @param info
	 * @param transactionNumb
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPendingTransactionInfo(String info, String transactionNumb) throws IOException, TestLinkAPIException {
		info("Kiểm tra thông tin giao dịch đang chờ xử lý");
		if (transactionNumb != "") {
			waitForAndGetElement(ELEMENT_TTTK_TRANSACTION_ID_INFO
					.replace("$transactionNumb", transactionNumb), 3000, 1);
			if ( info != "") 
				waitForAndGetElement( ELEMENT_TTTK_PENDING_TRANSACTION_INFO 
						.replace("$transactionNumb", transactionNumb)
						.replace("$info", info), 3000, 1);
		}
		
	}
	/**
	 * Tại Tab Giao dịch chờ xử lý: Click vào nút Thử Lại
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void cancelPendingTransaction() throws IOException, TestLinkAPIException {
		info ("Click vào nút Thử Lại");
		click(ELEMENT_TTTK_CANCEL_PENDING_TRANSACTION_BTN);
		Utils.pause(300);
	}
	/**
	 * Nhẩy sang trang giao dịch chờ xử lý tiếp theo
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void nextPendingTransactionPage() throws IOException, TestLinkAPIException {
		info ("Nhẩy sang trang giao dịch chờ xử lý tiếp theo");
		click( ELEMENT_TTTK_NEXT_PENDING_TRANSACTION_PAGE_BTN);
		Utils.pause(300);
	}
	/**
	 * Nhảy sang trang giao dịch chờ xử lý trước đó
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void previousPendingTransactionPage() throws IOException, TestLinkAPIException {
		info ("Nhảy sang trang giao dịch chờ xử lý trước đó");
		click( ELEMENT_TTTK_PREV_PENDING_TRANSACTION_PAGE_BTN);
		Utils.pause(300);
	}
	//*********************** DOI MAT KHAU *********************/
	/**
	 * Tại màn hình Đổi mật khẩu: Nhập description 
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void InputInfo(String info) throws IOException, TestLinkAPIException {
		info ("Nhập description");
		if ( info != ""){
			type(ELEMENT_TTTK_CHANGE_PASSWORD_MOTA_FIELD, info, true) ;
			Utils.pause(300);	
		}	
	}
	/**
	 * Tại màn hình Đổi mật khẩu: 
	 * - Click nút Đồng ý
	 * - Kiểm tra message đổi thành công
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void acceptChangePassword(String info) throws IOException, TestLinkAPIException {
		info ("Đồng ý đổi mật khẩu");
		click(ELEMENT_TTTK_CHANGE_PASSWORD_SUBMIT_BTN);
		Utils.pause(300);
		info ("Việc quay về màn hình thông tin và hiển thị message đổi thành công");
		if (info != "")
			waitForAndGetElement(ELEMENT_TTTK_CHANGE_PASSWORD_MESSAGE.replace("$mesg", info), 3000, 1);
	}
	
	/**
	 * Tại màn hình Đổi mật khẩu: Click vào nút Close
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void rejectChangePassword(String info) throws IOException, TestLinkAPIException {
		info ("Click vào nút Close");
		click( ELEMENT_TTTK_CHANGE_PASSWORD_CANCEL_BTN);
		Utils.pause(300);
		if (info != "")
			waitForAndGetElement(ELEMENT_TTTK_CHANGE_PASSWORD_MESSAGE.replace("$mesg", info), 3000, 1);
	}
	
	
	//************************** KHOA TAI KHOAN *******************/
	/**
	 * Tại màn hình Khóa tài khoản: Kiểm tra trạng thái đang chọn và chọn trạng thái
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputType(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra trạng thái đang chọn và chọn trạng thái");
		if (info != "") {		    
			click(ELEMENT_TTTK_LOCK_ACCOUNT_TYPE_FIELD.replace("$value", info));
			Utils.pause(300);	
		}	
	}
	/**
	 * Define typeStatus
	 * @author Teko
	 *
	 */
	public enum typeStatus{
		HOATDONG, TAMKHOA, KHOA
	}
	/**
	 * Tại màn hình Khóa tài khoản: Chọn một trạng thái
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputStatus( typeStatus status ) throws IOException, TestLinkAPIException {
		info ("Chọn một trạng thái");		
		switch (status){
			case HOATDONG:					
				select (ELEMENT_TTTK_LOCK_ACCOUNT_STATUS_FIELD, "Hoạt động", 2);			
				break;
			case TAMKHOA:				
				select (ELEMENT_TTTK_LOCK_ACCOUNT_STATUS_FIELD, "Tạm khóa", 2);	
				break;
			case KHOA:				
				select (ELEMENT_TTTK_LOCK_ACCOUNT_STATUS_FIELD, "Khóa", 2);	
				break;
			default:
				info ("Trạng thái không tồn tại, mời bạn thử lại ");
				break;		
		}
		Utils.pause(300);
	}
	/**
	 * Tại màn hình Khóa tài khoản: Nhập mô tả
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputInfo(String info) throws IOException, TestLinkAPIException {
		info ("Nhập mô tả");
		if (info != "") {		    
			type (ELEMENT_TTTK_LOCK_ACCOUNT_DESCRIPTION_FIELD , info, true);
			Utils.pause(300);	
		}	
	}
	/**
	 * Tại màn hình Khóa tài khoản: Verify việc hiển thị message sau khi khóa tài khoả
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyMessage(String mesg) throws IOException, TestLinkAPIException {
		info ("Verify việc hiển thị message sau khi khóa tài khoản");
		if ( mesg != "") {		    
			waitForAndGetElement(ELEMENT_TTTK_LOCK_ACCOUNT_MESSAGE.replace("$mesg", mesg), 3000, 1);
		}	
	}
	/**
	 * Tại màn hình Khóa tài khoản: Thực hiện việc khóa tài khoản/Thẻ
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void acceptLock() throws IOException, TestLinkAPIException {
		info ("Thực hiện việc khóa tài khoản/Thẻ");
		click (ELEMENT_TTTK_LOCK_ACCOUNT_ACCEPT_BTN);
		Utils.pause(300);	
		
	}
	/**
	 * Tại màn hình Khóa tài khoản: Thực hiện việc bỏ qua khóa tài khoản/Thẻ
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void rejectLock() throws IOException, TestLinkAPIException {
		info ("Thực hiện việc bỏ qua khóa tài khoản/Thẻ");
		click ( ELEMENT_TTTK_LOCK_ACCOUNT_CLOSE_BTN);
		Utils.pause(300);	
		
	}
	//******************************************************************
	//*************** Socical info Section ***************************
	/**
	 * Kiểm tra số BHXH
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifySocialInsuranceNumber(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số BHXH");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_SOCIAL_INSURANCE_NUMBER_VALUE.replace("$value", info),3000, 1);
		Utils.pause(300);	
		
	}
	/**
	 * Kiểm tra chế độ BHXH
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifySocialType(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số BHXH");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_SOCIAL_TYPE_VALUE.replace("$type", info),3000, 1);
		Utils.pause(300);	
		
	}
	/**
	 * Kiểm tra hình thức nhận
	 * 1 - Tiền mặt , 2 - Tài khoản cá nhân
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyReceiveType(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra hình thức nhận");
		if (info != "") 
			waitForAndGetElement(ELEMENT_TTTK_SOCIAL_INSURANCE_CASH_VALUE.replace("$info", info),3000, 1);
		Utils.pause(300);	
		
	}
	
	/**
	 * Kiểm tra trường số BHXH không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledSocialInsuranceNumber() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường số BHXH không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_SOCIAL_INSURANCE_NUMBER_READONLY,3000, 1);

	}
	/**
	 * Kiểm tra trường Chế độ BHXH không thể edit
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyDisabledSocialInsuranceType() throws IOException, TestLinkAPIException {
		info ("Kiểm tra trường số BHXH không thể edit");
		waitForAndGetElement(ELEMENT_TTTK_SOCIAL_TYPE_READONLY,3000, 1);

	}
	/**
	 * Chọn lựa hình thức nhận 
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputReceiveType(String info) throws IOException, TestLinkAPIException {
		info ("Chọn lựa hình thức nhận");
		if (info != "") 
			click(ELEMENT_TTTK_SOCIAL_INSURANCE_CASH_VALUE.replace("$info", info));
		Utils.pause(300);

	}
}
