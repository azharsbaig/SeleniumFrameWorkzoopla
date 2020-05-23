package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);// Selenium dev added==>driver null value
	}

	@FindBy(xpath = "//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement acceptcookies;
	
	@FindBy(xpath = "//*[@class='button button--tertiary-dark account-link__text']")
	private WebElement signin;
		
	@FindBy(xpath = "//*[@id='signin_email']")
	private WebElement email;
		
	@FindBy(xpath = "//*[@name='signin_password']")
	private WebElement pass;
		
	@FindBy(xpath = "//*[@id='signin_submit']")
	private WebElement submit;

	public WebElement getacceptcookies() {
		return acceptcookies;
	}
	
	public WebElement signin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
