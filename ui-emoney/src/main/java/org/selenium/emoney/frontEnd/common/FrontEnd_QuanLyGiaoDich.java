package org.selenium.emoney.frontEnd.common;
import static org.selenium.common.TestLogger.info;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_QuanLyGiaoDich;

import testlink.api.java.client.TestLinkAPIException;

public class FrontEnd_QuanLyGiaoDich extends FrontEnd_Locator_QuanLyGiaoDich {

	public FrontEnd_QuanLyGiaoDich(WebDriver dr){
		driver = dr;
	}
	 /**
     * Chọn bưu cục cấp 2
     * @param info
     * @throws IOException
	 * @throws TestLinkAPIException 
     */
    public void inputLevel2(String info) throws IOException, TestLinkAPIException {
        info ("Bấm mở thẻ span");               
        click( ELEMENT_QLGD_BUUCUC_CAP2_SPAN);
        Utils.pause(300);
        info ("Chọn bưu cục cấp 2");
        if ( info != "" ) select( ELEMENT_QLGD_BUUCUC_CAP2_SELECTED, info, 2);
        Utils.pause(300);
            
            
    }
    /**
     * Chọn bưu cục cấp 3
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputLevel3(String info) throws IOException, TestLinkAPIException {
        info ("Bấm mở thẻ span");               
        click( ELEMENT_QLGD_BUUCUC_CAP3_SPAN);
        Utils.pause(300);
        info ("Chọn bưu cục cấp 3");
        if ( info != "" ) 
        	select( ELEMENT_QLGD_BUUCUC_CAP3_SELECTED, info, 2);
        Utils.pause(300);
            
    }
    /**
     * Chọn bưu cục cấp 4
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputLevel4(String info) throws IOException, TestLinkAPIException {
        info ("Bấm mở thẻ span");               
        click( ELEMENT_QLGD_BUUCUC_CAP4_SPAN);
        Utils.pause(300);
        info ("Chọn bưu cục cấp 4");
        if ( info != "" ) 
        	select( ELEMENT_QLGD_BUUCUC_CAP4_SELECTED, info, 2);
        Utils.pause(300);   
    }
    /**
     * Chọn ngày Từ
     * @param date
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputDateFrom(String date) throws IOException, TestLinkAPIException {
        info ("Chọn ngày Từ");
        String datePattern = "\\d{2}/\\d{2}/\\d{4}";
        Boolean isDate = false;
        if (date != ""){
            isDate = date.matches(datePattern);
            if (isDate == true) {
            	type(ELEMENT_QLGD_DATE_FROM_FIELD, date, true);
            	Utils.pause(300);
            }
        }
        
        
    }
    /**
     * Chọn ngày Đến
     * @param date
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputDateTo(String date) throws IOException, TestLinkAPIException {
        info ("Chọn ngày Đến");
        String datePattern = "\\d{2}/\\d{2}/\\d{4}";
        Boolean isDate = false;
        if (date != ""){
            isDate = date.matches(datePattern);
            if (isDate == true) {
            	type(ELEMENT_QLGD_DATE_TO_FIELD, date, true);
            	 Utils.pause(300);
            }
        }
       
    }
    
    /**
     * Define cac truong co the update thong tin khach hang
     */
    public enum typeStatus{
            THANHCONG, THATBAI, CHOXULY, DAHOANTIEN, KHONGDUYET
    }
    /**
     * Chọn trạng thái
     * @param status
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputStatus( typeStatus status) throws IOException, TestLinkAPIException{
        info ("Chọn trạng thái");
        switch(status){
            case THANHCONG :                                
                select(ELEMENT_QLGD_STATUS_FIELD, "Thành công", 2);
                Utils.pause(300);
                break;
            case THATBAI :                          
                select(ELEMENT_QLGD_STATUS_FIELD, "Thất bại", 2);
                Utils.pause(300);
                break;
            case CHOXULY :                          
                select(ELEMENT_QLGD_STATUS_FIELD, "Chờ xử lý", 2);
                Utils.pause(300);
                break;
            case DAHOANTIEN :                               
                select(ELEMENT_QLGD_STATUS_FIELD, "Đã hoàn tiền", 2);
                Utils.pause(300);
                break;
            case KHONGDUYET :               
                select(ELEMENT_QLGD_STATUS_FIELD, "Không duyệt", 2);
                Utils.pause(300);
                break;
            default:
                info("Trạng thái không hợp lệ. Mời bạn làm lại");
                Utils.pause(300);
                break;
        }
        
    }
    /**
     * Define Type Transaction
     * @author Teko
     *
     */
    public enum typeTransaction{
            HUY, RUTTIEN, NAPTIEN, DIEUCHINH
    }
    /**
     * Chọn loại giao dịch
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputTransactionType(typeTransaction type) throws IOException, TestLinkAPIException{
        info ("Chọn loại giao dịch");
        switch( type ){
            case HUY:
                select (ELEMENT_QLGD_TYPE_TRANSACTION_FIELD, "Hủy", 2);
                Utils.pause(300);
                break;
            case RUTTIEN:
                select (ELEMENT_QLGD_TYPE_TRANSACTION_FIELD, "Rút tiền", 2);
                Utils.pause(300);
                break;
            case NAPTIEN:
                select(ELEMENT_QLGD_TYPE_TRANSACTION_FIELD, "Nạp tiền" , 2);
                Utils.pause(300);
                break;
            case DIEUCHINH:
                select(ELEMENT_QLGD_TYPE_TRANSACTION_FIELD, "Nạp tiền - Điều chỉnh khác", 2);
                Utils.pause(300);
                break;
            default:
                info("Trạng thái không hợp lệ. Mời bạn làm lại");
                break;
    
        }    
            
    }
    
    /**
     * Nhập họ và tên
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputName(String info) throws IOException, TestLinkAPIException{
        info ("Nhập họ và tên");
        if (info != "") 
        	type(ELEMENT_QLGD_NAME_FIELD, info, true);
        Utils.pause(300);
            
    }
    /**
     * Nhập số GTTT
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputGTTTNumber(String info) throws IOException, TestLinkAPIException{
        info ("Nhập số GTTT");
        if (info != "") 
        	type(ELEMENT_QLGD_GTTT_NUMBER_FIELD, info, true);
        Utils.pause(300);
    }
    /**
     * Nhập Số hiệu giao dịch
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputVNPNumber(String info) throws IOException, TestLinkAPIException{
        info ("Nhập Số hiệu giao dịch");
        if (info != "") 
        	type(ELEMENT_QLGD_VNP_NUMBER_FIELD, info, true);
        Utils.pause(300);
    }
    /**
     *Nhập giao dịch viên 
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void inputGiaoDichVien(String info) throws IOException, TestLinkAPIException{
        info ("Nhập giao dịch viên");
        if (info != "") 
        	type(ELEMENT_QLGD_GIAO_DICH_VIEN_FIELD, info, true );
        Utils.pause(300);
    }
    /**
     * Click vào nút tìm kiếm
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void search() throws IOException, TestLinkAPIException{
        info ("Click vào nút tìm kiếm");
        click(ELEMENT_QLGD_SEARCH_BTN);
        Utils.pause(1000);
    }
    /**
     * Kiểm tra thông tin giao dịch
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void verifyTransactionInfo(String info) throws IOException, TestLinkAPIException{
        info ("Kiểm tra thông tin giao dịch");
        if (info != "")
        	waitForAndGetElement(ELEMENT_QLGD_INFO.replace("$info", info), 3000, 1);
                    
    }
    /**
     * Hủy một giao dịch
     * @param info
     * @throws IOException
     * @throws TestLinkAPIException 
     */
    public void cancelTransaction(String info) throws IOException, TestLinkAPIException{
        info ("Hủy một giao dịch");
        if (info != ""){
            //click Huy
            waitForAndGetElement(ELEMENT_QLGD_CANCEL_BTN.replace("$info", info), 3000, 1);
            click (ELEMENT_QLGD_CANCEL_BTN.replace("$info", info));

            //click submit tai man hinh chi tiet 
            waitForAndGetElement(ELEMENT_QLGD_SUBMIT_BTN, 3000, 1);
            click(ELEMENT_QLGD_SUBMIT_BTN);
        }
        Utils.pause(1000);
    }
}
