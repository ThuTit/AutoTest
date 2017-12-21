package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_QuanLyUyQuyen extends UnitBase{
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_CLOSE_BTN = By.xpath(".//*[@id='addModal']//button[contains(@class,'btn-close')]");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_ADD_BTN = By.xpath(".//*[@id='add_authorized']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_DATETO = By.xpath(".//*[@class='new_auth_date_to']//input");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_DATEFROM = By.xpath(".//*[@class='new_auth_date_from']//input");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_OFFICE = By.xpath(".//*[@class='new_auth_office']//input");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_RELATIONSHIP = By.xpath(".//*[@class='new_auth_relation']//input");
	
	public final String AUTH_UPDATE_ADD_ACCOUNT_POPUP_ACCOUNT_CHECKBOX = ".//*[@id='account_data_table']//*[contains(text(),'$value')]/..//*[@type='checkbox']";
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_SEARCH_BTN = By.xpath(".//*[@id='auth_modal_search_submit']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_CMND = By.xpath(".//*[@id='id_identification_1']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_NAME = By.xpath(".//*[@id='id_name_1']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_STATUS = By.xpath(".//*[@id='id_status_1']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL4 = By.xpath(".//*[@id='id_member_store_id_1']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL3 = By.xpath(".//*[@id='id_member_store_g_id_1']");
	
	public final By AUTH_UPDATE_ADD_ACCOUNT_POPUP_POSTLEVEL2 = By.xpath(".//*[@id='id_member_store_2g_id_1']");
	
	public final By AUTH_UPDATE_ACCOUNTLIST_UPDATE_BTN =By.xpath(".//*[@id='account_list_table']//button[contains(@class,'auth_update_row')]");
	
	public final By AUTH_UPDATE_ACCOUNTLIST_DATETO = By.xpath(".//*[@class='auth_date_to']//input");
	
	public final By AUTH_UPDATE_ACCOUNTLIST_DATEFROM = By.xpath(".//*[@class='auth_date_from']//input");
	
	public final By AUTH_UPDATE_ACCOUNTLIST_OFFICE = By.xpath(".//*[@class='auth_office']//input");
	
	public final By AUTH_UPDATE_ACCOUNTLIST_RELATIONSHIP = By.xpath(".//*[@class='auth_relation']//input");
	
	public final String AUTH_UPDATE_ACCOUNTLIST_CHECKBOX = ".//*[@id='account_list_table']//*[contains(text(),'$value')]/..//input[@type='checkbox']";
	
	public final By AUTH_UPDATE_ACCOUNTLIST_CHECKBOX_ALL = By.xpath(".//*[@id='checkAll']");
	
	public final String AUTH_UPDATE_ACCOUNTLIST_EDIT_BTN = ".//*[@id='account_list_table']//*[contains(text(),'$value')]/..//button[contains(@class,'update_auth_info')]";
	
	public final By AUTH_UPDATE_DELETE_BTN = By.xpath(".//*[@id='delete_acc_btn']");
	
	public final By AUTH_UPDATE_ADD_NEW_ACCOUNT = By.xpath(".//*[@id='add_authorized_btn']");
	
	public final By AUTH_UPDATE_SEARCH_BTN = By.xpath(".//*[@id='auth_accout_list_find']");
	
	public final By AUTH_UPDATE_SEARCH_CMND = By.xpath(".//*[@id='id_identification_0']");
	
	public final By AUTH_UPDATE_SEARCH_NAME = By.xpath(".//*[@id='id_name_0']");
	
	public final By AUTH_UPDATE_SEARCH_STATUS = By.xpath(".//*[@id='id_status_0']");
	
	public final By AUTH_UPDATE_SEARCH_POSTLEVEL4 = By.xpath(".//*[@id='id_member_store_id_0']");
	
	public final By AUTH_UPDATE_SEARCH_POSTLEVEL3 = By.xpath(".//*[@id='id_member_store_g_id_0']");
	
	public final By AUTH_UPDATE_SEARCH_POSTLEVEL2 = By.xpath(".//*[@id='id_member_store_2g_id_0']");
	
	public final By AUTH_CREATE_UPDATE_CLOSE_BTN = By.xpath(".//*[@id='button-group']//a[contains(@class,'btn-close')]");
	
	public final By AUTH_CREATE_UPDATE_BTN = By.xpath(".//*[@id='button-group']//button[@type='submit']");
	
	public final By AUTH_CREATE_UPDATE_ISMEMBER_CHECKED = By.xpath(".//*[@id='id_is_member' and @checked='checked']");
	
	public final By AUTH_CREATE_UPDATE_ISMEMBER_UNCHECKED = By.xpath(".//*[@id='id_is_member' not (@checked='checked')]");
	
	public final By AUTH_CREATE_UPDATE_PHONE = By.xpath(".//*[@id='id_phone_number']");
	
	public final By AUTHO_CREATE_UPDATE_NOICAP = By.xpath(".//*[@id='id_identification_issue_address']");
	
	public final By AUTHO_CREATE_UPDATE_NGAYCAP = By.xpath(".//*[@id='id_identification_date']");
	
	public final By AUTH_CREATE_UPDATE_NAME = By.xpath(".//*[@id='id_name']");
	
	public final By AUTH_CREATE_UPDATE_GTTT_LOAI = By.xpath(".//*[@id='id_id_type']");
	
	public final By AUTH_CREATE_UPDATE_CMND = By.xpath(".//*[@id='id_identification']");
	
	public final String AUTH_HOME_AUTH_INFO = ".//*[@id='authorized-list']//*[contains(text(),'$value1')]/..//*[contains(text(),'$value2')]";
	
	public final By AUTH_HOME_UPDATE_LINK = By.xpath(".//*[@id='id_identification']");
	
	public final By AUTH_HOME_ADD_AUTH_BTN = By.xpath(".//*[@id='create_authorized']");
	
	public final By AUTH_HOME_SEARCH_BTN = By.xpath(".//*[@id='search-person']");
	
	public final By AUTH_HOME_SEARCH_CMND = By.xpath(".//*[@id='id_identification']");
	
	
	
}
