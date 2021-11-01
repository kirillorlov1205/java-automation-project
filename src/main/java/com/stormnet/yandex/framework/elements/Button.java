package com.stormnet.yandex.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends HtmlElement{

	public Button(WebDriver driver, By locator) {
		super(driver, locator);
	}

	public void click(){
		getElement().click();
	}
}
