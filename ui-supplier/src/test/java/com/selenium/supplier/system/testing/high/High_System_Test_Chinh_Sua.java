package com.selenium.supplier.system.testing.high;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.supplier.common.ManageLogInOut;
import com.selenium.supplier.common.Configuration;
import com.selenium.supplier.locator.Page_Locator;
import org.openqa.selenium.By;

import static org.selenium.common.TestLogger.*;
 
public class High_System_Test_Chinh_Sua extends Page_Locator {
 
        
    Configuration config;
    ManageLogInOut mgLogInOut;
        
    @BeforeMethod
    public void setUpBeforeMethod(){
		info("Start setUpBeforeMethod");
		initSeleniumTest();
		mgLogInOut = new ManageLogInOut(driver);
		config = new Configuration();
		mgLogInOut.login("nguyenthu279.uet@gmail.com", "123daihoccongnghe", true);
		info("End setUpBeforeMethod");
 
    }
    @Test
    public void SUM58_ChinhsuathanhcongkhinhapdungtenNSX() {
    	String tenNsx = "Autotest";
    	info("Chỉnh sửa thành công khi nhập đúng tên nhà sx");
    	testCaseID="SUM-58";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
    	info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu thành công");
        waitForAndGetElement(ELEMENT_NSX_EDIT_TEN_NSX_SUCCESS, 2000, 1);
    }
    @Test
    public void SUM59_ChinhsuathanhcongkhinhapdungtenNSXvaTrangchu() {
    	String tenNsx= "Autotest";
    	String TrangChu = "google.com";
    	info("Chỉnh sửa thành công khi nhập đúng tên nhà sx");
    	testCaseID="SUM-59";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Chỉnh sửa trang chủ");
    	type(ELEMENT_NSX_EDIT_TRANG_CHU, TrangChu, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	info("Kiểm tra chỉnh sửa Tên nhà sx thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TEN_NSX_SUCCESS, 2000, 1);
    	info("Kiểm tra chỉnh sửa Trang chủ thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TRANG_CHU_SUCCESS, 2000, 1);
    }
    @Test
    public void SUM60_ChinhsuathanhcongkhinhapdungtenNSXvachuyenTrangthai() {
    	String tenNsx= "Autotest";
    	info("Chỉnh sửa thành công khi nhập đúng tên nhà sx");
    	testCaseID="SUM-60";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	info("Kiểm tra chỉnh sửa Tên nhà sx thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TEN_NSX_SUCCESS, 2000, 1);
    	info("Kiểm tra chỉnh sửa Trạng thái thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_CHUYEN_TRANG_THAI_SUCCESS, 2000, 1);
    }
    @Test
    public void SUM61_ChinhsuadungkhinhaptenNhasxLinktrangchuvachuyenTrangthai() {
    	String tenNsx= "Autotest";
    	String TrangChu = "google.com";
    	testCaseID="SUM-61";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Chỉnh sửa trang chủ");
    	type(ELEMENT_NSX_EDIT_TRANG_CHU, TrangChu, true);
    	info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	info("Kiểm tra chỉnh sửa Tên nhà sx thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TEN_NSX_SUCCESS, 2000, 1);
    	info("Kiểm tra chỉnh sửa Trang chủ thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TRANG_CHU_SUCCESS, 2000, 1);
    	info("Kiểm tra chỉnh sửa Trạng thái thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_CHUYEN_TRANG_THAI_SUCCESS, 2000, 1);
    }
    //Bug SUM-400
    @Test
    public void SUM62_Chinhsuatennsxthanhcongnkhinhapdanghtml() {
    	String tenNsx = "<h1>Autotest</h1>";
    	info("Chỉnh sửa thành công khi nhập đúng tên nhà sx");
    	testCaseID="SUM-62";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
    	info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu thành công");
        waitForAndGetElement(ELEMENT_NSX_EDIT_TEN_NSX_HTML_SUCCESS, 2000, 1);
    }
    
    @Test
    public void SUM63_ChinhsuathatbaikhibotrongTenNhaSX() {
    	String tenNsx = "";
    	info("Chỉnh sửa thất bại khi bỏ trống tên Nhà SX");
    	testCaseID="SUM-63";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
    	info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang thông báo lỗi");
        waitForAndGetElement(ELEMENT_NSX_EDIT_DELETE_TEN_NSX, 2000, 1);
       
    }
    @Test
    public void SUM64_ChinhsuathatbaikhinhaptrungTenNhaSX() {
    	String tenNsx = "Acer";
    	info("Chỉnh sửa thất bại khi nhập trùng tên Nhà SX");
    	testCaseID="SUM-64";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
    	info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang thông báo lỗi");
        waitForAndGetElement(ELEMENT_NSX_EDIT_TRUNG_TEN_NSX, 2000, 1);
       
    }
    //Sai lỗi chính tả
    @Test
    public void SUM65_ChinhsuathatbaikhinhapTenNhaSXquadai() {
    	String tenNsx = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus odio lacus, ultricies id libero eu, vestibulum placerat libero. Nunc nec suscipit enim, id tincidunt nulla. Integer mi justo, sodales a iaculis sit amet, egestas sed enim. Interdum et malesuada fames ac ante ipsum primis in faucibus. Quisque at metus tellus. Donec vitae suscipit nunc. Cras luctus risus eu tellus pellentesque condimentum.";
    	info("Chỉnh sửa thất bại khi nhập tên Nhà SX quá dài");
    	testCaseID="SUM-64";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
    	info("Chỉnh sửa tên Nhà SX");
    	type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang thông báo lỗi");
        waitForAndGetElement(ELEMENT_NSX_EDIT_OVERLOAD_TEN_NSX, 2000, 1);
       
    }
    @Test
    public void SUM67_ChinhsuathongtinnhasxkhongthaydoikhichonDanhsach() {
    	info("Chỉnh sửa thông tin Nhà SX không thay đổi khi chọn Danh sach");
    	testCaseID="SUM-67";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Click Danh sách");
        click(ELEMENT_NSX_EDIT_CHON_DANH_SACH);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    }
    @Test
    public void SUM68_Chinhsuathongtinnhasxkhongthaydoikhichonmenutrai() {
    	info("Chỉnh sửa thông tin Nhà SX không thay đổi khi chọn mennu trái");
    	testCaseID="SUM-68";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Click Danh mục");
        click(ELEMENT_NSX_EDIT_MENU_TRAI);
        info("Kiểm tra hiển thị trang Danh mục thành công");
        waitForAndGetElement(DANH_MUC, 2000, 1);
    }
    @Test
    public void SUM70_ChinhsuathongtinnhasxkhongthaydoikhikiemtraBreadcrumbLinkNhaSX() {
    	info("Chỉnh sửa thông tin Nhà SX không thay đổi khi kiểm tra Breadcrumb link về Nhà SX");
    	testCaseID="SUM-70";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Click Breadcrumb link Nhà SX/Thương hiệu");
        click(BREADCRUMB_LINK_NHASX_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    }
    @Test
    public void SUM71_ChinhsuathongtinnhasxkhongthaydoikhikiemtraBreadcrumbLinkDashboard() {
    	info("Chỉnh sửa thông tin Nhà SX không thay đổi khi kiểm tra Breadcrumb link về Dashboard");
    	testCaseID="SUM-71";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn icon chỉnh sửa");
        click(ELEMENT_NSX_ICON_CHINH_SUA);
        info("Kiểm tra load sang trang Chỉnh sửa thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_CHINH_SUA, 2000, 1);
        info("Click Breadcrumb link Dashboard");
        click(BREADCRUMB_LINK_DASHBOARD);
        info("Kiểm tra hiển thị trang Dashboard thành công");
        waitForAndGetElement(SHOW_DASHBOARD, 2000, 1);
    }
    @AfterMethod
    public void afterMethod(){
            info("Start afterMethod");
            driver.manage().deleteAllCookies();
            driver.quit();
            info("End afterMethod");
    }
    
}