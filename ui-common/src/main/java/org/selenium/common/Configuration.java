package org.selenium.common;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.selenium.common.Utils;

import static org.selenium.common.TestLogger.info;

public class Configuration {
	protected static Scanner scanner;
	public static WebDriver driver;
	public WebDriver newDriver;
	public boolean isDriver = true;
	public String USER_ADMIN_NAME = "team qc";
	public String USER_ROOT = "qcteamteko@gmail.com";
	public final String USER_PASS = "QC12345678";
	
	public String TESTER_01 = "qcteam100@gmail.com";
	public String TESTER_NAME_01 = "tester01";
	public String TESTER_02 = "qcteam200@gmail.com";
	public String TESTER_NAME_02 = "tester02";
	public String TESTER_03 = "qcteam300@gmail.com";
	public String TESTER_NAME_03 = "tester03";

	protected int DEFAULT_TIMEOUT = 30000; //milliseconds = 30 seconds
	protected int WAIT_INTERVAL = 1000; //milliseconds  
	public int loopCount = 0;	
	protected boolean ieFlag;	 
	protected boolean chromeFlag;
	
	public final int ACTION_REPEAT = 5;
	public static boolean firstTimeLogin = false;
	public Actions action;

	//Driver path
	public String ieDriver=getAbsoluteFilePath("Drivers\\win\\IEDriverServer.exe");
	public String chromeDriver= getAbsoluteFilePath("Drivers\\win\\chromedriver.exe");
	public String chromeDriverUbuntu= getAbsoluteFilePath("Drivers\\ubuntu\\chromedriver");
	public String chromeDriverMac= getAbsoluteFilePath("Drivers\\mac\\chromedriver");
	
	//Enter your Test Project Name here 
	public static String testProject;
	public final String DEFAULT_TESTPROJECT="WarehouseProject";
		 
	//Enter your Test Plan here
	public static String testPlan;
	public final String DEFAULT_TESTPLAN="TestPlan1";
		 
    //Enter your Test build here
	public static String testBuild;
	public final String DEFAULT_TESTBUILD="Build1";
	
	public static String testCaseID="";

	
	/*========System Property====================*/
	public static String baseUrl;
	public static String browser;
	public static String server;

	protected Boolean isRandom;
	protected Boolean isUseFile;
	protected String nativeEvent;

	protected String defaultSheet;
	
	/*========Default System Property=============*/
	public final String DEFAULT_NATIVE_EVENT = "true";
	public final String DEFAULT_BASEURL="http://test.supplier.teko.vn";
	//public final String DEFAULT_BASEURL="http://test-counter-em.teko.vn/login/?next=/";
	//public final String DEFAULT_BASEURL="http://test-admin-em.teko.vn/";
	public final String DEFAULT_BROWSER="chrome";//iexplorer, firefox, chrome
	public final String DEFAULT_SERVER="win"; //win, ubuntu

	public final  Boolean DEFAULT_ISRANDOM = true;
	public final  Boolean DEFAULT_ISUSEFILE = true;
	
	public final String DEFAULT_SHEET="sheet1";
	
	//Enter your project API key here. 
	public static String devKey; 
	public final String DEFAULT_DEVKEY="0b7979cdb7e1cab802a2587458012ab0";
			  
	//Enter your Test Link URL here
	public static String testLinkURL;
	public final String DEFAULT_TESTLINKURL="http://testlink.teko.vn/lib/api/xmlrpc/v1/xmlrpc.php";
	
	/**
	 * Get System Property
	 */
	public void getSystemProperty(){
		nativeEvent = System.getProperty("nativeEvent");
		browser = System.getProperty("browser");
		server = System.getProperty("server");
		baseUrl = System.getProperty("baseUrl");
		devKey=System.getProperty("devKey");
		testLinkURL=System.getProperty("testLinkURL");
		testProject=System.getProperty("testProject");
		testPlan=System.getProperty("testPlan");
		testBuild=System.getProperty("testBuild");
		
		defaultSheet = System.getProperty("defaultSheet");
		
		if (nativeEvent==null) nativeEvent = DEFAULT_NATIVE_EVENT;
		if (browser==null) browser = DEFAULT_BROWSER;
		if (baseUrl==null) baseUrl = DEFAULT_BASEURL;
		if (server==null) server = DEFAULT_SERVER;

		if (isRandom==null) isRandom = DEFAULT_ISRANDOM;
		if (isUseFile==null) isUseFile = DEFAULT_ISUSEFILE;
		if (defaultSheet==null) defaultSheet = DEFAULT_SHEET;
		
		if (devKey==null)devKey=DEFAULT_DEVKEY;
		if (testLinkURL==null)testLinkURL=DEFAULT_TESTLINKURL;
		if (testProject==null)testProject=DEFAULT_TESTPROJECT;
		if (testPlan==null)testPlan=DEFAULT_TESTPLAN;
		if (testBuild==null)testBuild=DEFAULT_TESTBUILD;
	}
	
	/**
	 * Init Chrome driver
	 */
	public ChromeDriver initChromeDriver(){
		info("Init chrome driver");
		//getSystemProperty();
		String pathFile="";
		String fs = File.separator;
		String temp=System.getProperty("user.dir") + "/src/test/resources/TestData/TestOutput";;
		pathFile=temp.replace("/", fs).replace("\\", fs);

		if(server.contains("ubuntu"))
			System.setProperty("webdriver.chrome.driver",chromeDriverUbuntu) ;
		if(server.contains("win"))
			System.setProperty("webdriver.chrome.driver",chromeDriver) ;
		if(server.contains("mac"))
			System.setProperty("webdriver.chrome.driver",chromeDriverMac) ;
		
		// Add the WebDriver proxy capability.
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String[] switches = {"start-maximized","remote-debugging-port=9222"};
		capabilities.setCapability("chrome.switches", switches);
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", pathFile);
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		return new ChromeDriver(capabilities);
	}
	
