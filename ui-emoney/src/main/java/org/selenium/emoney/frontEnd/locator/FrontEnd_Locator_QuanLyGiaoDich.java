package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_QuanLyGiaoDich extends UnitBase{
	 
	 public By ELEMENT_QLGD_BUUCUC_CAP2_SPAN = By.xpath(".//*[@id='select2-id_m2-container']");
     
	 public By ELEMENT_QLGD_BUUCUC_CAP2_SELECTED = By.xpath(".//*[@id='id_m2']");
     
	 public By ELEMENT_QLGD_BUUCUC_CAP3_SPAN = By.xpath(".//*[@id='select2-id_m1-container']");
     
	 public By ELEMENT_QLGD_BUUCUC_CAP3_SELECTED = By.xpath(".//*[@id='id_m1']");
     
	 public By ELEMENT_QLGD_BUUCUC_CAP4_SPAN = By.xpath(".//*[@id='select2-id_m0-container']");
     
	 public By ELEMENT_QLGD_BUUCUC_CAP4_SELECTED = By.xpath(".//*[@id='id_m0']");
     
     public By ELEMENT_QLGD_DATE_TO_FIELD = By.xpath(".//*[@id='id_txnt']");
     
     public By ELEMENT_QLGD_DATE_FROM_FIELD = By.xpath(".//*[@id='id_txnf']");
     
     public By ELEMENT_QLGD_STATUS_FIELD = By.xpath(".//*[@id='id_stt']");
     
     public By ELEMENT_QLGD_TYPE_TRANSACTION_FIELD = By.xpath(".//*[@id='id_rc']");
     
     public By ELEMENT_QLGD_NAME_FIELD = By.xpath(".//*[@id='id_n']");
     
     public By ELEMENT_QLGD_GTTT_NUMBER_FIELD = By.xpath(".//*[@id='id_id']");
     
     public By ELEMENT_QLGD_VNP_NUMBER_FIELD = By.xpath(".//*[@id='id_tno']");
     
     public By ELEMENT_QLGD_GIAO_DICH_VIEN_FIELD = By.xpath(".//*[@id='id_ngd']");

     public String ELEMENT_QLGD_INFO = ".//*[@id='transaction-list']//*[text()='$info']";
     
     public By ELEMENT_QLGD_SEARCH_BTN = By.xpath(".//*[@id='search-transaction']");
     
     public String ELEMENT_QLGD_CANCEL_BTN = ".//*[@id='transaction-list']//*[text()='$info']/../..//*[contains(@href, '/cancel')]";
     
     public By ELEMENT_QLGD_SUBMIT_BTN = By.xpath(".//*[@id='btn-submit']");
}
