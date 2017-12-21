package com.selenium.emoney.smoke.frontend;

import org.selenium.emoney.readData.StaffInfoDatabase.fieldStaff;
import org.selenium.emoney.readData.TransactionInfoDatabase;
import org.selenium.emoney.readData.TransactionInfoDatabase.fieldTransaction;
import org.testng.annotations.Test;

import static org.selenium.common.TestLogger.info;
public class Smoke_FrontEnd_QuanLyGiaoDich extends TestConfig {

	/**
	* Test ID:QLGD_001
	* Test case name:Kiểm tra việc hủy giao dịch rút tiền
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*9. Vào phần quản lý giao dịch
	*10. Thực hiện việc hủy giao dịch
	* Expected Result:
	* Giao dịch được hủy thành công
	 * @throws Exception 
	*//*
	@Test
	public void QLGD_001_HủyGiaoDichRútTiền() throws Exception{
		info("Kiểm tra việc hủy giao dịch rút tiền");
		info("Khái báo các tham số");
		String mota ="Thực hiện hủy giao dịch";
		String prevDate=getDateOfFreviousMonth("MM/yyyy");
		String message = mesg.getMessageByArrayTypeRandom(10);
		
		info("Lấy mã giao dịch hủy từ Database");
		transactionList = new TransactionInfoDatabase();
		transactionList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,qlgiaodich.sqlQueryTransactionWidthdrawByDate.replace("$code","10").replace("$date",prevDate));
		String idCancelTransaction=transactionList.index.get(0).toString();
		info("idCancelTransaction:"+idCancelTransaction);
		String transactionNumb=transactionList.getByArrayTypeRandom(fieldTransaction.transaction_number,transactionList.index.get(0));
		
		info("Lấy mã pin của staff từ Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		String mapin = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,staffInfo.index.get(0));
		
		info("Step1: Mở trang quản lý giao dịch");
		hp.goToQuanLyGiaoDich();
		
		info("Step2: Chọn một giao dịch");
		info("Previous month:"+getDateOfFreviousMonth("d/M/yyyy"));
		qlgiaodich.searchTransaction(getDateOfFreviousMonth("d/M/yyyy"),"","","","","", transactionNumb,"");
		
		info("Step3: Hủy giao dịch");
		qlgiaodich.huyGiaoDich(transactionNumb, mota, mapin,false);
		qlgiaodich.huygiaodich_accept();
		qlgiaodich.huygiaodich_confirmpopup_accept();
		waitForAndGetElement(qlgiaodich.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
		
		info("Step4: Xác định giao dịch được hủy thành công");
		transactionList = new TransactionInfoDatabase();
		transactionList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,qlgiaodich.sqlQueryCancelTransactionWidthdrawByDate.replace("$id",idCancelTransaction));
		String vnpCancelTransaction=transactionList.getByArrayTypeRandom(fieldTransaction.transaction_number,transactionList.index.get(0));
		info("vnpCancelTransaction:"+vnpCancelTransaction);
		hp.goToQuanLyGiaoDich();
		qlgiaodich.searchTransaction("","","","","","", transactionNumb,"");
		waitForElementNotPresent(qlgiaodich.ELEMENT_QLGD_TRANSACTION_HUY_BTN.replace("$transNumb",transactionNumb),3000,1);
		
		info("Step5: Xác định giao dịch hủy đang được chờ duyệt trong Điện sự vụ");
		hp.goToDienSuVu();
		qldiensuvu.search("","","Chưa xử lý");
		waitForAndGetElement(qldiensuvu.ELEMENT_DIENSUVU_TRANSACTION_DUYET_BTN.replace("$transNumb",vnpCancelTransaction),3000,1);
	}*/
}
