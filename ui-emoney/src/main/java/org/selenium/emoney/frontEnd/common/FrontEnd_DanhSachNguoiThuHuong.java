package org.selenium.emoney.frontEnd.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.*;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.*;

import java.io.IOException;

public class FrontEnd_DanhSachNguoiThuHuong extends FrontEnd_Locator_DanhSachNguoiThuHuong{

	
	public FrontEnd_DanhSachNguoiThuHuong(WebDriver dr){
		driver = dr;
	}
	/**
	 * Chọn bưu cục cấp 2
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel2(String info) throws IOException, TestLinkAPIException {
		info ("Bấm mở thẻ span");		
		click( ELEMENT_DSTH_BUUCUC_CAP2_SPAN);
		Utils.pause(100);
		info ("Chọn bưu cục cấp 2");
		if ( info != "" ) 
			select( ELEMENT_DSTH_BUUCUC_CAP2_SELECTED, info, 2);
		Utils.pause(100);
		
	}
	/**
	 * Chọn bưu cục cấp 3
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel3(String info) throws IOException, TestLinkAPIException {
		info ("Bấm mở thẻ span");		
		click( ELEMENT_DSTH_BUUCUC_CAP3_SPAN);
		Utils.pause(100);
		info ("Chọn bưu cục cấp 3");
		if ( info != "" ) 
			select( ELEMENT_DSTH_BUUCUC_CAP3_SELECTED, info, 2);
		Utils.pause(100);
		
	}
	/**
	 * Chọn bưu cục cấp 4
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputLevel4(String info) throws IOException, TestLinkAPIException {
		info ("Bấm mở thẻ span");		
		click( ELEMENT_DSTH_BUUCUC_CAP4_SPAN);
		Utils.pause(100);
		info ("Chọn bưu cục cấp 4");
		if ( info != "" ) 
			select( ELEMENT_DSTH_BUUCUC_CAP4_SELECTED, info, 2);
		Utils.pause(100);
	}
	/**
	 * Chọn trạng thái
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputStatus(String info) throws IOException, TestLinkAPIException {
		info ("Bấm mở thẻ span trạng thái");		
		click( ELEMENT_DSTH_STATUS_SPAN);
		Utils.pause(100);
		info ("Chọn trạng thái");
		if ( info != "" ) 
			select( ELEMENT_DSTH_STATUS_SELECTED, info, 2);
		Utils.pause(100);
		
	}
	/**
	 * Nhập họ và tên
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputName(String info) throws IOException, TestLinkAPIException {
		info ("Nhập họ và tên");
		type(ELEMENT_DSTH_NAME_FIELD, info, true);
		Utils.pause(100);
		
	}
	/**
	 * Nhập số GTTT
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputGTTTNumber(String info) throws IOException, TestLinkAPIException {
		info ("Nhập số GTTT");
		type(ELEMENT_DSTH_GTTT_NUMBER_FIELD, info, true);
		Utils.pause(100);
		
	}
	/**
	 * Nhập Mã thành viên
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputEmoneyId(String info) throws IOException, TestLinkAPIException {
		info ("Nhập Mã thành viên");
		type(ELEMENT_DSTH_EMONEY_ID_FIELD, info, true);
		Utils.pause(100);
	}
	/**
	 * Nhập thời gian tạo
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDate(String info) throws IOException, TestLinkAPIException {
		info ("Nhập thời gian tạo");
		type( ELEMENT_DSTH_DATE_FIELD, info, true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút tìm kiếm
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void search() throws IOException, TestLinkAPIException {
		info ("Click vào nút tìm kiếm");
		click(ELEMENT_DSTH_SEARCH_BTN);
		Utils.pause(300);
	}
	/**
	 * Kiểm tra các thông tin của tài khoản trong danh sách
	 * @param idCard
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void verifyListAccountInfo(String idCard, String info ) throws IOException, TestLinkAPIException {
		info ("Kiểm tra các thông tin của tài khoản trong danh sách");
		if ( idCard != "" ){
			waitForAndGetElement(ELEMENT_DSTH_CARD_INFO.replace("$idCard", idCard), 3000, 1);
			if ( info != "") 
				waitForAndGetElement(ELEMENT_DSTH_ACCOUNT_INFO.replace("$idCard", idCard).replace("$info", info), 3000, 1);
		}
		
		
	}
	
	
}
