package com.stormnet.yandex.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HtmlElement {
	protected WebDriver driver;
	protected By locator;

	public HtmlElement(WebDriver driver, By locator) {
		this.driver = driver;
		this.locator = locator;
	}

	public WebElement getElement() {
		return driver.findElement(locator);
	}

	public By getLocator() {
		return locator;
	}

	public boolean isDisplayed() {
		return this.getElement().isDisplayed();
	}


}
