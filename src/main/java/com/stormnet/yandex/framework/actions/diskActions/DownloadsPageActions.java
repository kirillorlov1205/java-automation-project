package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.pageWrappers.ContextMenu;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import org.openqa.selenium.interactions.Actions;

public class DownloadsPageActions extends DiskPageActions {

	public static void invokeContextMenuFile(HtmlElement element) {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(element.getElement()).perform();
	}

	public static void clickMovingContextButton() {
		ContextMenu.getMoveContextButton().click();
	}

	public static void waitTillDownloadedFileShown() {
		Waiter.untilVisible(DownloadsPage.getDownloadedFile(), "Downloaded file hasn't been shown");
	}

	public static void waitTillDownloadsPageOpened() {
		Waiter.untilVisible(DownloadsPage.getDownloadsPageTitle(), "Downloaded file hasn't been shown");
	}

}
