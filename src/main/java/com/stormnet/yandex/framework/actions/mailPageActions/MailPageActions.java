package com.stormnet.yandex.framework.actions.mailPageActions;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailFormWrapper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPageActions {

	public static void waitMailPageOpened() {
		WebDriverWait wait = new WebDriverWait(UIDriver.getDriver(), 5);
		wait.withMessage("Mail page hasn't been opened")
				.until(ExpectedConditions.invisibilityOf(LoginPageWrapper.getUserPasswordFieldLocator().getElement()));
	}

}
