package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Text;
import org.openqa.selenium.By;

public class FilesPage extends DiskPage {
	private static final String DOWNLOADED_FILE_LOCATOR = "//span[text()=\"%s\"]//ancestor::div[contains(@class,\"listing-item_type_file\")]";
	private static final By BIN_LOCATOR = By.xpath("//span[contains(@class,\"file-icon_dir_trash \")]");
	private static final By FILES_PAGE_TITLE_LOCATOR = By.xpath("//h1[text() = \"Файлы\"]");
	private static final By FILE_DELETED_INDICATOR = By.xpath("//div[contains(@class,\"notifications__text js-message\")]");

	public static HtmlElement getDownloadedFileName(String fileName) {
		By locator = By.xpath(String.format(DOWNLOADED_FILE_LOCATOR, fileName));
		return new HtmlElement(UiDriver.getDriver(), locator);
	}

	public static HtmlElement getBin() {
		return new HtmlElement(UiDriver.getDriver(), BIN_LOCATOR);
	}

	public static Text getFilesPageTitle() {
		return new Text(UiDriver.getDriver(), FILES_PAGE_TITLE_LOCATOR);
	}

	public static HtmlElement getFileDeletedIndicator() {
		return new HtmlElement(UiDriver.getDriver(), FILE_DELETED_INDICATOR);
	}

}
