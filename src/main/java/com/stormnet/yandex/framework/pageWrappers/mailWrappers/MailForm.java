package com.stormnet.yandex.framework.pageWrappers.mailWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;

public class MailForm {
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
