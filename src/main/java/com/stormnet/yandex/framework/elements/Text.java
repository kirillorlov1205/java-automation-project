package com.stormnet.yandex.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Text extends HtmlElement {

	public Text(WebDriver driver, By locator) {
		super(driver, locator);
	}
}
