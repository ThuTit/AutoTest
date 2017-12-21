package com.selenium.emoney.smoke.frontend;

import java.util.ArrayList;

import org.selenium.emoney.readData.StaffInfoDatabase.fieldStaff;
import org.testng.annotations.Test;

import static org.selenium.common.TestLogger.info;
public class Smoke_FrontEnd_HoSoNguoiDung extends TestConfigHSNG{

	/**
	* Test ID:HSND_0013
	* Test case name:Kiểm tra các thông tin cơ bản
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Quan sát phần thông tin cơ bản
	* Expected Result:
	* Các thông tin được hiển thị giống trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_001_KiemTraThongTinCoBan() throws Exception{
		info("Kiểm tra các thông tin cơ bản");
		mgLogInOut.login(USER_ROOT, USER_ROOT_PASS,true);
		info("Lấy thông tin người dùng trong Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin người dùng từ Database");
		info("Lấy thông tin username");
		String userNameExp = staffInfo.getByArrayTypeRandom(fieldStaff.username,type);
		staffInfoExp.add(userNameExp);
		info("Lấy thông tin họ");
		String hoExp = staffInfo.getByArrayTypeRandom(fieldStaff.first_name,type);
		staffInfoExp.add(hoExp);
		info("Lấy thông tin tên");
		String tenExp = staffInfo.getByArrayTypeRandom(fieldStaff.last_name,type);
		staffInfoExp.add(tenExp);
		info("Lấy thông tin ngày sinh");
		String birthDayExp = staffInfo.getByArrayTypeRandom(fieldStaff.birthday,type);
		staffInfoExp.add(birthDayExp);
		info("Lấy thông tin CMND");
		String cmndExp = staffInfo.getByArrayTypeRandom(fieldStaff.identification,type);
		staffInfoExp.add(cmndExp);
		info("Lấy thông tin Mã bưu cục");
		String maBuuCuuExp = staffInfo.getByArrayTypeRandom(fieldStaff.post_code,type);
		staffInfoExp.add(maBuuCuuExp);
		info("Lấy thông tin mã Pincode");
		String pinCodeExp = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,type);
		staffInfoExp.add(pinCodeExp);
		
		
	    info("Lấy thông tin người dùng từ trang web");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    info("Lấy thông tin username");
	    ArrayList<String> staffInfoActual = new ArrayList<String>();
	    String userNameActual = hsnd.getValueUserNameField();
	    staffInfoActual.add(userNameActual);
	   
	    info("Lấy thông tin ho");
	    String hoActual = hsnd.getValueHoField();
	    staffInfoActual.add(hoActual);
	    
	    info("Lấy thông tin ten");
	    String tenActual = hsnd.getValueTenField();
	    staffInfoActual.add(tenActual);
	    
	    info("Lấy thông tin ngày sinh");
	    String birthDayActual = hsnd.getValueBirthDayField();
	    staffInfoActual.add(birthDayActual);
	    
	    info("Lấy thông tin CMND");
	    String cmndActual = hsnd.getValueCMNDField();
	    staffInfoActual.add(cmndActual);
	    info("Lấy thông tin mã bưu cục");
	    String maBuuCucActual = hsnd.getValueMabuuCucField();
	    staffInfoActual.add(maBuuCucActual);
		info("Lấy thông tin Pincode");
		String pinCodeActual = hsnd.getValuePinCodeField();
	    staffInfoActual.add(pinCodeActual);
		
		info("Compare các thông tin của staff");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
	}
	
	*//**
	* Test ID:HSND_002
	* Test case name:Kiểm tra các thông tin liên lạc
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Quan sát phần thông tin liên lạc
	* Expected Result:
	* Các thông tin được hiển thị giống trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_002_KiemTraThongTinLienLac() throws Exception{
		info("Kiểm tra các thông tin liên lạc");
		mgLogInOut.login(USER_ROOT, USER_ROOT_PASS,true);
		info("Lấy thông tin người dùng trong Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin người dùng từ Database");
		info("Lấy thông tin email");
		String emailExp = staffInfo.getByArrayTypeRandom(fieldStaff.email,type);
		staffInfoExp.add(emailExp);
		info("Lấy thông tin số điện thoại");
		String phoneExp = staffInfo.getByArrayTypeRandom(fieldStaff.phone_number,type);
		staffInfoExp.add(phoneExp);
		info("Lấy thông tin tỉnh thành");
		String tinhThanhExp = staffInfo.getByArrayTypeRandom(fieldStaff.province_name,type);
		staffInfoExp.add(tinhThanhExp);
		info("Lấy thông tin quận huyện");
		String quanHuyenExp = staffInfo.getByArrayTypeRandom(fieldStaff.district_name,type);
		staffInfoExp.add(quanHuyenExp);
		
	    info("Lấy thông tin người dùng từ trang web");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    info("Lấy thông tin username");
	    ArrayList<String> staffInfoActual = new ArrayList<String>();
		info("Lấy thông tin email");
		String emailActual = hsnd.getValueEmailField();
	    staffInfoActual.add(emailActual);
		info("Lấy thông tin điện thoại");
		String phoneActual = hsnd.getValuePhoneField();
	    staffInfoActual.add(phoneActual);
		info("Lấy thông tin tỉnh thành");
		String tinhThanhActual = hsnd.getValueTinhThanhField();
	    staffInfoActual.add(tinhThanhActual);
		info("Lấy thông tin quận huyện");
		String quanHuyenActual = hsnd.getValueQuanHuyenField();
	    staffInfoActual.add(quanHuyenActual);
		
		info("Compare các thông tin của staff");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
	}
	
	*//**
	* Test ID:HSND_003
	* Test case name:Kiểm tra các thông tin công tác
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Quan sát phần thông tin công tác
	* Expected Result:
	* Các thông tin được hiển thị giống trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_003_KiemTraThongTinCongTac() throws Exception{
		info("Kiểm tra các thông tin công tác");
		mgLogInOut.login(USER_ROOT, USER_ROOT_PASS,true);
		info("Lấy thông tin người dùng trong Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin người dùng từ Database");
		info("Lấy thông tin bưu điện cấp 1");
		String level1Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_1,type);
		staffInfoExp.add(level1Exp);
		info("Lấy thông tin bưu điện cấp 2");
		String level2Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_2,type);
		staffInfoExp.add(level2Exp);
		info("Lấy thông tin bưu điện cấp 3");
		String level3Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_3,type);
		staffInfoExp.add(level3Exp);
		info("Lấy thông tin bưu điện cấp 4");
		String level4Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_4,type);
		staffInfoExp.add(level4Exp);
		
	    info("Lấy thông tin người dùng từ trang web");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    ArrayList<String> staffInfoActual = new ArrayList<String>();
		info("Lấy thông tin cấp bưu cục 1");
		String buuCuc1Actual = hsnd.getValueBuuCuc1Field();
	    staffInfoActual.add(buuCuc1Actual);
		info("Lấy thông tin cấp bưu cục 2");
		String buuCuc2Actual = hsnd.getValueBuuCuc2Field();
	    staffInfoActual.add(buuCuc2Actual);
		info("Lấy thông tin cấp bưu cục 3");
		String buuCuc3Actual = hsnd.getValueBuuCuc3Field();
	    staffInfoActual.add(buuCuc3Actual);
		info("Lấy thông tin cấp bưu cục 4");
		String buuCuc4Actual = hsnd.getValueBuuCuc4Field();
	    staffInfoActual.add(buuCuc4Actual);
		
		info("Compare các thông tin của staff");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
	}
	
	*//**
	* Test ID:HSND_004
	* Test case name:Kiểm tra các thông tin quyền
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Quan sát phần thông tin quyền
	* Expected Result:
	* Các thông tin được hiển thị giống trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_004_KiemTraThongTinQuyen() throws Exception{
		info("Kiểm tra các thông tin quyền");
		mgLogInOut.login(USER_ROOT, USER_ROOT_PASS,true);
		info("Lấy thông tin người dùng trong Database");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		int type = staffInfo.index.get(0);
		info("Lấy thông tin phân quyền");
		staffRoles.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffRole.replace("$username",USER_ROOT));
		ArrayList<String> roleListExp = new ArrayList<String>();
		roleListExp = staffRoles.getByArrayTypeRandom(type);
		
	    info("Lấy thông tin người dùng từ trang web");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    info("Lấy thông tin phân quyền");
		ArrayList<String> rolesActual = new ArrayList<String>();
		rolesActual = hsnd.getValueRolesField();

		info("Compare roles của staff");
		hsnd.compare(rolesActual, roleListExp);
		
	}
	
	*//**
	* Test ID:HSND_005
	* Test case name:Kiểm tra việc update thông tin cơ bản
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Thay đổi các thông tin
	*4. Ấn nút Cập nhật
	* Expected Result:
	* Các thông tin thay đổi được lưu trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_005_KiemTraViecUpdateThongTinCoBan() throws Exception{
		info("Kiểm tra các thông tin quyền");
		info("Login voi a normal user");
		mgLogInOut.login(USER_01,password,true);
		
		info("Tạo thông tin update");
		ArrayList<String> staffInfoActual = new ArrayList<String>();
		String ho=getRandomString();
		staffInfoActual.add(ho);
		String ten = getRandomString();
		staffInfoActual.add(ten);
		String ngaySinh = getDayOfNextYear("dd/MM/yyyy",-5);
		staffInfoActual.add(ngaySinh);
		String cmnd =getRandomNumber()+getRandomNumber();
		staffInfoActual.add(cmnd);
		String maBC =getRandomNumber();
		staffInfoActual.add(maBC);
		String pin = getRandomNumber();
		staffInfoActual.add(pin);
		
		info("Vào phần hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
		info("Thay đổi các thông tin trong thông tin cơ bản");
		hsnd.updateBasicInfo(ho, ten, ngaySinh, cmnd, maBC, pin);
		
		info("Ấn nút cập nhật");
		hsnd.capnhat();
		
		info("Kiểm tra thông tin đã được lưu trong DB");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_01));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin người dùng từ Database");
		info("Lấy thông tin họ");
		String hoExp = staffInfo.getByArrayTypeRandom(fieldStaff.first_name,type);
		staffInfoExp.add(hoExp);
		info("Lấy thông tin tên");
		String tenExp = staffInfo.getByArrayTypeRandom(fieldStaff.last_name,type);
		staffInfoExp.add(tenExp);
		info("Lấy thông tin ngày sinh");
		String birthDayExp = staffInfo.getByArrayTypeRandom(fieldStaff.birthday,type);
		staffInfoExp.add(birthDayExp);
		info("Lấy thông tin CMND");
		String cmndExp = staffInfo.getByArrayTypeRandom(fieldStaff.identification,type);
		staffInfoExp.add(cmndExp);
		info("Lấy thông tin Mã bưu cục");
		String maBuuCuuExp = staffInfo.getByArrayTypeRandom(fieldStaff.post_code,type);
		staffInfoExp.add(maBuuCuuExp);
		info("Lấy thông tin mã Pincode");
		String pinCodeExp = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,type);
		staffInfoExp.add(pinCodeExp);
		
		info("So sánh thông tin đã được lưu trong DB và thực tế truyền vào");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
		info("Kiểm tra thông tin được hiển thị trên WEB sau khi thay đổi");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    info("Lấy thông tin username");
	    ArrayList<String> staffInfoActualWEB = new ArrayList<String>();
	    info("Lấy thông tin ho");
	    String hoActual = hsnd.getValueHoField();
	    staffInfoActualWEB.add(hoActual);
	    
	    info("Lấy thông tin ten");
	    String tenActual = hsnd.getValueTenField();
	    staffInfoActualWEB.add(tenActual);
	    
	    info("Lấy thông tin ngày sinh");
	    String birthDayActual = hsnd.getValueBirthDayField();
	    staffInfoActualWEB.add(birthDayActual);
	    
	    info("Lấy thông tin CMND");
	    String cmndActual = hsnd.getValueCMNDField();
	    staffInfoActualWEB.add(cmndActual);
	    info("Lấy thông tin mã bưu cục");
	    String maBuuCucActual = hsnd.getValueMabuuCucField();
	    staffInfoActualWEB.add(maBuuCucActual);
		info("Lấy thông tin Pincode");
		String pinCodeActual = hsnd.getValuePinCodeField();
	    staffInfoActualWEB.add(pinCodeActual);
	    
	    info("So sánh thông tin đã được thay đổi và thực tế hiện thị trên WEB");
		hsnd.compare(staffInfoActual,staffInfoActualWEB);
	}
	
	*//**
	* Test ID:HSND_006
	* Test case name:Kiểm tra việc update thông tin liên lạc
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Thay đổi các thông tin
	*4. Ấn nút Cập nhật
	* Expected Result:
	* Các thông tin thay đổi được lưu trong DB
	 * @throws Exception 
	*//*
	@Test
	public void HSND_006_KiemTraViecUpdateThongTinLienLac() throws Exception{
		info("Kiểm tra các thông tin quyền");
		info("Login voi a normal user");
		mgLogInOut.login(USER_01,password,true);
		
		info("Tạo thông tin update");
		ArrayList<String> staffInfoActual = new ArrayList<String>();
		String email=getRandomString()+"@gmail.com";
		staffInfoActual.add(email);
		String phone = getRandomNumber()+getRandomNumber();
		staffInfoActual.add(phone);
		int province_id = provinceList.getIDRandom();
		String province=provinceList.getNameByID(province_id);
		staffInfoActual.add(province);
		info("province:"+province);
		
		districtList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryDistrictList.replace("$province",String.valueOf(province_id)));
		String district=districtList.getNameRandom();
		staffInfoActual.add(district);
		
		info("Vào phần hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
		info("Thay đổi các thông tin trong thông tin cơ bản");
		hsnd.updateContactInfo(email, phone, province, district);
		
		info("Ấn nút cập nhật");
		hsnd.capnhat();
		
		info("Kiểm tra thông tin đã được lưu trong DB");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_01));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin email");
		String emailExp = staffInfo.getByArrayTypeRandom(fieldStaff.email,type);
		staffInfoExp.add(emailExp);
		info("Lấy thông tin số điện thoại");
		String phoneExp = staffInfo.getByArrayTypeRandom(fieldStaff.phone_number,type);
		staffInfoExp.add(phoneExp);
		info("Lấy thông tin tỉnh thành");
		String tinhThanhExp = staffInfo.getByArrayTypeRandom(fieldStaff.province_name,type);
		staffInfoExp.add(tinhThanhExp);
		info("Lấy thông tin quận huyện");
		String quanHuyenExp = staffInfo.getByArrayTypeRandom(fieldStaff.district_name,type);
		staffInfoExp.add(quanHuyenExp);
		
		info("So sánh thông tin đã được lưu trong DB và thực tế truyền vào");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
		info("Kiểm tra thông tin được hiển thị trên WEB sau khi thay đổi");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    ArrayList<String> staffInfoActualWEB = new ArrayList<String>();
		info("Lấy thông tin email");
		String emailActual = hsnd.getValueEmailField();
		staffInfoActualWEB.add(emailActual);
		info("Lấy thông tin điện thoại");
		String phoneActual = hsnd.getValuePhoneField();
		staffInfoActualWEB.add(phoneActual);
		info("Lấy thông tin tỉnh thành");
		String tinhThanhActual = hsnd.getValueTinhThanhField();
		staffInfoActualWEB.add(tinhThanhActual);
		info("Lấy thông tin quận huyện");
		String quanHuyenActual = hsnd.getValueQuanHuyenField();
		staffInfoActualWEB.add(quanHuyenActual);
	    
	    info("So sánh thông tin đã thay đổi và hiển thị trên web");
		hsnd.compare(staffInfoActual,staffInfoActualWEB);
		
	}
	
	*//**
	* Test ID:HSND_007
	* Test case name:Kiểm tra việc update thông tin công tác
	* Precondition:
	* Test Steps:
	*1. Vào trang WEB
	*2. Vào phần hồ sơ người dùng
	*3. Thay đổi các thông tin
	*4. Ấn nút Cập nhật
	* Expected Result:
	* Các thông tin thay đổi được lưu trong DB
	 * @throws Exception 
	*/
	//@Test
	/*public void HSND_007_KiemTraViecUpdateThongTinCongTac() throws Exception{
		info("Kiểm tra các thông tin quyền");
		info("Login voi a normal user");
		mgLogInOut.login(USER_02,password,true);
		
		info("Vào phần hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
		info("Thay đổi các thông tin trong thông tin công tác");
		if(!hsnd.isChangeWorkInfo()){
			String bc2="-1";
			String bc3="";
			String bc4="";
			mgLogInOut.logout();
			driver.get(baseAdmin_Url);
			Utils.pause(1000);
			mgLogInOut.login(USER_ROOT,USER_ROOT_PASS,true);
			info("Vào quản lý người dùng");
			admin.goToQuanLyNguoiDung();
			info("Search thông tin người dùng");
			qlNgDung.searchByUserName(USER_02);
			info("Xem thông tin người dùng");
			qlNgDung.goToStaff(USER_02);
			info("Edit thông tin người dùng");
			qlNgDung.updateWorkInfo(bc2,bc3,bc4);
			qlNgDung.capNhat();
			
			mgLogInOut.logout();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			Utils.pause(1000);
			info("Login voi a normal user");
			mgLogInOut.login(USER_02,password,true);
			info("Vào phần hồ sơ người dùng");
		    hp.goToHoSoNguoiDung();
		}
	    
		info("Tạo thông tin update");
		ArrayList<String> staffInfoActual = new ArrayList<String>();
		buuCucList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryBuuCucList);
		int bc4_id = buuCucList.getIDRandom();
		info("bc4_id"+bc4_id);
		String bc2=buuCucList.getBC2ByID(bc4_id);
		staffInfoActual.add(bc2);
		String bc3 =buuCucList.getBC3ByID(bc4_id);
		staffInfoActual.add(bc3);
		String bc4 =buuCucList.getBC4ByID(bc4_id);
		staffInfoActual.add(bc4);
		
		
		info("Vào phần hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
		info("Thay đổi các thông tin trong thông tin công tác");
		hsnd.updateWorkInfo(bc2, bc3, String.valueOf(bc4_id));
		
		info("Ấn nút cập nhật");
		hsnd.capnhat();
		
		info("Kiểm tra thông tin đã được lưu trong DB");
		staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
				config.pass,hsnd.sqlQueryStaffInfo.replace("$username",USER_02));
		int type = staffInfo.index.get(0);
		ArrayList<String> staffInfoExp = new ArrayList<String>();
		info("Lấy thông tin bưu điện cấp 2");
		String level2Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_2,type);
		staffInfoExp.add(level2Exp);
		info("Lấy thông tin bưu điện cấp 3");
		String level3Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_3,type);
		staffInfoExp.add(level3Exp);
		info("Lấy thông tin bưu điện cấp 4");
		String level4Exp = staffInfo.getByArrayTypeRandom(fieldStaff.level_4,type);
		staffInfoExp.add(level4Exp);
		
		info("So sánh thông tin đã được lưu trong DB và thực tế truyền vào");
		hsnd.compare(staffInfoExp,staffInfoActual);
		
		info("Kiểm tra thông tin được hiển thị trên WEB sau khi thay đổi");
	    info("Vào trang hồ sơ người dùng");
	    hp.goToHoSoNguoiDung();
	    
	    ArrayList<String> staffInfoActualWEB = new ArrayList<String>();
		info("Lấy thông tin cấp bưu cục 2");
		String buuCuc2Actual = hsnd.getValueBuuCuc2Field();
		staffInfoActualWEB.add(buuCuc2Actual);
		info("Lấy thông tin cấp bưu cục 3");
		String buuCuc3Actual = hsnd.getValueBuuCuc3Field();
		staffInfoActualWEB.add(buuCuc3Actual);
		info("Lấy thông tin cấp bưu cục 4");
		String buuCuc4Actual = hsnd.getValueBuuCuc4Field();
		String newBC4 = hsnd.removeLastText(buuCuc4Actual);
		staffInfoActualWEB.add(newBC4);
	    
	    info("So sánh thông tin đã thay đổi và hiển thị trên web");
		hsnd.compare(staffInfoActual,staffInfoActualWEB);
		info("Check rằng thông tin bưu cục bên dưới tên đăng nhập cũng được update");
		waitForAndGetElement(hsnd.ELEMENT_NAVIGATIONBAR_INFORMATION.replace("$info",bc4),2000,1);
	}*/
	
	
}
