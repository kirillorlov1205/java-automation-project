package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPage;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage.getBin;
import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage.getDownloadedFileName;

public class FilesPageActions extends DiskPageActions {

	@Step("Move downloaded file to bin")
	public static void moveDownloadedFileToBin(String fileName) {
		waitTillDownloadedFileShown(fileName);
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(getDownloadedFileName(fileName).getElement(), getBin().getElement())
				.build()
				.perform();
		Logger.getLogger().info("File '{}' has been moved to bin", fileName);
	}

	@Step("Wait till downloaded File  has been shown")
	public static void waitTillDownloadedFileShown(String fileName) {
		Waiter.untilVisible(getDownloadedFileName(fileName), "Downloaded file hasn't been shown");
	}

	@Step("Wait till Files Page has opened")
	public static void waitTillFilesPageOpened() {
		Waiter.untilVisible(DiskPage.DiskSideBarMenu.getFilesFolderButtonInSideBarMenu(), "Files page hasn't been opened");
	}

}
