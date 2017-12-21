package com.selenium.emoney.func.high.frontend;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class Func_High_FrontEnd_Login extends TestConfig{		
		/**
		* Test ID:EM-86
		* Test case name:Kiểm Tra Đăng Nhập Thành Công
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* <p>user chưa đăng nhập hệ thống</p>

		* Test Steps:
		* 1. Mở trang WEB
		* 2. Nhập đúng tên đăng nhập và mật khẩu tồn tại trong hệ thống
		* 3. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên đăng nhập và mật khẩu được nhập
		* 3. Đăng nhập thành công. Hiển thị trang chủ và thông tin người đăng nhập đúng
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_86_KiểmTraĐăngNhậpThànhCông() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập thành công");
			 testCaseID="EM-86";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 mgLogInOut.login(config.USER_ADMIN, config.USER_PASS, true);
			 info("Kiểm tra việc đăng nhập thành công ");
			 mgLogInOut.verifyUserInfHeaderBar(config.USER_ADMIN_NAME, "");
		}
		
		/**
		* Test ID:EM-87
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Tên Đăng Nhập Sai
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1. Mở trang WEB
		* 2. Nhập tên đăng nhập sai( không tồn tại hoặc không đúng với password sử dụng)
		* 3. Nhập password đúng
		* 4. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên đăng nhập được nhập
		* 3. Mật khẩu được nhập
		* 4. Hiển thị thông báo lỗi :"Thông tin người dùng hoặc mật khẩu không hợp lệ"
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_87_KiểmTraĐăngNhậpKhôngThànhCôngVớiTênĐăngNhậpSai() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với tên đăng nhập sai");
			 testCaseID="EM-87";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 String username=getRandomString();
			 mgLogInOut.login(username, config.USER_PASS);
			 info("Hiển thị thông báo lỗi :'Thông tin người dùng hoặc mật khẩu không hợp lệ'");
			 mgLogInOut.verifyMessage("Thông tin người dùng hoặc mật khẩu không hợp lệ");
		}
		
		/**
		* Test ID:EM-88
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Mật Khẩu Sai
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Nhập đúng tên đăng nhập đúng
		* 3. Nhập password sai (Không đúng với mật khẩu trong hệ thống của tên đăng nhập đó)
		* 4. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên đăng nhập được nhập
		* 3. Mật khẩu được nhập
		* 4. Hiển thị thông báo lỗi :"Thông tin người dùng hoặc mật khẩu không hợp lệ"
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_88_KiểmTraĐăngNhậpKhôngThànhCôngVớiMậtKhẩuSai() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với mật khẩu sai");
			 testCaseID="EM-88";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 String pass=getRandomString();
			 mgLogInOut.login(config.USER_ADMIN,pass);
			 info("Hiển thị thông báo lỗi :'Thông tin người dùng hoặc mật khẩu không hợp lệ'");
			 mgLogInOut.verifyMessage("Thông tin người dùng hoặc mật khẩu không hợp lệ");
		}
		
		/**
		* Test ID:EM-89
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Tên Và Mật Khẩu Sai
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Nhập tên đăng nhập và mật khẩu sai
		* 3. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên và mật khẩu được nhập
		* 3. Hiển thị thông báo lỗi :"Thông tin người dùng hoặc mật khẩu không hợp lệ"
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_89_KiểmTraĐăngNhậpKhôngThànhCôngVớiTênVàMậtKhẩuSai() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với tên và mật khẩu sai");
			 testCaseID="EM-89";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 String username=getRandomNumber();
			 String pass=getRandomString();
			 mgLogInOut.login(username,pass);
			 info("Hiển thị thông báo lỗi :'Thông tin người dùng hoặc mật khẩu không hợp lệ'");
			 mgLogInOut.verifyMessage("Thông tin người dùng hoặc mật khẩu không hợp lệ");
		}
		
		/**
		* Test ID:EM-90
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Tên Và Mật Khẩu Rỗng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Không thể đăng nhập
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_90_KiểmTraĐăngNhậpKhôngThànhCôngVớiTênVàMậtKhẩuRỗng() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với tên và mật khẩu rỗng");
			 testCaseID="EM-90";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 mgLogInOut.login("","");
			 info("Không thể đăng nhập");
			 waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_BTN,3000,1);
		}
		
		/**
		* Test ID:EM-91
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Tên Đăng Nhập Rỗng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Bỏ qua tên đăng nhập
		* 3. Nhập mật khẩu
		* 4. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên đăng nhập để trống
		* 3. Mật khẩu được nhập
		* 4. Không thể đăng nhập
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_91_KiểmTraĐăngNhậpKhôngThànhCôngVớiTênĐăngNhậpRỗng() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với tên đăng nhập rỗng");
			 testCaseID="EM-91";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 mgLogInOut.login("",config.USER_PASS);
			 info("Không thể đăng nhập");
			 waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_BTN,3000,1);
		}
		
		/**
		* Test ID:EM-92
		* Test case name:Kiểm Tra Đăng Nhập Không Thành Công Với Mật Khẩu Rỗng
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user chưa đăng nhập hệ thống
		* Test Steps:
		* 1.  Mở trang WEB
		* 2. Nhập tên đăng nhập
		* 3. Bỏ qua mật khẩu
		* 4. Click nút Đăng nhập
		* Expected Result:
		* 1. Trang web mở thành công
		* 2. Tên đăng nhập được nhập
		* 3. Mật khẩu để trống
		* 4. Không thể đăng nhập
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_92_KiểmTraĐăngNhậpKhôngThànhCôngVớiMậtKhẩuRỗng() throws TestLinkAPIException{
			 info("Kiểm tra đăng nhập không thành công với mật khẩu rỗng");
			 testCaseID="EM-92";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 mgLogInOut.login(config.USER_ADMIN,"");
			 info("Không thể đăng nhập");
			 waitForAndGetElement(mgLogInOut.ELEMENT_LOGIN_BTN,3000,1);
		}
		
		
		/**
		* Test ID:EM-94
		* Test case name:Kiểm Tra Đăng Xuất Thành Công Bằng Nút Đăng Xuất
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* user đã đăng nhập thành công
		* Test Steps:
		* 1. Vào trang WEB và đăng nhập thành công
		* 2. Click vào nút ĐĂNG XUẤT
		* Expected Result:
		* Hiển thị màn hình Home page
		* Đăng xuất thành công và hiển thị màn hình đăng nhập
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_94_KiểmTraĐăngXuấtThànhCôngBằngNútĐăngXuất() throws TestLinkAPIException{
			 info("Kiểm tra đăng xuất thành công bằng nút đăng xuất");
			 testCaseID="EM-94";
			 info("Nhập username và pass");
			 info("Click nút Đăng nhập");
			 mgLogInOut.login(config.USER_ADMIN,config.USER_PASS,true);
			 info("Đăng xuất");
			 mgLogInOut.logout(true);
		}
		
}