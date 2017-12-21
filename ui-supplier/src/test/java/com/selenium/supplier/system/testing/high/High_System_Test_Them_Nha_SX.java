package com.selenium.supplier.system.testing.high;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.supplier.common.ManageLogInOut;
import com.selenium.supplier.common.Configuration;
import com.selenium.supplier.locator.Page_Locator;
import org.openqa.selenium.By;

import static org.selenium.common.TestLogger.*;
 
public class High_System_Test_Them_Nha_SX extends Page_Locator {
 
        
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
    public void SUM72_ThemthanhcongnhapTenNhaSXkhongnhapMa() {
    	info("Thêm thành công khi nhập đúng tên Nhà SX và không nhập Mã Nhà SX");
    	testCaseID = "SUM-72";
    	String tenNhasx = "2SM72";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_72, 2000, 1);
    		
    }
    @Test
    public void SUM73_ThemthanhcongnhapTenNhaSXvanhapMa() {
    	info("Thêm thành công khi nhập đúng tên Nhà SX và nhập Mã Nhà SX");
    	testCaseID = "SUM-73";
    	String tenNhasx = "2SM73";
    	String maNhasx = "2SM73";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu tên Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUM_73, 2000, 1);
        info("Kiểm tra lưu mã Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_CODE_SUCCESS_SUM_73, 2000, 1);
    		
    }
    @Test
    public void SUM74_ThemthanhcongnhapTenNhaSXvanhapTrangchu() {
    	info("Thêm thành công khi nhập đúng tên Nhà SX và nhập Trang chủ");
    	testCaseID = "SUM-74";
    	String tenNhasx = "2SM74";
    	String trangChu = "google.com";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Thêm trang chủ");
    	type(ELEMENT_NSX_EDIT_TRANG_CHU, trangChu, true);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu tên Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_74, 2000, 1);
        info("Kiểm tra lưu trang chủ thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TRANG_CHU_SUCCESS_SUM_74, 2000, 1);
    }
    @Test
    public void SUM75_ThemthanhcongkhinhapdungtenNSXvachonTrangthaikichhoat() {
    	info("Thêm thành công khi nhập đúng tên NSX và chọn Trạng thái kích hoạt");
    	testCaseID = "SUM-75";
    	String tenNsx = "2SM75";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true );
        info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 4000, 1);
        info("Kiểm tra lưu tên Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_75, 2000, 1);
        info("Kiểm tra lưu Trạng thái thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_CHUYEN_TRANG_THAI_SUCCESS, 2000, 1);
    }
    @Test
    public void SUM76_Themthanhcongkhinhaptatcacactruong() {
    	info("Thêm thành công khi nhập tất cả các trường");
    	testCaseID= "SUM-76";
    	String tenNsx = "2SM76", maNsx = "2SM76", trangChu = "mvn.com";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNsx, true );
        info("Thêm trang chủ");
    	type(ELEMENT_NSX_EDIT_TRANG_CHU, trangChu, true);
    	info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 4000, 1);
        info("Kiểm tra lưu tên Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_76, 3000, 1);
        info("Kiểm tra lưu mã Nhà SX thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_CODE_SUCCESS_SUM_76, 2000, 1);
        info("Kiểm tra lưu trang chủ thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TRANG_CHU_SUCCESS_SUM_76, 2000, 1);
        info("Kiểm tra lưu Trạng thái thành công");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_CHUYEN_TRANG_THAI_SUCCESS, 2000, 1);
    }
    //Đội dev chưa fixbug
    /*
    @Test
    public void SUM77_ThemthanhcongnhapTenNhaSXdangHTML() {
    	info("Thêm thành công khi nhập đúng tên Nhà SX dạng HTML");
    	testCaseID = "SUM-77";
    	String tenNhasx = "<h1>01CD</h1>";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Kiểm tra lưu thành công");
        waitForAndGetElement(ELEMENT_NSX_ADD_TEN_NSX_SUCCESS_SUM_77, 2000, 1);
    		
    }
    */
    @Test
    public void SUM78_Themthatbaikhikhongnhapgi() {
    	testCaseID="SUM-78";
    	info("Thêm thất bại khi không nhập gì");
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_DELETE_TEN_NSX, 2000, 1);
    	
    }
    @Test
    public void SUM79_ThemthatbaikhikhongnhapTenNSX() {
    	testCaseID = "SUM-79";
    	String maNsx = "01II";
    	info("Thêm thất bại khi không nhập tên NSX");
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNsx, true );
        info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Chuyển trạng thái");
    	click(ELEMENT_NSC_EDIT_CHUYEN_TRANG_THAI);
    	info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_DELETE_TEN_NSX, 2000, 1);
        
        
    }
    @Test
    public void SUM80_ThemthatbaikhinhapTenNSXquadai() {
    	testCaseID = "SUM-80";
    	String tenNsx = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac nunc tempor, lacinia lorem et, tempor nulla. Nullam sodales ullamcorper gravida. Quisque pharetra lobortis porta. Donec non massa eu neque rhoncus pulvinar. Vivamus elementum, arcu in porttitor tempus, libero tellus commodo eros, ut ultrices purus dui a enim. Proin non egestas enim. Ut quis ligula condimentum, ornare dui at, ultricies odio. Curabitur blandit arcu a tellus pellentesque, a efficitur tellus facilisis. Maecenas ac imperdiet enim. Nullam ut venenatis urna. Nam scelerisque efficitur elementum.";
    	info("Thêm thất bại khi nhập tên NSX quá dài");
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 4000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
        info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_OVERLOAD_TEN_NSX, 2000, 1);
    }
    @Test
    public void SUM81_ThemthatbaikhinhaptrungTenNSX() {
    	testCaseID = "SUM-80";
    	String tenNsx = "Acer";
    	info("Thêm thất bại khi nhập trùng tên NSX");
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNsx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
        info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_EDIT_TRUNG_TEN_NSX, 2000, 1);
    }
    @Test
    public void SUM82_ThemthatbaikhinhaptrungMaNsx() {
    	info("Thêm thất bại khi nhập trùng mã nhà sx");
    	testCaseID = "SUM-82";
    	String tenNhasx = "82acer";
    	String maNhasx = "ACER";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 4000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_TRUNG_MA_NSX, 2000, 1);
    		
    }
    @Test
    public void SUM83_ThemthatbaikhinhapsaidodaiMaNsx() {
    	info("Thêm thất bại khi nhập sai độ dài mã nhà sx");
    	testCaseID = "SUM-83";
    	String tenNhasx = "82acer";
    	String maNhasx1 = "A", maNhasx2 ="qưedsadf";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx1, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DO_DAI_MA_3, 2000, 1);
    	info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx2, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DO_DAI_MA_6, 4000, 1);
    	
    		
    }
    @Test
    public void SUM84_ThemthatbaikhinhapsaidinhdangMaNsx() {
    	info("Thêm thất bại khi nhập sai định dạng mã nhà sx");
    	testCaseID = "SUM-84";
    	String tenNhasx = "82acer";
    	String maNhasx = "@@@";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DINH_DANG_MA, 2000, 1);
    		
    }
    @Test
    public void SUM85_ThemthatbaikhinhapsaidinhdangvadodaiMaNsx() {
    	info("Thêm thất bại khi nhập sai định dạng và độ dài mã nhà sx");
    	testCaseID = "SUM-85";
    	String tenNhasx = "82acer";
    	String maNhasx1 = "@", maNhasx2="!@#$%^&";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Nhập tên Nhà SX");
        type(ELEMENT_NSX_EDIT_TEN_NSX, tenNhasx, true );
        info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx1, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DINH_DANG_MA, 2000, 1);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DO_DAI_MA_3, 2000, 1);
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DINH_DANG_MA, 2000, 1);
    	info("Nhập Mã nhà sx");
        type(ELEMENT_NSX_ADD_CODE, maNhasx2, true );
        info("Click Lưu");
    	click(ELEMENT_NSX_BUTTON_EDIT_SUBMIT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DO_DAI_MA_6, 2000, 1);
    	waitForAndGetElement(ELEMENT_NSX_ADD_SAI_DINH_DANG_MA, 2000, 1);
    		
    }
    @Test
    public void SUM87_ThemNSXkhongdoikhichonDanhsach() {
    	info("Thêm Nhà sx không đổi khi chọn Danh sách");
    	testCaseID = "SUM-87";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Click Danh sách");
        click(ELEMENT_NSX_EDIT_CHON_DANH_SACH);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	
    }
    @Test
    public void SUM88_ThemNSXkhongdoikhichonMenutrai() {
    	info("Thêm Nhà sx không đổi khi chọn Menu trái");
    	testCaseID = "SUM-88";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Click Danh mục");
        click(ELEMENT_NSX_EDIT_MENU_TRAI );
        info("Kiểm tra hiển thị trang Danh mục thành công");
        waitForAndGetElement(DANH_MUC, 2000, 1);
    	
    }
    @Test
    public void SUM90_ThemNSXkhongdoikhichonBreadcrumblinkDanhmuc() {
    	info("Thêm Nhà sx không đổi khi chọn breadcrumb link Nhà SX/Thương hiệu");
    	testCaseID = "SUM-90";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Click breadcrumb link Nhà SX/Thương hiệu");
        click(BREADCRUMB_LINK_NHASX_THUONGHIEU );
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	
    }
    @Test
    public void SUM91_ThemNSXkhongdoikhichonBreadcrumblinkDashboard() {
    	info("Thêm Nhà sx không đổi khi chọn breadcrumb link Dashboard");
    	testCaseID = "SUM-91";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Click icon Thêm");
        click(ELEMENT_NSX_ADD_ICON_THEM);
        info("Kiểm tra hiển thị trang Thêm thành công");
        waitForAndGetElement(ELEMENT_NSX_FORM_ADD, 2000, 1);
        info("Click breadcrumb link Dashboard");
        click(BREADCRUMB_LINK_DASHBOARD );
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