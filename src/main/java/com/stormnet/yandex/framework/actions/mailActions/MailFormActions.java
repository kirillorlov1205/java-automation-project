package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailForm;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;

import java.io.File;

public class MailFormActions {

	public static void fillRecipientField(String email) {
		Waiter.untilVisible(MailForm.getMailRecipientField(), "Mail form hasn't been opened");
		MailForm.getMailRecipientField().sendKeys(email);
	}

	public static void fillTopicField(String topic) {
		MailForm.getMailTopicField().sendKeys(topic);
	}


	public static void fileTextField(String text) {
		MailForm.getMailTextAreaField().sendKeys(text);
	}


	public static void attachFile(String path) {
		MailForm.getAttachmentField().sendKeys(path);
	}

	public static void submitSendingMail() {
		MailForm.getSendMailButton().click();
	}

	public static void closeSuccessForm() {
		MailForm.getExitButton().click();
	}

	@Step("Send mail to myself with Topic, Text")
	public static void sendMail(String recipient, String topic, String text, File file) {
		MailPage.getWriteMailButton().click();
		fillRecipientField(recipient);
		fillTopicField(topic);
		fileTextField(text);
		attachFile(file.getAbsolutePath());
		Waiter.untilInvisible(MailForm.getLoadingProgressBar(), "\"file hasn't been loaded\"");
		submitSendingMail();
		Waiter.untilVisible(MailForm.getExitButton(), "Success pop-up hasn't been shown");
		closeSuccessForm();
		UiDriver.getDriver().navigate().refresh();
		Waiter.untilVisible(MailPage.getMailAttachmentAreaWithLastDownloadedFile(), "The mail page hasn't been refreshed");
		Logger.getLogger().info("The mail has been sent with file '{}'", file.getName());
	}

}
