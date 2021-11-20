package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.ContextMenu;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import org.openqa.selenium.interactions.Actions;

public class DownloadsPageActions extends DiskPageActions {

	public static void invokeContextMenuFile(String fileName) {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(DownloadsPage.getDownloadedFile(fileName).getElement()).perform();
	}

	public static void clickMovingContextButton() {
		ContextMenu.getMoveContextButton().click();
	}

	public static void waitTillDownloadedFileShown(String fileName) {
		Waiter.untilVisible(DownloadsPage.getDownloadedFile(fileName), "Downloaded file hasn't been shown");
	}

	public static void waitTillDownloadsPageOpened() {
		Waiter.untilVisible(DownloadsPage.getDownloadsPageTitle(), "Downloaded page hasn't been shown");
	}

}
