package org.selenium.emoney.frontEnd.locator;

import org.openqa.selenium.By;
import org.selenium.common.UnitBase;

public class FrontEnd_Locator_RutTien extends UnitBase{
	
	public By ELEMENT_RT_SEARCH_FIELD = By.xpath(".//*[@id='query']");
	
	public By ELEMENT_RT_SEARCH_BTN = By.xpath(".//*[@id='form-search']/div[1]/button[contains(@class, 'ttsearch')]");
	
	public String ELEMENT_RT_FULLNAME_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_BIRTHDAY_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_ADDRESS_FIELD =  ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_GTTT_NUMBER_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_SOCIAL_INSURANCE_NUMBER_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_PAGE_NUMBER_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_LINE_NUMBER_FIELD = ".//*[@id='account_holder_information']//*[text() = '$info']";
	
	public String ELEMENT_RT_EMONEY_BALANCE_FIELD = ".//*[@id='withdraw_amount' and @value = '$info']";
	
	public By ELEMENT_RT_WITHDRAW_BTN = By.xpath(".//*[@id='btn-withdraw']");
	
	public String ELEMENT_RT_MESSAGE = ".//*[@id='main']//*[text()='$info']"; 
}
