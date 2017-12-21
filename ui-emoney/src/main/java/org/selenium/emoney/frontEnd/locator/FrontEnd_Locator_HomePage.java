package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_HomePage extends UnitBase{

	public final By ELEMENT_HOMEPAGE_MENU_RUTTIEN=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'account/withdraw')]");
	public final By ELEMENT_RUTTIEN_SEARCH_FIELD=By.xpath(".//*[@id='query']");
	
	public final By ELEMENT_HOMEPAGE_MENU_THONGTINTAIKHOAN=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'account/search')]");
	public final By ELEMENT_TTTK_SEARCH_FIELD=By.xpath(".//*[@id='query']");
	
	public final By ELEMENT_HOMEPAGE_MENU_DANHSACHNGUOITHUHUONG=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'account/list')]");
	public final By ELEMENT_DSNTH_TIMKIEM_BTN=By.xpath(".//*[@class='btn btn-primary']");
	
	public final By ELEMENT_HOMEPAGE_MENU_QUANLYUYQUYEN=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'authorized')]");
	public final By ELEMENT_QLUQ_SEARCH_FIELD=By.xpath(".//*[@id='id_identification']");
	
	public final By ELEMENT_HOMEPAGE_MENU_QUANLYGIAODICH=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'txn_list')]");
	public final By ELEMENT_QLGD_TIMKIEM_BTN=By.xpath(".//*[@id='search-transaction']");
	
	public final By ELEMENT_HOMEPAGE_MENU_DIENSUVU=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'txn_approve_list')]");
	public final By ELEMENT_DIENSUVU_TRANGTHAI_DROPDOWN=By.xpath(".//*[@id='id_stt']");
	
	public final By ELEMENT_HOMEPAGE_MENU_BAOCAO=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'report')]");
	public final By ELEMENT_BAOCAO_CREATE_BTN=By.xpath(".//*[@id='submit']");
	
	public final By ELEMENT_HOMEPAGE_MENU_HOSONGUOIDUNG=By.xpath(".//*[@id='sidebar-menu']//a[contains(@href,'staff')]");
	public final By ELEMENT_HOSONGUOIDUNG_USERNAME=By.xpath(".//*[@id='id_username']");
	
}
