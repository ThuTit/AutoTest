package org.selenium.emoney.frontEnd.common;

import static org.selenium.common.TestLogger.info;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_RutTien;

import testlink.api.java.client.TestLinkAPIException;

public class FrontEnd_RutTien extends FrontEnd_Locator_RutTien{

	public FrontEnd_RutTien(WebDriver dr) {
		// TODO Auto-generated constructor stub
		driver = dr;
	}
	
	/**
	 * Nhập mã thẻ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputIdCard(String info) throws IOException, TestLinkAPIException {
		info ("Nhập mã thẻ");
		if ( info != "") 
			type( ELEMENT_RT_SEARCH_FIELD, info, true);
		Utils.pause(100);
	}

	/**
	 * Click vào icon Search
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void search() throws IOException, TestLinkAPIException {
		info ("Click vào icon Search");
		click(ELEMENT_RT_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Kiểm tra thông tin họ tên
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyNameInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin họ tên");
	    waitForAndGetElement(ELEMENT_RT_FULLNAME_FIELD.replace("$info", info), 3000, 1);
	}
	
	/**
	 * Kiểm tra thông tin ngày sinh
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyBirthdayInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin ngày sinh");
	    waitForAndGetElement(ELEMENT_RT_BIRTHDAY_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * Kiểm tra thông tin địa chỉ
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyAddressInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin địa chỉ");
	    waitForAndGetElement(ELEMENT_RT_ADDRESS_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * 
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyGTTTNumberInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin số giấy tờ tùy thân");
	    waitForAndGetElement(ELEMENT_RT_GTTT_NUMBER_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * Kiểm tra thông tin số sổ BHXH
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifySocialInsuranceNumberInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin số sổ BHXH");
	    waitForAndGetElement(ELEMENT_RT_SOCIAL_INSURANCE_NUMBER_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * Kiểm tra thông tin số trang
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPageNumberInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin số trang");
		waitForAndGetElement(ELEMENT_RT_PAGE_NUMBER_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * Kiểm tra thông tin số dòng
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyLineNumberInfo(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra thông tin số dòng");
		waitForAndGetElement(ELEMENT_RT_LINE_NUMBER_FIELD.replace("$info", info), 3000, 1);
	}
	/**
	 * Kiểm tra số tiền có trong tài khoản
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyEmoneyBalance(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra số tiền có trong tài khoản");		
		waitForAndGetElement(ELEMENT_RT_EMONEY_BALANCE_FIELD.replace("$info", info), 3000, 1);
	}
	
	/**
	 * Click vào nút rút tiền
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void exeWithdraw(String info) throws IOException, TestLinkAPIException {
		info ("Click vào nút rút tiền");
		click(ELEMENT_RT_WITHDRAW_BTN);
		Utils.pause(100);
	}
	/**
	 * Kiểm tra message hiển thị
	 * @param info
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyMessage(String info) throws IOException, TestLinkAPIException {
		info ("Kiểm tra message hiển thị");
        waitForAndGetElement(ELEMENT_RT_MESSAGE.replace("$info", info), 3000, 1);
	}
}
