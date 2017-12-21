package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_BaoCao extends UnitBase{
	
	public final By ELEMENT_BAOCAO_BAOCAO=By.xpath(".//*[@id='id_type_id']");
	
	public final By ELEMENT_BAOCAO_LOAI=By.xpath(".//*[@id='id_small_type']");
	
	public final By ELEMENT_BAOCAO_DICHVU=By.xpath(".//*[@id='id_services']");
	
	public final By ELEMENT_BAOCAO_NGHIEPVU=By.xpath(".//*[@id='id_services_business']");
	
	public final By ELEMENT_BAOCAO_LOAIGD=By.xpath(".//*[@id='id_transaction_type']");
	
	public final By ELEMENT_BAOCAO_TONGCONGTY=By.xpath(".//*[@id='id_member_store_3g_id']");
	
	public final By ELEMENT_BAOCAO_TINH=By.xpath(".//*[@id='id_member_store_2g_id']");
	
	public final By ELEMENT_BAOCAO_HUYEN=By.xpath(".//*[@id='id_member_store_g_id']");
	
	public final By ELEMENT_BAOCAO_BUUCUC=By.xpath(".//*[@id='id_member_store_id']");
	
	
	public final By ELEMENT_BAOCAO_THOIGIANBATDAU=By.xpath(".//*[@id='id_from_date']");
	
	public final By ELEMENT_BAOCAO_FROMDATE_CALENDAR_SHOW_BTN=By.xpath(".//*[@for='id_from_date']//*[contains(@class,'open-datetimepicker')]");
	
	public final By ELEMENT_BAOCAO_THOIGIANKETTHUC=By.xpath(".//*[@id='id_to_date']");
	
	public final By ELEMENT_BAOCAO_CALENDAR_TODATE_CALENDAR_SHOW=By.xpath(".//*[@for='id_to_date']//*[contains(@class,'open-datetimepicker')]");
	
	public final By ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_SHOW=By.xpath("//*[@class='datepicker-days']//*[@class='datepicker-switch']");
	
	public final By ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_PREV_BTN=By.xpath("//*[@class='datepicker-months']//*[@class='prev']");
	
	public final By ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_NEXT_BTN=By.xpath("//*[@class='datepicker-months']//*[@class='next']");
	
	public final By ELEMENT_BAOCAO_CALENDAR_DATE_YEAR_VALUE=By.xpath("//*[@class='datepicker-months']//*[@class='datepicker-switch']");
	
	public final String ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_VALUE="//*[@class='datepicker-months']//*[@class='month'][text()='Th$numb']";
	
	public final String ELEMENT_BAOCAO_CALENDAR_DATE_DAY="//*[@class='datepicker-days']//*[@class='day'][text()='$day']";
	
	
	public final By ELEMENT_BAOCAO_TAO_BTN=By.xpath(".//*[@id='submit']");
	
	public final By ELEMENT_BAOCAO_XEM_BTN=By.xpath(".//*[@id='display']");
	
	public final By ELEMENT_BAOCAO_DANHSACH_BTN=By.xpath(".//*[@id='mws-validate']//*[@href='/report/list']");
	
}
