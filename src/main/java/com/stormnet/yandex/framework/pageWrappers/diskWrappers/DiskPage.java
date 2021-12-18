package com.stormnet.yandex.framework.pageWrappers.diskWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.pageWrappers.AbstractPage;
import org.openqa.selenium.By;

public class DiskPage extends AbstractPage {

	public static class DiskSideBarMenu {

		private static final By FILES_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR = By.cssSelector("a.navigation__link_current");
		private static final By DOWNLOADS_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR = By.cssSelector("a.navigation__link_downloads");

		public static Button getDownloadsFolderButtonInSideBarMenu() {
			return new Button(UiDriver.getDriver(), DOWNLOADS_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR);
		}

		public static Button getFilesFolderButtonInSideBarMenu() {
			return new Button(UiDriver.getDriver(), FILES_FOLDER_BUTTON_IN_SIDE_BAR_LOCATOR);
		}
	}


}
