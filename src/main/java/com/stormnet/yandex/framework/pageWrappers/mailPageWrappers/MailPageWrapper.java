package com.stormnet.yandex.framework.pageWrappers.mailPageWrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailPageWrapper {
	private WebDriver driver;
	private By WRITE_MAIL_BUTTON_LOCATOR = By.xpath("//div[@class=\"mail-ComposeButton-Wrap js-compose-button-container\"]/a");

	public MailPageWrapper(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWriteMailButton() {
		return driver.findElement(WRITE_MAIL_BUTTON_LOCATOR);
	}
}
