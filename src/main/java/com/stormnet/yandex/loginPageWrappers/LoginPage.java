package com.stormnet.yandex.loginPageWrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static final By USER_ID_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By LOGIN_SUBMIT_FIELD_LOCATOR = By.id("passp:sign-in");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("");
	private static final By LOGIN_SUBMIT_BUTTON = By.id("");

	private final WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}

	public WebElement getUserIdFieldLocator() {
		return driver.findElement(USER_ID_FIELD_LOCATOR);
	}

	public WebElement getLoginSubmitButtonFirst() {
		return driver.findElement(USER_ID_FIELD_LOCATOR);
	}

	public static By getUserPasswordFieldLocator() {
		return driver.findElement();
	}

	public static By getLoginSubmitButton() {
		return driver.findElement();
	}
}
