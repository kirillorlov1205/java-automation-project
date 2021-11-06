package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import org.openqa.selenium.interactions.Actions;

public class DownloadsPageActions {

	public static void invokeContextMenuForLastFile() {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(DownloadsPageWrapper.getLastDownloadedFile().getElement()).perform();
	}

	public static void clickMovingContextButton() {
		DownloadsPageWrapper.getMoveContextButton().click();
	}

}
