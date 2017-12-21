package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_QuanLyNhomQuyen extends UnitBase{
	
	public final By ADMIN_QUANLYNHOMQUYEN_HOME_POST_LEVEL = By.xpath(".//*[@id='group_choice']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_HOME_CREATE_BTN = By.xpath(".//*[@id='main']//a[@href='/roles/create/']");
	
	public final String ADMIN_QUANLYNHOMQUYEN_HOME_ROLEINFO = ".//*[@id='main']//*[text()='$value']";
	
	public final String ADMIN_QUANLYNHOMQUYEN_HOME_ROLE_UPDATE = ".//*[@id='main']//*[text()='$value']/..//*[contains(@href,'role')][1]";
	
	public final String ADMIN_QUANLYNHOMQUYEN_HOME_ROLE_DELETE = ".//*[@id='main']//*[text()='$value']/..//*[@class='role_delete_btn']";
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_POST_LEVEL = By.xpath(".//*[@id='authorized_create_form']//select[@name='group_id']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_NAME = By.xpath(".//*[@id='id_name']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DESCRIPTION = By.xpath(".//*[@id='id_description']");
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT = "//a[contains(text(),'$value')]/../i[contains(@class,'jstree-icon')]";
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_PARENT_CHECKBOX = "//a[contains(text(),'$value')]/..//i[contains(@class,'jstree-checkbox')]";
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_CHILD_CHECKBOX = "//a[contains(text(),'$parent')]/..//*[contains(text(),'$child')]//*[contains(@class,'jstree-checkbox')]";
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_SAVE_BTN = By.xpath(".//*[@id='authorized_create_form']//button[@type='submit']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_BACK_BTN = By.xpath(".//*[@id='authorized_create_form']//a[contains(@class,'btn-close')]");
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_ERROR_MESSAGE_1 = "(.//*[@class='errorlist']//*[contains(text(),'$value')])[$field]";
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_ERROR_MESSAGE_2 = ".//*[contains(@class,'alert-danger')]//*[contains(text(),'$value')]";
	
	public final String ADMIN_QUANLYNHOMQUYEN_DETAIL_SUCCESS_MESSAGE = ".//*[contains(@class,'alert-success')]//*[contains(text(),'$value')]";
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE = By.xpath(".//*[@id='delete_role_btn']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE_OK = By.xpath("//button[@data-bb-handler='confirm']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_DETAIL_ROLE_DELETE_HUY = By.xpath("//button[@data-bb-handler='cancel']");
}
