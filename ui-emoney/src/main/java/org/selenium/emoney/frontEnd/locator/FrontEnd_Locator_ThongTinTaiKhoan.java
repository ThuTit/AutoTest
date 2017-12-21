package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_ThongTinTaiKhoan extends UnitBase {
	//*********************** INPUTS ************************/
		public By ELEMENT_TTTK_TYPE_FIELD = By.xpath(".//*[@id='id_type']");
		public By ELEMENT_TTTK_SEARCH_FIELD = By.xpath(".//*[@id='query']");

		public By ELEMENT_TTTK_CELL_PHONE_NUMBER_FIELD = By.xpath(".//*[@id='id_phone_number']");
		public By ELEMENT_TTTK_PHONE_NUMBER_FIELD = By.xpath(".//*[@id='id_cell_phone_number']");
		public By ELEMENT_TTTK_EMAIL_FIELD = By.xpath(".//*[@id='id_email']");
		public By ELEMENT_TTTK_SEARCH_BTN = By.xpath(".//*[@id='main']//button[contains(@class, 'btn-ttsearch' )]");
		
		
		// *********************** TAB THONG TIN ***********************************/
		public String ELEMENT_TTTK_MESSAGE = ".//*[@id='container']//[text()='$mess']";
		public String ELEMENT_TTTK_HEADER_INFO = ".//*[@id='container']//*[contains(text(),'$header_info')]";
		
		
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> THONG TIN CHUNG
		public String ELEMENT_TTTK_FULLNAME_VALUE = ".//*[@id='id_name' and @value = '$name']";		
		public String ELEMENT_TTTK_GENDER_CHECKED = ".//*[@id='info_div']//input[@name='gender' and @checked='checked' and @value='$gender']";
		public String ELEMENT_TTTK_BIRTHDAY_VALUE = ".//*[@id='id_birthday' and @value = '$birthday']";
		public String ELEMENT_TTTK_BIRTH_PLACE_VALUE = ".//*[@id='id_birth_address' and @value = '$birth_place']";
		public String ELEMENT_TTTK_IDENTIFICATION_VALUE = ".//*[@id='id_identification' and @value = '$identification']";
		public String ELEMENT_TTTK_IDENTIFICATION_DATE_VALUE = ".//*[@id='id_identification_date' and @value= '$identification_date']";
		public String ELEMENT_TTTK_IDENTIFICATION_ISSUE_DATE_VALUE = ".//*[@id='id_identification_issue_address' and @value = '$identification_issue_address']";
		
		public String ELEMENT_TTTK_FULLNAME_EMPTY = ".//*[@id='id_name' and not (@value)]";			
		public String ELEMENT_TTTK_BIRTHDAY_EMPTY = ".//*[@id='id_birthday' and not (@value)]";
		public String ELEMENT_TTTK_BIRTH_PLACE_EMPTY= ".//*[@id='id_birth_address' and not (@value)]";
		public String ELEMENT_TTTK_IDENTIFICATION_EMPTY = ".//*[@id='id_identification' and not (@value)]";
		public String ELEMENT_TTTK_IDENTIFICATION_DATE_EMPTY = ".//*[@id='id_identification_date' and not (@value)]";
		public String ELEMENT_TTTK_IDENTIFICATION_ISSUE_DATE_EMPTY = ".//*[@id='id_identification_issue_address' and not (@value)]";
		
		public By ELEMENT_TTTK_FULLNAME_READONLY = By.xpath(".//*[@id='id_name' and (@readonly='True' or @readonly = 'true')]");
		public By ELEMENT_TTTK_BIRTHDAY_READONLY = By.xpath(".//*[@id='id_birthday' and (@readonly='True' or @readonly = 'true')]");
		public By ELEMENT_TTTK_BIRTH_PLACE_READONLY = By.xpath(".//*[@id='id_birth_address' and (@readonly='True' or @readonly = 'true')]");
		public By ELEMENT_TTTK_BIRTH_IDENTIFICATION_NUMBER_READONLY = By.xpath(".//*[@id='id_identification' and (@readonly='True' or @readonly = 'true')]");
		public By ELEMENT_TTTK_BIRTH_IDENTIFICATION_DATE_READONLY = By.xpath(".//*[@id='id_identification_date' and (@readonly='True' or @readonly = 'true')]");
		public By ELEMENT_TTTK_BIRTH_IDENTIFICATION_ADDRESS_READONLY = By.xpath(".//*[@id='id_identification_issue_address' and (@readonly='True' or @readonly = 'true')]");
		
		
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> THONG TIN E-MONEY
		public String ELEMENT_TTTK_EMONEY_ID_VALUE = ".//*[@id='id_emoney_id' and @value='$emoney_id']";
		public String ELEMENT_TTTK_EMONEY_BALANCE_VALUE = ".//*[@id='emoney_balance' and @value= '$emoney_balance']";
		public String ELEMENT_TTTK_EMONEY_ACCOUNT_STATUS_VALUE = ".//*[@name='member_status']/..//*[@value='$status']";
		public String ELEMENT_TTTK_EMONEY_ID_CARD_NO_VALUE = ".//*[@id='id_card_no' and @value='$card_no']";
		public String ELEMENT_TTTK_CARD_EXP_DATE_VALUE = ".//*[@id='id_card_expiration_date' and @value ='$card_exp_date']";
		public String ELEMENT_TTTK_CARD_ISSUE_DATE_VALUE = ".//*[@id='id_card_issue_date' and @value = '$card_issue_date']";
		public String ELEMENT_TTTK_CARD_STATUS_VALUE = ".//*[@id='id_card_status' and @value = '$card_status']";
		
		public String ELEMENT_TTTK_EMONEY_ID_EMPTY = ".//*[@id='id_emoney_id' and not (@value)]";
		public String ELEMENT_TTTK_EMONEY_BALANCE_EMPTY = ".//*[@id='emoney_balance' and not(@value)]";
		public String ELEMENT_TTTK_EMONEY_ACCOUNT_STATUS_EMPTY = ".//*[@name='member_status']/..//input[@value='' or not(@value)]";
		public String ELEMENT_TTTK_EMONEY_ID_CARD_NO_EMPTY = ".//*[@id='id_card_no' and not (@value)]";
		public String ELEMENT_TTTK_CARD_EXP_DATE_EMPTY = ".//*[@id='id_card_expiration_date' and not (@value)]";
		public String ELEMENT_TTTK_CARD_ISSUE_DATE_EMPTY = ".//*[@id='id_card_issue_date' and not (@value)]";
		public String ELEMENT_TTTK_CARD_STATUS_EMPTY = ".//*[@id='id_card_status' and not (@value)]";
		
		public By ELEMENT_TTTK_EMONEY_ID_READONLY = By.xpath(".//*[@id='id_emoney_id' and (@readonly='True' or @readonly)]");
		public By ELEMENT_TTTK_EMONEY_BALANCE_READONLY = By.xpath(".//*[@id='emoney_balance' and (@readonly='True' or @readonly)]");
		public By ELEMENT_TTTK_EMONEY_ACCOUNT_STATUS_READONLY = By.xpath(".//*[@id='em_div']//*[@name='member_status']/..//input[@readonly]");
		public By ELEMENT_TTTK_EMONEY_ID_CARD_READONLY  = By.xpath(".//*[@id='id_card_no' and (@readonly='True' or @readonly )]");
		public By ELEMENT_TTTK_CARD_EXP_DATE_READONLY = By.xpath(".//*[@id='id_card_expiration_date' and (@readonly='True' or @readonly )]");
		public By ELEMENT_TTTK_CARD_ISSUE_DATE_READONLY = By.xpath(".//*[@id='id_card_issue_date' and (@readonly='True' or @readonly)]");
		public By ELEMENT_TTTK_CARD_STATUS_READONLY =  By.xpath(".//*[@id='id_card_status' and (@readonly='True' or @readonly)]");
		
		//*********************************************************************
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> THONG TIN LIEN LAC
		public String ELEMENT_TTTK_PHONE_NUMBER_VALUE = ".//*[@id='id_phone_number' and @value='$phone_number']";
		public String ELEMENT_TTTK_CELL_PHONE_NUMBER_VALUE = ".//*[@id='id_cell_phone_number' and @value='$cell_phone_number']";
		public String ELEMENT_TTTK_EMAIL_VALUE = ".//*[@id='id_email' and @value='$email']";
		

		//*********************************************************************
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> THONG TIN BHXH
		public By ELEMENT_TTTK_SOCIAL_INSURANCE_TAB = By.xpath(".//*[@id='bhxh_div']//contains(text(), 'THÔNG TIN BHXH')"); 
		public String ELEMENT_TTTK_SOCIAL_INSURANCE_NUMBER_VALUE = ".//*[@id='id_social_insurance_number' and @value= '$value']";	
		public String ELEMENT_TTTK_SOCIAL_TYPE_VALUE = ".//*[@id='bhxh_div']//input[@value='$type']";
		public String ELEMENT_TTTK_SOCIAL_INSURANCE_CASH_VALUE = ".//*[@id='bhxh_div']//*[@name = 'bhxh_cash' and @value='$info']";
		
		public By ELEMENT_TTTK_SOCIAL_INSURANCE_NUMBER_READONLY =  By.xpath(".//*[@id='id_social_insurance_number' and (@readonly)]");
		public By ELEMENT_TTTK_SOCIAL_TYPE_READONLY =  By.xpath(".//*[@id='bhxh_div']//*[contains(text(), 'Chế độ BHXH')]/..//input[@readonly]");
		
		
		

		//*********************************************************************
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> DIA CHI THUONG TRU
		public By ELEMENT_TTTK_DETAIL_ADDRESS_FIELD =   By.xpath(".//*[@id='id_address']");
		public By ELEMENT_TTTK_ADDRESS_PROVINCE_FIELD = By.xpath(".//*[@id='id_address_province']");
		public By ELEMENT_TTTK_ADDRESS_DISTRICT_FIELD = By.xpath(".//*[@id='id_address_district']");
		public By ELEMENT_TTTK_ADDRESS_COMMUNE_FIELD = By.xpath(".//*[@id='id_address_commune']");
		
		public String ELEMENT_TTTK_DETAIL_ADDRESS_VALUE = ".//*[@id='id_address' and @value='$detail_address']";	
		public By ELEMENT_TTTK_ADDRESS_PROVINCE_SELECTED = By.xpath(".//*[@id='id_address_province']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_PROVINCE_SELECTED_TEXT =".//*[@id='id_address_province']//*[@selected ='selected'][contains(text(),'$value')]";
		public By ELEMENT_TTTK_ADDRESS_DISTRICT_SELECTED = By.xpath(".//*[@id='id_address_district']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_DISTRICT_SELECTED_TEXT =".//*[@id='id_address_district']//*[@selected ='selected'][contains(text(),'$value')]";
		public By ELEMENT_TTTK_ADDRESS_COMMUNE_SELECTED = By.xpath(".//*[@id='id_address_commune']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_COMMUNE_SELECTED_TEXT =".//*[@id='id_address_commune']//*[@selected ='selected'][contains(text(),'$value')]";
		public String ELEMENT_TTTK_DETAIL_ADDRESS_EMPTY = ".//*[@id='id_address' and not (@value)]";	

		
		public By ELEMENT_TTTK_DETAIL_ADDRESS_DISABLE = By.xpath(".//*[@id='id_address' and @readonly='readonly']");	
		public By ELEMENT_TTTK_ADDRESS_PROVINCE_DISABLE = By.xpath(".//*[@id='id_address_province' and @readonly='readonly']");	
		public By ELEMENT_TTTK_ADDRESS_DISTRICT_DISABLE = By.xpath(".//*[@id='id_address_district' and @readonly='readonly']");	
		public By ELEMENT_TTTK_ADDRESS_COMMUNE_DISABLE = By.xpath(".//*[@id='id_address_commune' and @readonly='readonly']");	
		
		//*********************************************************************
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> DIA CHI TAM TRU
		public By ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_FIELD =   By.xpath(".//*[@id='id_address_temp']");
		public By ELEMENT_TTTK_ADDRESS_TEMP_PROVINCE_FIELD = By.xpath(".//*[@id='id_address_temp_province']");
		public By ELEMENT_TTTK_ADDRESS_TEMP_DISTRICT_FIELD = By.xpath(".//*[@id='id_address_temp_district']");
		public By ELEMENT_TTTK_ADDRESS_TEMP_COMMUNE_FIELD = By.xpath(".//*[@id='id_address_temp_commune']");
		
		public String ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_VALUE = ".//*[@id='id_address_temp' and @value='$detail_address_temp']";	
		public By ELEMENT_TTTK_ADDRESS_TEMP_PROVINCE_SELECTED = By.xpath(".//*[@id='id_address_temp_province']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_TEMP_PROVINCE_SELECTED_TEXT = ".//*[@id='id_address_temp_province']//*[@selected ='selected'][contains(text(),'$value')]";
		public By ELEMENT_TTTK_ADDRESS_TEMP_DISTRICT_SELECTED = By.xpath(".//*[@id='id_address_temp_district']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_TEMP_DISTRICT_SELECTED_TEXT =".//*[@id='id_address_temp_district']//*[@selected ='selected'][contains(text(),'$value')]";
		public By ELEMENT_TTTK_ADDRESS_TEMP_COMMUNE_SELECTED = By.xpath(".//*[@id='id_address_temp_commune']//*[@selected ='selected']");
		public String ELEMENT_TTTK_ADDRESS_TEMP_COMMUNE_SELECTED_TEXT = ".//*[@id='id_address_temp_commune']//*[@selected ='selected'][contains(text(),'$value')]";
		public By ELEMENT_TTTK_DETAIL_ADDRESS_TEMP_EMPTY = By.xpath(".//*[@id='id_address_temp' and not (@value)]");	
		
		
		//*********************************************************************
		// THONG TIN TAI KHOAN >> TAB THONG TIN >> THONG TIN UY QUYEN 
		public By ELEMENT_TTTK_AUTHORIZED_RELATION_FIELD = By.xpath(".//*[@id='id_authorized_relation']");
		public By ELEMENT_TTTK_AUTHORIZED_OFFICE_FIELD = By.xpath(".//*[@id='id_authorized_office']");
		public By ELEMENT_TTTK_AUTHORIZED_DATE_FROM_FIELD = By.xpath(".//*[@id='id_authorized_date_from']");
		public By ELEMENT_TTTK_AUTHORIZED_DATE_TO_FIELD = By.xpath(".//*[@id='id_authorized_date_to']");
		public By ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_FIELD = By.xpath(".//*[@id='id_auth_per_identification']");
		public By ELEMENT_TTTK_AUTH_SEARCH_BTN =  By.xpath(".//*[@id='id_auth_per_search']");
		
		public String ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_NUMBER_INFO = ".//*[@id='id_auth_per_identification' and @value='$info']";	
		public String ELEMENT_TTTK_AUTHORIZED_FULLNAME_INFO = ".//*[@id='id_auth_per_name' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_DATE_INFO = ".//*[@id='id_auth_per_identification_date' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_ADDRESS_INFO = ".//*[@id='id_auth_per_identification_add' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_PHONE_INFO = ".//*[@id='id_auth_per_phone' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_RELATION_INFO = ".//*[@id='id_authorized_relation' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_OFFICE_INFO = ".//*[@id='id_authorized_office' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_DATE_FROM_INFO = ".//*[@id='id_authorized_date_from' and @value='$info']";
		public String ELEMENT_TTTK_AUTHORIZED_DATE_TO_INFO = ".//*[@id='id_authorized_date_to' and @value='$info']";
		
		public By ELEMENT_TTTK_AUTHORIZED_FULLNAME_READONLY = By.xpath(".//*[@id='id_auth_per_name' and @readonly ]");
		public By ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_DATE_READONLY = By.xpath(".//*[@id='id_auth_per_identification_date' and @readonly ]");
		public By ELEMENT_TTTK_AUTHORIZED_IDENTIFICATION_ADDRESS_READONLY = By.xpath(".//*[@id='id_auth_per_identification_add' and @readonly ]");
		public By ELEMENT_TTTK_AUTHORIZED_PHONE_READONLY = By.xpath(".//*[@id='id_auth_per_phone' and @readonly ]");
		
		
		public By ELEMENT_TTTK_DELETE_AUTH_BTN = By.xpath(".//*[@id='delete_auth_per']");
		public By ELEMENT_TTTK_RESET_PASSWORD_LINK = By.xpath(".//*[@id='mws-validate']//a[contains(@href,'/reset_password')]");
		public By ELEMENT_TTTK_UPDATE_LINK = By.xpath(".//*[@id='mws-validate']//*[contains(@class,'submit')]");
		public By ELEMENT_TTTK_LOCK_ACCOUNT_LINK = By.xpath(".//*[contains(@href,'/change_status')]");
		
		
		//********************* TAB GIAO DICH ***********************************/
		// // THONG TIN TAI KHOAN >> TAB GIAO DICH 
		public By ELEMENT_TTTK_GIAODICH_TAB = By.xpath(".//*[@id='mws-validate']//a[@href='txn_history/']");
		public By ELEMENT_TTTK_TRANSACTION_DATE_FROM_FIELD = By.xpath(".//*[@id='id_txnf']");
		public By ELEMENT_TTTK_TRANSACTION_DATE_TO_FIELD = By.xpath(".//*[@id='id_txnt']");
		public By ELEMENT_TTTK_TRANSACTION_SEARCH_FIELD = By.xpath(".//*[@id='transaction-list_filter']//input[@type='search']");
		public By ELEMENT_TTTK_TRANSACTION_SEARCH_BTN = By.xpath(".//*[@id='search-transaction']");
		public String ELEMENT_TTTK_TRANSACTION_ID_INFO = ".//*[@id='transaction-list']//a[contains(text(),'$transactionNumb')]";
		public String ELEMENT_TTTK_TRANSACTION_INFO = ".//*[@id='transaction-list']//a[contains(text(),'$transactionNumb')]/../../*[contains( text(), '$info')]";
		public By ELEMENT_TTTK_TRANSACTION_LIST_LENGTH = By.xpath(".//*[@id='transaction-list_length']//select[@name='transaction-list_length']");
		public By ELEMENT_TTTK_NEXT_TRANSACTION_PAGE_BTN = By.xpath(".//*[@id='transaction-list_next']/a");
		public By ELEMENT_TTTK_PREV_TRANSACTION_PAGE_BTN = By.xpath(".//*[@id='transaction-list_next']/a");
		
		//********************* TAB GIAO DICH CHO XU LY **************************/
		public By ELEMENT_TTTK_GIAODICHXULY_TAB = By.xpath(".//*[@id='mws-validate']//a[@href='txn_pending/']");
		public String ELEMENT_TTTK_PENDING_TRANSACTION_INFO = "..//*[@id='transaction-list']//*[contains(text(),'$transactionNumb')]/..//*[contains(text(),'$info')]";	
		public By ELEMENT_TTTK_CANCEL_PENDING_TRANSACTION_BTN = By.xpath(".//*[@id='transaction-list']//button[contains(@class, 'btn-finish')]");
		public By ELEMENT_TTTK_NEXT_PENDING_TRANSACTION_PAGE_BTN = By.xpath(".//*[@id='main']//ul[@class='pagination']/li[2]/a");
		public By ELEMENT_TTTK_PREV_PENDING_TRANSACTION_PAGE_BTN = By.xpath(".//*[@id='main']//ul[@class='pagination']/li[1]/a");
		

		//********************* DOI MAT KHAU ************************************/
		public By ELEMENT_TTTK_CHANGE_PASSWORD_MOTA_FIELD = By.xpath(".//*[@id='id_description']");
		public By ELEMENT_TTTK_CHANGE_PASSWORD_SUBMIT_BTN = By.xpath(".//*[@id='main']//button[contains(@class, 'check-active')]");
		public String ELEMENT_TTTK_CHANGE_PASSWORD_MESSAGE = ".//*[@id='main']//*[contains( text(), '$mesg')]";
		public By ELEMENT_TTTK_CHANGE_PASSWORD_CANCEL_BTN = By.xpath(".//*[@id='main']//a[contains(@class, 'btn-close')]");
		
		//******************* KHOA TAI KHOAN *************************************/
		public By ELEMENT_TTTK_LOCK_ACCOUNT_BTN = By.xpath(".//*[@id='mws-validate']//*[contains(@href, '/change_status')]"); 
		public String ELEMENT_TTTK_LOCK_ACCOUNT_TYPE_CHECKED = ".//*[@id='status-form']//input[@name='type' and @value='$value' and not (@checked)]";
		public String ELEMENT_TTTK_LOCK_ACCOUNT_TYPE_FIELD = ".//*[@id='status-form']//input[@name='type' and @value='$value']";
		public By ELEMENT_TTTK_LOCK_ACCOUNT_STATUS_FIELD = By.xpath(".//select[@name='status']");
		public String ELEMENT_TTTK_LOCK_ACCOUNT_STATUS_DISABLED =".//select[@name='status']/*[text()='$status' and not(@disabled)]";
		public By ELEMENT_TTTK_LOCK_ACCOUNT_DESCRIPTION_FIELD = By.xpath(".//*[@id='id_description']");
		public String ELEMENT_TTTK_LOCK_ACCOUNT_MESSAGE = ".//*[@id='main']//*[contains(text(), '$mesg')]";
		public By ELEMENT_TTTK_LOCK_ACCOUNT_ACCEPT_BTN = By.xpath(".//*[@id='status-form']//button[@type='submit']");
		public By ELEMENT_TTTK_LOCK_ACCOUNT_CLOSE_BTN = By.xpath(".//*[contains(@href, '/account')]");
		
		
}
