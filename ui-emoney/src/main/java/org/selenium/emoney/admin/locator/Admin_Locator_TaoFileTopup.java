package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_TaoFileTopup extends UnitBase{
	
	public final By ADMIN_TAOFILETOPUP_CREATE_PROVINCE_LEVEL = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_TAOFILETOPUP_CREATE_DISTRICT_LEVEL = By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_TAOFILETOPUP_CREATE_BTN = By.xpath(".//*[@id='card_gen_task']//button[@type='submit']");
	
	public final By ADMIN_TAOFILETOPUP_CREATE_XEM_DANHSACH_BTN = By.xpath(".//*[@id='card_gen_task']//a[contains(@class,'btn-close')]");
	
	public final By ADMIN_TAOFILETOPUP_SEARCH_PROVINCE_LEVEL = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_TAOFILETOPUP_SEARCH_DISTRICT_LEVEL = By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_TAOFILETOPUP_SEARCH_BTN = By.xpath(".//*[@id='topup_gen_task']//button[@type='submit']");
	
	public final String ADMIN_TAOFILETOPUP_TOPUPINFO = ".//*[@id='main']//*[contains(text(),'$value1')]/..//*[contains(text(),'$value2')]";
	
	public final By ADMIN_TAOFILETOPUP_DANHSACH_YEUCAUTAOTOPUP_BTN = By.xpath(".//*[@id='main']//a[@href='/topup_gen/add/']");
}
