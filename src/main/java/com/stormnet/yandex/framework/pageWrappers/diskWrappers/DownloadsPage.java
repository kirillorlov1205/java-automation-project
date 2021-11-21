package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Text;
import org.openqa.selenium.By;

public class DownloadsPage extends DiskPage {

	private static final String DOWNLOADED_FILE_LOCATOR = "//div[contains(@class,\"listing-item__title\")]//span[text()=\"%s\"]";
	private static final By DOWNLOADS_PAGE_TITLE_LOCATOR = By.xpath("//h1[text() = \"Загрузки\"]");
	private static final By FILE_MOVED_INDICATOR = By.xpath("//div[contains(@class,\"notifications__text js-message\")]");

	public static HtmlElement getDownloadedFile(String fileName) {
		By locator = By.xpath(String.format(DOWNLOADED_FILE_LOCATOR, fileName));
		return new HtmlElement(UiDriver.getDriver(), locator);
	}

	public static Text getDownloadsPageTitle() {
		return new Text(UiDriver.getDriver(), DOWNLOADS_PAGE_TITLE_LOCATOR);
	}

	public static HtmlElement getFileMovedIndicator() {
		return new HtmlElement(UiDriver.getDriver(), FILE_MOVED_INDICATOR);
	}

}
