package org.selenium.emoney.admin.common;

import org.openqa.selenium.WebDriver;
import org.selenium.emoney.admin.locator.Admin_Locator_HomePage;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class Admin_HomePage extends Admin_Locator_HomePage {

	public Admin_HomePage(WebDriver dr) {
		driver = dr;
	}

	/**
	 * Vào trang quản lý nhóm quyền
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToQuanLyNhomQuyen() throws TestLinkAPIException {
		info("Mở trang quản lý nhóm quyền");
		click(ADMIN_LEFTMENU_QUANLYNHOMQUYEN);
		waitForAndGetElement(ADMIN_QUANLYNHOMQUYEN_TAONHOMQUYEN_TBN, 2000, 1);
		info("The page is shown");
	}

	/**
	 * Vào trang quản lý người dùng
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToQuanLyNguoiDung() throws TestLinkAPIException {
		// TODO Auto-generated method stub
		info("Mở trang quản lý người dùng");
		click(ADMIN_LEFTMENU_QUANLYNGUOIDUNG);
		waitForAndGetElement(ADMIN_QUANLYNGUOIDUNG_TAONGUOIDUNGMOI, 2000, 1);
		info("The page is shown");
	}

	/**
	 * Mở trang tạo tài khoản
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToTaoTaiKhoan() throws TestLinkAPIException {
		info("Hoverover lên link Thao tac hang loat");
		mouseOverAndClick(ADMIN_LEFTMENU_THAOTACHANGLOAT);
		info("Click vào Link Tạo Tài khoản");
		click(ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOTAIKHOAN);
		waitForAndGetElement(ADMIN_TAOTAIKHOAN_TITLE, 3000, 1);
		info("The page is shown");
	}

	/**
	 * Mở trang nạp tiền
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToNapTien() throws TestLinkAPIException {
		info("Hoverover lên link Thao tac hang loat");
		mouseOverAndClick(ADMIN_LEFTMENU_THAOTACHANGLOAT);
		info("Click vào Link Nạp Tiền");
		click(ADMIN_LEFTMENU_THAOTACHANGLOAT_NAPTIEN);
		waitForAndGetElement(ADMIN_NAPTIEN_TITLE, 3000, 1);
		info("The page is shown");
	}

	/**
	 * Mở trang upload thẻ
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToUploadThe() throws TestLinkAPIException {
		info("Hoverover lên link Thao tac hang loat");
		mouseOverAndClick(ADMIN_LEFTMENU_THAOTACHANGLOAT);
		info("Click vào Link Upload thẻ");
		click(ADMIN_LEFTMENU_THAOTACHANGLOAT_UPLOADTHE);
		waitForAndGetElement(ADMIN_UPLOADTHE_TITLE, 3000, 1);
		info("The page is shown");
	}

	/**
	 * Mở trang tạo Thẻ
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToTaoThe() throws TestLinkAPIException {
		info("Hoverover lên link Thao tac hang loat");
		mouseOverAndClick(ADMIN_LEFTMENU_THAOTACHANGLOAT);
		info("Click vào Link Tạo Thẻ");
		click(ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOTHE);
		waitForAndGetElement(ADMIN_TAOTHE_TITLE, 3000, 1);
		info("The page is shown");
	}

	/**
	 * Mở trang tạo popup
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToTaoPopupFile() throws TestLinkAPIException {
		info("Hoverover lên link Thao tac hang loat");
		mouseOverAndClick(ADMIN_LEFTMENU_THAOTACHANGLOAT);
		info("Click vào Link Tạo popup");
		click(ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOPOPUPFILE);
		waitForAndGetElement(ADMIN_TAOPOPUP_TITLE, 3000, 1);
		info("The page is shown");
	}

}
