package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.AbstractPage;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.testng.Assert;

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
			DiskPageActions.waitTillDiskPageOpened();
			Assert.assertTrue(DiskPage.DiskSideBarMenu.getDownloadsFolderButtonInSideBarMenu().isDisplayed(),"Disk Page hasn't been shown");
			Logger.getLogger().info("Disk page has been opened");
		}
	}

}
