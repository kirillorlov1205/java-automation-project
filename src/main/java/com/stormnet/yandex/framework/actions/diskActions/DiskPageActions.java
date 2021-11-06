package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.LoginPageWrapper;
import io.qameta.allure.Step;

public class DiskPageActions {

	@Step("Open Downloads Page")
	public static void openDownloadsPage() {
		DiskPageWrapper.getDownloadsButton().click();
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
}
