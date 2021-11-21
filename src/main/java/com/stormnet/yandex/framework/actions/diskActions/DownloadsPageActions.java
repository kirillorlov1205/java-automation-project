package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.ContextMenu;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class DownloadsPageActions extends DiskPageActions {

	public static void invokeContextMenuFile(File file) {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(DownloadsPage.getDownloadedFile(file.getName()).getElement()).perform();
	}

	public static void clickMovingContextButton() {
		ContextMenu.getMoveContextButton().click();
	}

	public static void waitTillDownloadedFileShown(File file) {
		Waiter.untilVisible(DownloadsPage.getDownloadedFile(file.getName()), "Downloaded file hasn't been shown");
	}

	public static void waitTillDownloadsPageOpened() {
		Waiter.untilVisible(DownloadsPage.getDownloadsPageTitle(), "Downloaded page hasn't been shown");
	}

	public static void waitTillDownloadedFileIsMoved(File file) {
		Waiter.untilInvisible(DownloadsPage.getDownloadedFile(file.getName()), "Downloaded file hasn't been moved");
	}

	public static void waitTillFileMovedNotifyShown() {
		Waiter.untilVisible(DownloadsPage.getFileMovedIndicator(),"File moved notification hasn't been shown");
	}

}
