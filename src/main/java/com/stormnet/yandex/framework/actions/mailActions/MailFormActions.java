package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailFormWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPageWrapper;

public class MailFormActions {

	public static void fillRecipientField(String email) {
		new Waiter(5).untilVisible(MailFormWrapper.getMailRecipientField(), "Mail form hasn't been opened");
		MailFormWrapper.getMailRecipientField().sendKeys(email);
	}

	public static void fillTopicField(String topic) {
		MailFormWrapper.getMailTopicField().sendKeys(topic);
	}


	public static void fileTextField(String text) {
		MailFormWrapper.getMailTextAreaField().sendKeys(text);
	}


	public static void attachFile(String path) {
		MailFormWrapper.getAttachmentField().sendKeys(path);
	}

	public static void submitSendingMail() {
		MailFormWrapper.getSendMailButton().click();
	}

	public static void closeSuccessForm() {
		MailFormWrapper.getExitButton().click();
	}

	public static void sendMail(String recipient, String topic, String text, String filePath) {
		MailPageWrapper.getWriteMailButton().click();
		fillRecipientField(recipient);
		fillTopicField(topic);
		fileTextField(text);
		attachFile(filePath);
		new Waiter(5).untilInvisible(MailFormWrapper.getLoadingProgressBar(), "\"file hasn't been loaded\"");
		submitSendingMail();
		new Waiter(5).untilVisible(MailFormWrapper.getExitButton(), "Success pop-up hasn't been shown");
		closeSuccessForm();
	}


}
