package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.elements.Text;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.openqa.selenium.By;

public class DownloadsPage extends DiskPage {

	private static final By DOWNLOADED_FILE_LOCATOR = By.xpath("//div[contains(@class,\"listing-item__title\")]//span[text()=\"" + new FileManager().getFileName() + "\"]");
	private static final By DOWNLOADS_PAGE_TITLE_LOCATOR = By.xpath("//h1[text() = \"Загрузки\"]");


	public static HtmlElement getDownloadedFile() {
		return new HtmlElement(UiDriver.getDriver(), DOWNLOADED_FILE_LOCATOR);

	}

	public static Text getDownloadsPageTitle() {
		return new Text(UiDriver.getDriver(), DOWNLOADS_PAGE_TITLE_LOCATOR);
	}


}
