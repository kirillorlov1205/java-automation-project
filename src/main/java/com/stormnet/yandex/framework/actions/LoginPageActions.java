package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginPageActions extends AbstractPageActions {

	@Step("Open Login Page")
	public static void openLoginPage() {
		UiDriver.getDriver().get("https://mail.yandex.com/");
	}

	@Step("Fill user ID field")
	public static void fillUserId(String username) {
		LoginPage.getUserIdField().sendKeys(username);
	}

	@Step("Fill user password field")
	public static void fillUserPassword(String password) {
		LoginPage.getUserPasswordField().sendKeys(password);
	}

	@Step("Submit Login form")
	public static void submitForm() {
		LoginPage.getLoginSubmitButton().click();
	}

	@Step("Login with credentials")
	public static void loginWithValidCredentials(String userName, String password) {
		openLoginPage();
		LoginPage.getUserLoginButton().click();
		fillUserId(userName);
		submitForm();
		Waiter.untilInvisible(LoginPage
				.getUserIdField(), "ID field hasn't disappear");
		fillUserPassword(password);
		submitForm();
		MailPageActions.waitMailPageOpened();
		Assert.assertTrue(MailPage.getWriteMailButton().isDisplayed(), "Mail page hasn't been opened");
		Logger.getLogger().info("User has been logged in the system");
	}

}
