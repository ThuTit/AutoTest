package org.selenium.emoney.common;

import org.selenium.common.UnitBase;

public class Emoney_Configuration extends UnitBase {
	
	
	public String USER_ADMIN = "qcteam";
	public String USER_PASS = "QC123456";
	public String USER_ADMIN_NAME = "team qc";
	public String EMAIL_ROOT = "qcteamteko@gmail.com";
	public final String EMAIL_ROOT_PASS = "QC12345678";
	public String EMAIL_TEST = "qcteamved@gmail.com";
	public final String EMAIL_TEST_PASS = "cod@123456";
	
	//Nhân viên bưu cục cấp tổng
	public  String USER_STAFF_01 = "staff01";
	public  String USER_STAFF_01_NAME = "qc 01 tester";
	
	//Nhân viên bưu cục cấp tỉnh
	public  String USER_STAFF_02 = "staff02";
	public  String USER_STAFF_02_NAME = "qc 02 tester";
	//Nhân viên bưu cục cấp huyện
	public  String USER_STAFF_03 = "staff03";
	public  String USER_STAFF_03_NAME = "qc 03 tester";
	
	//Nhân viên bưu cục cấp bưu cục
	public  String USER_STAFF_04 = "staff04";
	public  String USER_STAFF_04_NAME = "qc 04 tester";
	
	//Attached file path
	public String attachmentFilePath;
	public String userDataFilePath;
	
	//Permission list file path
	public String permissionListFilePath;
	public String typeGDListFilePath;
	public String statusGDListFilePath;
	public String messageListFilePath;

	
	/*========System Property====================*/
	public String jdbcDriver;
	public String dbUrl;
	public String user;
	public String pass;
	public String sqlQuery;
	public String baseAdmin_Url="http://test-admin-em.teko.vn/login/?next=/";
	
	/*========Default System Property=============*/
	public final String DEFAULT_JDBCDRIVER="com.mysql.jdbc.Driver";
	public final String DEFAULT_DBURL="jdbc:mysql://125.212.198.107/vnpost_test";
	public final String DEFAULT_USERDB="quynh-qa";
	public final String DEFAULT_PASSDB="abc@123?";
	
	public final String DEFAULT_USERFILEURL="DataDriven/" + "user.xls";
	public final String DEFAULT_ATTACHEDFILEURL="DataDriven/" + "attachedFileList.xls";
	public final String DEFAULT_PERMISSIONLISTURL="DataDriven/" + "listQuyen.xls";
	public final String DEFAULT_TYPEGIAODICHLISTURL="DataDriven/"+"LoaiGiaoDich.xls";
	public final String DEFAULT_STATUSGIAODICHLISTURL="DataDriven/"+"TrangThaiGiaoDich.xls";
	public final String DEFAULT_MESSAGE_URL="DataDriven/"+"Message.xls";
	
	
	/**
	 * Get System Property
	 */
	public void getSystemProperty(){

		defaultSheet = System.getProperty("defaultSheet");
		userDataFilePath = System.getProperty("userDataFilePath");
		attachmentFilePath =System.getProperty("attachmentFilePath");
		permissionListFilePath = System.getProperty("permissionListFilePath");
		messageListFilePath = System.getProperty("messageListFilePath");
		typeGDListFilePath = System.getProperty("typeGDListFilePath");
		statusGDListFilePath = System.getProperty("statusGDListFilePath");
		
		if (jdbcDriver==null) jdbcDriver=DEFAULT_JDBCDRIVER;
		if (dbUrl==null) dbUrl=DEFAULT_DBURL;
		if (user==null) user=DEFAULT_USERDB;
		if (pass==null) pass=DEFAULT_PASSDB;
		
		
		if (userDataFilePath==null) userDataFilePath = DEFAULT_USERFILEURL;
		if (attachmentFilePath==null) attachmentFilePath = DEFAULT_ATTACHEDFILEURL;
		
		if (permissionListFilePath==null) permissionListFilePath = DEFAULT_PERMISSIONLISTURL;
		if (typeGDListFilePath==null)    typeGDListFilePath=DEFAULT_TYPEGIAODICHLISTURL;
		if (statusGDListFilePath==null)  statusGDListFilePath = DEFAULT_STATUSGIAODICHLISTURL;
		if (messageListFilePath==null)    messageListFilePath=DEFAULT_MESSAGE_URL;
		
		
		userDataFilePath = getAbsoluteFilePath(userDataFilePath);
		attachmentFilePath = getAbsoluteFilePath(attachmentFilePath);
		permissionListFilePath = getAbsoluteFilePath(permissionListFilePath);
		typeGDListFilePath= getAbsoluteFilePath(typeGDListFilePath);
		statusGDListFilePath= getAbsoluteFilePath(statusGDListFilePath);
	    messageListFilePath = getAbsoluteFilePath(messageListFilePath);
	}
}
