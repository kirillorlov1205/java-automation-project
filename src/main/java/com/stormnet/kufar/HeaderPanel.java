package com.stormnet.kufar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPanel {
	private static final By OPEN_LOGIN_FORM_BUTTON_LOCATOR = By.xpath("//div[@data-name=\"login_button\"]/button");
	private final WebDriver driver;

	public HeaderPanel(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOpenLoginForm(){
		return driver.findElement(OPEN_LOGIN_FORM_BUTTON_LOCATOR);
	}
}
