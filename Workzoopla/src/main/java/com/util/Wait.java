package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
//	
	public void getExplicitWait(WebDriver driver, WebElement element) {
		WebDriverWait obj = new WebDriverWait(driver, 10);
		obj.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void getExplicitWait(WebDriver driver, By locator) {
			WebDriverWait obj = new WebDriverWait(driver,10);
			obj.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void getExplicitWaitVisible(WebDriver driver, By locator) {
		WebDriverWait obj = new WebDriverWait(driver, 20);
		obj.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void getExplicitWaitVisible(WebDriver driver, WebElement element) {
		WebDriverWait obj = new WebDriverWait(driver, 20);
		obj.until(ExpectedConditions.visibilityOf(element));

	}
}
