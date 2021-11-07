package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.By;

public class DownloadsPageWrapper {

	private static final By LAST_DOWNLOADED_FILE_LOCATOR = By.xpath("//div[contains(@class,\"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
	private static final By CLOSE_ECONOMY_TIME_POPUP_LOCATOR = By.xpath("\t//button[contains(@class,\"Button2 Button2_view_clear Button2_size_xs dialog__close\")]\n");

	public static HtmlElement getLastDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), LAST_DOWNLOADED_FILE_LOCATOR);
	}


}
