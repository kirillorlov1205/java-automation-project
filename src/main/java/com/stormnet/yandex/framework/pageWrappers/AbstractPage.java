package com.stormnet.yandex.framework.pageWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;

public class AbstractPage {

	public static class HeaderPanel {
		private static final By OPEN_MAIL_PAGE_BUTTON_LOCATOR = By.xpath("//div[contains(@class,\"PSHeaderIcon-Image PSHeaderIcon-Image_Mail PSHeaderIcon-Image_theme_light\")]");
		private static final By OPEN_DISK_PAGE_BUTTON_LOCATOR = By.xpath("//div[contains(@class,\"PSHeaderIcon-Image PSHeaderIcon-Image_Disk PSHeaderIcon-Image_theme_light\")]");

		public static Button getMailPageButton() {
			return new Button(UiDriver.getDriver(), OPEN_MAIL_PAGE_BUTTON_LOCATOR);
		}

		public static Button getDiskPageButton() {
			return new Button(UiDriver.getDriver(), OPEN_DISK_PAGE_BUTTON_LOCATOR);
		}
	}


}
