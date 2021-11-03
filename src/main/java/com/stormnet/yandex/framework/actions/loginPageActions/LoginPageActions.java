package com.stormnet.yandex.framework.actions.loginPageActions;

import com.stormnet.yandex.framework.actions.mailPageActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions {

	@Step("Open Login Page")
	public void openLoginPage() {
		UIDriver.getDriver().get("https://passport.yandex.by/auth?from=mail&origin=hostroot_homer_auth_L_by&retpath=https%3A%2F%2Fmail.yandex.by%2F&backpath=https%3A%2F%2Fmail.yandex.by%3Fnoretpath%3D1/");
	}

	@Step("Fill user ID field")
	public LoginPageActions fillUserId(String username) {
		new LoginPageWrapper(UIDriver.getDriver()).getUserIdFieldLocator().sendKeys(username);
		return this;
	}

	public LoginPageActions fillUserPassword(String password) {
		new LoginPageWrapper(UIDriver.getDriver()).getUserPasswordFieldLocator().sendKeys(password);
		return this;
	}

	public LoginPageActions submitForm() {
		new LoginPageWrapper(UIDriver.getDriver()).getLoginSubmitButton().click();
		return this;
	}

	public LoginPageActions loginWithCreds(String userName, String password) {
		openLoginPage();
		fillUserId(userName);
		new LoginPageWrapper(UIDriver.getDriver()).getLoginSubmitButton().click();
		waitUsernameFormClosed();
		fillUserPassword(password);
		new LoginPageWrapper(UIDriver.getDriver()).getLoginSubmitButton().click();
		new MailPageActions(UIDriver.getDriver()).waitMailPageOpened();
		return this;
	}

	public void waitUsernameFormClosed() {
		WebDriverWait wait = new WebDriverWait(UIDriver.getDriver(), 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(new LoginPageWrapper(UIDriver.getDriver())
						.getUserIdFieldLocator().getElement()));
	}


}
