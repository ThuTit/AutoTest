package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_TaoTaiKhoan extends UnitBase {
	
	public final By ADMIN_TAOTAIKHOAN_FROMDATE_CALENDAR_SHOW_BTN = By.xpath(".//*[@id='btnListFrom']/span");
	
	public final By ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_SHOW = By.xpath("//*[@class='datepicker-days']//*[@class='datepicker-switch']");
	
	public final By ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_PREV_BTN = By.xpath("//*[@class='datepicker-months']//*[@class='prev']");
	
	public final By ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_NEXT_BTN = By.xpath("//*[@class='datepicker-months']//*[@class='next']");
	
	public final By ADMIN_TAOTAIKHOAN_CALENDAR_DATE_YEAR_VALUE = By.xpath("//*[@class='datepicker-months']//*[@class='datepicker-switch']");
	
	public final String ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_VALUE = "//*[@class='datepicker-months']//*[@class='month'][text()='Th$numb']";
	
	public final String ADMIN_TAOTAIKHOAN_CALENDAR_DATE_DAY = "//*[@class='datepicker-days']//*[@class='day'][text()='$day']";
	
	public final By ADMIN_TAOTAIKHOAN_CALENDAR_TODATE_CALENDAR_SHOW = By.xpath(".//*[@id='btnListTo']/span");
	
	public final By ADMIN_TAOTAIKHOAN_SEARCH_BTN = By.xpath(".//*[@id='id_form']//button[@type='submit']");

}
