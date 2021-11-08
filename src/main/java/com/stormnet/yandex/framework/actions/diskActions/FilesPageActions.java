package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.SideBarMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

public class FilesPageActions {

	@Step("Move downloaded file to bin")
	public static void moveDownloadedFileToBin() {
		waitTillDownloadedFileShown();
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(FilesPageWrapper.getDownloadedFile().getElement(), FilesPageWrapper.getBin().getElement()).build().perform();
	}

	@Step("Wait till downloaded File  has been shown")
	public static void waitTillDownloadedFileShown() {
		new Waiter().untilVisible(FilesPageWrapper.getDownloadedFile(), "Downloaded file hasn't been shown");
	}

	@Step("Wait till Files Page has opened")
	public static void waitTillFilesPageOpened() {
		new Waiter().untilVisible(SideBarMenuWrapper.getFilesFolderButtonInSideBarMenu(), "Files page hasn't been opened");
	}

}