	/**
	 * Init IE driver
	 */
	public WebDriver initIEDriver(){
		info("Init IE driver");
		System.setProperty("webdriver.ie.driver",ieDriver) ;
		DesiredCapabilities  capabilitiesIE = DesiredCapabilities.internetExplorer();
		capabilitiesIE.setCapability("ignoreProtectedModeSettings", true);
		if ("true".equals(nativeEvent)){
			info("Set nativeEvent is TRUE");
			capabilitiesIE.setCapability("nativeEvents", true);
		}
		else{
			info("Set nativeEvent is FALSE");
			capabilitiesIE.setCapability("nativeEvents", false);
		}
		capabilitiesIE.setCapability("javascriptEnabled", true);
		capabilitiesIE.setCapability("requireWindowFocus", true);
		capabilitiesIE.setCapability("enablePersistentHover", false);
		capabilitiesIE.setCapability("ignoreZoomSetting", true);
		capabilitiesIE.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilitiesIE.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
		capabilitiesIE.setCapability("initialBrowserUrl", baseUrl);
		return new InternetExplorerDriver(capabilitiesIE);
	}

	/**
	 * 
	 * Init FF driver
	 */
	public WebDriver initFFDriver(){
		String pathFile="";
		if ("win".equals(server)){
			pathFile = System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\TestOutput";
		}
		else{
			pathFile = System.getProperty("user.dir") + "/src/main/resources/TestData/TestOutput";
		}
		info("Init FF driver");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("plugins.hide_infobar_for_missing_plugin", true);
		profile.setPreference("dom.max_script_run_time", 0);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		info("Save file to " + pathFile);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", pathFile);
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/x-xpinstall;" +
				"application/x-zip;application/x-zip-compressed;application/x-winzip;application/zip;" +
				"gzip/document;multipart/x-zip;application/x-gunzip;application/x-gzip;application/x-gzip-compressed;" +
				"application/x-bzip;application/gzipped;application/gzip-compressed;application/gzip" +
				"application/octet-stream" +
				";application/pdf;application/msword;text/plain;" +
				"application/octet;text/calendar;text/x-vcalendar;text/Calendar;" +
				"text/x-vCalendar;image/jpeg;image/jpg;image/jp_;application/jpg;" +
				"application/x-jpg;image/pjpeg;image/pipeg;image/vnd.swiftview-jpeg;image/x-xbitmap;image/png;application/xml;text/xml;text/icalendar;");

		profile.setPreference("plugin.disable_full_page_plugin_for_types", "application/pdf");
		profile.setPreference("pref.downloads.disable_button.edit_actions", true);
		profile.setPreference("pdfjs.disabled", true); 
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		return new FirefoxDriver(profile);
	}
	/**
	 * Select a browser's type to execute testing
	 * @param opParams
	 */
	public void initSeleniumTestWithSelectedBrowser(Object... opParams){
		getSystemProperty();
		if("chrome".equals(browser)){
			info("Open Chrome browser");
			driver = initChromeDriver();
			chromeFlag = true;
		} else if ("iexplorer".equals(browser)){
			driver = initIEDriver();
			ieFlag = true;
		} else {
			driver = initFFDriver();
		}
		action = new Actions(driver);
	}
	/**
	 * Get start testing
	 * @param opParams
	 */
	public void initSeleniumTest(Object... opParams){
		initSeleniumTestWithSelectedBrowser();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get(baseUrl);
		Utils.pause(3000);   
	}

	/**
	 * init newDriver
	 */
	public void initNewDriver(){
		getSystemProperty();
		if("chrome".equals(browser)){
			newDriver = initChromeDriver();
		} else if ("iexplorer".equals(browser)){
			newDriver = initIEDriver();
			ieFlag = true;
		} else {
			newDriver = initFFDriver();
		}
		newDriver.manage().window().maximize();
	}
	/**
	 * Start new driver without cache
	 */
	public void startNewDriver(){
		getSystemProperty();
		if("chrome".equals(browser)){
			newDriver = new ChromeDriver();
		} else if ("iexplorer".equals(browser)){
			newDriver = new InternetExplorerDriver();
			ieFlag = true;
		} else {
			newDriver = new FirefoxDriver();
		}
		newDriver.manage().window().maximize();
		newDriver.navigate().refresh();
		newDriver.navigate().to(baseUrl);
	}
	
	/**
	 * initNewIEBrowserWithNativeEvent
	 */
	public void initNewIEBrowserWithNativeEvent(){
		info("initNewIEBrowserWithNativeEvent");
		System.setProperty("webdriver.ie.driver",ieDriver) ;
		DesiredCapabilities  capabilitiesIE = DesiredCapabilities.internetExplorer();
		capabilitiesIE.setCapability("ignoreProtectedModeSettings", true);
		capabilitiesIE.setCapability("nativeEvents", true);
		capabilitiesIE.setCapability("ignoreZoomSetting", true);
		capabilitiesIE.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilitiesIE.setCapability("initialBrowserUrl", baseUrl);
		newDriver = new InternetExplorerDriver(capabilitiesIE);
	}

	/**
	 * This function returns a absolute path from a relative path
	 * @param relativeFilePath
	 * @return string
	 */
	public String getAbsoluteFilePath(String relativeFilePath){
		String fs = File.separator;
		String curDir = System.getProperty("user.dir");
		String absolutePath = curDir + relativeFilePath;
		absolutePath=absolutePath.replace("/", fs).replace("\\", fs);
		info("absolutePath:"+absolutePath);
		return absolutePath;
	}
}
