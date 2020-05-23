package com.page.object.model;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {
	
	public PropertyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="//input[@id='search-input-location']")
	private WebElement locationName;
	@FindBy(xpath="//button[@id='search-submit']")
	private WebElement searchSubmit;
	@FindBy(xpath="//a[@class='listing-results-price text-price']")
	private List<WebElement> homePrices;
	@FindBy(xpath="//img[@class='js-lazy-loaded']")
	private WebElement propertyLogo;
	@FindBy(xpath="(//h4[@class='ui-agent__name'])[1]")
	private WebElement agentName;
	@FindBy(xpath="(//*[@class='ui-link'])[4]")
	private WebElement agentPhoneNum;
	@FindBy(xpath="//*[@id='header-account-panel__signed-in-link']")
	private WebElement myZooplaBtn;
	@FindBy(xpath="//span[contains(text(),'Sign out')]")
	private WebElement signOutBtn;
	
	public WebElement getLocationName() {
		return locationName;
	}
	public WebElement getSearchSubmit() {
		return searchSubmit;
	}
	public List<WebElement> getHomePrices() {
		return homePrices;
	}
	public WebElement getPropertyLogo() {
		return propertyLogo;
	}
	public WebElement getAgentName() {
		return agentName;
	}
	public WebElement getAgentPhoneNum() {
		return agentPhoneNum;
	}
	public WebElement getMyZooplaBtn() {
		return myZooplaBtn;
	}
	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	


}
