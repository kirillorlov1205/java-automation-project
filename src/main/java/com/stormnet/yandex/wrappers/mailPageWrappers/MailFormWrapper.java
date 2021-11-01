package com.stormnet.yandex.wrappers.mailPageWrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailFormWrapper {
	private By MAIL_RECIPIENT_FIELD_LOCATOR = By.xpath("//div[@class=\"composeYabbles\"][1]");
	private By MAIL_TOPIC_FIELD_LOCATOR = By.xpath("//input[@name=\"subject\"]");
//	private final By MAIL_TEXT_FIELD_LOCATOR = By.ByXPath("")

	private WebDriver driver;

	public MailFormWrapper(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMAIL_RECIPIENT_FIELD_LOCATOR() {
		return driver.findElement(MAIL_RECIPIENT_FIELD_LOCATOR);
	}

	public WebElement getMAIL_TOPIC_FIELD_LOCATOR() {
		return driver.findElement(MAIL_TOPIC_FIELD_LOCATOR);
	}
}
