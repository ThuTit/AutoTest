package com.selenium.emoney.smoke.frontend;

import org.selenium.emoney.readData.StaffInfoDatabase.fieldStaff;
import org.selenium.emoney.readData.TransactionInfoDatabase;
import org.selenium.emoney.readData.TransactionInfoDatabase.fieldTransaction;
import org.testng.annotations.Test;

import static org.selenium.common.TestLogger.info;
public class Smoke_FrontEnd_DienSuVu extends TestConfig{

	/**
	* Test ID:QLDSV_001
	* Test case name:Kiểm tra việc duyệt một giao dịch hủy
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần điện sự vụ
	*3. Duyệt một giao dịch hủy
	* Expected Result:
	* Giao dịch hủy được duyệt thành công
	 * @throws Exception 
	*//*
	@Test
	public void QLDSV_001_KiểmTraViệcDuyệtMộtGiaoDịchHủy() throws Exception{
		info("Kiểm tra việc hủy giao dịch rút tiền");
		info("Khái báo các tham số");
		String mota ="Thực hiện duyệt một giao dịch hủy";
		String currentDate=getCurrentDate("MM/yyyy");
		String message = mesg.getMessageByArrayTypeRandom(11);
		
		info("Lấy mã giao dịch chờ duyệt từ Database");
		transactionList = new TransactionInfoDatabase();
		transactionList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,qlgiaodich.sqlQueryApproverTransactionWidthdrawByDate.replace("$newWhere","a.reason_code='11' and a.status ='-1' and DATE_FORMAT(a.transaction_date,'%d/%m/%Y %H:%i:%s') like '%"+currentDate+"%' and a.additional='' and a.approver_id is null "));
		String transactionNumb=transactionList.getByArrayTypeRandom(fieldTransaction.transaction_number,transactionList.index.get(0));
		String card_no=transactionList.getByArrayTypeRandom(fieldTransaction.card_no,transactionList.index.get(0));
		String emoney_amount=transactionList.getByArrayTypeRandom(fieldTransaction.emoney_amount,transactionList.index.get(0));
		
		
		info("Lấy mã pin của staff từ Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,thongtin.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		String mapin = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,staffInfo.index.get(0));
		
		info("Step1: Mở trang điện sự vụ");
		hp.goToDienSuVu();
		
		info("Step2: Chọn một giao dịch");
		
		info("Step3: Duyệt một giao dịch hủy");
		qldiensuvu.duyet(transactionNumb, mota, mapin, false);
		qldiensuvu.duyetGiaoDich_accept();
		waitForAndGetElement(qldiensuvu.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
		info("Check trạng thái giao dịch hủy được duyệt thành công trong bảng điện sự vụ");
		hp.goToDienSuVu();
		qldiensuvu.search("","","Đã xử lý");
		waitForElementNotPresent(qldiensuvu.ELEMENT_DIENSUVU_TRANSACTION_DUYET_BTN.replace("$transNumb",transactionNumb),3000,1);
		waitForAndGetElement(qldiensuvu.ELEMENT_QLGD_TRANSACTION_STATUS.replace("$transNumb",transactionNumb).replace("$status","Thành công"),3000,1);
		
		info("Step4: Xác định giao dịch hủy được duyệt thành công");
		hp.goToQuanLyGiaoDich();
		qlgiaodich.searchTransaction("","","","","","", transactionNumb,"");
		waitForElementNotPresent(qlgiaodich.ELEMENT_QLGD_TRANSACTION_HUY_BTN.replace("$transNumb",transactionNumb),3000,1);
		waitForAndGetElement(qlgiaodich.ELEMENT_QLGD_TRANSACTION_STATUS.replace("$transNumb",transactionNumb).replace("$status","Thành công"),3000,1);
		
		info("Step5: Xác định số dư tài khoản được refunde lại trong Database");
		transactionList = new TransactionInfoDatabase();
		transactionList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,qlgiaodich.sqlQueryApproverTransactionWidthdrawByDate.replace("$newWhere","a.transaction_number='"+transactionNumb+"'"));
		String emoney_balance=transactionList.getByArrayTypeRandom(fieldTransaction.emoney_balance,transactionList.index.get(0));
		info("emoney_amount:"+emoney_amount);
		info("emoney_balance:"+emoney_balance);
		
		info("Step 6: Xác định số dư tài khoản được trả lại trên màn hình thông tin chi tiết");
		info("Step6-1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step6-2: Nhập CMND/Card vào trường search");
		thongtin.search(5,card_no);
		info("Step6-3: Lấy số dư tài khoản");
		String actualEmoneyBalance=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_SODUTAIKHOAN_FILED).getAttribute("value").replace(".","");
		info("actualEmoneyBalance:"+actualEmoneyBalance);
		if(Integer.parseInt(emoney_balance)!=Integer.parseInt(actualEmoneyBalance));
			assert false:"Số tiền balance không được hiển thị đúng trên trang thông tin chi tiết";
		}*/
}
