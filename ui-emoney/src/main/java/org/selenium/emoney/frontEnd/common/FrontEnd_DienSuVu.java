package org.selenium.emoney.frontEnd.common;

import static org.selenium.common.TestLogger.info;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_DienSuVu;

import testlink.api.java.client.TestLinkAPIException;

public class FrontEnd_DienSuVu extends FrontEnd_Locator_DienSuVu {

	public FrontEnd_DienSuVu(WebDriver dr){
		driver = dr;
	}
		
	/**
	 * Chọn from date
	 * @param year
	 * @param month
	 * @param day
	 * @throws TestLinkAPIException 
	 */
	public void chooseFromDate(String year,String month,String day) throws TestLinkAPIException{
		String currentYear = getCurrentDate("yyyy");
		String currentMonth = getCurrentDate("M");
		String currentDay = getCurrentDate("d");
		
		info("Mở calendar popup");
		click(ELEMENT_DSV_FROMDATE_CALENDAR_SHOW);
		
		if ( (!year.equals(currentYear)) || !month.equals(currentMonth) ){
			info("Hiển thị 12 tháng và năm");
			click(ELEMENT_DSV_DATE_MONTH_SHOW, 3000, 1);			
		}
		
		while (!year.equals(currentYear)){
			if (Integer.parseInt(year) < Integer.parseInt(currentYear) ){
				info("Click vào nút previous");
				click(ELEMENT_DSV_DATE_MONTH_PREV_BTN, 3000, 1);
			} else {
				info("Click vào nút next");
				click(ELEMENT_DSV_DATE_MONTH_NEXT_BTN, 3000, 1);

			}
			
			String prevYear = waitForAndGetElement(ELEMENT_DSV_DATE_YEAR_VALUE).getText();
			if( prevYear.equals(year) ) break;
		}
		
		if( !month.equals(currentMonth) ){
			info("Chọn tháng");
			if( Integer.parseInt(month) < 10 ) month = month.replace("0","");
			click(ELEMENT_DSV_DATE_MONTH_VALUE.replace("$month",month), 3000, 1);
			
		}
		
		if(!day.equals(currentDay)){
		    info("Chọn ngày");
		    if(Integer.parseInt(day)<10) day = day.replace("0","");
		    click(ELEMENT_DSV_DATE_DAY.replace("$day",day), 3000, 1);
		    
		}
		
	}
	
	/**
	 * 
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputDateFrom(String date) throws IOException, TestLinkAPIException{
		String[] list = null;
		info ("Chọn ngày Từ");
		if (date != ""){
			list = date.split("/");
			chooseFromDate(list[2],list[1],list[0]);
			Utils.pause(100);
		}
		
	}
	/**
	 * Chọn from date
	 * @param year
	 * @param month
	 * @param day
	 * @throws TestLinkAPIException 
	 */
	public void chooseToDate(String year,String month,String day) throws TestLinkAPIException{
		String currentYear=getCurrentDate("yyyy");
		
		info("Mở calendar popup");
		click(ELEMENT_DSV_TODATE_CALENDAR_SHOW);
		
		info("Hiển thị 12 tháng và năm");
		click(ELEMENT_DSV_DATE_MONTH_SHOW);
		
		
		while (!year.equals(currentYear)){
			if(Integer.parseInt(year)<Integer.parseInt(currentYear)){
				info("Click vào nút previous");
				click(ELEMENT_DSV_DATE_MONTH_PREV_BTN);
				Utils.pause(100);
			}else {
				info("Click vào nút next");
				click(ELEMENT_DSV_DATE_MONTH_NEXT_BTN);
				Utils.pause(100);
			}
			
			String prevYear=waitForAndGetElement(ELEMENT_DSV_DATE_YEAR_VALUE).getText();
			if(prevYear.equals(year)) break;
		}
		
		info("Chọn tháng");
		if ( Integer.parseInt(month) < 10 ) month = month.replace("0","");
		click(ELEMENT_DSV_DATE_MONTH_VALUE.replace("$month",month));

		info("Chọn ngày");
		if ( Integer.parseInt(day) < 10 ) day = day.replace("0","");
		click(ELEMENT_DSV_DATE_DAY.replace("$day",day));
		
		Utils.pause(100);
	}	
	
	/**
	 * 
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputDateTo(String date) throws IOException, TestLinkAPIException{		
		String[] list = null;		
		info ("Chọn ngày Từ");	
		if (date != ""){			
			list = date.split("/");
			chooseToDate(list[2],list[1],list[0]);
			Utils.pause(100);
		}
		
	}
	
	 /**
     * Define cac truong co the update thong tin khach hang
     */
    public enum typeStatus{
          DAXULY, CHUAXULY
    }

	/**
	 * 
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void inputStatus(typeStatus status) throws IOException, TestLinkAPIException{
		info ("Chọn trạng thái");
		switch ( status){
			case DAXULY:
				select(ELEMENT_DSV_STATUS_FIELD, "Đã xử lý", 2);
				Utils.pause(100);
				break;
			case CHUAXULY:
				select(ELEMENT_DSV_STATUS_FIELD, "Chưa xử lý", 2);
				Utils.pause(100);
				break;
			default:
				info ("Trạng thái không hợp lệ, Mời bạn thử lại");
				break;
		
		}	
		
	}
	/**
	 * Click vào nút tìm kiếm
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void search() throws IOException, TestLinkAPIException{
		info ("Click vào nút tìm kiếm");
		click(ELEMENT_DSV_SEARCH_BTN);
		Utils.pause(100);
	
	}
	/**
	 * Kiểm tra thông tin giao dịch chờ duyệt
	 * @throws IOException
	 * @throws TestLinkAPIException 
	 */
	public void verifyPendingTransitionInfo(String info) throws IOException, TestLinkAPIException{
		info ("Kiểm tra thông tin giao dịch chờ duyệt");
		if ( info != "") 
			waitForAndGetElement( ELEMENT_DSV_PENDING_TRANSACTION_INFO.replace("$info", info), 3000, 1);
		
	}

}
