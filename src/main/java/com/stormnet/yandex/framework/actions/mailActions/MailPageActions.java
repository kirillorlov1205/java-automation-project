package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPageWrapper;

public class MailPageActions {

	public static void waitMailPageOpened() {
		new Waiter(10).untilInvisible(LoginPageWrapper.getUserPasswordFieldLocator(), "Mail page hasn't been opened");
	}

	public static void sendFileToDisk() {
		MailPageWrapper.getSendingToDiskButton().click();
	}

}
