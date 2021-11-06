package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;

public class DiskPageWrapper {
	private static final By DOWNLOADS_BUTTON_LOCATOR = By.xpath("//a[contains(@class,\"Link Link_theme_dark navigation__link navigation__link_favorite navigation__link_downloads\")]");
	private static final By FILES_BUTTON_LOCATOR = By.xpath("//a[contains(@class,\"Link Link_theme_dark drop-target navigation__link navigation__link_current\")]");

	public static Button getDownloadsButton() {
		return new Button(UiDriver.getDriver(), DOWNLOADS_BUTTON_LOCATOR);
	}

	public static Button getFilesButton() {
		return new Button(UiDriver.getDriver(), FILES_BUTTON_LOCATOR);
	}
}
