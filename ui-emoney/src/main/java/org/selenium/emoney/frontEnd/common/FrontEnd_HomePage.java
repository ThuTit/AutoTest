package org.selenium.emoney.frontEnd.common;

import org.openqa.selenium.WebDriver;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_HomePage;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class FrontEnd_HomePage extends FrontEnd_Locator_HomePage{

	public FrontEnd_HomePage(WebDriver dr){
		driver = dr;
	}
	
	/**
	 * Mở trang rút tiền
	 * @throws TestLinkAPIException 
	 */
	public void goToRutTien() throws TestLinkAPIException {
		// TODO Auto-generated method stub
		info("Mở trang rút tiền");
		click(ELEMENT_HOMEPAGE_MENU_RUTTIEN);
		waitForAndGetElement(ELEMENT_RUTTIEN_SEARCH_FIELD,2000,1);
		info("Trang rút tiền được hiển thị");
	}
	
	/**
	 * Mở trang thông tin tài khoản
	 * @throws TestLinkAPIException 
	 */
	public void goToThongTinTaiKhoan() throws TestLinkAPIException{
		info("Mở trang thông tin tài khoản");
		click(ELEMENT_HOMEPAGE_MENU_THONGTINTAIKHOAN);
		waitForAndGetElement(ELEMENT_TTTK_SEARCH_FIELD,3000,1);
		info("Trang thông tin tài khoản đã mở");
	}
	
	/**
	 * Mở trang danh sách người thụ hưởng
	 * @throws TestLinkAPIException 
	 */
	public void goToDanhSachNguoiThuHuong() throws TestLinkAPIException{
		info("Mở trang danh sách người thụ hưởng");
		click(ELEMENT_HOMEPAGE_MENU_DANHSACHNGUOITHUHUONG);
		waitForAndGetElement(ELEMENT_DSNTH_TIMKIEM_BTN,3000,1);
		info("Trang thông tin tài khoản đã mở");
	}
	
	/**
	 * Mở trang danh sách quản lý ủy quyền
	 * @throws TestLinkAPIException 
	 */
	public void goToQuanLyUyQuyen() throws TestLinkAPIException{
		info("Mở trang quản lý ủy quyền");
		click(ELEMENT_HOMEPAGE_MENU_QUANLYUYQUYEN);
		waitForAndGetElement(ELEMENT_QLUQ_SEARCH_FIELD,3000,1);
		info("Trang quản lý ủy quyền đã mở");
	}
	/**
	 * Mở trang quản lý giao dịch
	 * @throws TestLinkAPIException 
	 */
	public void goToQuanLyGiaoDich() throws TestLinkAPIException{
        info("Mở trang quản lý giao dịch");
        click(ELEMENT_HOMEPAGE_MENU_QUANLYGIAODICH);
        waitForAndGetElement(ELEMENT_QLGD_TIMKIEM_BTN,3000,1);
        info("Trang quản lý giao dịch đã mở");
	}
	/**
	 * Mở trang điện sự vụ
	 * @throws TestLinkAPIException 
	 */
	public void goToDienSuVu() throws TestLinkAPIException{
		info("Mở trang Điện sự vụ");
		click(ELEMENT_HOMEPAGE_MENU_DIENSUVU);
		waitForAndGetElement(ELEMENT_DIENSUVU_TRANGTHAI_DROPDOWN,3000,1);
		info("Trang điện sự vụ đã mở");
	}
	
	/**
	 * Mở trang báo cáo
	 * @throws TestLinkAPIException 
	 */
	public void goToBaoCao() throws TestLinkAPIException{
		info("Mở trang báo cáo");
		click(ELEMENT_HOMEPAGE_MENU_BAOCAO);
		waitForAndGetElement(ELEMENT_BAOCAO_CREATE_BTN,3000,1);
		info("Trang báo cáo đã mở");
	}
	
	/**
	 * Mở trang hồ sơ người dùng
	 * @throws TestLinkAPIException 
	 */
	public void goToHoSoNguoiDung() throws TestLinkAPIException{
		info("Mở trang Hồ sơ người dùng");
		click(ELEMENT_HOMEPAGE_MENU_HOSONGUOIDUNG);
		waitForAndGetElement(ELEMENT_HOSONGUOIDUNG_USERNAME,3000,1);
		info("Trang hồ sơ người dùng đã mở");
	}
	
	
}
