package com.stormnet.yandex.framework.actions.mailPageActions;

import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailFormWrapper;

public class MailFormActions {

	public static void fillRecipientField(String email) {
		MailFormWrapper.getMailRecipientField().sendKeys(email);
	}

	public static void fillTopicField(String topic) {
		MailFormWrapper.getMailTopicField().sendKeys(topic);
	}

	public static void fillTopicField(String topic) {
		MailFormWrapper.getMailTopicField().sendKeys(topic);
	}


}
