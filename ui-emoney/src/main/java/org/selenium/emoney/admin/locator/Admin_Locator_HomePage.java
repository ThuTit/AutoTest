package org.selenium.emoney.admin.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class Admin_Locator_HomePage extends UnitBase{

	//Header bar
	
	
	
	//Left Menu
	public final By ADMIN_LEFTMENU_QUANLYNGUOIDUNG=By.xpath(".//*[@id='sidebar-menu']//*[@href='/staff/list/']");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT=By.xpath(".//*[@id='sidebar-menu']//*[@href='javascript:;']");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOTAIKHOAN=By.xpath(".//*[@id='sidebar-menu']//*[@href='/batch/1/list']");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT_NAPTIEN=By.xpath(".//*[@id='sidebar-menu']//*[@href='/batch/3/list']");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT_UPLOADTHE=By.xpath(".//*[@id='sidebar-menu']//*[@href='/batch/2/list");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOTHE=By.xpath(".//*[@id='sidebar-menu']//*[@href='/card_gen/add/']");
	
	public final By ADMIN_LEFTMENU_THAOTACHANGLOAT_TAOPOPUPFILE=By.xpath(".//*[@id='sidebar-menu']//*[@href='/topup_gen/']");
	
	public final By ADMIN_LEFTMENU_QUANLYNHOMQUYEN=By.xpath(".//*[@id='sidebar-menu']//*[@href='/roles/']//i");
	
	//Title page
	public final By ADMIN_TAOTAIKHOAN_TITLE=By.xpath(".//*[@id='main']//*[contains(text(),'Tạo tài khoản hàng loạt')]");
	
	public final By ADMIN_NAPTIEN_TITLE=By.xpath(".//*[@id='main']//*[contains(text(),'Nạp tiền hàng loạt')]");
	
	public final By ADMIN_UPLOADTHE_TITLE=By.xpath(".//*[@id='main']//*[contains(text(),'Upload thẻ hàng loạt')]");
	
	public final By ADMIN_TAOTHE_TITLE=By.xpath(".//*[@id='main']//div[contains(text(),'Yêu cầu tạo thẻ')]");
	
	public final By ADMIN_TAOPOPUP_TITLE=By.xpath(".//*[@id='main']//*[contains(text(),'Danh sách yêu cầu tạo file topup')]");
	
	public final By ADMIN_QUANLYNGUOIDUNG_TAONGUOIDUNGMOI=By.xpath(".//*[@id='container']//*[@href='/staff/create/']");
	
	public final By ADMIN_QUANLYNHOMQUYEN_TAONHOMQUYEN_TBN=By.xpath("//*[@href='/roles/create/']");
}
