package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_DanhSachNguoiThuHuong extends UnitBase{
    
	public By ELEMENT_DSTH_BUUCUC_CAP2_SPAN = By.xpath(".//*[@id='select2-id_m2-container']");
	
	public By ELEMENT_DSTH_BUUCUC_CAP2_SELECTED = By.xpath(".//*[@id='id_m2']");
	
	public By ELEMENT_DSTH_BUUCUC_CAP3_SPAN = By.xpath(".//*[@id='select2-id_m1-container']");
	
	public By ELEMENT_DSTH_BUUCUC_CAP3_SELECTED = By.xpath(".//*[@id='id_m1']");
	
	public By ELEMENT_DSTH_BUUCUC_CAP4_SPAN = By.xpath(".//*[@id='select2-id_m0-container']");
	
	public By ELEMENT_DSTH_BUUCUC_CAP4_SELECTED = By.xpath(".//*[@id='id_m0']");
	
	public By ELEMENT_DSTH_STATUS_SPAN = By.xpath(".//*[@id='select2-id_s-container']");
	
	public By ELEMENT_DSTH_STATUS_SELECTED = By.xpath(".//*[@id='id_s']");
	
	public By ELEMENT_DSTH_NAME_FIELD 	= By.xpath(".//*[@id='id_n']");
	
	public By ELEMENT_DSTH_GTTT_NUMBER_FIELD = By.xpath(".//*[@id='id_i']");
	
	public By ELEMENT_DSTH_EMONEY_ID_FIELD = By.xpath(".//*[@id='id_e']");
	
	public By ELEMENT_DSTH_DATE_FIELD = By.xpath(".//*[@id='id_cd']");
	
	public By ELEMENT_DSTH_SEARCH_BTN = By.xpath(".//*[@id='main']//button[contains(@class, 'btn')]");
	
	public String ELEMENT_DSTH_CARD_INFO = ".//*[@id='main']//*[contains(text(),'$idCard')]";
	
	public String ELEMENT_DSTH_ACCOUNT_INFO  = ".//*[@id='main']//*[contains(text(),'$idCard')]/..//*[contains(text(),'$info')]";
}
