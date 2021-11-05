package com.stormnet.yandex.framework.actions.loginPageActions;

import com.stormnet.yandex.framework.actions.mailPageActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions {

	@Step("Open Login Page")
	public static void openLoginPage() {
		UIDriver.getDriver().get("https://passport.yandex.by/auth?from=mail&origin=hostroot_homer_auth_L_by&retpath=https%3A%2F%2Fmail.yandex.by%2F&backpath=https%3A%2F%2Fmail.yandex.by%3Fnoretpath%3D1/");
	}

	@Step("Fill user ID field")
	public static void fillUserId(String username) {
		LoginPageWrapper.getUserIdFieldLocator().sendKeys(username);
	}

	@Step("Fill user password field")
	public static void fillUserPassword(String password) {
		LoginPageWrapper.getUserPasswordFieldLocator().sendKeys(password);
	}

	@Step("Submit Login form")
	public static void submitForm() {
		LoginPageWrapper.getLoginSubmitButton().click();
	}

	@Step("Login with credentials")
	public static void loginWithCreds(String userName, String password) {
		openLoginPage();
		fillUserId(userName);
		LoginPageWrapper.getLoginSubmitButton().click();
		waitUsernameFormClosed();
		fillUserPassword(password);
		LoginPageWrapper.getLoginSubmitButton().click();
		MailPageActions.waitMailPageOpened();
	}

	@Step("Waiting till username form closed")
	public static void waitUsernameFormClosed() {
		WebDriverWait wait = new WebDriverWait(UIDriver.getDriver(), 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(LoginPageWrapper
						.getUserIdFieldLocator().getElement()));
	}


}
