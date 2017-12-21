package org.selenium.emoney.admin.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_Locator_TaoThe;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class Admin_TaoThe extends Admin_Locator_TaoThe {
	
	
	public Admin_TaoThe(WebDriver dr){
		driver=dr;
	}
	/**
	 * Nhập đơn vị phát hành
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputPublisher(String info) throws TestLinkAPIException{
		info("Nhập đơn vị phát hành");
		type(ADMIN_TAOTHE_DONVIPHATHANH,info,true);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp tỉnh
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputProvince(String info) throws TestLinkAPIException{
		info("chọn bưu cục cấp tỉnh");
		selectByValue(ADMIN_TAOTHE_PROVINCE_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp quận/huyện
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputDistrict(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp huyện");
		selectByValue(ADMIN_TAOTHE_DISTRICT_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập loại thẻ
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputCardType(String info) throws TestLinkAPIException{
		info("Chọn loại thẻ");
		select(ADMIN_TAOTHE_LOAI_THE,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập số lượng thẻ
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputQuality(String info) throws TestLinkAPIException{
		info("Nhập số lượng thẻ");
		type(ADMIN_TAOTHE_SOLUONG_THE,info,true);
		Utils.pause(100);
	}
	/**
	 * Click vào nút Yêu cầu tạo thẻ
	 * @throws TestLinkAPIException 
	 */
	public void create_card_btn() throws TestLinkAPIException{
		info("Click vào nút Yêu cầu tạo thẻ");
		click(ADMIN_TAOTHE_CREATE_CARD_BTN);
		Utils.pause(100);
	}
	/**
	 * Mở trang Danh sách yêu cầu
	 * @throws TestLinkAPIException 
	 */
	public void goToViewListCard() throws TestLinkAPIException{
		info("Mở trang Danh sách yêu cầu");
		click(ADMIN_TAOTHE_XEM_DANHSACH_YEUCAU_BTN);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp tỉnh để tìm kiếm
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByProvince(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp tỉnh");
		selectByValue(ADMIN_TAOTHE_SEARCH_PROVINCE_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập bưu cục cấp quận/huyện để tìm kiếm
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByDistrict(String info) throws TestLinkAPIException{
		info("Chọn bưu cục cấp quận/huyện");
		selectByValue(ADMIN_TAOTHE_SEARCH_DISTRICT_LEVEL,info,2);
		Utils.pause(100);
	}
	/**
	 * Nhập loại thẻ để tìm kiếm
	 * @param info
	 * @throws TestLinkAPIException 
	 */
	public void inputSearchByCardType(String info) throws TestLinkAPIException{
		info("Chọn loại thẻ");
		select(ADMIN_TAOTHE_SEARCH_LOAI_THE,info,2);
		Utils.pause(100);
	}
	/**
	 * Click vào nút search
	 * @throws TestLinkAPIException 
	 */
	public void search_btn() throws TestLinkAPIException{
		info("Click vào nút Search");
		click(ADMIN_TAOTHE_SEARCH_BTN);
		Utils.pause(100);
	}
	/**
	 * Kiểm tra các thông tin của thẻ
	 * @param info1
	 * @param info2
	 * @throws TestLinkAPIException 
	 */
	public void verifyRequestCardInfo(String info1,String info2) throws TestLinkAPIException{
		info("Kiểm tra thông tin của thẻ");
		waitForAndGetElement(ADMIN_TAOTHE_CARD_INFO.replace("$value1",info1).replace("$value2",info2),3000,1);
	}
	/**
	 * Mở trang Yêu cầu tạo thẻ
	 * @throws TestLinkAPIException 
	 */
	public void goToCreateNewCard() throws TestLinkAPIException{
		info("Mở trang yêu cầu tạo thẻ");
		click(ADMIN_TAOTHE_DANHSACHYEUCAU_YEUCAUTAOTHE_BTN);
		Utils.pause(100);
	}
	
	
}
