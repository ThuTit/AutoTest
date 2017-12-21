package com.selenium.warehouse.common;

import org.selenium.common.UnitBase;

public class Configuration extends UnitBase {
	
	/*========System Property====================*/
	public String jdbcDriver;
	public String dbUrl;
	public String user;
	public String pass;
	public String sqlQuery;
	
	/*========Default System Property=============*/
	public final String DEFAULT_JDBCDRIVER="com.mysql.jdbc.Driver";
	public final String DEFAULT_DBURL="jdbc:mysql://125.212.198.107/vnpost_test";
	public final String DEFAULT_USERDB="quynh-qa";
	public final String DEFAULT_PASSDB="abc@123?";
	
	
	/**
	 * Get System Property
	 */
	public void getSystemProperty(){
		if (jdbcDriver==null) jdbcDriver=DEFAULT_JDBCDRIVER;
		if (dbUrl==null) dbUrl=DEFAULT_DBURL;
		if (user==null) user=DEFAULT_USERDB;
		if (pass==null) pass=DEFAULT_PASSDB;
	}
}
