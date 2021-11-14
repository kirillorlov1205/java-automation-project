package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;

public class MailPageActions {

	public static void waitMailPageOpened() {
		new Waiter().untilInvisible(LoginPage.getUserPasswordFieldLocator(), "Mail page hasn't been opened");
	}

	public static void sendFileToDisk() {
		MailPage.getSendingToDiskButton().click();
	}

}
