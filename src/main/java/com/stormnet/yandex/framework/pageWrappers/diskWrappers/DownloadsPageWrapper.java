package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.By;

public class DownloadsPageWrapper {

	private static final By LAST_DOWNLOADED_FILE_LOCATOR = By.xpath("//div[contains(@class,\"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect\")]");
	private static final By MOVE_CONTEXT_BUTTON_LOCATOR = By.xpath("//div[contains(@class,\"Menu-Item Menu-Item_type_menuitem resources-actions-popup__action resources-actions-popup__action_type_move\")]");


	public static HtmlElement getLastDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), LAST_DOWNLOADED_FILE_LOCATOR);
	}

	public static Button getMoveContextButton() {
		return new Button(UiDriver.getDriver(), MOVE_CONTEXT_BUTTON_LOCATOR);
	}




}
