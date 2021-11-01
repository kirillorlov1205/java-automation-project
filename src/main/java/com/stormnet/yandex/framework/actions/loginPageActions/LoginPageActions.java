package com.stormnet.yandex.framework.actions.loginPageActions;

import com.stormnet.yandex.framework.actions.mailPageActions.MailPageActions;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions {

	private final WebDriver driver;

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void openLoginPage() {
		driver.get("https://passport.yandex.by/auth?from=mail&origin=hostroot_homer_auth_L_by&retpath=https%3A%2F%2Fmail.yandex.by%2F&backpath=https%3A%2F%2Fmail.yandex.by%3Fnoretpath%3D1/");
	}

	public LoginPageActions fillUserId(String username) {
		new LoginPageWrapper(driver).getUserIdFieldLocator().sendKeys(username);
		return this;
	}

	public LoginPageActions fillUserPassword(String password) {
		new LoginPageWrapper(driver).getUserPasswordFieldLocator().sendKeys(password);
		return this;
	}

	public LoginPageActions submitForm() {
		new LoginPageWrapper(driver).getLoginSubmitButton().click();
		return this;
	}

	public LoginPageActions loginWithCreds(String userName, String password) {
		openLoginPage();
		fillUserId(userName);
		new LoginPageWrapper(driver).getLoginSubmitButton().click();
		waitUsernameFormClosed();
		fillUserPassword(password);
		new LoginPageWrapper(driver).getLoginSubmitButton().click();
		new MailPageActions(driver).waitMailPageOpened();
		return this;
	}

	public void waitUsernameFormClosed() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(new LoginPageWrapper(driver)
						.getUserIdFieldLocator().getElement()));
	}


}
