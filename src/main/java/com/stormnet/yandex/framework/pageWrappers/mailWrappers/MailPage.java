package com.stormnet.yandex.framework.pageWrappers.mailWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.openqa.selenium.By;

public class MailPage {
	private static By WRITE_MAIL_BUTTON_LOCATOR = By.cssSelector("div.js-compose-button-container > a");
	private static By SEND_TO_DISK_BUTTON = By.xpath("//a[contains(@class,\"js-show-save-popup\")]");
	private static By FILE_SENT_POP_UP_LOCATOR = By.xpath("//a[contains(@class,\"_3abtIQJyoTF5bvw5BqN3g8\")]");
	private static By MAIL_ATTACHMENT_AREA_WITH_DOWNLOADED_FILE = By.xpath("//div[contains(@class,\"mail-MessageSnippet-Item_attachmentsFiles\")]//span[text()=\"" + FileManager.getFileName() +"\"]");
	private static By FILE_SENT_IFRAME_LOCATOR = By.xpath("//iframe[contains(@class,\"disk-widget-save\")]");
	private static By FILE_SENT_INDICATOR_LOCATOR = By.xpath("//a[contains(@class,\"_3abtIQJyoTF5bvw5BqN3g8\")]");




	public static Button getWriteMailButton() {
		return new Button(UiDriver.getDriver(), WRITE_MAIL_BUTTON_LOCATOR);
	}

	public static HtmlElement getMailAttachmentAreaWithLastDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), MAIL_ATTACHMENT_AREA_WITH_DOWNLOADED_FILE);
	}

	public static Button getSendingToDiskButton() {
		return new Button(UiDriver.getDriver(), SEND_TO_DISK_BUTTON);
	}

	public static HtmlElement getFileSentPopUp() {
		return new HtmlElement(UiDriver.getDriver(), FILE_SENT_POP_UP_LOCATOR);
	}

	public static HtmlElement getFileSentIframe() {
		return new HtmlElement(UiDriver.getDriver(), FILE_SENT_IFRAME_LOCATOR);
	}

	public static HtmlElement getFileSentIndicator() {
		return new HtmlElement(UiDriver.getDriver(), FILE_SENT_INDICATOR_LOCATOR);
	}

}
