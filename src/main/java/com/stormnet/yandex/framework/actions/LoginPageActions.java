package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.pageWrappers.LoginPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageActions {

	@Step("Open Login Page")
	public static void openLoginPage() {
		UiDriver.getDriver().get("https://mail.yandex.com/");
	}

	@Step("")
	public static void clickOnLoginButton() {
		LoginPageWrapper.getUserLoginButton().click();
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
		clickOnLoginButton();
		fillUserId(userName);
		submitForm();
		waitUsernameFormClosed();
		fillUserPassword(password);
		submitForm();
		MailPageActions.waitMailPageOpened();
	}

	@Step("Waiting till username form closed")
	public static void waitUsernameFormClosed() {
		WebDriverWait wait = new WebDriverWait(UiDriver.getDriver(), 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(LoginPageWrapper
						.getUserIdFieldLocator().getElement()));
	}


}
