package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Text;
import org.openqa.selenium.By;

public class DownloadsPage extends DiskPage{

	private static final By LAST_DOWNLOADED_FILE_LOCATOR = By.xpath("//span[contains(@class,\"file-icon file-icon_size_m file-icon_text resource-icon-preview resource-icon-preview_theme_tile resource-icon-preview_size_m js-prevent-deselect\")]");
	private static final By CLOSE_ECONOMY_TIME_POPUP_LOCATOR = By.xpath("\t//button[contains(@class,\"Button2 Button2_view_clear Button2_size_xs dialog__close\")]\n");
	private static final By DOWNLOADS_PAGE_TITLE_LOCATOR = By.xpath("//h1[text() = \"Загрузки\"]");

	public static HtmlElement getLastDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), LAST_DOWNLOADED_FILE_LOCATOR);
	}

	public static Text getDownloadsPageTitle() {
		return new Text(UiDriver.getDriver(), DOWNLOADS_PAGE_TITLE_LOCATOR);
	}


}
