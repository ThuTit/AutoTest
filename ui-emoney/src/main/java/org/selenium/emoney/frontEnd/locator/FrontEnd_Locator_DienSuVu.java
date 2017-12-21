package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_DienSuVu extends UnitBase {
	
	public By ELEMENT_DSV_FROMDATE_CALENDAR_SHOW = By.xpath(".//*[@id='btnPickerFrom']/span");
	
	public By ELEMENT_DSV_DATE_MONTH_SHOW = By.xpath("//*[@class='datepicker-days']//*[@class='datepicker-switch']");
	
	public By ELEMENT_DSV_DATE_MONTH_PREV_BTN = By.xpath("//*[@class='datepicker-months']//*[@class='prev']");
	
	public By ELEMENT_DSV_DATE_MONTH_NEXT_BTN = By.xpath("//*[@class='datepicker-months']//*[@class='next']");
	
	public String ELEMENT_DSV_DATE_MONTH_VALUE = "//*[@class='datepicker-months']//*[contains(@class,'month')][text()='Th$month']";
	
	public By ELEMENT_DSV_DATE_YEAR_VALUE = By.xpath("//*[@class='datepicker-months']//*[@class='datepicker-switch']");
	
	public String ELEMENT_DSV_DATE_DAY = "//*[@class='datepicker-days']//*[contains(@class,'day')][text()='$day']";
	
	public By ELEMENT_DSV_TODATE_CALENDAR_SHOW = By.xpath(".//*[@id='btnPickerTo']/span");
	
	public By ELEMENT_DSV_FROMDATE_CALENDAR_FIELD = By.xpath(".//*[@id='id_txnf']");
	
	public By ELEMENT_DSV_TODATE_CALENDAR_FIELD = By.xpath(".//*[@id='id_txnt']");
	
	public By ELEMENT_DSV_STATUS_FIELD = By.xpath(".//*[@id='id_stt']");
	
	public By ELEMENT_DSV_SEARCH_BTN = By.xpath(".//*[@id='search-transaction']");
	
	public String ELEMENT_DSV_PENDING_TRANSACTION_INFO = ".//*[@id='transaction-list']//*[text()='$info']";
}
