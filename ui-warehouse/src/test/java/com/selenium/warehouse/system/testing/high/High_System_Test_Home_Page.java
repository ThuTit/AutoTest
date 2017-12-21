package com.selenium.warehouse.system.testing.high;
import org.testng.annotations.Test;
import com.selenium.warehouse.common.ManageLogInOut;
import com.selenium.warehouse.common.Configuration;
import com.selenium.warehouse.locator.Page_Locator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import static org.selenium.common.TestLogger.info;
public class High_System_Test_Home_Page extends Page_Locator {

		
		Page_Locator locator;
		ManageLogInOut mgLogInOut;
		Configuration config;
		
		@BeforeMethod
		public void setUpBeforeMethod() throws Exception{
			 info("Start setUpBeforeMethod");
			 initSeleniumTest();
			 mgLogInOut = new ManageLogInOut(driver);
			 locator = new Page_Locator();
			 config = new Configuration();
			 info("End setUpBeforeMethod");
		 }

		@AfterMethod
		public void afterMethod(){
			 info("Start afterMethod");
			 driver.manage().deleteAllCookies();
			 driver.quit();
			 info("End afterMethod");
		 }

		
		/**
		* Test ID:WHP-11
		* Test case name:Kiểm Tra Hiển Thị Trang Thống Kê
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3: Click vào [Thống kê] link
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3. Thông tin được hiển thị
		*/
		@Test
		public void WHP_11_KiểmTraHiểnThịTrangThốngKê(){
			 info("Kiểm tra hiển thị trang Thống kê");
			 testCaseID="WHP-11";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Thống kê] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_THONGKE_LINK);
			 info("Kiểm tra hiển thị trang thống kê");
			 waitForAndGetElement(locator.ELEMENT_THONGKE_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-12
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Kiểm Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3: Click vào [Kiểm kho] link
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3: Trang được hiển thị 
		*/
		@Test
		public void WHP_12_KiểmTraViệcHiểnThịTrangKiểmKho(){
			 info("Kiểm tra việc hiển thị trang Kiểm kho");
			 testCaseID="WHP-12";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK);
			 info("Kiểm tra hiển thị trang kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-13
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Nhập Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3: Click vào [Nhập kho] link
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3: Trang được hiển thị 
		*/
		@Test
		public void WHP_13_KiểmTraViệcHiểnThịTrangNhậpKho(){
			 info("Kiểm tra việc hiển thị trang nhập kho");
			 testCaseID="WHP-13";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Nhập kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_NHAPKHO_LINK);
			 info("Kiểm tra hiển thị trang nhập kho");
			 waitForAndGetElement(locator.ELEMENT_NHAPKHO_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-14
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Dashboard
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3: Click vào [Dashboard] link
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3: Trang Dashboard được hiển thị lại
		*/
		@Test
		public void WHP_14_KiểmTraViệcHiểnThịTrangDashboard(){
			 info("Kiểm tra việc hiển thị trang dashboard");
			 testCaseID="WHP-14";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang dashboard theo default");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Trang chủ] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_TRANGCHU_LINK);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-15
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Xuất Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3: Click vào [Xuất kho] link
		* <p>1: Login</p>

		* <p>2: Trang Dashboard được hiển thị default</p>

		* <p>3: Click v&agrave;o [Chuyển kho] link</p>

		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3: Trang được hiển thị 
		* <p>1: Trang login mở v&agrave; login th&agrave;nh c&ocirc;ng</p>

		* <p>2: Trang Dashboard được hiển thị sau khi login th&agrave;nh c&ocirc;ng</p>

		* <p>3: Trang được hiển thị</p>

		*/
		@Test
		public void WHP_15_KiểmTraViệcHiểnThịTrangXuấtKho(){
			 info("Kiểm tra việc hiển thị trang xuất kho");
			 testCaseID="WHP-15";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Xuất kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_XUATKHO_LINK);
			 info("Kiểm tra hiển thị trang xuất kho");
			 waitForAndGetElement(locator.ELEMENT_XUATKHO_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-16
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Chuyển Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2. HIển thị thông tin: Số sản phẩm đang có, số yêu cầu, số lượng kho, số lượng người dùng  và số lượng phiếu nhập
		*/
		@Test
		public void WHP_16_KiểmTraViệcHiểnThịTrangChuyểnKho(){
			 info("Kiểm tra việc hiển thị trang Chuyển kho");
			 testCaseID="WHP-16";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Click [Chuyển kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_CHUYENKHO_LINK);
			 info("Kiểm tra hiển thị trang chuyển kho");
			 waitForAndGetElement(locator.ELEMENT_CHUYENKHO_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-17
		* Test case name:Kiểm Tra Việc Hiển Thị Thông Tin Trên Trang Dashboard
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3. Kiểm tra username
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* Username được hiển thị
		*/
		@Test
		public void WHP_17_KiểmTraViệcHiểnThịThôngTinTrênTrangDashboard(){
			 info("Kiểm tra việc hiển thị thông tin trên trang dashboard");
			 testCaseID="WHP-17";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard default");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Kiểm tra số sản phẩm đang có YC nhập kho");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_SO_SP_YCNK,2000,1);
			 info("Kiểm tra số lượng YC xuất kho mới tạo");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_SO_YCXK,2000,1);
			 info("Kiểm tra số lượng kho hàng toàn quốc");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_SO_KHO_HANG_TOAN_QUOC,2000,1);
			 info("Kiểm tra số lượng người dùng");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_SO_NGUOI_DUNG,2000,1);
			 info("Kiểm tra số lượng phiếu nhập xuất");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_SO_PHIEU_NHAP_XUAT,2000,1);
		}
		
		/**
		* Test ID:WHP-19
		* Test case name:Kiểm Tra Việc Hiển Thị Username
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1: Login
		* 2: Trang Dashboard được hiển thị default
		* 3. Nhấn vào avatar, sau đó click Logout
		* Expected Result:
		* 1: Trang login mở và login thành công
		* 2: Trang Dashboard được hiển thị sau khi login thành công 
		* 3. Logout thành công, thoát khỏi hệ thống
		*/
		@Test
		public void WHP_19_KiểmTraViệcHiểnThịUsername(){
			 info("Kiểm tra việc hiển thị username");
			 testCaseID="WHP-19";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Kiểm tra hiển thị trang Dashboard");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_TITLE_PAGE,2000,1);
			 info("Kiểm tra hiển thị username");
			 waitForAndGetElement(locator.ELEMENT_DASHBOARD_USERNAME,2000,1);
		}
}