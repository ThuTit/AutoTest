package com.selenium.warehouse.locator;
import org.selenium.common.UnitBase;
		

public class Page_Locator extends UnitBase {

		public final String ELEMENT_DASHBOARD_TITLE_PAGE=".//h4[contains(text(),'HỆ THỐNG QUẢN LÝ KHO HÀNG TEKSHOP')]";
		public final String ELEMENT_HOMEPAGE_MENU_THONGKE_LINK=".//a[@href='http://test.warehouse.teko.vn/statistic-product-logs']";
		public final String ELEMENT_THONGKE_TITLE_PAGE=".//*[contains(text(),'Thống kê sản phẩm Xuất-Nhập-Tồn hàng ngày')]";
		public final String ELEMENT_HOMEPAGE_MENU_KIEMKHO_LINK=".//*[@id='navigation']//li[@class='has-submenu']/a[contains(@href,'stock-checking')]";
		public final String ELEMENT_KIEMKHO_TITLE_PAGE=".//h4[contains(text(),'Kiểm kho')]";
		public final String ELEMENT_HOMEPAGE_MENU_NHAPKHO_LINK=".//li[@class='has-submenu']/a[@href='http://test.warehouse.teko.vn/request-imports']";
		public final String ELEMENT_NHAPKHO_TITLE_PAGE=".//*[contains(text(),'Danh sách Yêu cầu nhập kho từ Yêu cầu mua hàng')]";
		public final String ELEMENT_HOMEPAGE_MENU_TRANGCHU_LINK=".//*[@id='navigation']//a[@href='/']";
		public final String ELEMENT_HOMEPAGE_MENU_XUATKHO_LINK=".//li[@class='has-submenu']/a[@href='/request-exports']";
		public final String ELEMENT_XUATKHO_TITLE_PAGE=".//*[contains(text(),'Danh sách yêu cầu xuất kho') and @class='page-title']";
		public final String ELEMENT_HOMEPAGE_MENU_CHUYENKHO_LINK=".//li[@class='has-submenu']/a[@href='/stock-transfer-requests']";
		public final String ELEMENT_CHUYENKHO_TITLE_PAGE=".//b[contains(text(),'Danh sách Yêu cầu Chuyển kho')]";
		public final String ELEMENT_DASHBOARD_SO_SP_YCNK=".//*[contains(text(),'Số sản phẩm đang có yêu cầu nhập kho')]";
		public final String ELEMENT_DASHBOARD_SO_YCXK=".//*[contains(text(),'Số lượng yêu cầu xuất kho mới tạo')]";
		public final String ELEMENT_DASHBOARD_SO_KHO_HANG_TOAN_QUOC=".//*[contains(text(),'Số lượng kho hàng toàn quốc')]";
		public final String ELEMENT_DASHBOARD_SO_NGUOI_DUNG=".//*[contains(text(),'Số lượng người dùng')]";
		public final String ELEMENT_DASHBOARD_SO_PHIEU_NHAP_XUAT=".//*[contains(text(),'Số lượng phiếu nhập xuất')]";
		public final String ELEMENT_DASHBOARD_USERNAME=".//*[contains(text(),'tester01') and contains(@class,'dropdown-toggle')]";
		public final String ELEMENT_DASHBOARD_LOGOUT=".//a[@href='http://test.warehouse.teko.vn/admin/logout']";
		public final String ELEMENT_HOMEPAGE_MENU_KIEMKHO_DS_LICHSU_LINK=".//*[@id='navigation']//*[contains(@href,'stock-checking/history')]";
		public final String ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_KHO=".//*[@id='home']//*[@name='store_id']";
		public final String ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SELECT_LIMIT=".//*[@id='home']//*[@name='limit_status']";
		public final String ELEMENT_KIEMKHO_THUCHIEN_KIEMKHO_SUBMIT_BTN=".//*[@id='home']//button[@type='submit']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_TITLE_PAGE=".//*[contains(text(),'Lịch sử kiểm kho')]";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_SELECT_KHO_DROPDOWN_LIST=".//*[@name='store_id']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_SEARCH_BTN=".//*[@id='search-form']/button";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_SEARCH_RESULT_KHO_VINHPHUC=".//*[@id='dataTables']//*[contains(text(),'MB - Vĩnh Phúc')]";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_INPUT_DATE=".//*[@name ='date']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_LAST30DAYS="//*[@data-range-key='Last 30 Days']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_LAST7DAYS="//*[@data-range-key='Last 7 Days']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_YESTERDAY="//*[@data-range-key='Yesterday']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_TODAY="//*[@data-range-key='Today']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_THISMONTH="//*[@data-range-key='This Month']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_LASTMONTH="//*[@data-range-key='Last Month']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATE_CUSTOM="//*[@data-range-key='Custom']";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_FIRST_ROW_CHITIET_BTN="(.//*[@id='dataTables']//*[@title='Chi tiết'])[1]";
		public final String ELEMENT_KIEMKHO_DS_LICHSU_DATA=".//*[@id='dataTables']//*[contains(text(),'$value')]";
		public final String ELEMENT_KIEMKHO_CHITIET_TITLE_PAGE="//h4[@class='page-title'][text()='Chi tiết lịch sử kiểm kho']";
		

}