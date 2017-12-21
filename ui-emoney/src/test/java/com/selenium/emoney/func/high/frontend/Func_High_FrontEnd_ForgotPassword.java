package com.selenium.emoney.func.high.frontend;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class Func_High_FrontEnd_ForgotPassword extends TestConfig{		
		/**
		* Test ID:EM-97
		* Test case name:Kiểm Tra Lấy Lại Mất Khẩu Thành Công Với Email Đúng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Click vào link "Quên mật khẩu"
		* 3. Nhập email đúng và tồn tại trong hệ thống
		* 4. Click vào nút Gửi
		* 5. Login vào email và click lên link resetpassword
		* 6. Nhập password mới
		* 7. Login với pasword mới
		* Expected Result:
		* 1. Trang WEB mở thành công
		* 2.  Màn hình "Quên mật khẩu" được hiển thị
		* 3.  Email được nhập
		* 4.  Một link reset mật khẩu được gửi tới địa chỉ email
		* 5. Reset password màn hình được hiển thị
		* 6. Đổi pass thành công
		* 7. Đăng nhập hệ thống thành công
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_97_KiểmTraLấyLạiMấtKhẩuThànhCôngVớiEmailĐúng() throws TestLinkAPIException{
			info("Kiểm Tra Lấy Lại Mất Khẩu Thành Công Với Email Đúng");
			String parentWindow = driver.getWindowHandle();
			testCaseID="EM-97";
			info("Click vào link 'Quên mật khẩu'");
			info("Nhập email đúng và tồn tại trong hệ thống và click vào nút Gửi");
			mgLogInOut.forgot(config.EMAIL_TEST,true);
			info("Đăng nhập vào email");
			goToMail(config.EMAIL_TEST, config.EMAIL_TEST_PASS);
			openAnEmailContent("VNPOST: Reset password");
			info("Click vào link reset pasword");
			goToALinkIntoEmailContent("test-counter-em.teko.vn/reset_password/confirm");
			info("Nhập password mới để change password");
			String newPass="QC"+getRandomNumber()+getRandomString();
			mgLogInOut.resetPassword(newPass,newPass,parentWindow);
			info("Đóng tất cả các cửa sổ con");
			closeChildBrowsers(parentWindow);
			info("Mở lại trang đăng nhập");
			driver.get(baseUrl);
			info("Đăng nhập với mật khẩu mới");
 			mgLogInOut.login(config.USER_STAFF_01,newPass,true);
 			info("Kiểm tra việc đăng nhập thành công ");
 			mgLogInOut.verifyUserInfHeaderBar(config.USER_STAFF_01_NAME, "");
		}
		
		/**
		* Test ID:EM-98
		* Test case name:Kiểm Tra Lấy Lại Mật Khẩu Không Thành Công Với Email Sai Định Dạng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Click vào link "Quên mật khẩu"
		* 3. Nhập email sai định dạng (ex. abc@com)
		* 4. Click vào nút Gửi
		* Expected Result:
		* Trang WEB mở thành công
		* Màn hình "Quên mật khẩu" được hiển thị
		* Email được nhập
		* Hiển thị thông báo lỗi "Nhập địa chỉ email"
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_98_KiểmTraLấyLạiMậtKhẩuKhôngThànhCôngVớiEmailSaiĐịnhDạng() throws TestLinkAPIException{
			info("Kiểm Tra Lấy Lại Mật Khẩu Không Thành Công Với Email Sai Định Dạng");
			testCaseID="EM-98";
			info("Click vào link 'Quên mật khẩu'");
			info("Nhập email đúng và tồn tại trong hệ thống và click vào nút Gửi");
			String email=getRandomString();
			mgLogInOut.forgot(email);
			info("Kiểm tra thông tin lỗi hiển thị");
			mgLogInOut.verifyMessage("Nhập địa chỉ email");
		}
		
		/**
		* Test ID:EM-332
		* Test case name:Kiểm Tra Lấy Lại Mật Khẩu Không Thành Công Với Email Không Tồn Tại Trong Hệ Thống
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Click vào link "Quên mật khẩu"
		* 3. Nhập email đúng định dạng nhưng không tồn tại trong hệ thống
		* 4. Click vào nút Gửi
		* Expected Result:
		* Vẫn gửi email bình thường và hiển thị màn hình đăng nhập
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_332_KiểmTraLấyLạiMậtKhẩuKhôngThànhCôngVớiEmailKhôngTồnTạiTrongHệThống() throws TestLinkAPIException{
			info("Kiểm Tra Lấy Lại Mật Khẩu Không Thành Công Với Email Không Tồn Tại Trong Hệ Thống");
			testCaseID="EM-332";
			info("Click vào link 'Quên mật khẩu'");
			info("Nhập email đúng và tồn tại trong hệ thống và click vào nút Gửi");
			String email=getRandomString()+"@gmail.com";
			mgLogInOut.forgot(email);
			info("Vẫn gửi email bình thường và hiển thị màn hình đăng nhập");
			waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_BTN,3000,1);
		}
		
		/**
		* Test ID:EM-100
		* Test case name:Kiểm Tra Lấy Mật Khẩu Không Thành Công Với Email Rỗng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Click vào link "Quên mật khẩu"
		* 3. Không nhập email
		* 4. Click vào nút Gửi
		* Expected Result:
		* Trang WEB mở thành công
		* Màn hình "Quên mật khẩu" được hiển thị
		* Email được bỏ trống
		* Hiển thị thông báo lỗi và yêu cầu nhập địa chỉ email
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_100_KiểmTraLấyMậtKhẩuKhôngThànhCôngVớiEmailRỗng() throws TestLinkAPIException{
			info("Kiểm Tra Lấy Mật Khẩu Không Thành Công Với Email Rỗng");
			testCaseID="EM-100";
			info("Click vào link 'Quên mật khẩu'");
			info("Nhập email đúng và tồn tại trong hệ thống và click vào nút Gửi");
			mgLogInOut.forgot("");
			info("Kiểm tra thông tin lỗi hiển thị");
			mgLogInOut.verifyMessage("Trường này là bắt buộc");
		}
}