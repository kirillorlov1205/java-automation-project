package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.FileMovingPopUpActions;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPage;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class DiskPageActions extends AbstractPageActions {

	@Step("Move file to Files folder")
	public static void moveFileToFilesFolder(WebElement element) {
		DownloadsPageActions.waitTillDownloadedFileShown();
		DownloadsPageActions.invokeContextMenuFile(element);
		DownloadsPageActions.clickMovingContextButton();
		FileMovingPopUpActions.selectFileFolder();
		FileMovingPopUpActions.clickMoveButton();
		Logger.getLogger().info("File '{}' has been moved to files folder", FileManager.getFileName());
	}

	public static class DiskSideBarMenuActions {

		@Step("Open downloads page")
		public static void openDownloadsPage() {
			DiskPage.DiskSideBarMenu.getDownloadsFolderButtonInSideBarMenu().click();
			DownloadsPageActions.waitTillDownloadsPageOpened();
			Logger.getLogger().info("Downloads page has been opened");
		}

		@Step("Open files page")
		public static void openFilesPage() {
			waitTillSideBarVisible();
			DiskPage.DiskSideBarMenu.getFilesFolderButtonInSideBarMenu().click();
			FilesPageActions.waitTillFilesPageOpened();
			Logger.getLogger().info("Files page has been opened");
		}

		public static void waitTillSideBarVisible() {
			Waiter.untilVisible(DiskPage.DiskSideBarMenu.getFilesFolderButtonInSideBarMenu(), "Side bar invisible");
		}
	}


}
