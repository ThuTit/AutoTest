package org.selenium.emoney.admin.common;

import static org.selenium.common.TestLogger.info;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_locator_QuanLyNguoiDung;

import testlink.api.java.client.TestLinkAPIException;

public class Admin_QuanLyNguoiDung extends Admin_locator_QuanLyNguoiDung {


	public Admin_QuanLyNguoiDung(WebDriver dr) {
		driver = dr;
	}

	/**
	 * Nhập username vào trường search
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchUserName(String info) throws TestLinkAPIException {
		info("Nhập username");
		type(ADMIN_QUANLYNGUOIDUNG_SEARCH_USERNAME, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập email vào trường search
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchEmail(String info) throws TestLinkAPIException {
		info("Nhập email");
		type(ADMIN_QUANLYNGUOIDUNG_SEARCH_EMAIL, info, true);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp tỉnh
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchPostLevel2(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp tỉnh");
		select(ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL2, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp quận/huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchPostLevel3(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp quận/huyện");
		select(ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL3, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputSearchPostLevel4(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp bưu cục");
		select(ADMIN_QUANLYNGUOIDUNG_SEARCH_POSTLEVEL4, info, 2);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Search
	 * 
	 * @throws TestLinkAPIException
	 */
	public void search_btn() throws TestLinkAPIException {
		info("Click vào nút Tìm kiếm");
		click(ADMIN_QUANLYNGUOIDUNG_SEARCH_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào link Xem của một user
	 * 
	 * @param username
	 * @throws TestLinkAPIException
	 */
	public void goToUserDetail(String username) throws TestLinkAPIException {
		info("Click vào link Xem");
		click(ADMIN_QUANLYNGUOIDUNG_XEM_BTN.replace("$username", username));
		Utils.pause(100);
	}

	/**
	 * Mở trang tọa người dùng mới
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToCreateNewUser() throws TestLinkAPIException {
		info("Click vào nút Tạo người dùng mới");
		click(ADMIN_QUANLYNGUOIDUNG_TAONGUOIDUNG_BTN);
		Utils.pause(100);
	}

	/**
	 * Kiểm tra thông tin người dùng
	 * 
	 * @param username
	 * @param name
	 * @param email
	 * @throws TestLinkAPIException
	 */
	public void verifyUserInfo(String username, String name, String email)
			throws TestLinkAPIException {
		info("Kiểm tra thông tin người dùng với:" + username + "," + name + ","
				+ email);
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_USERINFO.replace("$username", username)
						.replace("$name", name).replace("$email", email), 3000,
				1);
	}

	/**
	 * Mở trang tạo người dùng mới hàng loạt
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToCreateMultiUser() throws TestLinkAPIException {
		info("Click vào link Tạo hàng loạt");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Tạo mới
	 * 
	 * @throws TestLinkAPIException
	 */
	public void create_btn() throws TestLinkAPIException {
		info("Click vào nút Tạo mới");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CREATE_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Đóng
	 * 
	 * @throws TestLinkAPIException
	 */
	public void cancelCreate_btn() throws TestLinkAPIException {
		info("Click vào nút Đóng");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CANCEL_BTN);
		Utils.pause(100);
	}

	/**
	 * Nhập username vào trường Tên đăng nhập
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputUserName(String info) throws TestLinkAPIException {
		info("Nhập username");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_USERNAME, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập họ vào trường Họ
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputFirstName(String info) throws TestLinkAPIException {
		info("Nhập họ");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_FIRSTNAME, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập tên vào trường Tên
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputLastName(String info) throws TestLinkAPIException {
		info("Nhập tên");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_LASTNAME, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập ngày sinh vào trường ngày sinh
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputBirthday(String info) throws TestLinkAPIException {
		info("Nhập ngày sinh");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_BIRTHDAY, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập CMND
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputCMND(String info) throws TestLinkAPIException {
		info("Nhập CMND");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_CMND, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập Mã bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPostCode(String info) throws TestLinkAPIException {
		info("Nhập mã bưu cục");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTCODE, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập trạng thái hoạt động của người dùng
	 * 
	 * @throws TestLinkAPIException
	 */
	public void inputStatus() throws TestLinkAPIException {
		if (waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_CHECKED, 3000, 0) != null) {
			info("Deactive người dùng");
			check(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_UNCHECKED, 2);
		} else {
			info("Active người dùng");
			check(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_CHECKED, 2);
		}
	}

