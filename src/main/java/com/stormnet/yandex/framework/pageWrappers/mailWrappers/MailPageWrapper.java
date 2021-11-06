package com.stormnet.yandex.framework.pageWrappers.mailWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;

public class MailPageWrapper {
	private static By WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//div[@class=\"mail-ComposeButton-Wrap js-compose-button-container\"]/a");
	private static By SEND_TO_DISK_BUTTON = By.xpath("//a[contains(@class,\"js-show-save-popup\")]");


	public static Button getWriteMailButton() {
		return new Button(UiDriver.getDriver(), WRITE_MAIL_BUTTON_LOCATOR);
	}

	public static Button getSendingToDiskButton() {
		return new Button(UiDriver.getDriver(), SEND_TO_DISK_BUTTON);
	}
}
