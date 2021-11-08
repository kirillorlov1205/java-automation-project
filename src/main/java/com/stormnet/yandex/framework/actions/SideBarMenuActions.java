package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.actions.diskActions.DownloadsPageActions;
import com.stormnet.yandex.framework.pageWrappers.SideBarMenuWrapper;
import io.qameta.allure.Step;

public class SideBarMenuActions {

	@Step("Open bucket page")
	public static void selectBucketInSideBarMenu() {
		SideBarMenuWrapper.getBucketFolderButtonInSideBarMenu();
	}

	@Step("Open downloads page")
	public static void openDownloadsPage() {
		SideBarMenuWrapper.getDownloadsFolderButtonInSideBarMenu().click();
		DownloadsPageActions.waitTillDownloadsPageOpened();
	}

	@Step("Open files page")
	public static void openFilesPage() {
		SideBarMenuWrapper.getFilesFolderButtonInSideBarMenu().click();
	}
}
