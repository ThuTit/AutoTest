package com.selenium.supplier.system.testing.high;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.supplier.common.ManageLogInOut;
import com.selenium.supplier.common.Configuration;
import com.selenium.supplier.locator.Page_Locator;
import org.openqa.selenium.By;

import static org.selenium.common.TestLogger.*;
 
public class High_System_Test_Danh_Sach extends Page_Locator {
 
        
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
    public void SUM43_ShowRecord(){
        info("Kiểm tra hiển thị số record trên một trang");
        testCaseID="SUM-43";
        info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn số lượng trong ô downdrop");
        select(SELECT_SHOW_RECORD_NHASANXUAT_THUONGHIEU, Integer.toString(50), 2);
        info("Kiểm tra hiển thị số lượng record thành công");
        waitForAndGetElement(SHOW_RECORD_NHASANXUAT_THUONGHIEU_SUCCESS, 2000, 1);
      }
    @Test
    public void SUM44_Kiemtratranghienthi(){
    	info("Kiểm tra trang hiển thị");
    	testCaseID= "SUM-44";
    	info("Vào trang Quản lý danh mục");
        click(QUANLYDANHMUC);
        info("Vào trang Nhà SX_Thương hiệu ");
        click(NHASANXUAT_THUONGHIEU);
        info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
        waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
        info("Chọn trang muốn hiển thị");
        click(SELECT_PAGE);
        info("Kiểm tra hiển thị đúng số trang");
        waitForAndGetElement(SHOW_PAGE_SUCCESS, 2000, 1);
        	
      }
      @Test
      public void SUM45_KiemtraBreadcrumblinkDanhmuc(){
    	  info("Kiểm tra Breadcrumb link về Danh mục");
    	  testCaseID= "SUM-45";
    	  info("Vào trang Quản lý danh mục");
    	  click(QUANLYDANHMUC);
    	  info("Vào trang Nhà SX_Thương hiệu ");
    	  click(NHASANXUAT_THUONGHIEU);
    	  info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	  waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	  info("Click vào link breadcrumb Nhà SX _ Thương hiệu");
    	  click(BREADCRUMB_LINK_NHASX_THUONGHIEU);
    	  info("Kiểm tra hiển thị trang Nhà SX thành công");
    	  waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	  
      }
      @Test
      public void SUM46_KiemtrabreadcrumblinkDashboard(){
    	  info("Kiểm tra Breadcrumb link về Dashboard");
    	  testCaseID= "SUM-46";
    	  info("Vào trang Quản lý danh mục");
    	  click(QUANLYDANHMUC);
    	  info("Vào trang Nhà SX_Thương hiệu ");
    	  click(NHASANXUAT_THUONGHIEU);
    	  info("Kiểm tra hiển thị trang Nhà SX_Thương hiệu thành công");
    	  waitForAndGetElement(SHOW_NHASANXUAT_THUONGHIEU, 2000, 1);
    	  info("Click vào link breadcrumb Dashboard");
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