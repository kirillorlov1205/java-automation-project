package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.actions.ContextMenuActions;
import com.stormnet.yandex.framework.actions.MovingPopUpActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.pageWrappers.ContextMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

public class DownloadsPageActions {

	public static void invokeContextMenuForLastFile(HtmlElement htmlElement) {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(htmlElement.getElement()).perform();
	}

	public static void waitTillDownloadedFileShown() {
		new Waiter().untilVisible(DownloadsPageWrapper.getLastDownloadedFile(), "Downloaded file hasn't been shown");
	}

	public static void waitTillDownloadsPageOpened() {
		new Waiter().untilVisible(DownloadsPageWrapper.getDownloadsPageTitle(), "Downloaded file hasn't been shown");
	}

	@Step("Move downloaded file to Files folder")
	public static void moveDownloadedFileToFilesFolder(HtmlElement htmlElement) {
		waitTillDownloadedFileShown();
		invokeContextMenuForLastFile(htmlElement);
		ContextMenuActions.clickMovingContextButton();
		MovingPopUpActions.selectFileFolder();
		MovingPopUpActions.clickMoveButton();
	}

}
