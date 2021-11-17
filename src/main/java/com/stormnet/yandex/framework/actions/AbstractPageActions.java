package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.pageWrappers.AbstractPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;

public class AbstractPageActions {

	public static class HeaderPanelActions {

		@Step("Open mail page")
		public static void openMailPage() {
			AbstractPage.HeaderPanel.getMailPageButton().click();
			Logger.getLogger().info("Mail page has been opened");
		}

		@Step("Open disk page")
		public static void openDiskPage() {
			AbstractPage.HeaderPanel.getDiskPageButton().click();
			Logger.getLogger().info("Disk page has been opened");
		}
	}

}
