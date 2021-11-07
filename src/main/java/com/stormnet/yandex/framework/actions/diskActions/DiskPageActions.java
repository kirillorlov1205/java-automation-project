package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.actions.MovingPopUpActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiskPageActions {

	@Step("Open Downloads Page")
	public static void openDownloadsPage() {
		DiskPageWrapper.getDownloadsButton().click();
		DownloadsPageActions.waitTillDownloadsPageOpened();
	}

//	@Step("Open Downloads Page")
//	public static void openDownloadsPage() {
//		DiskPageWrapper.getDownloadsButton().click();
//		DownloadsPageActions.waitTillDownloadsPageOpened();
//	}

	@Step("Move file to Files folder")
	public static void moveToFilesPage(HtmlElement htmlElement) {
		DownloadsPageActions.invokeContextMenuForLastFile(htmlElement);
		DownloadsPageActions.clickMovingContextButton();
		MovingPopUpActions.selectFileFolder();
		MovingPopUpActions.clickMoveButton();
	}


}
