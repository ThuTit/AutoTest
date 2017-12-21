package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_HoSoNguoiDung extends UnitBase{
	//***************************************SQL QUERY***************************************************************\
	//Lấy thông tin của người dùng trong DB
	public String sqlQueryStaffInfo="select a.id,a.username,a.first_name,a.last_name,DATE_FORMAT(a.birthday,'%d/%m/%Y') as birthday,a.identification,a.email,a.phone_number,a.post_code,a.pincode,"
			+ "b.`name` as province_name,c.`name` as district_name,g.`name` as member_store_3g_name,h.`name` as member_store_2g_name,"
			+ "f.`name` as member_store_g_name,l.`name` as member_store_name from staff a "
			+ "Left JOIN province b on a.province=b.id "
			+ "Left JOIN district c on a.district=c.id "
			+ "LEFT JOIN member_store_3g g on a.member_store_3g_id=g.`code` "
			+ "LEFT JOIN member_store_2g h on a.member_store_2g_id=h.`code` "
			+ "LEFT JOIN member_store_g f on a.member_store_g_id = f.`code` "
			+ "LEFT JOIN member_store l on a.member_store_id = l.`code` WHERE a.username ='$username';";
	
	//Lấy thông tin về phân quyền của người dùng trong DB
	public String sqlQueryStaffRole="select a.id,e.`name` as name_roles from staff a "
			+ "LEFT JOIN `role-staff` d on a.id = d.staff_id "
			+ "LEFT JOIN roles e on d.role_id = e.id "
			+ "WHERE a.username ='$username';";
	//Lấy thông tin về tỉnh thành
	public final String sqlQueryProvince="select*FROM province;";
    
	//Lấy thông tin về quận huyện theo tỉnh thành
	public String sqlQueryDistrictList="select a.id,a.code,a.`name` from district a LEFT JOIN province b on b.id = a.province_id WHERE b.id='$province';";
	
	//Lấy danh sách các bưu cục
	public String sqlQueryBuuCucList="select a.`code`,a.`name` as bc4,b.`name` as bc3,c.`name` as bc2 from member_store a"
			+ " left JOIN member_store_g b on a.parent_code = b.`code`"
			+ " LEFT JOIN member_store_2g c on b.parent_code = c.`code`";


	
	//***********************************LOCATOR***************************************************************************\
	
	public By ELEMENT_HSND_USERNAME_READONLY = By.xpath(".//*[@id='id_username' and @readonly='true']");
	
	public By ELEMENT_HSND_BUUCUC_CAP1_READONLY=By.xpath(".//*[@id='id_member_store_3g_id'][@disabled='disabled']");
	
	public By ELEMENT_HSNG_ROLE_READONLY=By.xpath(".//*[@id='mws-validate']//*[contains(@class,'disabled')]");
	
	public String ELEMENT_HSND_USER_NAME_VALUE = ".//*[@id='id_username'][@value='$username']";
	
	public String ELEMENT_HSND_FIRST_NAME_VALUE = ".//*[@id='id_first_name' and @value='$firstName']";
	
	public String ELEMENT_HSND_LAST_NAME_VALUE = ".//*[@id='id_last_name' and @value='$lastName']";
	
	public String ELEMENT_HSND_BIRTHDAY_VALUE = ".//*[@id='id_birthday' and @value='$birthDay']";
	
	public String ELEMENT_HSND_IDENTIFICATION_VALUE = ".//*[@id='id_identification'and @value='$identification']";
	
	public By ELEMENT_HSND_POSTCODE=By.xpath(".//*[@id='id_post_code']");
	
	public String ELEMENT_HSND_POST_CODE_VALUE = ".//*[@id='id_post_code'and @value='$postCode']";
	
	public String ELEMENT_HSND_PIN_CODE_VALUE = ".//*[@id='id_pincode' and @value='$pinCode']";
	
	public String ELEMENT_HSND_EMAIL_VALUE = ".//*[@id='id_email' and @value='$email']";
	
	public String ELEMENT_HSND_PHONE_NUMBER_VALUE = ".//*[@id='id_phone_number' and @value='$phoneNumber']";
	
	public String ELEMENT_HSND_PROVINCE_VALUE = ".//*[@id='id_province']//*[@selected='selected' and contains(text(),'$idProvince')]";
	
	public By ELEMENT_HSND_PROVINCE_SELECTED=By.xpath(".//*[@id='id_province']//*[@selected='selected']");
	
	public String ELEMENT_HSND_DISTRICT_VALUE = ".//*[@id='id_district']//*[@selected='selected' and contains(text(),'$idDistrict')]";
	
	
	public String ELEMENT_HSND_BUUCUC_CAP1_SELECTED = ".//*[@id='id_member_store_3g_id']//*[@selected='selected' and text()='$info']";
	
	public String ELEMENT_HSND_BUUCUC_CAP2_SELECTED = ".//*[@id='id_member_store_2g_id']//*[@selected='selected' and text()='$info']";
	
	public By ELEMENT_HSND_BUUCUC_CAP2_SELECTED_EMPTY = By.xpath(".//*[@id='id_member_store_2g_id']//*[(@selected='selected')]");
	
	public By ELEMENT_HSND_BUUCUC_CAP2_DISABLED=By.xpath(".//*[@id='id_member_store_2g_id'][@disabled='disabled']");
	
	public By ELEMENT_HSND_BUUCUC_CAP2_FIELD = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public String ELEMENT_HSND_BUUCUC_CAP3_SELECTED = ".//*[@id='id_member_store_g_id']//*[@selected='selected' and text()= '$info']";
	
	public By ELEMENT_HSND_BUUCUC_CAP3_SELECTED_EMPTY = By.xpath(".//*[@id='id_member_store_g_id']//*[(@selected='selected')]");
	
	public By ELEMENT_HSND_BUUCUC_CAP3_DISABLED=By.xpath(".//*[@id='id_member_store_g_id'][@disabled='disabled']");
	
	public By ELEMENT_HSND_BUUCUC_CAP3_FIELD = By.xpath( ".//*[@id='id_member_store_g_id']");
	
	public String ELEMENT_HSND_BUUCUC_CAP4_SELECTED = ".//*[@id='id_member_store_id']//*[@selected='selected' and contains(text(),'$info')]";
	
	public By ELEMENT_HSND_BUUCUC_CAP4_SELECTED_EMPTY = By.xpath(".//*[@id='id_member_store_id']//*[(@selected='selected')]");
	
	public By ELEMENT_HSND_BUUCUC_CAP4_DISABLED=By.xpath(".//*[@id='id_member_store_id'][@disabled='disabled']");
	
	public By ELEMENT_HSND_BUUCUC_CAP4_FIELD = By.xpath(".//*[@id='id_member_store_id']");

	public String ELEMENT_HSND_ROLE_FIELD = ".//*[@id='mws-validate']//*[contains(text(), '$role')]";
	
	public By ELEMENT_HSND_ROLE_EMPTY=By.xpath(".//*[@id='mws-validate']//*[contains(@class,'tokenfield')]//*[@value='']");
	
	public By ELEMENT_HSND_FIRST_NAME_FIELD = By.xpath(".//*[@id='id_first_name']");
	
	public By ELEMENT_HSND_LAST_NAME_FIELD = By.xpath(".//*[@id='id_last_name']");
	
	public By ELEMENT_HSND_BIRTHDAY_FIELD = By.xpath(".//*[@id='id_birthday']");
	
	public By ELEMENT_HSND_IDENTIFICATION_NUMBER_FIELD = By.xpath(".//*[@id='id_identification']");
	
	public By ELEMENT_HSND_POST_CODE_FIELD = By.xpath(".//*[@id='id_post_code']");
	
	public By ELEMENT_HSND_PIN_CODE_FIELD = By.xpath(".//*[@id='id_pincode']");
	
	public By ELEMENT_HSND_EMAIL_FIELD = By.xpath(".//*[@id='id_email']");
	
	public By ELEMENT_HSND_PHONE_NUMBER_FIELD = By.xpath(".//*[@id='id_phone_number']");
	
	public By ELEMENT_HSND_PROVINCE_FIELD = By.xpath(".//*[@id='id_province']");
	
	public By ELEMENT_HSND_DISTRICT_FIELD = By.xpath(".//*[@id='id_district']");

	public By ELEMENT_HSND_UPDATE_BTN = By.xpath(".//*[@id='mws-validate']//button[@type='submit']");
	public By ELEMENT_HSND_CLOSE_BTN = By.xpath(".//*[@id='mws-validate']//*[@href='/']");
}
