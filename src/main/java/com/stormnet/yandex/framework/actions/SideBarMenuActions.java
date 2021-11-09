package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.actions.diskActions.DownloadsPageActions;
import com.stormnet.yandex.framework.actions.diskActions.FilesPageActions;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.SideBarMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPageWrapper;
import io.qameta.allure.Step;

public class SideBarMenuActions {

	@Step("Open downloads page")
	public static void openDownloadsPage() {
		SideBarMenuWrapper.getDownloadsFolderButtonInSideBarMenu().click();
		DownloadsPageActions.waitTillDownloadsPageOpened();
	}

	@Step("Open files page")
	public static void openFilesPage() {
		waitTillSideBarVisible();
		SideBarMenuWrapper.getFilesFolderButtonInSideBarMenu().click();
	}

	public static  void waitTillSideBarVisible() {
		new Waiter().untilVisible(SideBarMenuWrapper.getFilesFolderButtonInSideBarMenu(),"Side bar invisible");
	}


}
