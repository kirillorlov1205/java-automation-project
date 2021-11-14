package com.stormnet.yandex.framework.pageWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;

public class LoginPage extends AbstractPage{
	private static final By USER_ID_FIELD_LOCATOR = By.id("passp-field-login");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("passp-field-passwd");
	private static final By LOGIN_SUBMIT_BUTTON = By.id("passp:sign-in");
	private static final By LOGIN_BUTTON = By.xpath("//a[contains(@class,\"button2_theme_mail-white\")]");


	public static Button getUserLoginButton() {
		return new Button(UiDriver.getDriver(), LOGIN_BUTTON);
	}

	public static Input getUserIdFieldLocator() {
		return new Input(UiDriver.getDriver(), USER_ID_FIELD_LOCATOR);
	}

	public static Input getUserPasswordFieldLocator() {
		return new Input(UiDriver.getDriver(), USER_PASSWORD_FIELD_LOCATOR);
	}

	public static Button getLoginSubmitButton() {
		return new Button(UiDriver.getDriver(), LOGIN_SUBMIT_BUTTON);
	}

}
