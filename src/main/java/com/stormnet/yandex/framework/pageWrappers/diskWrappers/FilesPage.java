package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.openqa.selenium.By;

public class FilesPage extends DiskPage {
	private static final String DOWNLOADED_FILE_LOCATOR = "//span[text()=\"%s\"]//ancestor::div[contains(@class,\"listing-item_type_file\")]";
	private static final By BIN_LOCATOR = By.xpath("//span[contains(@class,\"file-icon_dir_trash \")]");

	public static HtmlElement getDownloadedFileName(String fileName) {
		By locator = By.xpath(String.format(DOWNLOADED_FILE_LOCATOR, fileName));
		return new HtmlElement(UiDriver.getDriver(), locator);
	}

	public static HtmlElement getBin() {
		return new HtmlElement(UiDriver.getDriver(), BIN_LOCATOR);
	}

}
