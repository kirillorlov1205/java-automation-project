package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class MailPageActions {

	public static void waitMailPageOpened() {
		Waiter.untilInvisible(LoginPage.getUserPasswordField(), "Mail page hasn't been opened");
	}

	public static void waitFileSent() {
		Waiter.untilVisible(MailPage.getFileSentIndicator(), "file hasn't been sent");
	}

	@Step("Send File to disk")
	public static void sendFileToDisk(File file) {
		String parentWindow = UiDriver.getDriver().getWindowHandle();
		MailPage.getSendingToDiskButton().click();
		Waiter.waitFrameToBeAvailableAndSwitch(MailPage.getFileSentIframe(), "Frame hasn't been shown");
		MailPageActions.waitFileSent();
		WebElement button = UiDriver.getDriver().findElement(By.xpath("//button[contains(@class,\"tUmQfkSVYK0RxeWDEBvd4\")]"));
		button.click();
		UiDriver.getDriver().switchTo().window(parentWindow);
		Logger.getLogger().info("File '{}' has been sent to disk", file.getName());
	}

	public static class MailFormActions {

		public static void fillRecipientField(String email) {
			Waiter.untilVisible(MailPage.MailForm.getMailRecipientField(), "Mail form hasn't been opened");
			MailPage.MailForm.getMailRecipientField().sendKeys(email);
		}

		public static void fillTopicField(String topic) {
			MailPage.MailForm.getMailTopicField().sendKeys(topic);
		}


		public static void fileTextField(String text) {
			MailPage.MailForm.getMailTextAreaField().sendKeys(text);
		}


		public static void attachFile(String path) {
			MailPage.MailForm.getAttachmentField().sendKeys(path);
		}

		public static void submitSendingMail() {
			MailPage.MailForm.getSendMailButton().click();
		}

		public static void closeSuccessForm() {
			MailPage.MailForm.getExitButton().click();
		}

		@Step("Send mail to myself with Topic, Text")
		public static void sendMail(String recipient, String topic, String text, File file) {
			MailPage.getWriteMailButton().click();
			fillRecipientField(recipient);
			fillTopicField(topic);
			fileTextField(text);
			attachFile(file.getAbsolutePath());
			Waiter.untilInvisible(MailPage.MailForm.getLoadingProgressBar(), "\"file hasn't been loaded\"");
			submitSendingMail();
			Waiter.untilVisible(MailPage.MailForm.getExitButton(), "Success pop-up hasn't been shown");
			closeSuccessForm();
			UiDriver.getDriver().navigate().refresh();
			Waiter.untilVisible(MailPage.getMailAttachmentAreaWithFile(file.getName()), "The mail page hasn't been refreshed");
			Logger.getLogger().info("The mail has been sent with file '{}'", file.getName());
		}

	}
}