	/**
	 * Nhập email
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputEmail(String info) throws TestLinkAPIException {
		info("Nhập email");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_EMAIL, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập số điện thoại
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPhone(String info) throws TestLinkAPIException {
		info("Nhập số điện thoại");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_PHONE, info, true);
		Utils.pause(100);
	}

	/**
	 * Chọn tỉnh/thành
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputProvince(String info) throws TestLinkAPIException {
		info("Chọn tỉnh/thành");
		select(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_PROVINCE, info, 2);
		Utils.pause(100);
	}

	/**
	 * chọn Quận/Huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputDistrict(String info) throws TestLinkAPIException {
		info("Chọn quận/huyện");
		select(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_DISTRICT, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp tỉnh
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPostLevel2(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp tỉnh");
		selectByValue(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL2, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp quận/huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPostLevel3(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp quận/huyện");
		selectByValue(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL3, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục cấp bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputPostLevel4(String info) throws TestLinkAPIException {
		info("Chọn bưu cục cấp bưu cục");
		selectByValue(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_POSTLEVEL4, info, 2);
		Utils.pause(100);
	}

	/**
	 * Chọn nhóm quyền
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputRole(String info) throws TestLinkAPIException {
		info("Chọn nhóm quyền");
		type(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_ROLE,info,true);
		waitForAndGetElement(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_ROLE).sendKeys(Keys.RETURN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Tải lên của popup tạo user hàng loạt
	 * 
	 * @throws TestLinkAPIException
	 */
	public void upload_btn() throws TestLinkAPIException {
		info("Click vào nút Tải lên");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_UPLOAD_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Đóng của popup Tạo user hàng loạt
	 * 
	 * @throws TestLinkAPIException
	 */
	public void cancelUpload_btn() throws TestLinkAPIException {
		info("Click vào nút Đóng");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_DONG_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào icon Close của popup Tải user hàng loạt
	 * 
	 * @throws TestLinkAPIException
	 */
	public void closeUpload_btn() throws TestLinkAPIException {
		info("Click vào icon Close của popup");
		click(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_MULTI_USER_CLOSE_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Cập nhật khi update user info
	 * 
	 * @throws TestLinkAPIException
	 */
	public void update_btn() throws TestLinkAPIException {
		info("Click vào nút Cập nhật");
		click(ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_UPDATE_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Đóng khi update user info
	 * 
	 * @throws TestLinkAPIException
	 */
	public void cancelUpdate_btn() throws TestLinkAPIException {
		info("Click vào nút Đóng");
		click(ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_DONG_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Đặt lại mật khẩu
	 * 
	 * @throws TestLinkAPIException
	 */
	public void goToResetPassword() throws TestLinkAPIException {
		info("Click vào nút Đặt lại Mật khẩu");
		click(ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_RESETPASSWORD_BTN);
		Utils.pause(100);
	}

	/**
	 * Kiểm tra username
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyUsername(String info) throws TestLinkAPIException {
		info("Kiểm tra lại user name");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_USERNAME_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra Họ
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyFirstName(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Họ");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_FIRSTNAME_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại Tên
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyLastName(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Tên");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_LASTNAME_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại ngày sinh
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyBirthday(String info) throws TestLinkAPIException {
		info("Kiểm tra lại ngày sinh");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_BIRTHDAY_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại CMND
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyIDCard(String info) throws TestLinkAPIException {
		info("Kiểm tra lại CMND");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_CMND_VALUE.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Kiểm ta lại Mã bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPostCode(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Mã bưu cục");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_MABUUCUC_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại pincode
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPinCode(String info) throws TestLinkAPIException {
		info("Kiểm tra lại PinCode");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PINCODE_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra trạng thái hoạt động
	 * 
	 * @param isChecked
	 * @throws TestLinkAPIException
	 */
	public void verifyStatus(Boolean isChecked) throws TestLinkAPIException {
		info("Kiểm tra lại Trạng thái hoạt động");
		if(isChecked)
			waitForAndGetElement(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_CHECKED, 3000, 1);
		else waitForAndGetElement(ADMIN_QUANLYNGUOIDUNG_CREATEUSER_STATUS_UNCHECKED, 3000, 1);
	}

	/**
	 * Kiểm tra email
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyEmail(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Email");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_EMAIL_VALUE.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Kiểm tra Phone
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPhone(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Phone");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PHONE_VALUE.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Kiểm tra lại Tỉnh thành
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void veriyProvince(String info) throws TestLinkAPIException {
		info("Kiểm tra lại Tỉnh/Thành");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_PROVINCE_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại Quận/Huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyDistrict(String info) throws TestLinkAPIException {
		info("Kiểm tra lại quận/huyện");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_DISTRICT_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra bưu cục cấp tổng công ty
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPostLevel1(String info) throws TestLinkAPIException {
		info("Kiểm tra lại bưu cục cấp tổng công ty");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL1_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra bưu cục cấp tỉnh thành
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPostLevel2(String info) throws TestLinkAPIException {
		info("Kiểm tra lại bưu cục cấp tỉnh\thành");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL2_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra bưu cục cấp quận/huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPostLevel3(String info) throws TestLinkAPIException {
		info("Kiểm tra lại bưu cục cấp quận/huyện");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL3_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra bưu cục cấp bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyPostLevel4(String info) throws TestLinkAPIException {
		info("Kiểm tra lại bưu cục cấp bưu cục");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL4_VALUE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra các trường không thể edit
	 * 
	 * @throws TestLinkAPIException
	 */
	public void verifyDisabledFiles() throws TestLinkAPIException {
		info("Kiểm tra trường tên đăng nhập không thể edit");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_USERNAME_DISABLED, 3000, 1);
		info("Kiểm tra trường bưu điện cấp tổng bưu cục không thể edit");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_POSTLEVEL1_DISABLED, 3000, 1);
	}

	/**
	 * Kiểm tra nhóm phân quyền
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyRoles(String info) throws TestLinkAPIException {
		info("Kiểm tra lại nhóm phân quyền");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_ROLE_VALUE.replace("$value",
						info), 3000, 1);
	}

	/**
	 * Kiểm tra lại thông tin error message
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyErrorMessage(String info) throws TestLinkAPIException {
		info("Kiểm tra error mesage hiển thị");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_ERROR_MESSAGE.replace(
						"$value", info), 3000, 1);
	}

	/**
	 * Kiểm tra lại thông tin message success
	 * 
	 * @throws TestLinkAPIException
	 */
	public void verifySuccMessage() throws TestLinkAPIException {
		info("Kiểm tra success mesage hiển thị");
		waitForAndGetElement(ADMIN_QUANLYNGUOIDUNG_UPDATEUSER_SUCCESS_MESSAGE, 3000, 1);
	}

	/**
	 * Nhập mật khẩu mới của Đặt lại mật khẩu popup
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputNewPassword(String info) throws TestLinkAPIException {
		info("Nhập mật khẩu mới");
		type(ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_PASSWORD, info, true);
		Utils.pause(100);
	}

	/**
	 * Nhập lại mật khẩu mới của Đặt lại mật khẩu popup
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputConfirmPassword(String info) throws TestLinkAPIException {
		info("Nhập lại mật khẩu mới");
		type(ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_CONFIRMPASSWORD, info, true);
		Utils.pause(100);
	}

	/**
	 * Click vào nút Cập nhật của Đặt lại mật khẩu popup
	 * 
	 * @throws TestLinkAPIException
	 */
	public void updatePassword_btn() throws TestLinkAPIException {
		info("Click vao nút Cập nhập lại mật khẩu");
		click(ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_UPDATE_BTN);
		Utils.pause(100);
	}

	/**
	 * click vào nút Đóng của Đặt lại mật khẩu popup
	 * 
	 * @throws TestLinkAPIException
	 */
	public void cancelUpdatePassword_btn() throws TestLinkAPIException {
		info("Click vao nút Đóng");
		click(ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_DONG_BTN);
		Utils.pause(100);
	}

	/**
	 * Click vào icon Close của Đặt lại mật khẩu popup
	 * 
	 * @throws TestLinkAPIException
	 */
	public void closeUpdatePassword_btn() throws TestLinkAPIException {
		info("Click vao icon Close của popup");
		click(ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_CLOSE_BTN);
		Utils.pause(100);
	}

	/**
	 * Kiểm tra lại message về việc đặt lại mật khẩu
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void verifyMessageUpdatePass(String info)
			throws TestLinkAPIException {
		info("Kiểm tra message sau khi cập nhật lại mật khẩu");
		waitForAndGetElement(
				ADMIN_QUANLYNGUOIDUNG_RESETPASSWORD_MESSAGE.replace("$mesg",
						info), 3000, 1);
	}

	
}
