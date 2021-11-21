package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.FileMovingPopUpActions;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.FileMovingPopUp;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPage;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.io.File;

public class DiskPageActions extends AbstractPageActions {

	@Step("Move file to Files folder")
	public static void moveFileToFilesFolder(File file) {
		DownloadsPageActions.waitTillDownloadedFileShown(file);
		DownloadsPageActions.invokeContextMenuFile(file);
		DownloadsPageActions.clickMovingContextButton();
		FileMovingPopUpActions.selectFileFolder();
		FileMovingPopUp.getMoveButton().click();
		DownloadsPageActions.waitTillFileMovedNotifyShown();
		Assert.assertTrue(DownloadsPage.getFileMovedIndicator().isDisplayed(), "File hasn't been moved to files folder");
		DownloadsPageActions.waitTillDownloadedFileIsMoved(file);
		Logger.getLogger().info("File '{}' has been moved to files folder", file.getName());
	}

	public static void waitTillDiskPageOpened() {
		Waiter.untilVisible(DiskPage.DiskSideBarMenu.getDownloadsFolderButtonInSideBarMenu(), "Downloaded page hasn't been shown");
	}

	public static class DiskSideBarMenuActions {

		@Step("Open downloads page")
		public static void openDownloadsPage() {
			DiskPage.DiskSideBarMenu.getDownloadsFolderButtonInSideBarMenu().click();
			DownloadsPageActions.waitTillDownloadsPageOpened();
			Assert.assertTrue(DownloadsPage.getDownloadsPageTitle().isDisplayed(), "Downloads  Page hasn't been shown");
			Logger.getLogger().info("Downloads page has been opened");
		}

		@Step("Open files page")
		public static void openFilesPage() {
			waitTillSideBarVisible();
			DiskPage.DiskSideBarMenu.getFilesFolderButtonInSideBarMenu().click();
			FilesPageActions.waitTillFilesPageOpened();
			Assert.assertTrue(FilesPage.getFilesPageTitle().isDisplayed(),"Files page hasn't been opened");
			Logger.getLogger().info("Files page has been opened");
		}

		public static void waitTillSideBarVisible() {
			Waiter.untilVisible(DiskPage.DiskSideBarMenu.getFilesFolderButtonInSideBarMenu(), "Side bar invisible");
		}
	}


}
