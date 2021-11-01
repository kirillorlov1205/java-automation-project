package com.stormnet.yandex.wrappers.loginPageWrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageWrapper {
	private static final By USER_ID_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By LOGIN_SUBMIT_FIELD_LOCATOR = By.id("passp:sign-in");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By LOGIN_SUBMIT_BUTTON = By.id("passp:sign-in");

	private final WebDriver driver;

	public LoginPageWrapper(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserIdFieldLocator() {
		return driver.findElement(USER_ID_FIELD_LOCATOR);
	}

	public WebElement getLoginSubmitButtonFirst() {
		return driver.findElement(USER_ID_FIELD_LOCATOR);
	}

	public WebElement getUserPasswordFieldLocator() {
		return driver.findElement(USER_PASSWORD_FIELD_LOCATOR);
	}

	public  WebElement getLoginSubmitButton() {
		return driver.findElement(LOGIN_SUBMIT_BUTTON);
	}
}
