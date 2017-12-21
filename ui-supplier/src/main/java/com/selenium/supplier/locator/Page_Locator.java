package com.selenium.supplier.locator;

import org.selenium.common.UnitBase;
import org.openqa.selenium.By;
		

public class Page_Locator extends UnitBase {

		
	 public final By QUANLYDANHMUC=By.xpath(".//*[@id='sidebar']//span[contains(text(),'Quản lý danh mục')]//parent::a");
	 public final By NHASANXUAT_THUONGHIEU=By.xpath(".//*[@id='sidebar']//a[@href='http://test.supplier.teko.vn/manufacturers']");
	 public final By SHOW_NHASANXUAT_THUONGHIEU=By.xpath(".//*[@id='main-container']//div[@class='page-header']/child::h1");
	 public final By SELECT_SHOW_RECORD_NHASANXUAT_THUONGHIEU= By.xpath(".//*[@id='dataTables-manufacturers_length']//select");
	 public final By SHOW_RECORD_NHASANXUAT_THUONGHIEU_SUCCESS=By.xpath(".//*[@id='dataTables-manufacturers_info']");
	 public final By SELECT_PAGE=By.xpath(".//*[@id='dataTables-manufacturers_paginate']//a[text()='3']");
	 public final By SHOW_PAGE_SUCCESS = By.xpath(".//*[@id='dataTables-manufacturers_info']");
	 public final By BREADCRUMB_LINK_NHASX_THUONGHIEU = By.xpath(".//*[@id='breadcrumbs']//a[@href='http://test.supplier.teko.vn/manufacturers']");
	 public final By BREADCRUMB_LINK_DASHBOARD = By.xpath(".//*[@id='breadcrumbs']//a[@href='http://test.supplier.teko.vn/dashboard']");
	 public final By SHOW_DASHBOARD = By.xpath(".//*[@id='main-container']//h1[contains(text(),'Dashboard')]");

	 
	 public final By INPUT_KEYWORD_NHASX = By.xpath(".//*[@id='dataTables-manufacturers_filter']//input");
	 public final By SHOW_RESULT_SEARCH_NAME = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='Acer']");
	 public final By SHOW_RESULT_SEARCH_CODE = By.xpath(".//*[@id='dataTables-manufacturers']//td[1][text()='CISCO']");
	 public final By SHOW_RESULT_SEARCH_LINK = By.xpath(".//*[@id='dataTables-manufacturers']//td[3][text()='abc.vn']");
	 
	 public final By ELEMENT_NSX_ICON_CHINH_SUA = By.xpath(".//*[@id='dataTables-manufacturers']//a[@href='http://test.supplier.teko.vn/manufacturers/2237/edit']/child::i");
	 public final By ELEMENT_NSX_FORM_CHINH_SUA = By.xpath(".//*[@id='main-container']//div[@class='page-header']/child::h1");
	 public final By ELEMENT_NSX_EDIT_TEN_NSX = By.xpath(".//*[@id='main-container']//input[@placeholder='Tên nhà SX']");
	 public final By ELEMENT_NSX_BUTTON_EDIT_SUBMIT = By.xpath(".//*[@id='main-container']//button[@type='submit']");
	 public final By ELEMENT_NSX_EDIT_TEN_NSX_SUCCESS = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='Autotest']");
	 public final By ELEMENT_NSX_EDIT_TRANG_CHU = By.xpath(".//*[@id='main-container']//input[@placeholder='Trang chủ']");
	 public final By ELEMENT_NSX_EDIT_TRANG_CHU_SUCCESS = By.xpath(".//*[@id='dataTables-manufacturers']//td[3][text()='google.com']");
	 public final By ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI = 	By.xpath(".//*[@id='main-container']//span[@class='lbl']");
	 public final By ELEMENT_NSX_EDIT_CHUYEN_TRANG_THAI_SUCCESS = By.xpath(".//*[@id='dataTables-manufacturers']//td[text()='Autotest']/following-sibling::td[2]/child::i");
	 public final By ELEMENT_NSX_EDIT_TEN_NSX_HTML_SUCCESS = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='<h1>Autotest</h1>']");
	 public final By ELEMENT_NSX_EDIT_DELETE_TEN_NSX = By.xpath(".//*[@id='main-container']//li[text()='Vui lòng nhập tên nhà sản xuất.']");
	 public final By ELEMENT_NSX_EDIT_TRUNG_TEN_NSX = By.xpath(".//*[@id='main-container']//li[text()='Tên nhà sản xuất đã tồn tại.']");
	 public final By ELEMENT_NSX_EDIT_OVERLOAD_TEN_NSX = By.xpath(".//*[@id='main-container']//li[text()='Tên nhà sản xuất quá dài, tối đa 255 kí tự.']");
	 public final By ELEMENT_NSX_EDIT_CHON_DANH_SACH = By.xpath(".//*[@id='main-container']//a[@class='btn btn-primary pull-right']");
	 public final By ELEMENT_NSX_EDIT_MENU_TRAI = By.xpath(".//*[@id='sidebar']//a[@href='http://test.supplier.teko.vn/categories']");
	 public final By DANH_MUC = By.xpath(".//*[@id='main-container']//div[@class='page-header']/child::h1");
	 
	 public final By ELEMENT_NSX_ADD_ICON_THEM = By.xpath(".//*[@id='main-container']//a[@href='http://test.supplier.teko.vn/manufacturers/create']");
	 public final By ELEMENT_NSX_FORM_ADD = By.xpath(".//*[@id='breadcrumbs']//li[3][@class='active']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_72 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='2SM72']");
	 public final By ELEMENT_NSX_ADD_CODE = By.xpath(".//*[@id='main-container']//input[@placeholder='Mã nhà SX']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUM_73 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='2SM73']");
	 public final By ELEMENT_NSX_ADD_CODE_SUCCESS_SUM_73 = By.xpath(".//*[@id='dataTables-manufacturers']//td[1][text()='2SM73']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_74 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='2SM74']");
	 public final By ELEMENT_NSX_ADD_TRANG_CHU_SUCCESS_SUM_74 = By.xpath(".//*[@id='dataTables-manufacturers']//td[3][text()='google.com']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_75 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='2SM75']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_76 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='2SM76']");
	 public final By ELEMENT_NSX_ADD_CODE_SUCCESS_SUM_76 = By.xpath(".//*[@id='dataTables-manufacturers']//td[1][text()='2SM76']");
	 public final By ELEMENT_NSX_ADD_TRANG_CHU_SUCCESS_SUM_76 = By.xpath(".//*[@id='dataTables-manufacturers']//td[3][text()='mvn.com']");
	 public final By ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_77 = By.xpath(".//*[@id='dataTables-manufacturers']//td[2][text()='<h1>01CD</h1>']");
	 public final By ELEMENT_NSX_ADD_FAIL_ALL = By.xpath(".//*[@id='main-container']//li[text()='Tên Nhà SX là bắt buộc.']");
	 public final By ELEMENT_NSX_ADD_TRUNG_MA_NSX = By.xpath(".//*[@id='main-container']//li[text()='Mã nhà sản xuất đã tồn tại.']");
	 public final By ELEMENT_NSX_ADD_SAI_DO_DAI_MA_3 = By.xpath(".//*[@id='main-container']//li[text()='Mã nhà sản xuất phải có ít nhất 3 kí tự.']");
	 public final By ELEMENT_NSX_ADD_SAI_DO_DAI_MA_6 = By.xpath(".//*[@id='main-container']//li[text()='Mã nhà sản xuất có tối đa 6 kí tự.']");
	 public final By ELEMENT_NSX_ADD_SAI_DINH_DANG_MA = By.xpath(".//*[@id='main-container']//li[text()='Mã nhà sản xuất không được chứa kí tự đặc biệt.']");
	 
	 public final By ELEMENT_DANH_MUC_CLICK = By.xpath(".//*[@id='sidebar']//a[@href='http://test.supplier.teko.vn/categories']");
	 public final By ELEMENT_DANH_MUC_ICON_MARGIN = By.xpath(".//*[@id='dataTables-categories']//td[text()='API']//following-sibling::td//child::span[@class='orange']");
	 public final By ELEMENT_DANH_MUC_POPUP = By.xpath(".//*[@id='modal-edit-margins']//button[2]");
	 public final By ELEMENT_DANH_MUC_MIEN_BAC = By.xpath(".//*[@id='modal-edit-margins']//input[@placeholder='Miền Bắc']");
	 public final By ELEMENT_DANH_MUC_MIEN_TRUNG = By.xpath(".//*[@id='modal-edit-margins']//input[@placeholder='Miền Trung']");
	 public final By ELEMENT_DANH_MUC_MIEN_NAM = By.xpath(".//*[@id='modal-edit-margins']//input[@placeholder='Miền Nam']");
	 public final By ELEMENT_DANH_MUC_CAP_NHAT =By.xpath(".//*[@id='modal-edit-margins']//button[2]");
	 public final By ELEMENT_DANH_MUC_MARGIN_RONG = By.xpath(".//*[@id='modal-edit-margins']//li[text()='Vui lòng nhập margin.']");
	 public final By ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN = By.xpath(".//*[@id='modal-edit-margins']//li[text()='Margin quá lớn, tối đa 100.']");
	 public final By ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG = By.xpath(".//*[@id='modal-edit-margins']//li[text()='Margin phải là số.']");
	 public final By ELEMENT_DANH_MUC_MARGIN_DONG = By.xpath(".//*[@id='modal-edit-margins']//button[1][text()='Đóng']");
	 
}

