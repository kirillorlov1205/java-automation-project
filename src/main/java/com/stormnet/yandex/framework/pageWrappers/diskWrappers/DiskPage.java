package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.pageWrappers.AbstractPage;
import org.openqa.selenium.By;

public class DiskPage extends AbstractPage {

	public static class DiskSideBarMenu {

		private static final By BUCKET_FOLDER_IN_SIDE_BAR_LOCATOR = By.xpath("//button[contains(@class,\"Button2 Button2_theme_raised Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit \")]");
		private static final By FILES_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR = By.xpath("//a[contains(@class,\"Link Link_theme_dark drop-target navigation__link navigation__link_current\")]");
		private static final By DOWNLOADS_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR = By.xpath("//a[contains(@class,\"Link Link_theme_dark navigation__link navigation__link_favorite navigation__link_downloads\")]");


		public static Button getBucketFolderButtonInSideBarMenu() {
			return new Button(UiDriver.getDriver(), BUCKET_FOLDER_IN_SIDE_BAR_LOCATOR);
		}

		public static Button getDownloadsFolderButtonInSideBarMenu() {
			return new Button(UiDriver.getDriver(), DOWNLOADS_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR);
		}

		public static Button getFilesFolderButtonInSideBarMenu() {
			return new Button(UiDriver.getDriver(), FILES_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR);
		}
	}


}
