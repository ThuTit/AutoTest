package org.selenium.emoney.frontEnd.common;
import static org.selenium.common.TestLogger.info;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_QuanLyUyQuyen;

import testlink.api.java.client.TestLinkAPIException;

public class FrontEnd_QuanLyUyQuyen extends FrontEnd_Locator_QuanLyUyQuyen {

	
	
	public FrontEnd_QuanLyUyQuyen(WebDriver dr){
		driver = dr;
	}
	
	//********************************HOME***************************************************************\\
	/**
	 * Nhập CMND
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByCMNDHome(String info) throws TestLinkAPIException{
		info("Nhập CMND");
		type(AUTH_HOME_SEARCH_CMND,info,true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Search
	 * @throws TestLinkAPIException 
	 */
	public void search_btn_home() throws TestLinkAPIException{
		info("Click vào nút Search");
		click(AUTH_HOME_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Thêm người ủy quyền
	 * @throws TestLinkAPIException 
	 */
	public void goToAddNewAuth() throws TestLinkAPIException{
		info("Click vào nút Thêm người ủy quyền");
		click(AUTH_HOME_ADD_AUTH_BTN);
		Utils.pause(100);
	}
	/**
	 * Mở trang thông tin chi tiết của một người ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void goToUpdateAuthHome(String info) throws TestLinkAPIException{
		info("Click vào link Cập nhật của người ủy quyền:"+info);
		click(AUTH_HOME_UPDATE_LINK);
		Utils.pause(100);
	}
	/**
	 * Kiểm tra thông tin người ủy quyền
	 * @param info1
	 * @param info2
	 * @throws TestLinkAPIException 
	 */
	public void verifyAuthInfoHome(String info1,String info2) throws TestLinkAPIException{
		info("Kiểm tra thông tin người ủy quyền với:"+ info1+" và:"+info2);
		waitForAndGetElement(AUTH_HOME_AUTH_INFO
				.replace("$value1",info1)
				.replace("$value2",info2),3000,1);
	}
	
	//********************************THÊM NGƯỜI ỦY QUYỀN***************************************************************\\
	/**
	 * Nhập CMND
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputCMND(String info) throws TestLinkAPIException{
		info("Nhập CMND");
		type(AUTH_CREATE_UPDATE_CMND,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập loại giấy tờ tùy thân
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputGTTTType(String info) throws TestLinkAPIException{
		info("Nhập loại GTTT");
		type(AUTH_CREATE_UPDATE_GTTT_LOAI,info,true);
		Utils.pause(100);
		
	}
	/**
	 * Nhập họ và tên
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputName(String info) throws TestLinkAPIException{
		info("Nhập họ và tên");
		type(AUTH_CREATE_UPDATE_NAME,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập ngày cấp
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputNgayCap(String info) throws TestLinkAPIException{
		info("Nhập ngày cấp");
		type(AUTHO_CREATE_UPDATE_NGAYCAP,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập nơi cấp
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputNoiCap(String info) throws TestLinkAPIException{
		info("Nhập nơi cấp");
		type(AUTHO_CREATE_UPDATE_NOICAP,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập số điện thoại
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputPhone(String info) throws TestLinkAPIException{
		info("Nhập số điện thoại");
		type(AUTH_CREATE_UPDATE_PHONE,info,true);
		Utils.pause(100);
	}
	/**
	 * Check hoặc uncheck Đã đăng ký người thụ hưởng checkbox
	 * @throws TestLinkAPIException 
	 */
	public void checkIsMember() throws TestLinkAPIException{
		if(waitForAndGetElement(AUTH_CREATE_UPDATE_ISMEMBER_CHECKED,3000,0)!=null){
			info("Uncheck đã đăng ký người thụ hưởng");
			check(AUTH_CREATE_UPDATE_ISMEMBER_UNCHECKED,2);
		}else {
			info("Check đã đăng ký người thụ hưởng");
			check(AUTH_CREATE_UPDATE_ISMEMBER_CHECKED,2);
		}
	}
	/**
	 * Click vào nút Tạo mới hoặc nút Cập nhật
	 * @throws TestLinkAPIException 
	 */
	public void create_update_btn() throws TestLinkAPIException{
		info("Click vào nút Tạo mới hoặc cập nhật");
		click(AUTH_CREATE_UPDATE_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút đóng
	 * @throws TestLinkAPIException 
	 */
	public void close_btn() throws TestLinkAPIException{
		info("Click vào nút Đóng");
		click(AUTH_CREATE_UPDATE_CLOSE_BTN);
		Utils.pause(100);
	}
	
	//********************************CẬP NHẬT NGƯỜI ỦY QUYỀN***************************************************************\\
	/**
	 * Nhập bưu cục cấp 2
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByPostLevel2(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp hai");
		selectByValue(AUTH_UPDATE_SEARCH_POSTLEVEL2,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp 3
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByPostLevel3(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp ba");
		selectByValue(AUTH_UPDATE_SEARCH_POSTLEVEL3,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp 4
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByPostLevel4(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp bốn");
		selectByValue(AUTH_UPDATE_SEARCH_POSTLEVEL4,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập trạng thái
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByStatus(String info) throws TestLinkAPIException{
		info("Nhập trạng thái");
		select(AUTH_UPDATE_SEARCH_STATUS,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập họ tên
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByName(String info) throws TestLinkAPIException{
		info("Nhập họ tên");
		type(AUTH_UPDATE_SEARCH_NAME,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập CMND
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByCMND(String info) throws TestLinkAPIException{
		info("Nhập CMND");
		type(AUTH_UPDATE_SEARCH_CMND,info,true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút search
	 * @throws TestLinkAPIException 
	 */
	public void search_btn_update() throws TestLinkAPIException{
		info("Click vào nút tìm kiếm auth");
		click(AUTH_UPDATE_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Thêm mới
	 * @throws TestLinkAPIException 
	 */
	public void goToAddAccount() throws TestLinkAPIException{
		info("Click vào nút Thêm mới");
		click(AUTH_UPDATE_ADD_NEW_ACCOUNT);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Xóa
	 * @throws TestLinkAPIException 
	 */
	public void delete_btn() throws TestLinkAPIException{
		info("Click vào nút Xóa");
		click(AUTH_UPDATE_DELETE_BTN);
		Utils.pause(100);
	}
	/**
	 * Sửa thông tin một người thụ hưởng
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void edit_btn(String info) throws TestLinkAPIException{
		info("Click vào nút Sửa của người thụ hưởng:"+info);
		click(AUTH_UPDATE_ACCOUNTLIST_EDIT_BTN.replace("$value",info));
		Utils.pause(100);
	}
	/**
	 * Select all các account trong danh sách người thụ hưởng
	 * @throws TestLinkAPIException 
	 */
	public void selectAll() throws TestLinkAPIException{
		info("Click vào nút select All checkbox");
		check(AUTH_UPDATE_ACCOUNTLIST_CHECKBOX_ALL,2);
		Utils.pause(100);
	}
	/**
	 * Select từng account trong danh sách người thụ hưởng
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void selectAcount(String info) throws TestLinkAPIException{
		info("Chọn người thụ hưởng trong dánh sách");
		check(AUTH_UPDATE_ACCOUNTLIST_CHECKBOX.replace("$value",info),2);
		Utils.pause(100);
	}
	/**
	 * Nhập quan hệ với người ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputRelationShip(String info) throws TestLinkAPIException{
		info("Nhập quan hệ với người ủy quyền");
		type(AUTH_UPDATE_ACCOUNTLIST_RELATIONSHIP,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập nơi ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputOffice(String info) throws TestLinkAPIException{
		info("Nhập nơi ủy quyền");
		type(AUTH_UPDATE_ACCOUNTLIST_OFFICE,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập ngày bắt đầu ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void imputDateFrom(String info) throws TestLinkAPIException{
		info("Nhập ngày bắt đầu ủy quyền");
		type(AUTH_UPDATE_ACCOUNTLIST_DATEFROM,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập ngày kết thúc ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDateTo(String info) throws TestLinkAPIException{
		info("Nhập ngày kết thúc ủy quyền");
		type(AUTH_UPDATE_ACCOUNTLIST_DATETO,info,true);
		Utils.pause(100);
	}
	/**
	 * click vào nút Cập nhật của một người thụ hưởng trong danh sách
	 * @throws TestLinkAPIException 
	 */
	public void update_btn() throws TestLinkAPIException{
		info("Click vào nút Cập nhật trong danh sách người thụ hưởng");
		click(AUTH_UPDATE_ACCOUNTLIST_UPDATE_BTN);
		Utils.pause(100);
	}
	
	//********************************THÊM ACCOUNT (NGƯỜI THỤ HƯỞNG) VÀO DANH SÁCH NGƯỜI THỰ HƯỞNG***************************************************************\\
    /**
     * Nhập bưu cục cấp 2 của Account popup
     * @param info
     * @throws TestLinkAPIException 
     */
	public void inputSearchByPostLevel2AccountPopup(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp 2");
		selectByValue(AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL2,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp 3 của Account popup
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByPostLevel3AccountPopup(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp 3");
		selectByValue(AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL3,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp 4 của Account popup
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByPostLevel4AccountPopup(String info) throws TestLinkAPIException{
		info("Nhập bưu cục cấp 4");
		selectByValue(AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL4,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập trạng thái của Account popup
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByStatusTypeAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập trạng thái");
		select(AUTH_UPDATE_ADD_ACCOUNT_POPUP_STATUS,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập họ tên của account popup
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByNameAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập họ và tên");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_NAME,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập CMND của Account popup
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByCMNDAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập CMND");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_CMND,info,true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Search
	 * @throws TestLinkAPIException 
	 */
	public void search_btn_account_popup() throws TestLinkAPIException{
		info("Click vào nút search");
		click(AUTH_UPDATE_ADD_ACCOUNT_POPUP_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Chọn từng accoun trong danh sách 
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void selectAccountPopup(String info) throws TestLinkAPIException{
		info("Chọn account:"+info);
		check(AUTH_UPDATE_ADD_ACCOUNT_POPUP_ACCOUNT_CHECKBOX.replace("$value",info),2);
		Utils.pause(100);
	}
	/**
	 * Nhập mối quan hệ với người ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputRelationAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập quan hệ với người ủy quyền");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_RELATIONSHIP,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập nơi ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputOfficeAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập nơi ủy quyền");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_OFFICE,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập ngày bắt đầu ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDateFromAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập ngày bắt đầu ủy quyền");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_DATEFROM,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập ngày kết thúc ủy quyền
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDateToAccountPopup(String info) throws TestLinkAPIException{
		info("Nhập ngày kết thúc ủy quyền");
		type(AUTH_UPDATE_ADD_ACCOUNT_POPUP_DATETO,info,true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Thêm của Account popup
	 * @throws TestLinkAPIException 
	 */
	public void add_btn_account_popup() throws TestLinkAPIException{
		info("Click vào nút Thêm");
		click(AUTH_UPDATE_ADD_ACCOUNT_POPUP_ADD_BTN);
		Utils.pause(100);
	}
	/**
	 * Click vào nút đóng
	 * @throws TestLinkAPIException 
	 */
	public void close_btn_account_popup() throws TestLinkAPIException{
		info("Click vào nút Đóng");
		click(AUTH_UPDATE_ADD_ACCOUNT_POPUP_CLOSE_BTN);
		Utils.pause(100);
	}
	
	//***********************************************************************************************\\
	
}
