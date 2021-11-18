package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.openqa.selenium.By;

public class FilesPage extends DiskPage {
	private static final By DOWNLOADED_FILE_LOCATOR = By.xpath("//span[text()=\"" + FileManager.getFileName() + "\"]//ancestor::div[contains(@class,\"listing-item_type_file\")]");
	private static final By BIN_LOCATOR = By.xpath("//span[contains(@class,\"file-icon_dir_trash \")]");

	public static HtmlElement getDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), DOWNLOADED_FILE_LOCATOR);
	}

	public static HtmlElement getBin() {
		return new HtmlElement(UiDriver.getDriver(), BIN_LOCATOR);
	}

}
