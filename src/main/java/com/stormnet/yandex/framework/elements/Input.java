package com.stormnet.yandex.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends HtmlElement {
	public Input(WebDriver driver, By locator) {
		super(driver, locator);
	}

	public void sendKeys(String string) {
		getElement().clear();
		getElement().sendKeys(string);
	}
}
