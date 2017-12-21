package com.selenium.supplier.system.testing.high;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.supplier.common.ManageLogInOut;
import com.selenium.supplier.common.Configuration;
import com.selenium.supplier.locator.Page_Locator;
import org.openqa.selenium.By;

import static org.selenium.common.TestLogger.*;
 
public class High_System_Test_Quan_Ly_Margin extends Page_Locator {
 
        
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
    public void SUM104_SuaMarginthanhcong() {
    	String MienBac = "5", MienTrung = "5", MienNam = "5";
    	info("Sửa Margin thành công");
    	testCaseID = "SUM_104";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra đóng popup thành công");
    	waitForElementNotPresent(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    }
    @Test
    public void SUM105_SuaMarginthatbaivoiMienBacrong() {
    	String MienBac = "", MienTrung = "5", MienNam = "5";
    	info("Sửa Margin thất bại với Miền Bắc rỗng");
    	testCaseID = "SUM_105";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    @Test
    public void SUM106_SuaMarginthatbaivoiMienNamrong() {
    	String MienBac = "5", MienTrung = "5", MienNam = "";
    	info("Sửa Margin thất bại với Miền Nam rỗng");
    	testCaseID = "SUM_106";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    @Test
    public void SUM107_SuaMarginthatbaivoiMienTrungrong() {
    	String MienBac = "5", MienTrung = "", MienNam = "5";
    	info("Sửa Margin thất bại với Miền Trung rỗng");
    	testCaseID = "SUM_107";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    //Bug SUM-614
    
    @Test
    public void SUM108_SuaMarginthatbaivoiMienBacvsMienNamrong() {
    	String MienBac = "", MienTrung = "5", MienNam = "";
    	info("Sửa Margin thất bại với Miền Bắc và miền Nam rỗng");
    	testCaseID = "SUM_108";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    //Bug SUM-614
    @Test
    public void SUM109_SuaMarginthatbaivoiMienBacvsMienTrungrong() {
    	String MienBac = "", MienTrung = "", MienNam = "5";
    	info("Sửa Margin thất bại với Miền Bắc và miền Trung rỗng");
    	testCaseID = "SUM_109";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    //Bug SUM-614
    @Test
    public void SUM110_SuaMarginthatbaivoiMienNamvsMienTrungrong() {
    	String MienBac = "5", MienTrung = "", MienNam = "";
    	info("Sửa Margin thất bại với Miền Bắc và miền Trung rỗng");
    	testCaseID = "SUM_110";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
    //Bug SUM-615
    @Test
    public void SUM111_SuaMarginthatbaivoiMienBacMienTrungMienNamrong() {
    	String MienBac = "", MienTrung = "", MienNam = "";
    	info("Sửa Margin thất bại với Miền Bắc miền Trung và miền Nam rỗng");
    	testCaseID = "SUM_111";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_RONG, 2000, 1);
    }
  
    @Test
    public void SUM112_SuaMarginthatbaivoiMienBacngoaidoan() {
    	String MienBac = "111", MienTrung = "5", MienNam = "5";
    	info("Sửa Margin thất bại với giá trị Miền Bắc ngoài đoạn [0; 100]");
    	testCaseID = "SUM_112";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
    @Test
    public void SUM113_SuaMarginthatbaivoiMienTrungngoaidoan() {
    	String MienBac = "11", MienTrung = "115", MienNam = "5";
    	info("Sửa Margin thất bại với giá trị Miền Trung ngoài đoạn [0; 100]");
    	testCaseID = "SUM_113";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
    @Test
    public void SUM114_SuaMarginthatbaivoiMienNamngoaidoan() {
    	String MienBac = "11", MienTrung = "15", MienNam = "115";
    	info("Sửa Margin thất bại với giá trị Miền Nam ngoài đoạn [0; 100]");
    	testCaseID = "SUM_114";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
    //Bug SUM-617
    @Test
    public void SUM115_SuaMarginthatbaivoiMienBacNamngoaidoan() {
    	String MienBac = "111", MienTrung = "15", MienNam = "115";
    	info("Sửa Margin thất bại với giá trị Miền Bắc, Nam ngoài đoạn [0; 100]");
    	testCaseID = "SUM_115";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
  //Bug SUM-617
    @Test
    public void SUM116_SuaMarginthatbaivoiMienBacTrungngoaidoan() {
    	String MienBac = "111", MienTrung = "115", MienNam = "11";
    	info("Sửa Margin thất bại với giá trị Miền Bắc, Trung ngoài đoạn [0; 100]");
    	testCaseID = "SUM_116";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
  //Bug SUM-617
    @Test
    public void SUM117_SuaMarginthatbaivoiMienTrungNamngoaidoan() {
    	String MienBac = "11", MienTrung = "115", MienNam = "111";
    	info("Sửa Margin thất bại với giá trị Miền Trung, Nam ngoài đoạn [0; 100]");
    	testCaseID = "SUM_117";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
  //Bug SUM-618
    @Test
    public void SUM118_SuaMarginthatbaivoiMienBacTrungNamngoaidoan() {
    	String MienBac = "114", MienTrung = "115", MienNam = "111";
    	info("Sửa Margin thất bại với giá trị Miền Bắc, Trung, Nam ngoài đoạn [0; 100]");
    	testCaseID = "SUM_118";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_NGOAI_DOAN, 2000, 1);
    }
    @Test
    public void SUM119_SuaMarginthatbaivoiMienBackhacso() {
    	String MienBac = "aa", MienTrung = "15", MienNam = "11";
    	info("Sửa Margin thất bại với giá trị Miền Bắc khác số");
    	testCaseID = "SUM_119";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM120_SuaMarginthatbaivoiMienTrungkhacso() {
    	String MienBac = "12", MienTrung = "ww", MienNam = "11";
    	info("Sửa Margin thất bại với giá trị Miền Trung khác số");
    	testCaseID = "SUM_120";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM121_SuaMarginthatbaivoiMienNamkhacso() {
    	String MienBac = "12", MienTrung = "11", MienNam = "kk";
    	info("Sửa Margin thất bại với giá trị Miền Nam khác số");
    	testCaseID = "SUM_121";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM122_SuaMarginthatbaivoiMienBacNamkhacso() {
    	String MienBac = "ee", MienTrung = "12", MienNam = "kk";
    	info("Sửa Margin thất bại với giá trị Miền Bắc, Nam khác số");
    	testCaseID = "SUM_122";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM123_SuaMarginthatbaivoiMienBacTrungkhacso() {
    	String MienBac = "ee", MienTrung = "ff", MienNam = "12";
    	info("Sửa Margin thất bại với giá trị Miền Bắc, Trung khác số");
    	testCaseID = "SUM_123";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM124_SuaMarginthatbaivoiMienTrungNamkhacso() {
    	String MienBac = "11", MienTrung = "ff", MienNam = "rr";
    	info("Sửa Margin thất bại với giá trị Miền Trung Nam khác số");
    	testCaseID = "SUM_124";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM125_SuaMarginthatbaivoiMienBacTrungNamkhacso() {
    	String MienBac = "ee", MienTrung = "ff", MienNam = "rr";
    	info("Sửa Margin thất bại với giá trị Miền Bắc Trung Nam khác số");
    	testCaseID = "SUM_125";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Sửa giá trị Miền Bắc là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_BAC, MienBac, true);
    	info("Sửa giá trị Miền Trung là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_TRUNG, MienTrung, true);
    	info("Sửa giá trị Miền Nam là là số nguyên trong phạm vi [0;100]");
    	type(ELEMENT_DANH_MUC_MIEN_NAM, MienNam, true);
    	info("Chọn Cập nhật");
    	click(ELEMENT_DANH_MUC_CAP_NHAT);
    	info("Kiểm tra hiển thị thông báo lỗi");
    	waitForAndGetElement(ELEMENT_DANH_MUC_MARGIN_SAI_DINH_DANG, 2000, 1);
    }
    @Test
    public void SUM127_SuaMarginkhongdoikhichonDong() {
    	info("Sửa Margin không đổi khi chọn đóng");
    	testCaseID = "SUM_127";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Chọn Đóng");
    	click(ELEMENT_DANH_MUC_MARGIN_DONG);
    	info("Kiểm tra đóng popup thành công");
    	waitForElementNotPresent(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    }
    @Test
    public void SUM128_SuaMarginkhongdoikhiclichchuotngoaipopup() {
    	info("Sửa Margin không đổi khi click chuột ngoài popup");
    	testCaseID = "SUM_128";
    	info("Vào Quản lý danh mục");
    	click(QUANLYDANHMUC);
    	info("Vào trang Danh mục");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra hiển thị trang Danh mục thành công");
    	waitForAndGetElement(DANH_MUC, 2000, 1);
    	info("Click icon Margin");
    	click(ELEMENT_DANH_MUC_ICON_MARGIN);
    	info("Kiểm tra hiển thị popup thành công");
    	waitForAndGetElement(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    	info("Click chuột ngoai popup");
    	click(ELEMENT_DANH_MUC_CLICK);
    	info("Kiểm tra đóng popup thành công");
    	waitForElementNotPresent(ELEMENT_DANH_MUC_POPUP, 2000, 1);
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @AfterMethod
    public void afterMethod(){
            info("Start afterMethod");
            driver.manage().deleteAllCookies();
            driver.quit();
            info("End afterMethod");
    }
}