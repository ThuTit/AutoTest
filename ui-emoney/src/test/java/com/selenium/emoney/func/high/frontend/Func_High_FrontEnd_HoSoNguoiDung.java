package com.selenium.emoney.func.high.frontend;
import java.io.IOException;
import java.util.ArrayList;

import org.selenium.common.Utils;
import org.selenium.emoney.readData.StaffInfoDatabase.fieldStaff;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class Func_High_FrontEnd_HoSoNguoiDung extends TestConfig2{		
		/**
		* Test ID:EM-320
		* Test case name:Kiểm Tra Giá Trị Default
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Quan sát
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* +Các trường sau không thể edit: Tên đăng nhập, Phân quyền và khóa tất cả các cấp bưu cục mà nhân viên thuộc về
		* + Các thông tin hồ sơ người dùng hiển thị đúng như trong DB
		 * @throws Exception 
		*/
		@Test
		public void EM_320_KiểmTraGiáTrịDefault() throws Exception{
			 info("Kiểm tra giá trị default");
			 testCaseID="EM-320";
			 
			 mgLogInOut.login(config.USER_STAFF_01,config.USER_PASS, true);
			 
			 info("Lấy thông tin người dùng trong Database");
			  staffInfo.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
						config.pass,hsnd.sqlQueryStaffInfo.replace("$username",config.USER_ADMIN));
			 int type = staffInfo.index.get(0);
				
			info("Lấy thông tin username");
			String userNameExp = staffInfo.getByArrayTypeRandom(fieldStaff.username,type);
			info("Lấy thông tin họ");
			String firstNameExp = staffInfo.getByArrayTypeRandom(fieldStaff.first_name,type);
			info("Lấy thông tin tên");
			String lastNameExp = staffInfo.getByArrayTypeRandom(fieldStaff.last_name,type);
			info("Lấy thông tin ngày sinh");
			String birthDayExp = staffInfo.getByArrayTypeRandom(fieldStaff.birthday,type);
			info("Lấy thông tin CMND");
			String cmndExp = staffInfo.getByArrayTypeRandom(fieldStaff.identification,type);
			info("Lấy thông tin Mã bưu cục");
			String maBuuCuuExp = staffInfo.getByArrayTypeRandom(fieldStaff.post_code,type);
			info("Lấy thông tin mã Pincode");
			String pinCodeExp = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,type);

			 
			info("Lấy thông tin email");
			String emailExp = staffInfo.getByArrayTypeRandom(fieldStaff.email,type);
			info("Lấy thông tin số điện thoại");
			String phoneExp = staffInfo.getByArrayTypeRandom(fieldStaff.phone_number,type);
			info("Lấy thông tin tỉnh thành");
			String provinceExp = staffInfo.getByArrayTypeRandom(fieldStaff.province_name,type);
			info("Lấy thông tin quận huyện");
			String districtExp = staffInfo.getByArrayTypeRandom(fieldStaff.district_name,type);

			 
			info("Lấy thông tin bưu điện cấp 1");
			String buuCucCap1 = staffInfo.getByArrayTypeRandom(fieldStaff.level_1,type);
			info("Lấy thông tin bưu điện cấp 2");
			String buuCucCap2 = staffInfo.getByArrayTypeRandom(fieldStaff.level_2,type);
			info("Lấy thông tin bưu điện cấp 3");
			String buuCucCap3 = staffInfo.getByArrayTypeRandom(fieldStaff.level_3,type);
			info("Lấy thông tin bưu điện cấp 4");
			String buuCucCap4 = staffInfo.getByArrayTypeRandom(fieldStaff.level_4,type);
			 
			info("Lấy thông tin phân quyền");
			staffRoles.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
					config.pass,hsnd.sqlQueryStaffRole.replace("$username",config.USER_ADMIN));
			ArrayList<String> roleListExp = new ArrayList<String>();
			roleListExp = staffRoles.getByArrayTypeRandom(type);

			info("Vào trang Hồ Sơ Người Dùng");
			hp.goToHoSoNguoiDung();
			
			info("Kiểm tra các trường không thể edit");
			hsnd.verifyDisabledFields();
			info("Kiểm tra các thông hiển thị của người dùng");
			hsnd.verifyUserNameInfo(userNameExp);
			hsnd.verifyFirstnameInfo(firstNameExp);
			hsnd.verifyLastnameInfo(lastNameExp);
			hsnd.verifyBirthdayInfo(birthDayExp);
			hsnd.verifyCMNDInfo(cmndExp);
			hsnd.verifyCodePost(maBuuCuuExp);
			hsnd.verifyPinCode(pinCodeExp);
			hsnd.verifyEmailInfo(emailExp);
			hsnd.verifyPhoneInfo(phoneExp);
			hsnd.verifyProvinceInfo(provinceExp);
			hsnd.verifyDistrictInfo(districtExp);
			hsnd.verifyLevel1Info(buuCucCap1);
			hsnd.verifyLevel2Info(buuCucCap2);
			hsnd.verifyLevel3Info(buuCucCap3);
			hsnd.verifyLevel4Info(buuCucCap4);
			for(int i=0;i<roleListExp.size();i++){
				hsnd.verifyRolesInfo(roleListExp.get(i));
			}
		}
		
		/**
		* Test ID:EM-321
		* Test case name:Kiểm Tra Việc Thay Đổi Phần Họ Và Tên
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi phần họ và tên
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* +Thông tin được cập nhật trong DB
		* + Thông tin sau khi login phía trên bên phải được update đồng thời
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_321_KiểmTraViệcThayĐổiPhầnHọVàTên() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi phần họ và tên");
			 testCaseID="EM-321";
			 
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
				
			 info("Thay đổi họ và tên");
			 String firstName=getRandomString();
			 String lastName=getRandomString();
			 String fullName=lastName+" "+ firstName;
			 info("Thay đổi họ");
			 hsnd.inputFirstname(firstName);
			 info("Thay đổi tên");
			 hsnd.inputLastname(lastName);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyFirstnameInfo(firstName);
			 hsnd.verifyLastnameInfo(lastName);
			 
			 info("Kiểm tra thông tin đã được update");
			 info("Thông tin sau khi login phía trên bên phải được update đồng thời");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 mgLogInOut.verifyUserInfHeaderBar(fullName,"");
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyFirstnameInfo(firstName);
			 hsnd.verifyLastnameInfo(lastName);
			 
		}
		
		/**
		* Test ID:EM-322
		* Test case name:Kiểm Tra Việc Thay Đổi Ngày Sinh
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi ngày sinh
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_322_KiểmTraViệcThayĐổiNgàySinh() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi ngày sinh");
			 testCaseID="EM-322";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 
			 info("Thay đổi ngày sinh");
			 String birthday="17/10/1992";
			 hsnd.inputBirthday(birthday);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyBirthdayInfo(birthday);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyBirthdayInfo(birthday);
		}
		
		/**
		* Test ID:EM-323
		* Test case name:Kiểm Tra Việc Thay Đổi CMND
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi CMND
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_323_KiểmTraViệcThayĐổiCMND() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi CMND");
			 testCaseID="EM-323";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 
			 info("Thay đổi CMND");
			 String cmnd="1710199286";
			 hsnd.inputCMND(cmnd);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCMNDInfo(cmnd);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCMNDInfo(cmnd);
		}
		
		/**
		* Test ID:EM-324
		* Test case name:Kiểm Tra Việc Thay Đổi Mã Bưu Cục
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi mã bưu cục
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_324_KiểmTraViệcThayĐổiMãBưuCục() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi Mã bưu cục");
			 testCaseID="EM-324";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 
			 info("Thay đổi Mã bưu cục");
			 String maBuuCuc=getRandomNumber();
			 hsnd.inputCodePost(maBuuCuc);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCodePost(maBuuCuc);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCodePost(maBuuCuc);
		}
		
		/**
		* Test ID:EM-325
		* Test case name:Kiểm Tra Việc Thay Đổi Mã Pincode
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi mã pincode
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* +Thông tin được cập nhật trong DB
		* +Mã pincode mới có thể thực hiện các giao dịch cần pincode
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_325_KiểmTraViệcThayĐổiMãPincode() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi mã Pincode");
			 testCaseID="EM-325";
			 
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
				 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			
			 info("Thay đổi Mã pincode");
			 String maPincode=getRandomNumber();
			 hsnd.inputPinCode(maPincode);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyPinCode(maPincode);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyPinCode(maPincode);
		}
		
		/**
		* Test ID:EM-326
		* Test case name:Kiểm Tra Việc Thay Đổi Email
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi email
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_326_KiểmTraViệcThayĐổiEmail() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi email");
			 testCaseID="EM-326";
			 
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			
			 info("Thay đổi email");
			 String email=getRandomString()+"@gmail.com";
			 hsnd.inputEmail(email);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyEmailInfo(email);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyEmailInfo(email);
		}
		
		/**
		* Test ID:EM-327
		* Test case name:Kiểm Tra Việc Thay Đổi Điện Thoại
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi số điện thoại
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_327_KiểmTraViệcThayĐổiĐiệnThoại() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc thay đổi điện thoại");
			 testCaseID="EM-327";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			
			 info("Thay đổi số điện thoại");
			 String phone=getRandomNumber()+getRandomNumber();
			 hsnd.inputPhone(phone);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyPhoneInfo(phone);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyPhoneInfo(phone);
		}
		
		/**
		* Test ID:EM-328
		* Test case name:Kiểm Tra Việc Thay Đổi Tỉnh/Thành
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi Tỉnh/Thành
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws Exception 
		*/
		@Test
		public void EM_328_KiểmTraViệcThayĐổiTỉnhThành() throws Exception{
			 info("Kiểm tra việc thay đổi Tỉnh/Thành");
			 testCaseID="EM-328";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
             provinceList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
 					config.pass,hsnd.sqlQueryProvince);
             
             
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			
			 info("Thay đổi tỉnh thành");
			 int province_id = provinceList.getIDRandom();
			 String province=provinceList.getNameByID(province_id);
			 hsnd.inputProvince(province);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyProvinceInfo(province);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyProvinceInfo(province);
		}
		
		/**
		* Test ID:EM-329
		* Test case name:Kiểm Tra Việc Thay Đổi Quận/Huyện
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi Quận/Huyện
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được cập nhật trong DB
		 * @throws Exception 
		*/
		@Test
		public void EM_329_KiểmTraViệcThayĐổiQuậnHuyện() throws Exception{
			 info("Kiểm tra việc thay đổi Quận/Huyện");
			 testCaseID="EM-329";
			 
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
             
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 String province_id = hsnd.getIDProvince();
	         info("province id:"+province_id);
             info("Lấy thông tin về quận huyện có id tỉnh là:"+province_id);
             districtList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
     				config.pass,hsnd.sqlQueryDistrictList.replace("$province",province_id));
             
			 info("Thay đổi quận huyện");
			 String district=districtList.getNameRandom();
			 hsnd.inputDistrict(district);
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyDistrictInfo(district);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyDistrictInfo(district);
		}
		
		/**
		* Test ID:EM-330
		* Test case name:Kiểm Tra Việc Thay Đổi Cấp Bưu Cục
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi cấp bưu cục
		* 4. Ấn nút Cập nhật
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* +Thông tin được cập nhật trong DB
		* +Thông tin được hiển thị đúng trong các giao dịch và phân quyền data
		 * @throws Exception 
		*/
		@Test
		public void EM_330_KiểmTraViệcThayĐổiCấpBưuCục() throws Exception{
			 info("Kiểm tra việc thay đổi cấp bưu cục");
			 testCaseID="EM-330";
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
             buuCucList.setData("","",false, config.jdbcDriver,config.dbUrl,config.user,
     				config.pass,hsnd.sqlQueryBuuCucList);
             
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 
			 if(!hsnd.isChangeWorkInfo()){
				 info("Reset lại thông tin làm việc của người dùng về bưu cục cấp 1");
					String bc2="-1";
					mgLogInOut.logout();
					driver.get(config.baseAdmin_Url);
					Utils.pause(1000);
					mgLogInOut.login(config.USER_ADMIN,config.USER_PASS,true);
					info("Vào quản lý người dùng");
					adHp.goToQuanLyNguoiDung();
					info("Search thông tin người dùng");
					adQLND.inputSearchUserName(config.USER_STAFF_02);
					adQLND.search_btn();
					info("Xem thông tin người dùng");
					adQLND.goToUserDetail(config.USER_STAFF_02);
					info("Reset thông tin làm việc");
					adQLND.inputPostLevel2(bc2);
					adQLND.inputRole("Super Admin");
					adQLND.update_btn();
					
					mgLogInOut.logout();
					driver.get(baseUrl);
					driver.manage().window().maximize();
					driver.navigate().refresh();
					Utils.pause(1000);
					info("Login voi a normal user");
					 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
					info("Vào phần hồ sơ người dùng");
				    hp.goToHoSoNguoiDung();
				}
			
			 info("Thay đổi cấp bưu cục");
			 int bc4_id = buuCucList.getIDRandom();
			 String bc2=buuCucList.getBC2ByID(bc4_id);
			 String bc3 =buuCucList.getBC3ByID(bc4_id);
			 String bc4 =buuCucList.getBC4ByID(bc4_id);
			 hsnd.inputLevel2(bc2);
			 hsnd.inputLevel3(bc3);
			 hsnd.inputLevel4(String.valueOf(bc4_id));
			 info("Ấn nút cập nhật");
			 hsnd.update_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyLevel1Info("VNPost");
			 hsnd.verifyLevel2Info(bc2);
			 hsnd.verifyLevel3Info(bc3);
			 hsnd.verifyLevel4Info(bc4);
			 mgLogInOut.verifyUserInfHeaderBar("",bc4);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 mgLogInOut.verifyUserInfHeaderBar("",bc4);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyLevel1Info("VNPost");
			 hsnd.verifyLevel2Info(bc2);
			 hsnd.verifyLevel3Info(bc3);
			 hsnd.verifyLevel4Info(bc4);
		}
		
		/**
		* Test ID:EM-331
		* Test case name:Kiểm Tra Việc Hủy Các Thay Đổi Thông Tin
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* 
		* Test Steps:
		* 1. Vào trang với account staff
		* 2. Vào Hồ sơ người dùng
		* 3. Thay đổi cấp bưu cục
		* 4. Ấn nút Đóng
		* Expected Result:
		* Trang home được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin thay đổi không được cập nhật trong DB. Các thông tin cũ được giữ nguyên
		 * @throws TestLinkAPIException 
		 * @throws IOException 
		*/
		@Test
		public void EM_331_KiểmTraViệcHủyCácThayĐổiThôngTin() throws TestLinkAPIException, IOException{
			 info("Kiểm tra việc hủy các thay đổi thông tin");
			 testCaseID="EM-331";
			 
             mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào trang Hồ Sơ Người Dùng");
			 hp.goToHoSoNguoiDung();
			 String oldMaBuuCuc=waitForAndGetElement(hsnd.ELEMENT_HSND_POSTCODE).getAttribute("value");
			 
			 info("Thay đổi Mã bưu cục");
			 String maBuuCuc=getRandomNumber();
			 hsnd.inputCodePost(maBuuCuc);
			 info("Ấn nút Đóng");
			 hsnd.close_btn();
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCodePost(oldMaBuuCuc);
			 
			 info("Kiểm tra thông tin đã được update");
			 mgLogInOut.logout();
			 mgLogInOut.login(config.USER_STAFF_02, config.USER_PASS, true);
			 
			 info("Vào lại trang người dùng");
			 hp.goToHoSoNguoiDung();
			 hsnd.verifyCodePost(oldMaBuuCuc);
		}
}