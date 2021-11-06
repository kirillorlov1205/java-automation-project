package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.pageWrappers.HeaderPanelWrapper;

public class HeaderPanelActions {

	public static void openMailPage() {
		HeaderPanelWrapper.getMailPageButton().click();
	}

	public static void openDiskPage() {
		HeaderPanelWrapper.getDiskPageButton().click();
	}

}
