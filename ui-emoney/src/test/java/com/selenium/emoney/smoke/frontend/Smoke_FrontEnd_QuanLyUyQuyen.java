package com.selenium.emoney.smoke.frontend;
import java.util.ArrayList;

import org.selenium.emoney.readData.AccountDetailDatabase;
import org.selenium.emoney.readData.AccountDetailDatabase.fields;
import org.selenium.emoney.readData.AuthorizedPersonDatabase.fieldsAuthor;
import org.testng.annotations.Test;

import static org.selenium.common.TestLogger.info;
public class Smoke_FrontEnd_QuanLyUyQuyen extends TestConfig {

	/**
	* Test ID:QLUQ_001
	* Test case name:Tìm kiếm thành công người được ủy quyền theo CMND tồn tại trong hệ thống
	* Precondition:
	* Test Steps:
	* 1. Vào trang WEB
	* 2. Vào phần quản lý ủy quyền
	* 3. Nhập CMND tồn tại trong hệ thống
	* 4. Ấn nút tìm kiếm
	* Expected Result:
	* Hiển thị đúng thông tin người được ủy quyền theo đúng số CMND
	 * @throws Exception 
	*//*
	@Test
	public void QLUQ_001_TìmKiếmNgườiỦyQuyềnTheoCMNDTồnTạiTrongHệThống() throws Exception{
		info("Tìm kiếm thành công người được ủy quyền theo CMND tồn tại trong hệ thống");
		info("Khái báo các tham số");
		String cmnd =authoList.getByArrayTypeRandom(fieldsAuthor.identification,authoList.index.get(0));
		String hoten=authoList.getByArrayTypeRandom(fieldsAuthor.name,authoList.index.get(0));
		String[] list=authoList.getByArrayTypeRandom(fieldsAuthor.identification_date,authoList.index.get(0)).split("-");
		String ngayCap=list[2]+"/"+list[1]+"/"+list[0];
		String noiCap=authoList.getByArrayTypeRandom(fieldsAuthor.identification_issue_address,authoList.index.get(0));
		String phone=authoList.getByArrayTypeRandom(fieldsAuthor.phone_number,authoList.index.get(0));
		
		info("Step1: Mở trang quản lý ủy quyền");
		hp.goToQuanLyUyQuyen();
		
		info("Step2: Nhập CMNd");
		qlUyQuyen.search(cmnd);
		
		info("Step3: Kiểm tra các thông tin tìm kiếm");
		info("Kiểm tra số CMND");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",cmnd),3000,1);
		info("Kiểm tra họ và tên");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",hoten),3000,1);
		info("Kiểm tra ngày cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",ngayCap),3000,1);
		info("Kiểm tra nơi cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",noiCap),3000,1);
		info("Kiểm tra phone");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",phone),3000,1);
		
	}
	
	*//**
	* Test ID:QLUQ_002
	* Test case name:Tạo thông tin cho người ủy quyền mới
	* Precondition:
	* Test Steps:
	* 1. Vào trang WEB
	* 2. Vào phần quản lý ủy quyền
	* 3. Click vào nút Thêm Người Ủy Quyền
	* 4. Điển thông tin người ủy quyền
	* 5. Save
	* Expected Result:
	* Người được ủy quyền mới được tạo thành công và được lưu trong DB
	 * @throws Exception 
	*//*
	@Test
	public void QLUQ_002_TạoThôngTinChoNgườiUyQuyềnMới() throws Exception{
		info("Tạo thông tin cho người ủy quyền mới");
		info("Khái báo các tham số");
		String cmnd =getRandomNumber()+getRandomNumber();
		String hoten=getRandomString();
		String ngayCap=getDayOfNextYear("dd/MM/yyyy",-2);
		String noiCap=getRandomString();
		String phone=getRandomNumber()+getRandomNumber();
		
		info("Step1: Mở trang quản lý ủy quyền");
		hp.goToQuanLyUyQuyen();
		
		info("Step2: Tạo người ủy quyền mới");
		qlUyQuyen.create(cmnd, hoten, ngayCap, noiCap, phone);
		qlUyQuyen.uyquyen_save();
		
		info("Step3: Nhập CMNd");
		qlUyQuyen.search(cmnd);
		
		info("Step4: Kiểm tra các thông tin tìm kiếm");
		info("Kiểm tra số CMND");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",cmnd),3000,1);
		info("Kiểm tra họ và tên");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",hoten),3000,1);
		info("Kiểm tra ngày cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",ngayCap),3000,1);
		info("Kiểm tra nơi cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",noiCap),3000,1);
		info("Kiểm tra phone");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",phone),3000,1);
		
	}
	
	*//**
	* Test ID:QLUQ_003
	* Test case name:Cập nhập thông tin cho người được ủy quyền
	* Precondition:
	* Test Steps:
	* 1. Vào trang WEB
	* 2. Vào phần quản lý ủy quyền
	* 3. Chọn một người được ủy quyền trong danh sách
	* 4. Click vào nút Cập nhật
	* 5. Nhập các thông tin mới cho người được ủy quyền
	* 6. Save
	* Expected Result:
	* Thông tin mới của người được ủy quyền được save và lưu lại trong DB
	 * @throws Exception 
	*//*
	@Test
	public void QLUQ_003_CậpNhậtThôngTinChoNgườiỦyQuyền() throws Exception{
		info("Cập nhập thông tin cho người được ủy quyền");
		info("Khái báo các tham số");
		String cmndOld =authoList.getByArrayTypeRandom(fieldsAuthor.identification,authoList.index.get(0));
		
		String cmndNew =getRandomNumber()+getRandomNumber();
		String hotenNew=getRandomString();
		String ngayCapNew=getDayOfNextYear("dd/MM/yyyy",-2);
		String noiCapNew=getRandomString();
		String phoneNew=getRandomNumber()+getRandomNumber();
		
		info("Step1: Mở trang quản lý ủy quyền");
		hp.goToQuanLyUyQuyen();
		
		info("Step2: Nhập CMNd");
		qlUyQuyen.search(cmndOld);
		
		info("Step3: Cập nhật thông tin người được ủy quyền");
		qlUyQuyen.goToUpdate(cmndOld);
		qlUyQuyen.update(cmndNew, hotenNew, ngayCapNew, noiCapNew, phoneNew);
		qlUyQuyen.uyquyen_save();

		info("Step4: Nhập CMND mới");
		qlUyQuyen.search(cmndNew);
		
		info("Step5: Kiểm tra thông tin sau khi cập nhập");
		info("Kiểm tra số CMND");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",cmndNew),3000,1);
		info("Kiểm tra họ và tên");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",hotenNew),3000,1);
		info("Kiểm tra ngày cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",ngayCapNew),3000,1);
		info("Kiểm tra nơi cấp");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",noiCapNew),3000,1);
		info("Kiểm tra phone");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THONGTIN_NGUOIUYQUYEN.replace("$value",phoneNew),3000,1);
	}
	
	*//**
	* Test ID:QLUQ_004
	* Test case name:Thêm người thụ hưởng cho một người được ủy quyền
	* Precondition:
	* Test Steps:
	* 1. Vào trang WEB
	* 2. Vào phần quản lý ủy quyền
	* 3. Chọn một người được ủy quyền trong danh sách
	* 4. Click vào nút Cập nhật
	* 5. Click vào nút Thêm
	* 6. Thêm vài người thụ hưởng
	* 7. Save
	* Expected Result:
	* Người thụ hưởng mới được add đúng người được ủy quyền và được lưu trong DB
	 * @throws Exception 
	*//*
	@Test
	public void QLUQ_004_ThêmNgườiThụHưởngChoMộtNgườiĐượcỦyQuyền() throws Exception{
		info("Thêm người thụ hưởng cho một người được ủy quyền");
		info("Khái báo các tham số");
		String autho_cmnd=authoList.getByArrayTypeRandom(fieldsAuthor.identification,authoList.index.get(0));
		String autho_name =authoList.getByArrayTypeRandom(fieldsAuthor.name,authoList.index.get(0));
		String autho_ngaycap=authoList.getByArrayTypeRandom(fieldsAuthor.identification_date,authoList.index.get(0));
		String autho_noicap=authoList.getByArrayTypeRandom(fieldsAuthor.identification_issue_address,authoList.index.get(0));
		String autho_phone=authoList.getByArrayTypeRandom(fieldsAuthor.phone_number,authoList.index.get(0));
		
		ArrayList<String> listDataAutho= new ArrayList<String>();
		ArrayList<String> listDataFromWEB= new ArrayList<String>();
		
		String autho_relationship=getRandomString();
		String autho_address=getRandomString();
		String autho_fromDate=getCurrentDate("dd/MM/yyyy");
		String autho_toDate=getDayOfNextYear("dd/MM/yyyy",2);
		
		info("Step1: Mở trang quản lý ủy quyền");
		hp.goToQuanLyUyQuyen();
		
		info("Step2: Nhập CMND của người được ủy quyền");
		qlUyQuyen.search(autho_cmnd);
		
		info("Step3: Thêm người thụ hưởng");
		qlUyQuyen.goToUpdate(autho_cmnd);
		qlUyQuyen.add(autho_relationship,autho_address,autho_fromDate,autho_toDate,1);
		String account_cmnd= waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_THEM_NGUOITHUHUONG_ACCOUNT_CMND.replace("$col","3").replace("$row","1")).getText();
		qlUyQuyen.uyquyen_update_add_save();
		
		info("Step4: Kiểm tra thông tin người thụ hưởng sau khi add trong bảng người thụ hưởng");
		info("Step 4-0: Lấy số CMND của người thụ hưởng");
		qlUyQuyen.searchAccount("","","","","",account_cmnd);
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_UPDATE_THONGTINNGUOITHUHUONG.replace("$value",account_cmnd),3000,1);
		info("Step4-1: Kiểm tra thông tin quan hệ với người được ủy quyền");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_UPDATE_THONGTINNGUOITHUHUONG.replace("$value",autho_relationship),3000,1);
		info("Step4-2: Kiểm tra nơi xác nhận ủy quyền");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_UPDATE_THONGTINNGUOITHUHUONG.replace("$value",autho_address),3000,1);
		info("Step4-3: Kiểm tra ngày bắt đầu ủy quyền");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_UPDATE_THONGTINNGUOITHUHUONG.replace("$value",autho_fromDate),3000,1);
		info("Step4-4: Kiểm tra ngày hết hạn ủy quyền");
		waitForAndGetElement(qlUyQuyen.ELEMENT_QLUQ_UPDATE_THONGTINNGUOITHUHUONG.replace("$value",autho_toDate),3000,1);
		
		info("Lấy thông tin người thụ hưởng theo CMND trong DB");
		accDetail = new AccountDetailDatabase();
		accDetail.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,qlUyQuyen.sqlQueryAccountAuthorizedInfor.replace("$id",account_cmnd));
		int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
		
		info("Step4: Mở thông tin chi tiết của người thụ hưởng");
		hp.goToThongTinTaiKhoan();
		
		info("Step4-1: Nhập CMND và Ấn Enter");
		thongtin.search(idType,account_cmnd);
		
		info("Step5: Kiểm tra thông tin sau khi cập nhập");
		listDataAutho.add(autho_cmnd);
		listDataAutho.add(autho_name);
		listDataAutho.add(autho_ngaycap);
		listDataAutho.add(autho_noicap);
		listDataAutho.add(autho_phone);
		listDataAutho.add(autho_relationship);
		listDataAutho.add(autho_address);
		listDataAutho.add(autho_fromDate);
		listDataAutho.add(autho_toDate);
		
		info("Lấy chứng minh thư người được ủy quyền");
	    String actual24=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_CMND_FILED).getAttribute("value");
	    listDataFromWEB.add(actual24);
	   
	    info("Lấy họ tên người được ủy quyền");
		String actual25=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_HOTEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual25);
		
		info("Lấy ngày cấp chứng minh thư người được ủy quyền");
		String actual26=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NGAYCAP_FILED).getAttribute("value");
		listDataFromWEB.add(actual26);
		
		info("Lấy nơi cấp chứng minh thư người được ủy quyền");
		String actual27=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NOICAP_FILED).getAttribute("value");
		listDataFromWEB.add(actual27);
		
		info("Lấy số điện thoại người được ủy quyền");
		String actual28=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_SODIENTHOAI_FILED).getAttribute("value");
		listDataFromWEB.add(actual28);
		
		info("Lấy quan hệ với chủ tài khoản của người được ủy quyền");
		String actual29=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_QUANHEVOICHUTAIKHOAN_FILED).getAttribute("value");
		listDataFromWEB.add(actual29);
		
		info("Lấy nơi xác nhận ủy quyền của người được ủy quyền");
		String actual30=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NOIXACNHANUYQUYEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual30);
		
		info("Lấy ngày cấp ủy quyền của người được ủy quyền");
		String actual31=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_THOIHANUYQUYEN_FROMDATE_FILED).getAttribute("value");
		listDataFromWEB.add(actual31);
		
		info("Lấy ngày hết hạn ủy quyền của người được ủy quyền");
		String actual32=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_THOIHANUYQUYEN_TODATE_FILED).getAttribute("value");
		listDataFromWEB.add(actual32);
		
		for(int i=0;i<listDataFromWEB.size();i++){
			info("So sánh các thông tin trên web và Database của:"+listDataFromWEB.get(i));
			if(!listDataFromWEB.get(i).equals(listDataAutho.get(i)))
			   assert false: "Giá trị trên WEB là:"+listDataFromWEB.get(i)+" với giá trị trong DB là:"+listDataAutho.get(i)+"";
		}
		
	}*/
}
