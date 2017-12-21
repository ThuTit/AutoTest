package org.selenium.emoney.frontEnd.common;

import org.openqa.selenium.WebDriver;
import org.selenium.common.Utils;
import org.selenium.emoney.frontEnd.locator.FrontEnd_Locator_BaoCao;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;

public class FrontEnd_BaoCao extends FrontEnd_Locator_BaoCao {

	public FrontEnd_BaoCao(WebDriver dr) {
		driver = dr;
	}

	/**
	 * Chọn tên báo cáo
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputName(String info) throws TestLinkAPIException {
		info("Chọn tên báo cáo");
		if (info != "") {
			select(ELEMENT_BAOCAO_BAOCAO, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn loại báo cáo
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputType(String info) throws TestLinkAPIException {
		info("Chọn loại báo cáo");
		if (info != "") {
			select(ELEMENT_BAOCAO_LOAI, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn dịch vụ
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputService(String info) throws TestLinkAPIException {
		info("Chọn dịch vụ");
		if (info != "") {
			select(ELEMENT_BAOCAO_DICHVU, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn nghiệp vụ
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputServiceBusiness(String info) throws TestLinkAPIException {
		info("Chọn nghiệp vụ");
		if (info != "") {
			select(ELEMENT_BAOCAO_NGHIEPVU, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn loại giao dịch
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputTransactionType(String info) throws TestLinkAPIException {
		info("Chọn loại giao dịch");
		if (info != "") {
			select(ELEMENT_BAOCAO_LOAIGD, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn Tỉnh
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputProvince(String info) throws TestLinkAPIException {
		info("Chọn tỉnh");
		if (info != "") {
			select(ELEMENT_BAOCAO_TINH, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn Huyện
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputDistrict(String info) throws TestLinkAPIException {
		info("Chọn huyện");
		if (info != "") {
			select(ELEMENT_BAOCAO_HUYEN, info, 2);
		}
		Utils.pause(100);
	}

	/**
	 * Chọn bưu cục
	 * 
	 * @param info
	 * @throws TestLinkAPIException
	 */
	public void inputCommune(String info) throws TestLinkAPIException {
		info("Chọn bưu cục");
		if (info != "") {
			select(ELEMENT_BAOCAO_BUUCUC, info, 2);
		}
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
		click(ELEMENT_BAOCAO_FROMDATE_CALENDAR_SHOW_BTN);

		info("Hiển thị 12 tháng và năm");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_SHOW);

		while (!year.equals(currentYear)) {
			if (Integer.parseInt(year) < Integer.parseInt(currentYear)) {
				info("Click vào nút previous");
				click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_PREV_BTN);
			} else {
				info("Click vào nút next");
				click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_NEXT_BTN);
			}

			String prevYear = waitForAndGetElement(
					ELEMENT_BAOCAO_CALENDAR_DATE_YEAR_VALUE).getText();
			if (prevYear.equals(year))
				break;
		}

		info("Chọn tháng");
		if (Integer.parseInt(month) < 10)
			month.replace("0", "");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_VALUE.replace("$numb", month));

		info("Chọn ngày");
		if (Integer.parseInt(day) < 10)
			day.replace("0", "");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_DAY.replace("$day", day));
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
		click(ELEMENT_BAOCAO_CALENDAR_TODATE_CALENDAR_SHOW);

		info("Hiển thị 12 tháng và năm");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_SHOW);

		while (!year.equals(currentYear)) {
			if (Integer.parseInt(year) < Integer.parseInt(currentYear)) {
				info("Click vào nút previous");
				click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_PREV_BTN);
			} else {
				info("Click vào nút next");
				click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_NEXT_BTN);
			}

			String prevYear = waitForAndGetElement(
					ELEMENT_BAOCAO_CALENDAR_DATE_YEAR_VALUE).getText();
			if (prevYear.equals(year))
				break;
		}

		info("Chọn tháng");
		if (Integer.parseInt(month) < 10)
			month.replace("0", "");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_MONTH_VALUE.replace("$numb", month));

		info("Chọn ngày");
		if (Integer.parseInt(day) < 10)
			day.replace("0", "");
		click(ELEMENT_BAOCAO_CALENDAR_DATE_DAY.replace("$day", day));
	}

	/**
	 * Tạo báo cáo
	 * 
	 * @throws TestLinkAPIException
	 */
	public void createReport() throws TestLinkAPIException {
		info("Click vào nút Tạo báo cáo");
		click(ELEMENT_BAOCAO_TAO_BTN);
		Utils.pause(100);
	}

	/**
	 * Xem báo cáo
	 * 
	 * @throws TestLinkAPIException
	 */
	public void viewReport() throws TestLinkAPIException {
		info("Click vào nút Xem báo cáo");
		click(ELEMENT_BAOCAO_XEM_BTN);
		Utils.pause(100);
	}

	/**
	 * Xem danh sách báo cáo
	 * 
	 * @throws TestLinkAPIException
	 */
	public void viewListReport() throws TestLinkAPIException {
		info("Xem danh sách báo cáo");
		click(ELEMENT_BAOCAO_XEM_BTN);
		Utils.pause(100);
	}
}
