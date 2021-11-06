package com.stormnet.yandex.framework.pageWrappers.loginPageWrappers;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;

public class LoginPageWrapper {
	private static final By USER_ID_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By LOGIN_SUBMIT_BUTTON = By.id("passp:sign-in");
	private static final By LOGIN_BUTTON = By.xpath("//a[contains(@class,\"button2_theme_mail-white\")]");


	public static Button getUserLoginButton() {
		return new Button(UIDriver.getDriver(), LOGIN_BUTTON);
	}

	public static Input getUserIdFieldLocator() {
		return new Input(UIDriver.getDriver(), USER_ID_FIELD_LOCATOR);
	}

	public static Input getUserPasswordFieldLocator() {
		return new Input(UIDriver.getDriver(), USER_PASSWORD_FIELD_LOCATOR);
	}

	public static Button getLoginSubmitButton() {
		return new Button(UIDriver.getDriver(), LOGIN_SUBMIT_BUTTON);
	}

}
