package org.selenium.emoney.admin.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.ManageAlert;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_Locator_QuanLyNhomQuyen;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class Admin_QuanLyNhomQuyen extends Admin_Locator_QuanLyNhomQuyen {

	ManageAlert alert;

	public Admin_QuanLyNhomQuyen(WebDriver dr) {
		driver = dr;
		alert = new ManageAlert(driver);
	}

	/**
	 * Chọn bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void selectPostLevels(String info) throws TestLinkAPIException {
		info("Chọn một bưu cục");
		select(ADMIN_QUANLYNHOMQUYEN_HOME_POST_LEVEL, info, 2);
		Utils.pause(100);
	}

	/**
	 * Mở trang Tạo mới nhóm quyền
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToCreateNewRole() throws TestLinkAPIException {
		info("Mở trang tạo nhóm quyền mới");
		click(ADMIN_QUANLYNHOMQUYEN_HOME_CREATE_BTN);
		Utils.pause(100);
	}

	/**
	 * Kiểm tra thông tin nhóm quyền có tồn tại
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyRoleInfoIsPresent(String info)
			throws TestLinkAPIException {
		info("Kiểm tra thông tin nhóm quyền có tồn tại trong hệ thống");
		waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_HOME_ROLEINFO.replace("$value", info),
				3000, 1);
	}

	/**
	 * Kiểm tra thông tin nhóm quyền không tồn tại
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyRoleInfoNOPresent(String info)
			throws TestLinkAPIException {
		info("Kiểm tra thông tin nhóm quyền không tồn tại trong hệ thống");
		waitForElementNotPresent(
				ADMIN_QUANLYNHOMQUYEN_HOME_ROLEINFO.replace("$value", info),
				3000, 1);
	}

	/**
	 * Mở trang chi tiết nhóm quyền
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void goToUpdateRole(String info) throws TestLinkAPIException {
		info("Mở trang chi tiết nhóm quyền");
		click(ADMIN_QUANLYNHOMQUYEN_HOME_ROLE_UPDATE.replace("$value", info));
		Utils.pause(100);
	}

	/**
	 * Xóa một nhóm quyền từ trang Home
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void deleteRoleFromHome(String info) throws TestLinkAPIException {
		info("Xóa một nhóm quyền từ trang Home");
		click(ADMIN_QUANLYNHOMQUYEN_HOME_ROLE_DELETE.replace("$value", info));
		waitForElementNotPresent(
				ADMIN_QUANLYNHOMQUYEN_HOME_ROLEINFO.replace("$value", info),
				3000, 1);
		Utils.pause(100);
	}

	/**
	 * Nhập cấp bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPostLevel(String info) throws TestLinkAPIException {
		info("Chọn cấp bưu cục");
		select(ADMIN_QUANLYNHOMQUYEN_DETAIL_POST_LEVEL, info, 2);
		Utils.pause(100);
	}

	/**
	 * Nhập tên nhóm quyền
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputNameRole(String info) throws TestLinkAPIException {
		info("Nhập tên nhóm quyền");
		type(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_NAME, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập mô tả nhóm quyền
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputDesRole(String info) throws TestLinkAPIException {
		info("Nhập mô tả nhóm quyền");
		type(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DESCRIPTION, info, true);
		Utils.pause(100);
	}

	/**
	 * Chọn tất cả các nhóm quyền con của một nhóm quyền cha
	 * 
	 * @param parent
	 * @throws TestLinkAPIException
	 */
	public void inputAllRoles(String parent) throws TestLinkAPIException {
		if (waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT.replace("$value",
						parent), 3000, 0) != null) {
			info("Chọn tất cả các quyền trong nhóm: " + parent);
			check(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT_CHECKBOX.replace(
					"$value", parent), 2);
		}
	}

	/**
	 * Chọn một nhóm quyền con của một nhóm quyền cha
	 * 
	 * @param parent
	 * @param child
	 * @throws TestLinkAPIException
	 */
	public void inputRole(String parent, String child)
			throws TestLinkAPIException {
		if (waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT.replace("$value",
						parent), 3000, 0) != null) {
			info("Expand nhóm quyền cha là: " + parent);
			click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT.replace("$value",
					parent));
		}

		if (waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_CHILD_CHECKBOX.replace(
						"$parent", parent).replace("$child", child), 3000, 0) != null) {
			info("Chọn quyền con");
			check(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_CHILD_CHECKBOX.replace(
					"$parent", parent).replace("$child", child), 2);
		}
	}

	/**
	 * Click vào nút Lưu
	 * 
	 * @throws TestLinkAPIException
	 */
	public void create_btn() throws TestLinkAPIException {
		info("Click vào nút Lưu");
		click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_SAVE_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Quay lại
	 * 
	 * @throws TestLinkAPIException
	 */
	public void cancel_btn() throws TestLinkAPIException {
		info("Click vào nút Quay lại");
		click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_BACK_BTN);
		Utils.pause(100);
	}

	/**
	 * Kiểm tra message lỗi của từng trường
	 * 
	 * @param info
	 * @param fieldNumber
	 * @throws TestLinkAPIException
	 */
	public void verifyErrorMessage(String info, String fieldNumber)
			throws TestLinkAPIException {
		info("Kiểm tra message lỗi");
		waitForAndGetElement(ADMIN_QUANLYNHOMQUYEN_DETAIL_ERROR_MESSAGE_1
				.replace("$value", info).replace("$field", fieldNumber), 3000,
				1);
	}

	/**
	 * Kiểm tra lỗi message của cả chức năng
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyErrorMessage(String info) throws TestLinkAPIException {
		info("Kiểm tra message lỗi");
		waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_DETAIL_ERROR_MESSAGE_2.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Kiểm tra message thành công
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifySuccessMessage(String info) throws TestLinkAPIException {
		info("Kiểm tra message thành công");
		waitForAndGetElement(
				ADMIN_QUANLYNHOMQUYEN_DETAIL_SUCCESS_MESSAGE.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Xóa một nhóm quyền từ trang chi tiết nhóm quyền
	 * 
	 * @param isDelete
	 * @throws TestLinkAPIException
	 */
	public void deleteRoleFromDetail(Boolean isDelete)
			throws TestLinkAPIException {
		info("Xóa một nhóm quyền từ trang chi tiết");
		click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE);
		if (isDelete) {
			info("click vào nút Xác nhận");
			click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE_OK);
		} else {
			info("click vào nút Hủy");
			click(ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE_HUY);
		}
		Utils.pause(100);
	}
}
