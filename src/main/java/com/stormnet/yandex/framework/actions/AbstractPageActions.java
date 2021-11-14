package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.pageWrappers.AbstractPage;

public class AbstractPageActions {

	public static class HeaderPanelActions {

		public static void openMailPage() {
			AbstractPage.HeaderPanel.getMailPageButton().click();
		}

		public static void openDiskPage() {
			AbstractPage.HeaderPanel.getDiskPageButton().click();
		}
	}

}
