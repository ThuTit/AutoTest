package com.selenium.supplier.system.testing.high;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.supplier.common.ManageLogInOut;
import com.selenium.supplier.common.Configuration;
import com.selenium.supplier.locator.Page_Locator;
import org.openqa.selenium.By;

import static org.selenium.common.TestLogger.*;
 
public class High_System_Test_Tim_Kiem extends Page_Locator {
 
        
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
    public void SUM55_Timkiemtheoten() {
    	String keyword = "Acer";
    	info("Tìm kiếm theo tên");
    	testCaseID="SUM-55";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Nhập tên Nhà SX/Thương hiệu cần tìm kiếm trong ô \"Search\"");
        type(INPUT_KEYWORD_NHASX, keyword, true);
        info("Kiểm tra hiển thị kết quả tìm kiếm thành công");
        waitForAndGetElement(SHOW_RESULT_SEARCH_NAME, 2000, 1);
    }
    @Test
    public void SUM56_TimkiemtheoMa() {
    	String keyword = "CISCO";
    	info("Tìm kiếm theo tên");
    	testCaseID="SUM-56";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Nhập mã Nhà SX/Thương hiệu cần tìm kiếm trong ô \"Search\"");
        type(INPUT_KEYWORD_NHASX, keyword, true);
        info("Kiểm tra hiển thị kết quả tìm kiếm thành công");
        waitForAndGetElement(SHOW_RESULT_SEARCH_CODE, 2000, 1);
    	
    }
    @Test
    public void SUM56_TimkiemtheoTrangchu() {
    	String keyword = "abc.vn";
    	info("Tìm kiếm theo trang chủ");
    	testCaseID="SUM-56";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Nhập link trang chủ Nhà SX/Thương hiệu cần tìm kiếm trong ô \"Search\"");
        type(INPUT_KEYWORD_NHASX, keyword, true);
        info("Kiểm tra hiển thị kết quả tìm kiếm thành công");
        waitForAndGetElement(SHOW_RESULT_SEARCH_LINK, 2000, 1);
    	
    }
    @AfterMethod
    public void afterMethod(){
            info("Start afterMethod");
            driver.manage().deleteAllCookies();
            driver.quit();
            info("End afterMethod");
    }
}
        