package com.selenium.warehouse.system.testing.high;
import org.testng.annotations.Test;
import com.selenium.warehouse.common.ManageLogInOut;
import com.selenium.warehouse.common.Configuration;
import com.selenium.warehouse.locator.Page_Locator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import static org.selenium.common.TestLogger.info;
public class High_System_Test_Kiem_Kho_DSLS extends Page_Locator {

		
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
		* Test ID:WHP-9722
		* Test case name:Kiểm Tra Việc Hiển Thị Trang Kiểm Kho - Danh Sách Lịch Sử Kiểm Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Loggin
		* 2. Horver vào [Kiểm kho] link
		* 3. CLick [ Danh sách lịch sử kiểm kho ] link
		* Expected Result:
		* 
		* 
		* 3. Trang được hiển thị
		*/
		@Test
		public void WHP_9722_KiểmTraViệcHiểnThịTrangKiểmKhoDanhSáchLịchSửKiểmKho(){
			 info("Kiểm tra việc hiển thị trang Kiểm kho - Danh sách lịch sử kiểm kho");
			 testCaseID="WHP-9722";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Hover vào Kiểm kho link");
			 mouseOver(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK,true);
			 info("CLick [Danh sách lịch sử kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK);
			 info("Kiểm tra việc hiển thị trang Danh sách lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE,2000,1);
		}
		
		/**
		* Test ID:WHP-9724
		* Test case name:Tìm Kiếm Theo Kho
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Loggin
		* 2. Horver vào [Kiểm kho] link
		* 3. CLick [ Danh sách lịch sử kiểm kho ] link
		* 4. Nhập keyword
		* 5. Nhấn tìm kiếm
		* Expected Result:
		* 
		* 
		* 3. Trang được hiển thị
		* 
		* 5. Kết quả tìm kiếm được hiển thị
		*/
		@Test
		public void WHP_9724_TìmKiếmTheoKho(){
			 info("Tìm kiếm theo kho");
			 testCaseID="WHP-9724";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Hover vào Kiểm kho link");
			 String khoName="MB - Hà Nội (Tổng)";
			 info("Hover vào Kiểm kho link");
			 mouseOver(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK,true);
			 info("CLick [Danh sách lịch sử kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK);
			 info("Kiểm tra việc hiển thị trang Danh sách lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE,2000,1);
			 info("Nhập tên kho");
			 select(locator.ELEMENT_KIEMKHO_DS_LICHSU_SELECT_KHO_DROPDOWN_LIST,khoName,2);
			 info("CLick vào nút Tìm kiếm");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_SEARCH_BTN);
			 info("Kiểm tra kết quả tìm kiếm");
			 waitForAndGetElementWithReplace(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATA,khoName);
		}
		
		/**
		* Test ID:WHP-9725
		* Test case name:Tìm Kiếm Theo Ngày Tạo
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Loggin
		* 2. Horver vào [Kiểm kho] link
		* 3. CLick [ Danh sách lịch sử kiểm kho ] link
		* 4. Nhập keyword
		* 5. Nhấn tìm kiếm
		* Expected Result:
		* 
		* 
		* 3. Trang được hiển thị
		* 
		* 5. Kết quả tìm kiếm được hiển thị
		*/
		@Test
		public void WHP_9725_TìmKiếmTheoNgàyTạo(){
			 info("Tìm kiếm theo ngày tạo");
			 testCaseID="WHP-9725";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Lấy ngày hiện tại của hệ thống");
			 String currentDate=getCurrentDate();
			 info("Khai báo tên kho");
			 String khoName="MB - Hà Nội (Tổng)";
			 info("Khai báo tên giới hạn");
			 String limitName="Chỉ thực hiện với sản phẩm có Nhập/Xuất trong ngày";
			 info("Click vào link Thực hiện kiểm kho");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK);
			 info("Chọn kho");
			 select(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_KHO,khoName,2);
			 info("Chọn giới hạn");
			 select(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_LIMIT,limitName,2);
			 info("Lấy danh sách sản phẩm");
			 click(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SUBMIT_BTN);
			 info("Mở qua trang Thống kê");
			 click(locator.ELEMENT_HOMEPAGE_MENU_THONGKE_LINK);
			 info("Hover vào Kiểm kho link");
			 mouseOver(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK,true);
			 info("CLick [Danh sách lịch sử kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK);
			 info("Kiểm tra việc hiển thị trang Danh sách lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE,2000,1);
			 info("Mở popup để chọn ngày");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_INPUT_DATE);
			 info("Chọn ngày");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATE_TODAY);
			 info("CLick vào nút Tìm kiếm");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_SEARCH_BTN);
			 info("Kiểm tra kết quả tìm kiếm");
			 waitForAndGetElementWithReplace(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATA,currentDate);
		}
		
		/**
		* Test ID:WHP-9726
		* Test case name:Tìm Kiếm Theo Cả Kho Và Ngày Tạo
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Loggin
		* 2. Horver vào [Kiểm kho] link
		* 3. CLick [ Danh sách lịch sử kiểm kho ] link
		* 4. Nhập keyword
		* 5. Nhấn tìm kiếm
		* Expected Result:
		* 
		* 
		* 3. Trang được hiển thị
		* 
		* 5. Kết quả tìm kiếm được hiển thị
		*/
		@Test
		public void WHP_9726_TìmKiếmTheoCảKhoVàNgàyTạo(){
			 info("Tìm kiếm theo cả kho và ngày tạo");
			 testCaseID="WHP-9726";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Lấy ngày hiện tại của hệ thống");
			 String currentDate=getCurrentDate();
			 info("Khai báo tên kho");
			 String khoName="MB - Hà Nội (Tổng)";
			 info("Khai báo giới hạn");
			 String limitName="Chỉ thực hiện với sản phẩm có Nhập/Xuất trong ngày";
			 info("Click vào link Thực hiện kiểm kho");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK);
			 info("Chọn kho");
			 select(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_KHO,khoName,2);
			 info("Chọn giới hạn");
			 select(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_LIMIT,limitName,2);
			 info("Lấy danh sách sản phẩm");
			 click(locator.ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SUBMIT_BTN);
			 info("Mở qua trang Thống kê");
			 click(locator.ELEMENT_HOMEPAGE_MENU_THONGKE_LINK);
			 info("Hover vào Kiểm kho link");
			 mouseOver(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK,true);
			 info("CLick [Danh sách lịch sử kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK);
			 info("Kiểm tra việc hiển thị trang Danh sách lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE,2000,1);
			 info("Nhập tên kho");
			 select(locator.ELEMENT_KIEMKHO_DS_LICHSU_SELECT_KHO_DROPDOWN_LIST,khoName,2);
			 info("Mở popup để chọn ngày");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_INPUT_DATE);
			 info("Chọn ngày");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATE_TODAY);
			 info("CLick vào nút Tìm kiếm");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_SEARCH_BTN);
			 info("Kiểm tra kết quả tìm kiếm theo ngày");
			 waitForAndGetElementWithReplace(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATA,currentDate);
			 info("Kiểm tra kết quả tìm kiếm theo kho");
			 waitForAndGetElementWithReplace(locator.ELEMENT_KIEMKHO_DS_LICHSU_DATA,khoName);
		}
		
		/**
		* Test ID:WHP-9730
		* Test case name:Kiểm Tra Việc Xem Chi Tiết Một Lịch Sử Kiểm Kho Trong Danh Sách
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Loggin
		* 2. Horver vào [Kiểm kho] link
		* 3. CLick [ Danh sách lịch sử kiểm kho ] link
		* 4. Chọn 1 Kho, click vào nút xem chi tiết
		* Expected Result:
		* 
		* 
		* 3. Trang được hiển thị
		* 4. Chi tiết lịch sử kiểm kho được hiển thị
		*/
		@Test
		public void WHP_9730_KiểmTraViệcXemChiTiếtMộtLịchSửKiểmKhoTrongDanhSách(){
			 info("Kiểm tra việc xem chi tiết một lịch sử kiểm kho trong danh sách");
			 testCaseID="WHP-9730";
			 mgLogInOut.login(TESTER_01,USER_PASS);
			 info("Hover vào Kiểm kho link");
			 mouseOver(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK,true);
			 info("CLick [Danh sách lịch sử kiểm kho] link");
			 click(locator.ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK);
			 info("Kiểm tra việc hiển thị trang Danh sách lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE,2000,1);
			 info("Click vào nút xem chi tiết");
			 click(locator.ELEMENT_KIEMKHO_DS_LICHSU_FIRST_ROW_CHITIET_BTN);
			 info("Kiểm tra việc hiển thị trang chi tiết lịch sử kiểm kho");
			 waitForAndGetElement(locator.ELEMENT_KIEMKHO_CHITIET_TITLE_PAGE,2000,1);
		}
}