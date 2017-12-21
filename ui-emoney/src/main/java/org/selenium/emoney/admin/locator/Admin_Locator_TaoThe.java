package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_TaoThe extends UnitBase {
	
	public final By ADMIN_TAOTHE_DONVIPHATHANH = By.xpath(".//*[@id='id_publisher_id']");
	
	public final By ADMIN_TAOTHE_PROVINCE_LEVEL = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_TAOTHE_DISTRICT_LEVEL = By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_TAOTHE_LOAI_THE = By.xpath(".//*[@id='id_card_type']");
	
	public final By ADMIN_TAOTHE_SOLUONG_THE = By.xpath(".//*[@id='id_quality']");
	
	public final By ADMIN_TAOTHE_CREATE_CARD_BTN = By.xpath(".//*[@id='card_gen_task']//button[@type='submit']");
	
	public final By ADMIN_TAOTHE_XEM_DANHSACH_YEUCAU_BTN = By.xpath(".//*[@id='card_gen_task']//*[contains(@class,'close')]");
	
	public final By ADMIN_TAOTHE_SEARCH_PROVINCE_LEVEL = By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ADMIN_TAOTHE_SEARCH_DISTRICT_LEVEL = By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ADMIN_TAOTHE_SEARCH_LOAI_THE = By.xpath(".//*[@id='id_card_type']");
	
	public final By ADMIN_TAOTHE_SEARCH_BTN = By.xpath(".//*[@id='card_gen_task']//button[@type='submit']");
	
	public final String ADMIN_TAOTHE_CARD_INFO = ".//*[@id='main']//*[contains(text(),'$value1')]/..//*[contains(text(),'$value2')]";
	
	public final By ADMIN_TAOTHE_DANHSACHYEUCAU_YEUCAUTAOTHE_BTN = By.xpath(".//*[@id='main']//a[@href='/card_gen/add/']");

}
