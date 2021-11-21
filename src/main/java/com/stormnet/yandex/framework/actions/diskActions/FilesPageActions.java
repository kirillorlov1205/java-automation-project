package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;

import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage.getBin;
import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPage.getDownloadedFileName;

public class FilesPageActions extends DiskPageActions {

	@Step("Move downloaded file to bin")
	public static void moveDownloadedFileToBin(File file) {
		waitTillDownloadedFileShown(file);
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(getDownloadedFileName(file.getName()).getElement(), getBin().getElement())
				.build()
				.perform();
		waitTillFillDeleted();
		Assert.assertTrue(FilesPage.getFileDeletedIndicator().isDisplayed(), "File hasn't been deleted");
		Logger.getLogger().info("File '{}' has been moved to bin", file.getName());
	}

	@Step("Wait till downloaded File  has been shown")
	public static void waitTillDownloadedFileShown(File file) {
		Waiter.untilVisible(getDownloadedFileName(file.getName()), "Downloaded file hasn't been shown");
	}

	@Step("Wait till Files Page has opened")
	public static void waitTillFilesPageOpened() {
		Waiter.untilVisible(FilesPage.getFilesPageTitle(), "Files page hasn't been opened");
	}

	@Step("Wait till file will be deleted")
	public static void waitTillFillDeleted() {
		Waiter.untilVisible(FilesPage.getFileDeletedIndicator(), "File delete notification hasn't been shown");
	}

}
