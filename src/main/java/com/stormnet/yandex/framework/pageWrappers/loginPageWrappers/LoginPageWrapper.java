package com.stormnet.yandex.framework.pageWrappers.loginPageWrappers;

import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWrapper {
	private static final By USER_ID_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By LOGIN_SUBMIT_BUTTON = By.id("passp:sign-in");

	private final WebDriver driver;

	public LoginPageWrapper(WebDriver driver) {
		this.driver = driver;
	}

	public Input getUserIdFieldLocator() {
		return new Input(driver, USER_ID_FIELD_LOCATOR);
	}

	public Input getUserPasswordFieldLocator() {
		return new Input(driver, USER_PASSWORD_FIELD_LOCATOR);
	}

	public Button getLoginSubmitButton() {
		return new Button(driver, LOGIN_SUBMIT_BUTTON);
	}

}
