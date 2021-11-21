package com.stormnet.yandex.framework.pageWrappers.mailWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;

public class MailPage {
	private static By WRITE_MAIL_BUTTON_LOCATOR = By.cssSelector("div.js-compose-button-container > a");
	private static By SEND_TO_DISK_BUTTON = By.xpath("//a[contains(@class,\"js-show-save-popup\")]");
	private static String MAIL_ATTACHMENT_AREA_WITH_DOWNLOADED_FILE = "//div[contains(@class,\"mail-MessageSnippet-Item_attachmentsFiles\")]//span[text()=\"%s\"]";
	private static By FILE_SENT_IFRAME_LOCATOR = By.xpath("//iframe[contains(@class,\"disk-widget-save\")]");
	private static By FILE_SENT_INDICATOR_LOCATOR = By.xpath("//a[contains(@class,\"_3abtIQJyoTF5bvw5BqN3g8\")]");


	public static Button getWriteMailButton() {
		return new Button(UiDriver.getDriver(), WRITE_MAIL_BUTTON_LOCATOR);
	}

	public static HtmlElement getMailAttachmentAreaWithFile(String fileName) {
		By locator = By.xpath(String.format(MAIL_ATTACHMENT_AREA_WITH_DOWNLOADED_FILE, fileName));
		return new HtmlElement(UiDriver.getDriver(), locator);
	}

	public static Button getSendingToDiskButton() {
		return new Button(UiDriver.getDriver(), SEND_TO_DISK_BUTTON);
	}


	public static HtmlElement getFileSentIframe() {
		return new HtmlElement(UiDriver.getDriver(), FILE_SENT_IFRAME_LOCATOR);
	}

	public static HtmlElement getFileSentIndicator() {
		return new HtmlElement(UiDriver.getDriver(), FILE_SENT_INDICATOR_LOCATOR);
	}

	public static class MailForm {
		private static final By MAIL_RECIPIENT_FIELD_LOCATOR = By.cssSelector("div.composeYabbles");
		private static final By MAIL_TOPIC_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
		private static final By MAIL_TEXT_FIELD_LOCATOR = By.xpath("//div[@id=\"cke_1_contents\"]/div");
		private static final By ATTACHMENT_FIELD_LOCATOR = By.cssSelector("input.qa-Compose-FileInput");
		private static final By SENDING_MAIL_BUTTON_LOCATOR = By.cssSelector("button.Button2_view_default");
		private static final By LOADING_PROGRESS_BAR_LOCATION = By.xpath("//div[contains(@class,\"LoadingProgress__progress\")]");
		private static final By EXIT_BUTTON_LOCATOR = By.cssSelector("div.ComposeDoneScreen-Actions");


		public static Input getMailRecipientField() {
			return new Input(UiDriver.getDriver(), MAIL_RECIPIENT_FIELD_LOCATOR);
		}

		public static Input getMailTopicField() {
			return new Input(UiDriver.getDriver(), MAIL_TOPIC_FIELD_LOCATOR);
		}

		public static Input getMailTextAreaField() {
			return new Input(UiDriver.getDriver(), MAIL_TEXT_FIELD_LOCATOR);
		}

		public static Input getAttachmentField() {
			return new Input(UiDriver.getDriver(), ATTACHMENT_FIELD_LOCATOR);
		}

		public static Button getSendMailButton() {
			return new Button(UiDriver.getDriver(), SENDING_MAIL_BUTTON_LOCATOR);
		}

		public static HtmlElement getLoadingProgressBar() {
			return new HtmlElement(UiDriver.getDriver(), LOADING_PROGRESS_BAR_LOCATION);
		}

		public static Button getExitButton() {
			return new Button(UiDriver.getDriver(), EXIT_BUTTON_LOCATOR);
		}
	}
}
