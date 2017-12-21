package org.selenium.emoney.admin.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_Locator_TaoFileTopup;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class Admin_TaoFileTopup extends Admin_Locator_TaoFileTopup{

	public Admin_TaoFileTopup(WebDriver dr){
		driver=dr;
	}
	/**
	 * Chọn bưu cục cấp tỉnh
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputProvince(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp tỉnh");
		selectByValue(ADMIN_TAOFILETOPUP_CREATE_PROVINCE_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Chọn bưu cục cấp quận/huyện
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputDistrict(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp quận/huyện");
		selectByValue(ADMIN_TAOFILETOPUP_CREATE_DISTRICT_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Click vào nút yêu cầu tạo thẻ
	 * @throws TestLinkAPIException
	 */
	public void create_btn() throws TestLinkAPIException{
		info("Click vào nút yêu cầu tạo thẻ");
		click(ADMIN_TAOFILETOPUP_CREATE_BTN);
		Utils.pause(100);
	}
	/**
	 * Mở trang xem danh sách yêu cầu tạo topup
	 * @throws TestLinkAPIException 
	 */
	public void goToViewListTopup() throws TestLinkAPIException{
		info("Click vào nút Xem Danh sách yêu cầu");
		click(ADMIN_TAOFILETOPUP_CREATE_XEM_DANHSACH_BTN);
		Utils.pause(100);
	}
	/**
	 * Chọn bưu cục cấp tỉnh để tìm kiếm
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchByProvince(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp tỉnh");
		selectByValue(ADMIN_TAOFILETOPUP_SEARCH_PROVINCE_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Chọn bưu cục cấp quận/huyện để tìm kiếm
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByDistrict(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp quận/huyện");
		selectByValue(ADMIN_TAOFILETOPUP_SEARCH_DISTRICT_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Search
	 * @throws TestLinkAPIException
	 */
	public void search_btn() throws TestLinkAPIException{
		info("Click vào nút Search");
		click(ADMIN_TAOFILETOPUP_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Kiểm tra thông tin của topup
	 * @param info1
	 * @param info2
	 * @throws TestLinkAPIException
	 */
	public void verifyTopupInfo(String info1,String info2) throws TestLinkAPIException{
		info("Kiểm tra thông tin topup");
		waitForAndGetElement(ADMIN_TAOFILETOPUP_TOPUPINFO.replace("$value1",info1).replace("$value2",info2),3000,1);
	}
	/**
	 * Mở trang yêu cầu tạo topup
	 * @throws TestLinkAPIException 
	 */
	public void goToCreateNewTopup() throws TestLinkAPIException{
		info("Click vào nút Yêu cầu tạo Topup");
		click(ADMIN_TAOFILETOPUP_DANHSACH_YEUCAUTAOTOPUP_BTN);
		Utils.pause(100);
	}
	
}
