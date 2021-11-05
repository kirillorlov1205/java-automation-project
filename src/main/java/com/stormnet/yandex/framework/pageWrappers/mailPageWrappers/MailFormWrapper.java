package com.stormnet.yandex.framework.pageWrappers.mailPageWrappers;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.elements.Input;
import org.openqa.selenium.By;

public class MailFormWrapper {
	private static final By MAIL_RECIPIENT_FIELD_LOCATOR = By.xpath("//div[@class=\"composeYabbles\"]");
	private static final By MAIL_TOPIC_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
	private static final By MAIL_TEXT_FIELD_LOCATOR = By.xpath("//div[@id=\"cke_1_contents\"]/div");


	public static Input getMailRecipientField() {
		return new Input(UIDriver.getDriver(), MAIL_RECIPIENT_FIELD_LOCATOR);
	}

	public static Input getMailTopicField() {
		return new Input(UIDriver.getDriver(), MAIL_TOPIC_FIELD_LOCATOR);
	}

	public static Input getMailTextAreaField() {
		return new Input(UIDriver.getDriver(), MAIL_TEXT_FIELD_LOCATOR);
	}
}
