package org.selenium.emoney.admin.common;

import static org.selenium.common.TestLogger.info;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.admin.locator.Admin_Locator_TaoTaiKhoan;

import testlink.api.java.client.TestLinkAPIException;

public class Admin_TaoTaiKhoan extends Admin_Locator_TaoTaiKhoan{
	
	public Admin_TaoTaiKhoan(WebDriver dr){
		driver = dr;
	}
	/**
	 * Click vào nút Tìm kiếm
	 * @throws TestLinkAPIException
	 */
	public void search_btn() throws TestLinkAPIException{
		info("Click vào nút search");
		click(ADMIN_TAOTAIKHOAN_SEARCH_BTN);
		Utils.pause(100);
	}
	
	/**
	 * Chọn from date
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @throws TestLinkAPIException
	 */
	public void inputDateFrom(String year, String month, String day)
			throws TestLinkAPIException {
		String currentYear = getCurrentDate("yyyy");

		info("Mở calendar popup");
		click(ADMIN_TAOTAIKHOAN_FROMDATE_CALENDAR_SHOW_BTN);

		info("Hiển thị 12 tháng và năm");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_SHOW);

		while (!year.equals(currentYear)) {
			if (Integer.parseInt(year) < Integer.parseInt(currentYear)) {
				info("Click vào nút previous");
				click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_PREV_BTN);
			} else {
				info("Click vào nút next");
				click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_NEXT_BTN);
			}

			String prevYear = waitForAndGetElement(
					ADMIN_TAOTAIKHOAN_CALENDAR_DATE_YEAR_VALUE).getText();
			if (prevYear.equals(year))
				break;
		}

		info("Chọn tháng");
		if (Integer.parseInt(month) < 10)
			month.replace("0", "");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_VALUE.replace("$numb", month));

		info("Chọn ngày");
		if (Integer.parseInt(day) < 10)
			day.replace("0", "");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_DAY.replace("$day", day));
	}

	/**
	 * Chọn from date
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @throws TestLinkAPIException
	 */
	public void inputDateTo(String year, String month, String day)
			throws TestLinkAPIException {
		String currentYear = getCurrentDate("yyyy");

		info("Mở calendar popup");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_TODATE_CALENDAR_SHOW);

		info("Hiển thị 12 tháng và năm");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_SHOW);

		while (!year.equals(currentYear)) {
			if (Integer.parseInt(year) < Integer.parseInt(currentYear)) {
				info("Click vào nút previous");
				click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_PREV_BTN);
			} else {
				info("Click vào nút next");
				click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_NEXT_BTN);
			}

			String prevYear = waitForAndGetElement(
					ADMIN_TAOTAIKHOAN_CALENDAR_DATE_YEAR_VALUE).getText();
			if (prevYear.equals(year))
				break;
		}

		info("Chọn tháng");
		if (Integer.parseInt(month) < 10)
			month.replace("0", "");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_MONTH_VALUE.replace("$numb", month));

		info("Chọn ngày");
		if (Integer.parseInt(day) < 10)
			day.replace("0", "");
		click(ADMIN_TAOTAIKHOAN_CALENDAR_DATE_DAY.replace("$day", day));
	}

}
