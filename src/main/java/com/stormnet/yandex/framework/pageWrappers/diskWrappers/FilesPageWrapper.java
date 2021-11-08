package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.By;

public class FilesPageWrapper {
	private static final By DOWNLOADED_FILE_LOCATOR = By.xpath("//div[contains(@class,\"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
	private static final By BIN_LOCATOR = By.xpath("//span[contains(@class,\"file-icon file-icon_size_m file-icon_dir_trash-full listing-item__dir-icon resource-icon-preview resource-icon-preview_theme_tile resource-icon-preview_size_m js-prevent-drag js-prevent-deselect\")]");

	public static HtmlElement getDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), DOWNLOADED_FILE_LOCATOR);
	}

	public static HtmlElement getBin() {
		return new HtmlElement(UiDriver.getDriver(), BIN_LOCATOR);
	}

}
