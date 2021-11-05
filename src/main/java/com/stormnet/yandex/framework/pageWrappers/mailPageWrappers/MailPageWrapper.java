package com.stormnet.yandex.framework.pageWrappers.mailPageWrappers;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.model.Bucket;

public class MailPageWrapper {
	private static By WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//div[@class=\"mail-ComposeButton-Wrap js-compose-button-container\"]/a");

	public static Button getWriteMailButton() {
		return new Button(UIDriver.getDriver(), WRITE_MAIL_BUTTON_LOCATOR);
	}
}
